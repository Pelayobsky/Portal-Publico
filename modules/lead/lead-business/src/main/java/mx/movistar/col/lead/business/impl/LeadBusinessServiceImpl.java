package mx.movistar.col.lead.business.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.business.api.LeadBusinessService;
import mx.movistar.col.lead.business.exception.BusinessErrorCodeRelationship;
import mx.movistar.col.lead.business.exception.BusinessException;
import mx.movistar.col.lead.business.model.GenericLead;
import mx.movistar.col.lead.business.ws.api.CallCentersService;
import mx.movistar.col.lead.business.ws.atento.model.InsertarResponse;
import mx.movistar.col.lead.model.BlackList;
import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.model.LeadScoring;
import mx.movistar.col.lead.model.Nir;
import mx.movistar.col.lead.service.BlackListLocalService;
import mx.movistar.col.lead.service.LeadLocalService;
import mx.movistar.col.lead.service.LeadScoringLocalService;
import mx.movistar.col.lead.service.LeadScoringLocalServiceUtil;
import mx.movistar.col.lead.service.NirLocalService;

@Component(	immediate = false, service = LeadBusinessService.class)
public class LeadBusinessServiceImpl implements LeadBusinessService {
	
	private static final Log _log = LogFactoryUtil.getLog(LeadBusinessServiceImpl.class);
	
	@Reference 
	protected NirLocalService         _nirLocalService;
	@Reference
	protected LeadLocalService        _leadLocalService;
	@Reference
	protected CallCentersService      _callCentersService;
	@Reference 
	protected BlackListLocalService   _blackListLocalService;
	@Reference
	protected LeadScoringLocalService _leadScoringLocalService;
	
	/**
	 * Para guardar cualquier lead sea local o de CC primero se guarda en la base de datos de liferay 
	 * y luego se manda al CC si es requerido. 
	 * 
	 *  1-Se busca el lead al que pertenece la peticiones por medio del IdLead
	 *  2-se guarda el registro en LeadScoring la tabla de liferay
	 *  3-se manada a llamar el Call Center 
	 *  4-se acutaliza el registro en liferya con la respuesta del CC
	 * 
	 * @param genericLead
	 * @return
	 */
	@Override
	public LeadScoring saveLead(GenericLead genericLead) throws BusinessException {

		_log.debug("-->saveLead - 1");
		//_log.info("-->saveLead - 1");
		
	
		
		
		Lead lead = null;
		LeadScoring leadScoring =  null;
			
		//valida contra NIR y Blacklist
		if(isMsisdnValid(genericLead.getPhone())) {
			
			//validacion de menos de 6 horas por intento de registro
//			if(isrequestDuplicated(genericLead)) {
//				throw new BusinessException(BusinessErrorCodeRelationship.mapCodeRelationship.get(BusinessErrorCodeRelationship.FOUR),BusinessErrorCodeRelationship.FOUR);
//			}
			
			//obtiene toda la info del LEAD
			lead = findLeadByGenericLead(genericLead);
			//parsea el genericLead a un Scoring
			leadScoring = parseLeadScoringToGenericLead(genericLead, lead);
						
			//guardar en lfieray 
			LeadScoring newLeadScoring = saveNewScoring(leadScoring);
			leadScoring.setLeadScoringId(newLeadScoring.getPrimaryKey());
			
			//incementa en 1 el totalScoring
			incrementTotalScoring(lead, lead.getTotalScoring()+1);
			
			//Manda el registro al cc
			leadScoring = sendLeadToCallCenter(leadScoring,lead);

			//Actualiza lead ya con la respuesta del Call Center
			updateScoring(leadScoring);
			
		}
		_log.debug("leadScoring  >"+leadScoring.toString());


		return leadScoring;
	}	
	
	
	/**
	 * Valida que el intento de regsitros del lead no haya sido previamente capturado en las ultimsa 6 horas
	 * @param genericLead
	 * @return
	 */
//	private boolean isrequestDuplicated(GenericLead genericLead) {
//		
//		LocalDateTime now = LocalDateTime.now();
//		List<LeadScoring> list = _leadScoringLocalService.getLeadScoringByPhoneAndIdLead(genericLead.getPhone(), genericLead.getIdLead());
//		_log.info(list);
//		if(list==null || list.isEmpty()) return false;
//		LeadScoring leadScoring = list.stream().max(Comparator.comparing(LeadScoring::getCreateDate)).get();
//		
//        Instant current = leadScoring.getCreateDate().toInstant();
//        
//        LocalDateTime ldt = LocalDateTime.ofInstant(current, ZoneId.systemDefault());
//       
//        
//        
//        long diff = Math.abs(ChronoUnit.HOURS.between(now, ldt));		
//	    _log.info("diferencia de horas: "+diff);
//        
//        return diff>5?false:true;
//    
//	}
	
	
	/**
	 * Actualiza el leadSCoring
	 * @param leadScoring
	 * @return
	 */
	private LeadScoring updateScoring(LeadScoring leadScoring) {
		
		LeadScoring updatedLeadScoring = null;
		try {
			updatedLeadScoring  =  _leadScoringLocalService.updateLeadScoring(leadScoring);
		}catch(Exception e) {
			throw new BusinessException("Error updating leadScoring",BusinessErrorCodeRelationship.THREE);
		}
		return updatedLeadScoring;
	}
	
	/**
	 * Incremeta en el numero de hits que tiene un lead en especifico
	 * @param lead
	 * @param incremet
	 */
	private void incrementTotalScoring(Lead lead, int incremet) {
		
		try {
			_leadLocalService.incrementTotalScoring(lead, lead.getTotalScoring()+1);
		}catch(Exception e) {
			throw new BusinessException("Increment TotalScoring fail",BusinessErrorCodeRelationship.THREE);
		}
		
	}
	
	/**
	 * Guarda en liferya el nuevo leadScoring
	 * @param leadScoring
	 * @return
	 */
	private LeadScoring saveNewScoring(LeadScoring leadScoring) {
		
		LeadScoring newLeadScoring = null;
		try {
			newLeadScoring  =  _leadScoringLocalService.addLeadScoring(leadScoring);
		}catch(Exception e) {
			throw new BusinessException("Error saving new leadScoring",BusinessErrorCodeRelationship.THREE);
		}
		return newLeadScoring;
	}
	
	/**
	 * Parsea el genericLead a un LeadScoring
	 * @param genericLead
	 * @param lead
	 * @return
	 */
	private LeadScoring parseLeadScoringToGenericLead(GenericLead genericLead, Lead lead) {
		
		if(Validator.isNotNull(genericLead.getEmail()) && !Validator.isEmailAddress(genericLead.getEmail())) {
			throw new BusinessException("Invalid email address", BusinessErrorCodeRelationship.ONE);
		}
		LocalDateTime localDate = LocalDateTime.now();
		LeadScoring leadScoring = LeadScoringLocalServiceUtil.createLeadScoring(CounterLocalServiceUtil.increment(LeadScoring.class.getName()));
		Date creationDate       = Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant());
		Map<String,String> mapUTM  = getQueryMap(genericLead.getUrl());

		leadScoring.setIpCliente(genericLead.getIp());
		leadScoring.setOrigen(genericLead.getOrigen());
		
		leadScoring.setLeadId(lead.getPrimaryKey());
		leadScoring.setCreateDate(creationDate);			
		leadScoring.setDateSchedule(genericLead.getDateTimeScheduled());
		
		leadScoring.setName(lead.getHasName()?genericLead.getName():null);
		leadScoring.setEmail(lead.getHasEmail()?genericLead.getEmail():null);
		leadScoring.setMsisdn(lead.getHasPhone()?genericLead.getPhone():null);
		leadScoring.setUrl(genericLead.getUrl());

		int size = Validator.isNull(genericLead.getExtra())?0:genericLead.getExtra().size();

		switch(size>=4?3:size) {
			case 3:leadScoring.setExtra3(lead.getExtra3()?genericLead.getExtra().get(2):null);
			case 2:leadScoring.setExtra2(lead.getExtra2()?genericLead.getExtra().get(1):null);
			case 1:leadScoring.setExtra1(lead.getExtra1()?genericLead.getExtra().get(0):null);
		}

		if(Validator.isNotNull(mapUTM)) {
		
			for (Map.Entry<String, String> entry : mapUTM.entrySet()){
	
			    switch(entry.getKey()) {
				    case "utm_campaign": leadScoring.setUtmCampaign(entry.getValue()); break;
				    case "utm_content":  leadScoring.setUtmContent(entry.getValue());  break;
				    case "utm_source":   leadScoring.setUtmSource(entry.getValue());   break;
				    case "utm_medium":   leadScoring.setUtmMedium(entry.getValue());   break;
				    case "utm_term":     leadScoring.setUtmTerm(entry.getValue());     break;
				    default:  {
				    	
				    	if(leadScoring.getOtherSource()==null ||  leadScoring.getOtherSource().isEmpty()) {
					    	leadScoring.setOtherSource(entry.getValue());
				    	}else {
					    	String other = entry.getValue();
					    	String otherSource = leadScoring.getOtherSource();
					    	leadScoring.setOtherSource(otherSource+"|"+other);
				    	}
				    }
			    }
			}
		}
				
		return leadScoring;
	}
	
	/**
	 * Envia el request al ws del call center si esta asignado el Lead a uno
	 * @param leadScoring
	 * @param lead
	 * @return
	 */
	private LeadScoring sendLeadToCallCenter(LeadScoring leadScoring , Lead lead) {
		
		LocalDateTime localDateTime = convertToLocalDateTimeViaInstant(leadScoring.getDateSchedule());
		LocalDate date =  localDateTime != null?localDateTime.toLocalDate():null;
		LocalTime time =  localDateTime != null?localDateTime.toLocalTime():null;		
		
		try {
			switch(lead.getSource()) {
				case "AMPLIFICA":{
					String utms = joinUtmFields(leadScoring);      
					String formatedDate = formateDate("yyyy-MM-dd hh:mm:ss", leadScoring.getDateSchedule());
					String response = _callCentersService.sendLeadAmplifica(Integer.valueOf(String.valueOf(leadScoring.getPrimaryKey())), 
																			lead.getType(), 
																			lead.getProduct(), 
																			leadScoring.getMsisdn(), 
																			leadScoring.getName(), 
																			leadScoring.getSurname()==null?" ":leadScoring.getSurname(),
																			leadScoring.getEmail(), 
																			formatedDate,
																			joinExtrasFields(leadScoring),
																			utms, 
																			leadScoring.getUrl(), 
																			0,
																			1,
																			0);
					
					String[] splitedResponse = response.split("\\|");
					_log.debug("Respuesta AMPLIFICA CC>"+Arrays.toString(splitedResponse));

					if(splitedResponse != null && splitedResponse.length > 1) {
						if(splitedResponse[0].equals("200")) {
							leadScoring.setIdCCWS(splitedResponse[1]);
							leadScoring.setResponseWS("");
						}else {
							leadScoring.setIdCCWS(splitedResponse[0]);
							leadScoring.setResponseWS(splitedResponse[1]);
						}
												
					}				
					return leadScoring;
				}case "ATENTO":{
					
					InsertarResponse insertarResponse =_callCentersService.sendLeadAtento(Integer.valueOf(String.valueOf(leadScoring.getPrimaryKey())), 
																					 	  lead.getType(), 
																						  null, 
																						  null,
																						  leadScoring.getMsisdn(), 
																						  leadScoring.getName(),
																						  leadScoring.getSurname(), 
																						  leadScoring.getEmail(),	
																						  lead.getProduct(),
																						  date!=null?date.toString():null, 
																						  time!=null?time.toString():null,
																					      Integer.valueOf(String.valueOf(lead.getCampaignId())), 
																						  0,
																						  joinExtrasFields(leadScoring));
				
					String[] splitedResponse = insertarResponse.getInsertarResult().split("\\|");
					_log.debug("Respuesta ATENTO CC>"+Arrays.toString(splitedResponse));
					
					if(splitedResponse != null && splitedResponse.length > 1) {
						
						if(splitedResponse[0].equals("True")) {
							leadScoring.setIdCCWS(splitedResponse[1]);
							leadScoring.setResponseWS("");
						}else {
							leadScoring.setIdCCWS(splitedResponse[1]);
							leadScoring.setResponseWS(splitedResponse[0]);
						}
						
//						leadScoring.setIdCCWS(splitedResponse[1]);
//						leadScoring.setResponseWS(splitedResponse[0]);
					}

					return leadScoring;
				}
			}
		}catch(Exception e) {
			_log.error(e);
			leadScoring.setIdCCWS("9");
			leadScoring.setResponseWS("Fallo al enviar al CC");
		}
		
		return leadScoring;
	}
	

	
	/**
	 * Formatea un fehca segun el formato que se le pase 
	 * @param format
	 * @param date
	 * @return
	 */
	private  String formateDate(String format, Date date) {
				
		if(Validator.isNull(date))   return null;
		if(Validator.isNull(format)) return null;
						
		SimpleDateFormat formateador = new SimpleDateFormat(format);
		
		return formateador.format(date);
	}
	
	/**
	 * Parsea de date a LocalDateTime
	 * @param dateToConvert
	 * @return
	 */
	private LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
		
		if(Validator.isNull(dateToConvert)) return null;
		
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDateTime();
	}
	
	/**
	 * Crea un string apartir de todos los extras 
	 * @param genericLead
	 * @return
	 */
	private String joinExtrasFields( LeadScoring leadScoring) {
		
		StringBuilder sb = new StringBuilder("");

		sb.append(leadScoring.getExtra1());
		sb.append("|");
		sb.append(leadScoring.getExtra2());
		sb.append("|");
		sb.append(leadScoring.getExtra3());
		
		return sb.toString();
	}
	
	
	/**
	 * Junta todos los utm y otherSource en un solo campo 
	 * @param map
	 * @return
	 */
	private String joinUtmFields(LeadScoring leadScoring) {
			
		StringBuilder sb = new StringBuilder("");
			
		sb.append(leadScoring.getUtmCampaign()!=null?leadScoring.getUtmCampaign():"");
		sb.append("|");
		sb.append(leadScoring.getUtmContent()!=null?leadScoring.getUtmContent():"");
		sb.append("|");
		sb.append(leadScoring.getUtmMedium()!=null?leadScoring.getUtmMedium():"");
		sb.append("|");
		sb.append(leadScoring.getUtmSource()!=null?leadScoring.getUtmSource():"");
		sb.append("|");
		sb.append(leadScoring.getUtmTerm()!=null?leadScoring.getUtmTerm():"");
		sb.append("|");
		sb.append(leadScoring.getOtherSource()!=null?leadScoring.getOtherSource():"");
		
		return sb.toString();
	};
	
	/**
	 * Busca el "Lead" por medio de varios parametros, si ya se tiene el idLead se busca directamente,
	 * si no se busca por varios campos hasta encontar 
	 * @param genericLead
	 * @return
	 * @throws PortalException
	 */
	private Lead findLeadByGenericLead(GenericLead genericLead) {

		if(Validator.isNull(genericLead.getIdLead()))  				     throw new BusinessException("Id lead null",        BusinessErrorCodeRelationship.ONE);
		if(!Validator.isNumber(String.valueOf(genericLead.getIdLead()))) throw new BusinessException("Id lead not a number",BusinessErrorCodeRelationship.ONE);
		
		Lead lead = null;
		try{
			lead =  _leadLocalService.getLead(genericLead.getIdLead());
			if(Validator.isNull(lead)) {
				throw new BusinessException("Lead not found", BusinessErrorCodeRelationship.THREE);
			}
		}catch(Exception e) {
			throw new BusinessException("Lead ->"+e.getMessage(), BusinessErrorCodeRelationship.THREE);
		}

		return lead;
		
	}
	
	/**
	 * Regresa un mapa con todos los parametros de la url separados por llave 
	 * 
	 * @param query
	 * @return
	*/
	private Map<String, String> getQueryMap(String query) {  

		Map<String, String> map = new HashMap<String, String>();  
		if(Validator.isNull(query)) return map;
		
		String[] url = query.split("\\?"); 
	    if(url.length == 1) return  map;		
		String[] params = url[1].split("&");  
	    if(params.length == 1) return  map;
		for (String param : params){  
	        try {
				String name  = param.split("=")[0];
		        String value = param.split("=")[1];
		        map.put(name, value);  
	        }catch(Exception e) {
	        	
	        }
	    }  
	    
		return map;  
	}
	
	/**
	 * Valida que el numero tenga una lada nacional y que no esta en la lista de numeros bloqueados(Black List)
	 * @param number
	 * @return
	 */
	@Override
	public boolean isMsisdnValid(String number) {
	 
		if (!isNirValid(number))        throw new BusinessException("Invalid NIR",           BusinessErrorCodeRelationship.ONE);
		if (isMsisdnInBlackList(number))throw new BusinessException("Number is blacklisted", BusinessErrorCodeRelationship.ONE);

		return true;
	}
	
	/**
	 * Valida que la lada del numero sea correcta, se valida los primeros 2 y 3 numeros contra la lada
	 * @param number
	 * @return
	 */
	private boolean isNirValid(String number) {
		
		if(Validator.isNull(number))    throw new BusinessException("Number is null",      BusinessErrorCodeRelationship.ONE);
		if(!Validator.isNumber(number)) throw new BusinessException("Is not a number",     BusinessErrorCodeRelationship.ONE);
		if(number.length() != 10)       throw new BusinessException("Number lenght <> 10", BusinessErrorCodeRelationship.ONE);
			
		List<Nir> nirs = _nirLocalService.getNirByNumber(number);
		
		return  Validator.isNotNull(nirs) && nirs.size() > 0;
	}
	
	/**
	 * Valida que numero de telefono este en la lista negra
	 * @param number
	 * @return
	 */
	private boolean isMsisdnInBlackList(String number) {
		
		if(Validator.isNull(number))    throw new BusinessException("Number is null",      BusinessErrorCodeRelationship.ONE);
		if(!Validator.isNumber(number)) throw new BusinessException("Is not a number",     BusinessErrorCodeRelationship.ONE);
		if(number.length() != 10)       throw new BusinessException("Number lenght <> 10", BusinessErrorCodeRelationship.ONE);
			
		List<BlackList> blackList = _blackListLocalService.getPhone(number);

		return Validator.isNotNull(blackList) && blackList.size() > 0;
	}
	
}

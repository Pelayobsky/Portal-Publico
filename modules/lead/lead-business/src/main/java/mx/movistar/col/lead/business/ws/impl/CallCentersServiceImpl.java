package mx.movistar.col.lead.business.ws.impl;


import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.business.ws.amplifica.impl.AmplificaServiceImpl;
import mx.movistar.col.lead.business.ws.amplifica.model.Lead;
import mx.movistar.col.lead.business.ws.api.CallCentersService;
import mx.movistar.col.lead.business.ws.atento.impl.AtentoServiceImpl;
import mx.movistar.col.lead.business.ws.atento.model.*;
import mx.movistar.col.lead.business.ws.atento.model.Insertar;



@Component(
		immediate = false, 
		service = CallCentersService.class
		)
public class CallCentersServiceImpl implements CallCentersService {

	private static final Log _log = LogFactoryUtil.getLog(CallCentersServiceImpl.class);

	
	
	
	@Reference
	private AtentoServiceImpl    _atentoServiceImpl;
	@Reference
	private AmplificaServiceImpl _amplificaServiceImpl;
					
	@Override
	public String sendLeadAmplifica(int id, String type, String product, String phone, String name, String surname, String email, String dateTimeScheduled, String extra, String utm, String url, int outOfTime, int rdph, int natural) {
			
		Lead lead = new Lead(id, type, product, phone, name, surname, email, dateTimeScheduled, extra, utm, url, outOfTime);	
		_log.debug(lead);
		return _amplificaServiceImpl.sendLead(lead,rdph ,natural);
	}

	@Override
	public InsertarResponse sendLeadAtento(int idLead, String tipo, String contryCode, String area, String phone, String name,
			String surname, String mail, String product, String dateScheduled, String timeScheduled, int idCamp,
			int priority, String extra) {
	
		
		Tipo tipoEnum = (Tipo.contains(tipo))?Tipo.fromValue(tipo):null;			
		
		DatosCore datosCore = new DatosCore(priority, extra);
		Campaña campaña = new Campaña(idCamp);
		DatosAgenda datosAgenda = new DatosAgenda(dateScheduled, timeScheduled);
		DatosContacto datosContacto = new DatosContacto(idLead, tipoEnum, contryCode, area, phone, name, surname, mail, product);
		Datos datos = new Datos(datosContacto, datosAgenda, campaña, datosCore);
		Insertar insertar = new Insertar(datos);
		_log.debug(insertar);
	
		return _atentoServiceImpl.sendLead(insertar);
		
	}

}

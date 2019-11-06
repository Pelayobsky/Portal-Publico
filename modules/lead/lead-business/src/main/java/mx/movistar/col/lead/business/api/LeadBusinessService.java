package mx.movistar.col.lead.business.api;

import mx.movistar.col.lead.business.exception.BusinessException;
import mx.movistar.col.lead.business.model.GenericLead;
import mx.movistar.col.lead.model.LeadScoring;

public interface LeadBusinessService {

	/**
	 * Guarda un lead en la base de datos liferay y manda el lead al CC si es necesario
	 * @param genericLead
	 * @return
	 * @throws BusinessException
	 */
	LeadScoring saveLead(GenericLead genericLead) throws BusinessException;	
	
	
	/**
	 * Valida si el msisdn es valido, esto es
	 * 1-numero no esta en la lista negra
	 * 2-su codigo lada es valido
	 * @return
	 */
	boolean isMsisdnValid(String number);
	
	
	
	
}

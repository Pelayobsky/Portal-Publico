package mx.movistar.col.lead.business.ws.api;

import mx.movistar.col.lead.business.ws.atento.model.InsertarResponse;

/**
 * Interface para mandar el Lead segun el callCenter que se requiera
 * 
 * @author vass
 *
 */
public interface CallCentersService {

	
	InsertarResponse sendLeadAtento(int idLead, String tipo , String contryCode, String area, String phone, String name, String surname, String mail, String product, String dateScheduled, String timeScheduled,int idCamp, int priority, String extra);


	String sendLeadAmplifica(int id, String type, String product, String phone, String name, String surname, String email, String dateTimeScheduled, String extra, String utm, String url, int outOfTime, int rdph, int natural);
}

package mx.movistar.col.lead.business.ws.amplifica.impl;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.Map;

import javax.xml.ws.Service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import mx.movistar.col.lead.business.ws.AbstractSoapProxy;
import mx.movistar.col.lead.business.ws.amplifica.model.Lead;
import mx.movistar.col.lead.business.ws.amplifica.model.WundermanEnd;
import mx.movistar.col.lead.business.ws.amplifica.model.WundermanEndSoap;
import mx.movistar.col.lead.configuration.api.LeadSystemWSConfiguration;

@Component(
	configurationPid = "mx.movistar.col.lead.configuration.api.LeadSystemWSConfiguration",
	immediate = false, 
	service = AmplificaServiceImpl.class
)
public class AmplificaServiceImpl extends AbstractSoapProxy<WundermanEndSoap> {
	
	private static final Log _log = LogFactoryUtil.getLog(AmplificaServiceImpl.class);

	public AmplificaServiceImpl() {
		super(WundermanEndSoap.class);
	}
	
	@Override
	public Service getService() {
		return new WundermanEnd();
	}
	
	public String sendLead(Lead lead, int rdph, int natural) {
	    
		String response = getPort().sendLead(lead, rdph, natural);		
		
		return response;
	}
	
	/**
	 * Metodo que recibe el Configuration de Liferay para
	 * los endpoint de los servicios de AppSaac.
	 * Inicializa el service template de Retrofit.
	 * @param properties
	 */
	@Activate
	@Modified
	public void activate(Map<String, Object> properties) {

		_leadSystemWSConfiguration = ConfigurableUtil.createConfigurable(LeadSystemWSConfiguration.class, properties);
		
		String endpoint = _leadSystemWSConfiguration.amplificaEndPointURL();
		String user     = _leadSystemWSConfiguration.amplificaUser();
		String pass     = _leadSystemWSConfiguration.amplificaPassword();
		Integer connectTimeOut = _leadSystemWSConfiguration.connectTimeOut();

		_log.info(endpoint);
		_log.info(connectTimeOut);
		
		super.doConnection( endpoint, connectTimeOut, connectTimeOut, user,pass);	
		
	}
		
	private volatile LeadSystemWSConfiguration _leadSystemWSConfiguration;
}
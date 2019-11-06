package mx.movistar.col.lead.business.ws.atento.impl;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.Map;

import javax.xml.ws.Service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import mx.movistar.col.lead.business.ws.AbstractSoapProxy;
import mx.movistar.col.lead.business.ws.atento.model.Insertar;
import mx.movistar.col.lead.business.ws.atento.model.InsertarResponse;
import mx.movistar.col.lead.business.ws.atento.model.Service1;
import mx.movistar.col.lead.business.ws.atento.model.Service1Soap;
import mx.movistar.col.lead.configuration.api.LeadSystemWSConfiguration;

@Component(
		configurationPid = "mx.movistar.col.lead.configuration.api.LeadSystemWSConfiguration",
		immediate = false, 
		service = AtentoServiceImpl.class
		)
public class AtentoServiceImpl extends AbstractSoapProxy<Service1Soap> {
	
	private static final Log _log = LogFactoryUtil.getLog(AtentoServiceImpl.class);
	
	public AtentoServiceImpl() {
		super(Service1Soap.class);		
	}
	
	@Override
	public Service getService() {
        return new Service1();
	}

	public InsertarResponse sendLead(Insertar insertar) {
		    
		InsertarResponse response = getPort().insertar(insertar);
		
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
		try {
			String endpoint = _leadSystemWSConfiguration.atentoEndPointURL();
			String user     = _leadSystemWSConfiguration.atentoUser();
			String pass     = _leadSystemWSConfiguration.atentoPassword();
			Integer connectTimeOut = _leadSystemWSConfiguration.connectTimeOut();

			_log.info(endpoint);
			_log.info(connectTimeOut);
			
			super.doConnection( endpoint, connectTimeOut, connectTimeOut, user,pass);
		}catch(Exception e) {
			_log.error(e);
		}
	}
		
	private volatile LeadSystemWSConfiguration _leadSystemWSConfiguration;

}
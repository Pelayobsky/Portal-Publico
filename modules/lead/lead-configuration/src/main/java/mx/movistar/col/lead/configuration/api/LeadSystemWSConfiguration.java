package mx.movistar.col.lead.configuration.api;


import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;
import aQute.bnd.annotation.metatype.Meta;
/**
 * Configuration interface for lead Application. 
 * 
 * An user interface for this interface is automatically created 
 * in Control Panel -> System settings.
 * 
 * @author Hector Silvar
 */
@ExtendedObjectClassDefinition(
		category = "Leads",
		scope = ExtendedObjectClassDefinition.Scope.SYSTEM
)
@Meta.OCD(
		id = "mx.movistar.col.lead.configuration.api.LeadSystemWSConfiguration",
		localization = "content/Language",
		name = "ecare-service-configuration-name"
)
public interface LeadSystemWSConfiguration {

	//AMPLIFICA
	@Meta.AD(
			deflt = "http://198.100.158.107/wunderman/index.php", 
			description = "endpoint-atento-url", 
			name = "endpoint-amplifica-url-description", 
			required = false
		)
	public String amplificaEndPointURL();
		
	@Meta.AD(
			deflt = "15000", 
			description = "lead-configuration-amplifica-connecttimeout-name", 
			name = "lead-configuration-amplifica-connecttimeout-description", 
			required = false
		)
	public Integer amplificaconnectTimeOut();
	
	@Meta.AD(
			deflt = "user", 
			description = "user-atento", 
			name = "user-amplifica-description", 
			required = false
		)
	public String amplificaUser();
	
	
	@Meta.AD(
			deflt = "pass", 
			description = "password-atento", 
			name = "password-amplifica-description", 
			required = false
		)
	public String amplificaPassword();
	
	//ATENTO 
	@Meta.AD(
			deflt = "https://leviatan.atento.com.mx/CoLWS/service1.asmx", 
			description = "endpoint-atento-url", 
			name = "endpoint-atento-url-description", 
			required = false
		)
	public String atentoEndPointURL();
		
	@Meta.AD(
			deflt = "15000", 
			description = "lead-configuration-connecttimeout-name", 
			name = "lead-configuration-connecttimeout-description", 
			required = false
		)
	public Integer connectTimeOut();
	
	@Meta.AD(
			deflt = "user", 
			description = "user-atento", 
			name = "user-atento-description", 
			required = false
		)
	public String atentoUser();
	
	
	@Meta.AD(
			deflt = "pass", 
			description = "password-atento", 
			name = "password-atento-description", 
			required = false
		)
	public String atentoPassword();
	
	//Origenes de Call centers
	@Meta.AD(
			deflt = "", 
			description = "sources-description", 
			name = "sources-name", 
			required = false
		)
	public String[] sources();
	
	//Catalogo de Producto
	@Meta.AD(
			deflt = "", 
			description = "products-description", 
			name = "products-name", 
			required = false
		)
	public String[] products();
	
	//Catalogo de Tipos de Lead
	@Meta.AD(
			deflt = "", 
			description = "types-description", 
			name = "types-name", 
			required = false
		)
	public String[] types();
	
	@Meta.AD(
			deflt = "9,22", 
			description = "horary-description", 
			name = "horary-name", 
			required = false
		)
	public String atentoHorary();
	
}
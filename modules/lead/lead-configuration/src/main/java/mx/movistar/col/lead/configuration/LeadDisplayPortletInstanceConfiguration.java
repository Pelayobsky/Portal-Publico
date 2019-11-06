/**
 * 
 */
package mx.movistar.col.lead.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;
import aQute.bnd.annotation.metatype.Meta;
/**
 * 
 * Definición de atributos personalizables para la preferencias
 * del portlet LeadDisplay.
 * @author hectorsv
 *
 */
@ExtendedObjectClassDefinition(
		category = "Leads",
		scope = ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE
)
@Meta.OCD(
		id = "mx.movistar.col.lead.configuration.LeadDisplaySystemServiceConfiguration",
		localization = "content/Language",
		name = "lead-display-service-configuration-name"
)

public interface LeadDisplayPortletInstanceConfiguration {
	
	@Meta.AD(
			deflt = "", 
			description = "leaddisplay.label-leadId-description", 
			name = "leaddisplay.label-leadId", 
			required = false
		)
	public String leadId();
	
	@Meta.AD(
			deflt = "", 
			description = "leaddisplay.label-title-description", 
			name = "leaddisplay.label-title", 
			required = false
		)
	public String title();
	
	@Meta.AD(
			deflt = "", 
			description = "leaddisplay.label-subtitle-description", 
			name = "leaddisplay.label-subtitle", 
			required = false
		)
	public String subtitle();
	
	@Meta.AD(
			deflt = "", 
			description = "leaddisplay.label-field1-description", 
			name = "leaddisplay.label-field1", 
			required = false
		)
	public String field1();
	
	@Meta.AD(
			deflt = "", 
			description = "leaddisplay.label-freeText-description", 
			name = "leaddisplay.label-freeText", 
			required = false
		)
	public String freeText();
	
	@Meta.AD(
			deflt = "", 
			description = "leaddisplay.label-displayStyle-description", 
			name = "leaddisplay.label-displayStyle", 
			required = false
		)
	public String displayStyle();
	
	@Meta.AD(
			deflt = "0",
			name = "display-style-group-id",
			required = false
		)
	public long displayStyleGroupId();
	
}

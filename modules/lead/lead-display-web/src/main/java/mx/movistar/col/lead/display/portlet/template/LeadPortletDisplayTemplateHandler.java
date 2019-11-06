/**
 * 
 */
package mx.movistar.col.lead.display.portlet.template;

import com.liferay.portal.kernel.portletdisplaytemplate.BasePortletDisplayTemplateHandler;
import com.liferay.portal.kernel.portletdisplaytemplate.PortletDisplayTemplateManager;
import com.liferay.portal.kernel.template.TemplateHandler;
import com.liferay.portal.kernel.template.TemplateVariableGroup;
import com.liferay.portal.kernel.util.ResourceBundleUtil;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

import mx.movistar.col.lead.display.constants.LeadDisplayWebPortletKeys;
import mx.movistar.col.lead.model.Lead;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + LeadDisplayWebPortletKeys.LEAD_DISPLAY
		},
		service = TemplateHandler.class
	)
public class LeadPortletDisplayTemplateHandler extends BasePortletDisplayTemplateHandler {

	@Override
	public String getClassName() {
		return Lead.class.getName();
	}

	@Override
	public String getName(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
				"content.Language", locale, getClass());
			return resourceBundle.getString("application-display-template-type");
	}

	@Override
	public String getResourceName() {
		return LeadDisplayWebPortletKeys.LEAD_DISPLAY;
	}
	
	@Override
	public Map<String, TemplateVariableGroup> getTemplateVariableGroups(
		long classPK, String language, Locale locale)
		throws Exception {

		Map<String, TemplateVariableGroup> templateVariableGroups =
			super.getTemplateVariableGroups(classPK, language, locale);

		TemplateVariableGroup templateVariableGroup =
			templateVariableGroups.get("fields");

		templateVariableGroup.empty();

		String collectionLabel = "leads";
		String collectionName = PortletDisplayTemplateManager.ENTRIES;
		Class<List> collectionClazz = List.class;

		String itemLabel = "lead";
		Class<Lead> itemClazz = Lead.class;
		String itemName = "currentLead";
		String itemAccessor = "getTitle(locale)";

		templateVariableGroup.addCollectionVariable(
			collectionLabel, collectionClazz, collectionName, itemLabel,
			itemClazz, itemName, itemAccessor);

		return templateVariableGroups;
	}
	
	@Override
	protected String getTemplatesConfigPath() {
		return "mx/movistar/col/lead/display/portlet/template/portlet-display-templates.xml";
	}

}

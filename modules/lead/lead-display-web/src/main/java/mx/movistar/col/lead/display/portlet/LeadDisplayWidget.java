package mx.movistar.col.lead.display.portlet;

import mx.movistar.col.lead.display.constants.LeadDisplayWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import javax.portlet.Portlet;
import org.osgi.service.component.annotations.Component;

/**
 * @author hectorsv
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.leads",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Lead Display Widget",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LeadDisplayWebPortletKeys.LEAD_DISPLAY,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LeadDisplayWidget extends MVCPortlet {
	
}
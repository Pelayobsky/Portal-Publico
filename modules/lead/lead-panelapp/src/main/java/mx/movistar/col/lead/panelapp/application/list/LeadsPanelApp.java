package mx.movistar.col.lead.panelapp.application.list;

import mx.movistar.col.lead.panelapp.constants.LeadsPanelCategoryKeys;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author hectorsv
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=200",
		"panel.category.key=" + LeadsPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class LeadsPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return LeadsPortletKeys.LeadsPanelApp;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + LeadsPortletKeys.LeadsPanelApp + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}
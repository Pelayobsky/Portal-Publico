/**
 * 
 */
package mx.movistar.col.lead.panelapp.application.list;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.panelapp.constants.LeadsPanelCategoryKeys;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		property = {
			"panel.app.order:Integer=300",
			"panel.category.key=" + LeadsPanelCategoryKeys.CONTROL_PANEL_CATEGORY
		},
		service = PanelApp.class
	)
public class ReportsPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return LeadsPortletKeys.ReportsPanelApp;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + LeadsPortletKeys.ReportsPanelApp + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}

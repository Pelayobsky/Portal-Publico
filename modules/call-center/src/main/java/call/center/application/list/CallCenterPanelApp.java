package call.center.application.list;

import call.center.constants.CallCenterPanelCategoryKeys;
import call.center.constants.CallCenterPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Krolls
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + CallCenterPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class CallCenterPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return CallCenterPortletKeys.CALLCENTER;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + CallCenterPortletKeys.CALLCENTER + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}
package mx.movistar.col.lead.panelapp.portlet.actions;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.configuration.api.LeadSystemWSConfiguration;
import mx.movistar.col.lead.exception.NoSuchCallCenterException;
import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.model.CallCenter;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;
import mx.movistar.col.lead.service.CampaignService;
import mx.movistar.col.lead.service.CallCenterService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		configurationPid = "mx.movistar.col.lead.configuration.api.LeadSystemWSConfiguration",
		property = {
			"javax.portlet.name=" + LeadsPortletKeys.CallCenterPanelApp,
			"mvc.command.name=" + MVCCommandNames.EDIT_CALLCENTER
		}, 
		service = MVCRenderCommand.class
	)
public class EditCallCenterMVCRenderCommand implements MVCRenderCommand {
	
	private static final Log _log =
			LogFactoryUtil.getLog(EditCallCenterMVCRenderCommand.class);
	
	@Reference
	private CallCenterService _callCenterService;
	
	@Reference
	protected CampaignService _campaignService;

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		CallCenter callCenter = null;
		
		long callCenterId = ParamUtil.getLong(renderRequest, "callCenterId", 0);
		
		_log.info("CallCenterID : " + callCenterId);
		if (callCenterId > 0) {
			try {
				
				// Call the service to get the Lead for editing.
				
				callCenter = _callCenterService.getCallCenter(callCenterId);
			}
			catch (NoSuchCallCenterException e) {
				_log.error(e);
			}
			catch (PortalException e) {
				_log.error(e);
			}
		}
		
		ThemeDisplay themeDisplay =
			(ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		// Set back icon visible.
		
		PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

		portletDisplay.setShowBackIcon(true);

		String redirect = renderRequest.getParameter("redirect");

		portletDisplay.setURLBack(redirect);
		
		
		List<Campaign> campaigns = _campaignService.getCampaignsByGroupId(
				themeDisplay.getScopeGroupId());
		// Set request attributes.
		renderRequest.setAttribute("campaigns", campaigns);
		renderRequest.setAttribute("sources", _configuration.sources());
		renderRequest.setAttribute("products", _configuration.products());
		renderRequest.setAttribute("types", _configuration.types());
		renderRequest.setAttribute("callCenter", callCenter);
		renderRequest.setAttribute("callCenterClass", CallCenter.class);

		return "/callcenter/edit_callcenter.jsp";
	}
	
	@Activate   
	@Modified
    protected void activate(Map<String, Object> properties) {
        _configuration = ConfigurableUtil.createConfigurable(
        		LeadSystemWSConfiguration.class, properties);
    }
	
	private volatile LeadSystemWSConfiguration _configuration;
	
}

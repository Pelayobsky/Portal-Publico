/**
 * 
 */
package mx.movistar.col.lead.panelapp.portlet.actions;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.exception.NoSuchCampaignException;
import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;
import mx.movistar.col.lead.service.CampaignService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + LeadsPortletKeys.CampaignPanelApp,
				"mvc.command.name=" + MVCCommandNames.EDIT_CAMPAIGN
		},
		service = MVCRenderCommand.class)
public class EditCampaignMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		Campaign campaign = null;

		long campaignId = ParamUtil.getLong(renderRequest, "campaignId", 0);
		
		_log.info("CampaignID : " + campaignId);
		if (campaignId > 0) {
			try {
				
				// Call the service to get the Campaign for editing.
				
				campaign = _campaignService.getCampaign(campaignId);
			}
			catch (NoSuchCampaignException e) {
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

		// Set Campaign to the request attributes
		_log.info(campaign);
		renderRequest.setAttribute("campaign", campaign);
		renderRequest.setAttribute("campaignClass", Campaign.class);

		return "/campaign/edit_campaign.jsp";
	}

	@Reference
	private CampaignService _campaignService;

	private static final Log _log =
		LogFactoryUtil.getLog(EditCampaignMVCRenderCommand.class);


}

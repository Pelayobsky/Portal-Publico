/**
 * 
 */
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
import mx.movistar.col.lead.exception.NoSuchLeadException;
import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;
import mx.movistar.col.lead.service.CampaignService;
import mx.movistar.col.lead.service.LeadService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		configurationPid = "mx.movistar.col.lead.configuration.api.LeadSystemWSConfiguration",
		property = {
			"javax.portlet.name=" + LeadsPortletKeys.LeadsPanelApp,
			"mvc.command.name=" + MVCCommandNames.EDIT_LEAD
		}, 
		service = MVCRenderCommand.class
	)
public class EditLeadMVCRenderCommand implements MVCRenderCommand {
	
	private static final Log _log =
			LogFactoryUtil.getLog(EditLeadMVCRenderCommand.class);
	
	@Reference
	private LeadService _leadService;
	
	@Reference
	protected CampaignService _campaignService;

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		Lead lead = null;
		
		long leadId = ParamUtil.getLong(renderRequest, "leadId", 0);
		
		_log.info("LeadID : " + leadId);
		if (leadId > 0) {
			try {
				
				// Call the service to get the Lead for editing.
				
				lead = _leadService.getLead(leadId);
			}
			catch (NoSuchLeadException e) {
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
		renderRequest.setAttribute("lead", lead);
		renderRequest.setAttribute("leadClass", Lead.class);

		return "/leads/edit_lead.jsp";
	}
	
	@Activate   
	@Modified
    protected void activate(Map<String, Object> properties) {
        _configuration = ConfigurableUtil.createConfigurable(
        		LeadSystemWSConfiguration.class, properties);
    }
	
	private volatile LeadSystemWSConfiguration _configuration;
	
}

/**
 * 
 */
package mx.movistar.col.lead.panelapp.portlet.actions;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.exception.CampaignValidationException;
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
		service = MVCActionCommand.class)
public class EditCampaignMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ServiceContext serviceContext =
			ServiceContextFactory.getInstance(Campaign.class.getName(), actionRequest);

		// Get parameters from the request.
		
		long campaignId = ParamUtil.getLong(actionRequest, "campaignId");

		if (_log.isDebugEnabled()) {
			_log.debug("Editing Campaign " + campaignId);
		}

		Map<Locale, String> title =
			LocalizationUtil.getLocalizationMap(actionRequest, "title");

		String description = ParamUtil.getString(actionRequest, "description");

		Date dueDate = ParamUtil.getDate(
			actionRequest, "dueDate",
			DateFormatFactoryUtil.getDate(actionRequest.getLocale()));
		
		try {
			
			// Call the service to update the Campaign
			
			_campaignService.updateCampaign(
				campaignId, title, description, dueDate, serviceContext);

			// Set success message.
			
			SessionMessages.add(actionRequest, "campaign-updated");

			// Hide default success message.
			
			hideDefaultSuccessMessage(actionRequest);

			sendRedirect(actionRequest, actionResponse);
		}
		catch (CampaignValidationException e) {

			// Set error messages from the service layer.
			
			e.getErrors().forEach(
				key -> SessionErrors.add(actionRequest, key));
			
			actionResponse.setRenderParameter(
				"mvcRenderCommandName", MVCCommandNames.EDIT_LEAD);			

		}
		catch (PortalException e) {

			_log.error(e);

			// Set error message.
			
			SessionErrors.add(actionRequest, "error.campaign-service-error");

			actionResponse.setRenderParameter(
				"mvcRenderCommandName", MVCCommandNames.EDIT_LEAD);			
		}
	}

	@Reference
	protected CampaignService _campaignService;

	private static final Log _log =
		LogFactoryUtil.getLog(EditCampaignMVCActionCommand.class);

}

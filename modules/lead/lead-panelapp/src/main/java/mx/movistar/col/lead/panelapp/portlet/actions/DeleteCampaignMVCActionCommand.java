/**
 * 
 */
package mx.movistar.col.lead.panelapp.portlet.actions;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

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
			"mvc.command.name=" + MVCCommandNames.DELETE_CAMPAIGN
		},
		service = MVCActionCommand.class
	)
public class DeleteCampaignMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		// Get assignment id from request.

		long campaignId = ParamUtil.getLong(actionRequest, "campaignId");

		if (_log.isDebugEnabled()) {
			_log.debug("Deleting campaign " + campaignId);
		}

		try {

			// Call service to delete the campaign.

			_campaignService.deleteCampaign(campaignId);

			// Set success message.

			SessionMessages.add(actionRequest, "campaign-deleted");

		}
		catch (PortalException e) {

			// Set error message.

			SessionErrors.add(actionRequest, "error.campaign-service-error");

			_log.error(e);
		}

	}

	@Reference
	protected CampaignService _campaignService;

	private static final Log _log =
		LogFactoryUtil.getLog(DeleteCampaignMVCActionCommand.class);

}

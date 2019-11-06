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
import mx.movistar.col.lead.service.LeadService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + LeadsPortletKeys.LeadsPanelApp,
			"mvc.command.name=" + MVCCommandNames.DELETE_LEAD
		},
		service = MVCActionCommand.class
	)
public class DeleteLeadMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		// Get assignment id from request.

		long leadId = ParamUtil.getLong(actionRequest, "leadId");

		if (_log.isDebugEnabled()) {
			_log.debug("Deleting assignment " + leadId);
		}

		try {

			// Call service to delete the assignment.

			_assignmentService.deleteLead(leadId);

			// Set success message.

			SessionMessages.add(actionRequest, "lead-deleted");

		}
		catch (PortalException e) {

			// Set error message.

			SessionErrors.add(actionRequest, "error.lead-service-error");

			_log.error(e);
		}

	}

	@Reference
	protected LeadService _assignmentService;

	private static final Log _log =
		LogFactoryUtil.getLog(DeleteLeadMVCActionCommand.class);

}

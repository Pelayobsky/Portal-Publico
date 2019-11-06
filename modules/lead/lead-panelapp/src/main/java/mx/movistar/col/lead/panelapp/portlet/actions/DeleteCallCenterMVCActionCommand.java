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
import mx.movistar.col.lead.service.CallCenterService;


@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + LeadsPortletKeys.CallCenterPanelApp,
			"mvc.command.name=" + MVCCommandNames.DELETE_CALLCENTER
		},
		service = MVCActionCommand.class
	)
public class DeleteCallCenterMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		// Get assignment id from request.

		long callCenterId = ParamUtil.getLong(actionRequest, "callCenterId");

		if (_log.isDebugEnabled()) {
			_log.debug("Deleting assignment " + callCenterId);
		}

		try {

			// Call service to delete the assignment.

			_assignmentService.deleteCallCenter(callCenterId);

			// Set success message.

			SessionMessages.add(actionRequest, "callcenter-deleted");

		}
		catch (PortalException e) {

			// Set error message.

			SessionErrors.add(actionRequest, "error.callCenter-service-error");

			_log.error(e);
		}

	}

	@Reference
	protected CallCenterService _assignmentService;

	private static final Log _log =
		LogFactoryUtil.getLog(DeleteCallCenterMVCActionCommand.class);

}

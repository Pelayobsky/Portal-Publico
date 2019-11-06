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
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.exception.LeadValidationException;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;

import mx.movistar.col.lead.model.CallCenter;
import mx.movistar.col.lead.service.CallCenterService;


@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + LeadsPortletKeys.CallCenterPanelApp,
				"mvc.command.name=" + MVCCommandNames.EDIT_CALLCENTER
		},
		service = MVCActionCommand.class)
public class EditCallCenterMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ServiceContext serviceContext =
			ServiceContextFactory.getInstance(CallCenter.class.getName(), actionRequest);

		// Get parameters from the request.
		long campaignId = ParamUtil.getLong(actionRequest, "campaign");
		long callCenterId = ParamUtil.getLong(actionRequest, "callCenterId");
		String source = ParamUtil.getString(actionRequest, "source");
		String type = ParamUtil.getString(actionRequest, "type");
		String product = ParamUtil.getString(actionRequest, "product");
		Boolean name = ParamUtil.getBoolean(actionRequest, "hasName");
		Boolean email = ParamUtil.getBoolean(actionRequest, "hasEmail");
		Boolean phone = ParamUtil.getBoolean(actionRequest, "hasPhone");
		Boolean extra1 = ParamUtil.getBoolean(actionRequest, "extra1");
		Boolean extra2 = ParamUtil.getBoolean(actionRequest, "extra2");
		Boolean extra3 = ParamUtil.getBoolean(actionRequest, "extra3");
		
		//fill parameters map
		Map<String, String> parameters = new HashMap<>();
		parameters.put("campaignId", String.valueOf(campaignId));
		parameters.put("source", source);
		parameters.put("type", type);
		parameters.put("product", product);
		parameters.put("hasName",name.toString());
		parameters.put("hasEmail",email.toString());
		parameters.put("hasPhone",phone.toString());
		parameters.put("extra1",extra1.toString());
		parameters.put("extra2",extra2.toString());
		parameters.put("extra3", extra3.toString());
		
		if (_log.isDebugEnabled()) {
			_log.debug("Editing CallCenter " + callCenterId);
		}

		Map<Locale, String> title =
			LocalizationUtil.getLocalizationMap(actionRequest, "title");

		String description = ParamUtil.getString(actionRequest, "description");

		Date dueDate = ParamUtil.getDate(
			actionRequest, "dueDate",
			DateFormatFactoryUtil.getDate(actionRequest.getLocale()));
		
		try {
			
			// Call the service to update the Lead
			
			_callCenterService.updateCallCenter(
				callCenterId, title, description, dueDate, parameters, serviceContext);

			// Set success message.
			
			SessionMessages.add(actionRequest, "callCenter-updated");

			// Hide default success message.
			
			hideDefaultSuccessMessage(actionRequest);

			sendRedirect(actionRequest, actionResponse);
		}
		catch (LeadValidationException e) {

			// Set error messages from the service layer.
			
			e.getErrors().forEach(
				key -> SessionErrors.add(actionRequest, key));
			
			actionResponse.setRenderParameter(
				"mvcRenderCommandName", MVCCommandNames.EDIT_CALLCENTER);			

		}
		catch (PortalException e) {

			_log.error(e);

			// Set error message.
			
			SessionErrors.add(actionRequest, "error.callCenter-service-error");

			actionResponse.setRenderParameter(
				"mvcRenderCommandName", MVCCommandNames.EDIT_CALLCENTER);			
		}
	}

	@Reference
	protected CallCenterService _callCenterService;

	private static final Log _log =
		LogFactoryUtil.getLog(EditCallCenterMVCActionCommand.class);

}

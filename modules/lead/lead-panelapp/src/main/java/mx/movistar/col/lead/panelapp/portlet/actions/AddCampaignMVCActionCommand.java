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
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

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


@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name="+LeadsPortletKeys.CampaignPanelApp,
	        "mvc.command.name="+ MVCCommandNames.ADD_CAMPAIGN
	    },
	    service = MVCActionCommand.class
)
public class AddCampaignMVCActionCommand extends BaseMVCActionCommand {
	
	private static final Log _logger = LogFactoryUtil.getLog(AddCampaignMVCActionCommand.class);
	
	/*
	 * (non-Javadoc)
	 * @see com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand#doProcessAction(javax.portlet.ActionRequest, javax.portlet.ActionResponse)
	 */
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		_logger.info("llegue aqui");
		
		ThemeDisplay themeDisplay =
				(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Campaign.class.getName(), actionRequest);
		
		// Get parameters from the request.

		// Use LocalizationUtil to get a localized parameter.

		Map<Locale, String> title =
					LocalizationUtil.getLocalizationMap(actionRequest, "title");
		
		String description = ParamUtil.getString(actionRequest, "description");

		Date dueDate = ParamUtil.getDate(
			actionRequest, "dueDate",
			DateFormatFactoryUtil.getDate(actionRequest.getLocale()));
		
		try {
			
			_logger.info("llegue aqui tambien");
			
			_logger.info("********");
			_logger.info("title"+title);
			_logger.info("description"+description);
			_logger.info("dueDate"+dueDate);
			_logger.info("serviceContext"+serviceContext);
			_logger.info("themeDisplay.getScopeGroupId()"+themeDisplay.getScopeGroupId());
			_logger.info("********");
			
			_campaignService.addCampaign(themeDisplay.getScopeGroupId(), title, description, dueDate, serviceContext);
			
			System.out.println();
			
			// Set success message.
			SessionMessages.add(actionRequest, "campaign-added");
			
			_logger.info("si llego aqui??");

			// Hide default success message.
			hideDefaultSuccessMessage(actionRequest);
						
			sendRedirect(actionRequest, actionResponse);
			
			
		}catch (CampaignValidationException e) {
			
			// Set error messages from the service layer.
			e.getErrors().forEach(key -> SessionErrors.add(actionRequest, key));
						
			actionResponse.setRenderParameter(
							"mvcRenderCommandName", MVCCommandNames.EDIT_LEAD);	
		}catch(PortalException e) {
			_logger.error(e);
			// Set error message.
			SessionErrors.add(actionRequest, "error.Lead-service-error");
			actionResponse.setRenderParameter(
				"mvcRenderCommandName", MVCCommandNames.EDIT_LEAD);	
		}
		
		/*
		String title       = ParamUtil.getString(actionRequest, "nombre");
		String description = ParamUtil.getString(actionRequest, "descripcion");
		long   campaigntId = ParamUtil.getLong(actionRequest  , "id",0);
		int dobDay   = ParamUtil.getInteger(actionRequest, "dobDay");
		int dobMonth = ParamUtil.getInteger(actionRequest, "dobMonth");
		int dobYear  = ParamUtil.getInteger(actionRequest, "dobYear");

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, dobDay);
		calendar.set(Calendar.MONTH, dobMonth);
		calendar.set(Calendar.YEAR, dobYear);
		
		
		if(campaigntId==0) {
			Calendar today = Calendar.getInstance();
			today.set(Calendar.HOUR_OF_DAY, 0);
		    
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);		
			long id = CounterLocalServiceUtil.increment(Campaign.class.getName());
			Campaign campaign = _campaignService.createCampaign(id);
			campaign.setGroupId(themeDisplay.getScopeGroupId());//
			campaign.setCompanyId(themeDisplay.getCompanyId());
			campaign.setUserId(themeDisplay.getUser().getUserId());
			campaign.setName(themeDisplay.getUser().getFullName());//
			campaign.setCreateDate(today.getTime());
			campaign.setModifiedDate(null);
			campaign.setDueDate(null);
			campaign.setStatus(1);
			campaign.setTitle(title);
			campaign.setDescription(description);
			campaign.setDueDate(calendar.getTime());
			
			_campaignService.addCampaign(campaign);
		}else {
		
			_campaignService.updateEntry(campaigntId, title, description, calendar.getTime());
		}
		*/
	}
	
	@Reference
	private CampaignService _campaignService;


}
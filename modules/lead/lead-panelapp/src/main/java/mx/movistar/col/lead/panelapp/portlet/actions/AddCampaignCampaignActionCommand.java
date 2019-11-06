package mx.movistar.col.lead.panelapp.portlet.actions;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Calendar;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.service.CampaignLocalService;
import mx.movistar.col.lead.service.CampaignLocalServiceUtil;


@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name="+LeadsPortletKeys.CampaignPanelApp,
	        "mvc.command.name=/campaign/add"
	    },
	    service = MVCActionCommand.class
)
public class AddCampaignCampaignActionCommand extends BaseMVCActionCommand {
	
	private static final Log _logger = LogFactoryUtil.getLog(AddCampaignCampaignActionCommand.class);

	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		//_logger.info("si llego aqui??");
//		
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
			Campaign campaign = CampaignLocalServiceUtil.createCampaign(id);
			campaign.setGroupId(themeDisplay.getScopeGroupId());//
			campaign.setCompanyId(themeDisplay.getCompanyId());
			campaign.setUserId(themeDisplay.getUser().getUserId());
			//campaign.setName(themeDisplay.getUser().getFullName());//
			campaign.setCreateDate(today.getTime());
			campaign.setModifiedDate(null);
			campaign.setDueDate(null);
			campaign.setStatus(1);
			campaign.setTitle(title);
			campaign.setDescription(description);
			campaign.setDueDate(calendar.getTime());
			
			campaignService.addCampaign(campaign);
		}else {
		
			campaignService.updateEntry(campaigntId, title, description, calendar.getTime());
		}
		
	}
	
	@Reference
	private CampaignLocalService campaignService;


}

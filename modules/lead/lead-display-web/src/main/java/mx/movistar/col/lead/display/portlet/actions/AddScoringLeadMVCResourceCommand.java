/**
 * 
 */
package mx.movistar.col.lead.display.portlet.actions;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.business.api.LeadBusinessService;
import mx.movistar.col.lead.business.exception.BusinessException;
import mx.movistar.col.lead.business.model.GenericLead;
import mx.movistar.col.lead.configuration.LeadDisplayPortletInstanceConfiguration;
import mx.movistar.col.lead.display.constants.LeadDisplayWebPortletKeys;
import mx.movistar.col.lead.display.constants.MVCCommandNames;
import mx.movistar.col.lead.display.portlet.config.LeadDisplayAccessContext;

/**
 * @author hectorsv
 *
 */
@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name="+LeadDisplayWebPortletKeys.LEAD_DISPLAY,
	        "mvc.command.name="+ MVCCommandNames.ADD_SCORING_LEAD
	    },
	    service = MVCResourceCommand.class
)
public class AddScoringLeadMVCResourceCommand extends BaseMVCResourceCommand {
	
	private static final Log _logger = LogFactoryUtil.getLog(AddScoringLeadMVCResourceCommand.class);
	
	@Reference
	private LeadBusinessService _leadBusinessService;
	
	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		
		JSONObject jsonResponse = JSONFactoryUtil.createJSONObject();
		jsonResponse.put("success", Boolean.FALSE);
		try {
			
			//cargamos el configuration del widget
			LeadDisplayAccessContext accessContext = new LeadDisplayAccessContext(resourceRequest);
			LeadDisplayPortletInstanceConfiguration displayPortletInstanceConfiguration = 
					accessContext.getLeadDisplayPortletInstanceConfiguration();
			
			String email = ParamUtil.getString(resourceRequest, "email");
			String phone = ParamUtil.getString(resourceRequest, "phone");
			String name = ParamUtil.getString(resourceRequest, "name");
			String extra1 = ParamUtil.getString(resourceRequest, "extra1");
			String extra2 = ParamUtil.getString(resourceRequest, "extra2");
			String extra3 = ParamUtil.getString(resourceRequest, "extra3");
			String horary = ParamUtil.getString(resourceRequest, "horary");
			String schedule = ParamUtil.getString(resourceRequest, "schedule");
			
			
			if(isValidScoring(Arrays.asList(extra1,extra2,extra3), email, phone, name)) {
				GenericLead genericLead = new GenericLead();
				genericLead.setIdLead(Long.valueOf(displayPortletInstanceConfiguration.leadId()));
				genericLead.setEmail(email);
				genericLead.setName(name);
				genericLead.setPhone(phone);
				genericLead.setExtra(Arrays.asList(extra1,extra2,extra3));
				if(Validator.isNotNull(schedule) && Validator.isNotNull(horary)) {
					DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
					LocalDateTime localDate = LocalDateTime.parse(schedule.concat(StringPool.SPACE + horary), format);
			        genericLead.setDateTimeScheduled(Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant()));
				}
				_leadBusinessService.saveLead(genericLead);
				jsonResponse.put("success", Boolean.TRUE);
			}else {
				jsonResponse.put("errorCode", 1);
			}
			
		} catch (BusinessException e) {
			jsonResponse.put("errorCode", e.getCode());
		} catch (Exception e) {
			jsonResponse.put("errorCode", 9);
			_logger.error("Error",e);
		}finally {
			resourceResponse.getWriter().println(jsonResponse.toJSONString());
		}
		
	}
	
	private Boolean isValidScoring(List<String> extras, String email, String phone, String name) {
		
		Boolean valid = Boolean.TRUE;
		//phone
		if(Validator.isNotNull(phone)) {
			if(!Validator.isNumber(phone) || phone.trim().length() > 12) {
				valid = Boolean.FALSE;
			}
		}
		
		//mail
		if(Validator.isNotNull(email)) {
			if(!Validator.isEmailAddress(email) || email.trim().length() > 75) {
				valid = Boolean.FALSE;
			}
		}
		
		//name
		if(Validator.isNotNull(name)) {
			if( name.trim().length() > 70) {
				valid = Boolean.FALSE;
			}
		}
		
		for(String extra : extras) {
			//extra
			if(Validator.isNotNull(extra)) {
				if( extra.trim().length() > 70) {
					valid = Boolean.FALSE;
				}
			}
		}
		
		return valid;
	}
	
}

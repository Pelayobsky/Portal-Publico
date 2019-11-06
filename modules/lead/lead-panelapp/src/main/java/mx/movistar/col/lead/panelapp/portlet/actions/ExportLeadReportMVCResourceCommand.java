
package mx.movistar.col.lead.panelapp.portlet.actions;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Enumeration;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.business.api.LeadReportService;
import mx.movistar.col.lead.business.constants.ReportType;
import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;
import mx.movistar.col.lead.service.LeadLocalService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + LeadsPortletKeys.ReportsPanelApp,
				"mvc.command.name=" + MVCCommandNames.EXPORT_LEAD_REPORT
		},
		service = MVCResourceCommand.class
)
public class ExportLeadReportMVCResourceCommand extends BaseMVCResourceCommand {

	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws Exception {
		
		
		
		Enumeration<String> params = resourceRequest.getParameterNames();
		
		while(params.hasMoreElements()){
			String paramName = params.nextElement();
			_log.info("Parameter Name - "+paramName+", Value - "+resourceRequest.getParameter(paramName));
		}
		
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		ServiceContext serviceContext = null;
		
		try {
			
			serviceContext = ServiceContextFactory.getInstance( Lead.class.getName(), resourceRequest );
			_log.trace(serviceContext.getLocale());
			
		} catch (PortalException e) {
			_log.error(e);
		}
		
		// Get the workflow status for the list.
		int status = WorkflowConstants.STATUS_APPROVED;
		
		// Get Report Type
		ReportType reportType = Enum.valueOf(ReportType.class, ParamUtil.getString(resourceRequest, "reportType") );
		
		// Get dates from Render Request
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		DateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		
		String fromDateString = ParamUtil.getString(resourceRequest, "fromDate");
		String toDateString = ParamUtil.getString(resourceRequest, "toDate");
		
		_log.debug("fromDateString : " + fromDateString );
		_log.debug("toDateString : " + toDateString );
		
		Date fromDate = null;
		Date toDate = null;
		
		LocalDateTime fromLocalDateTime;
		LocalDateTime toLocalDateTime;
		
		if(Validator.isNull(fromDateString)) {
			fromLocalDateTime = LocalDateTime.now( ZoneId.of( themeDisplay.getTimeZone().getID() ) );
		} else {
			fromLocalDateTime = LocalDateTime.parse(fromDateString.concat(StringPool.SPACE + "00:00:00:000"), dateTimeFormatter);
		}
		
		if(Validator.isNull(fromDateString)) {
			toLocalDateTime = LocalDateTime.now( ZoneId.of( themeDisplay.getTimeZone().getID() ) );
		} else {
			toLocalDateTime = LocalDateTime.parse(toDateString.concat(StringPool.SPACE + "23:59:59:999"), dateTimeFormatter);
		}
		
		fromDate = Date.from( fromLocalDateTime.atZone( ZoneId.of( themeDisplay.getTimeZone().getID() ) ).toInstant() );
		toDate = Date.from( toLocalDateTime.atZone( ZoneId.of( themeDisplay.getTimeZone().getID() ) ).toInstant() );
		
		_log.debug("fromDate : " + ( Validator.isNotNull(fromDate) ? dateTimeFormat.format(fromDate) : "" ) );
		_log.debug("toDate : " + ( Validator.isNotNull(toDate) ? dateTimeFormat.format(toDate) : "" ) );
		
		try {
			
			byte[] leadReportBytes = _leadReportService.getExcelBytes(themeDisplay.getScopeGroupId(), status, fromDate, toDate, reportType, themeDisplay);
			
			PortletResponseUtil.sendFile(resourceRequest, resourceResponse, "LeadReport.xlsx", leadReportBytes, ContentTypes.APPLICATION_VND_MS_EXCEL);
			
		} catch (Exception e) {
			_log.error(e);
		}
		
	}

	@Reference
	protected LeadLocalService _LeadLocalService;
	
	@Reference
	private LeadReportService _leadReportService;

	private static final Log _log = LogFactoryUtil.getLog(ExportLeadReportMVCResourceCommand.class);

}

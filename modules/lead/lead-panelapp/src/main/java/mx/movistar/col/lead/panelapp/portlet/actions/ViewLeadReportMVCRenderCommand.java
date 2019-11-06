/**
 * 
 */
package mx.movistar.col.lead.panelapp.portlet.actions;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.model.impl.LeadReportImpl;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;
import mx.movistar.col.lead.permission.LeadPermissionChecker;
import mx.movistar.col.lead.service.LeadLocalService;

/**
 * @author siulpendergast
 *
 */
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + LeadsPortletKeys.ReportsPanelApp,
			"mvc.command.name=" + MVCCommandNames.VIEW_LEAD_REPORT
		},
		service = MVCRenderCommand.class
	)
public class ViewLeadReportMVCRenderCommand implements MVCRenderCommand {
	
	private static final Log _log = LogFactoryUtil.getLog(ViewLeadReportMVCRenderCommand.class);
	
	@Reference
	protected LeadPermissionChecker _leadPermissionChecker;

	@Reference
	protected LeadLocalService _LeadLocalService;
	
	@Reference
	private Portal _portal;
	
	@Override
	public String render( RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		_log.debug("Render phase");
		
		//renderRequest.setAttribute("currentURL", PortalUtil.getCurrentURL(renderRequest));
		//renderRequest.setAttribute("mvcRenderCommandName", MVCCommandNames.VIEW_LEAD_REPORT);

		// Add Lead list related attributes.

		addLeadListAttributes(renderRequest);

		// Add permission checker

		//renderRequest.setAttribute("leadPermissionChecker", _leadPermissionChecker);

		// Add attributes needed by Application Display Templates renderer.

		addADTAttributes(renderRequest);
		
		return "/reports/view.jsp";
	}

	/**
	 * Add attributes needed by Application Display Templates renderer.
	 * 
	 * @param renderRequest
	 */
	private void addADTAttributes(RenderRequest renderRequest) {

		ThemeDisplay themeDisplay =
			(ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		renderRequest.setAttribute(
			"leadReportClassName", LeadReportImpl.class.getName());

		PortletPreferences portletPreferences = renderRequest.getPreferences();

		renderRequest.setAttribute(
			"ADTdisplayStyle",
			portletPreferences.getValue("displayStyle", StringPool.BLANK));
		renderRequest.setAttribute(
			"ADTdisplayStyleGroupId",
			GetterUtil.getLong(
				portletPreferences.getValue("displayStyleGroupId", null),
				themeDisplay.getScopeGroupId()));

	}

	/**
	 * Adds assigment list related attributes to the request.
	 * 
	 * @param renderRequest
	 * @throws PortalException 
	 * @throws ParseException 
	 */
	private void addLeadListAttributes(RenderRequest renderRequest) {
		
		Enumeration<String> params = renderRequest.getParameterNames(); 
		
		while(params.hasMoreElements()){
			String paramName = params.nextElement();
			_log.trace("Parameter Name - "+paramName+", Value - "+renderRequest.getParameter(paramName));
		}
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		_log.trace( themeDisplay.getTimeZone().toString() );
		_log.trace( themeDisplay.getUser().getTimeZone().toString() );
		
		ServiceContext serviceContext = null;
		
		try {
			
			serviceContext = ServiceContextFactory.getInstance( Lead.class.getName(), renderRequest );
			_log.trace(serviceContext.getLocale());
			
		} catch (PortalException e) {
			_log.error(e);
		}
		
		// Resolve start and end for the search.
		
		int currentPage = ParamUtil.getInteger(
			renderRequest, SearchContainer.DEFAULT_CUR_PARAM,
			SearchContainer.DEFAULT_CUR);

		int delta = ParamUtil.getInteger(
			renderRequest, SearchContainer.DEFAULT_DELTA_PARAM,
			SearchContainer.DEFAULT_DELTA);

		int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
		int end = start + delta;
		
		_log.trace("currentPage : " + currentPage);
		_log.trace("delta : " + delta);
		_log.trace("start : " + start);
		_log.trace("end : " + end);
		
		// Get the workflow status for the list.
		int status = WorkflowConstants.STATUS_APPROVED;
		
		// Get dates from Render Request
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		DateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		
		String fromDateString = ParamUtil.getString(renderRequest, "fromDate");
		String toDateString = ParamUtil.getString(renderRequest, "toDate");
		
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
		
		// Call the service to get the list of Campaign.
		List<LeadReportImpl> leadReportEntries = _LeadLocalService.findLeadReportByG_S_DateRange(themeDisplay.getScopeGroupId(), status, fromDate, toDate, start, end);
		
		renderRequest.setAttribute("leadReportEntries", leadReportEntries);
		renderRequest.setAttribute("leadReportEntriesCount", _LeadLocalService.countLeadReportEntriesByG_S_DateRange(themeDisplay.getScopeGroupId(), status, fromDate, toDate));
		
		renderRequest.setAttribute("fromDateInputValue", fromLocalDateTime.format(dateFormatter));
		renderRequest.setAttribute("toDateInputValue", toLocalDateTime.format(dateFormatter));
		
	}
	
}

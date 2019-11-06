/**
 * 
 */
package mx.movistar.col.lead.panelapp.portlet.actions;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;
import mx.movistar.col.lead.permission.LeadPermissionChecker;
import mx.movistar.col.lead.service.LeadService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + LeadsPortletKeys.LeadsPanelApp,
			"mvc.command.name=" + MVCCommandNames.VIEW_LEADS
		},
		service = MVCRenderCommand.class
	)
public class ViewLeadMVCRenderCommand implements MVCRenderCommand {
	
	@Reference
	protected LeadPermissionChecker _leadPermissionChecker;

	@Reference
	protected LeadService _LeadService;
	
	@Reference
	private Portal _portal;
	
	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {
		

		// Add Lead list related attributes.

		addLeadListAttributes(renderRequest);

		// Add permission checker

		renderRequest.setAttribute("leadPermissionChecker", _leadPermissionChecker);

		// Add attributes needed by Application Display Templates renderer.

		addADTAttributes(renderRequest);
		
		return "/leads/view.jsp";
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
			"leadClassName", Lead.class.getName());

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
	 */
	private void addLeadListAttributes(RenderRequest renderRequest) {

		ThemeDisplay themeDisplay =
			(ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		// Resolve start and end for the search.

		int currentPage = ParamUtil.getInteger(
			renderRequest, SearchContainer.DEFAULT_CUR_PARAM,
			SearchContainer.DEFAULT_CUR);

		int delta = ParamUtil.getInteger(
			renderRequest, SearchContainer.DEFAULT_DELTA_PARAM,
			SearchContainer.DEFAULT_DELTA);

		int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
		int end = start + delta;

		// Get sorting options.
		// Notice that this doesn't really sort on title because the field is
		// stored in XML
		// In real world this search would be integrated to the search engine to
		// get localized
		// sort options.

		String orderByCol =
			ParamUtil.getString(renderRequest, "orderByCol", "modifiedDate");
		String orderByType =
			ParamUtil.getString(renderRequest, "orderByType", "desc");

		// Create comparator

		OrderByComparator<Lead> comp =
			OrderByComparatorFactoryUtil.create(
				"Lead", orderByCol, !("asc").equals(orderByType));

		// Get keywords.
		// Notice that cleaning keywords is not implemented.

		String keywords = ParamUtil.getString(renderRequest, "keywords");
		
		// Get the workflow status for the list.
		
		int status = WorkflowConstants.STATUS_APPROVED;
		
		// Call the service to get the list of Campaign.
		
		List<Lead> leads =
			_LeadService.getLeadsByKeywords(
				themeDisplay.getScopeGroupId(), keywords, start, end, status, comp);
		
		
		renderRequest.setAttribute("leads", leads);
		renderRequest.setAttribute(
			"leadCount", _LeadService.getLeadsCountByKeywords(
				themeDisplay.getScopeGroupId(), keywords, status));

	}
	
}

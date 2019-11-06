/**
 * 
 */
package mx.movistar.col.lead.display.portlet.config;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.display.constants.LeadDisplayWebPortletKeys;
import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.service.LeadService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + LeadDisplayWebPortletKeys.LEAD_DISPLAY
		},
		service = ConfigurationAction.class
	)
public class LeadDisplayPortletInstanceConfigurationAction extends DefaultConfigurationAction {
	
	private static final Log _log = LogFactoryUtil.getLog(
			LeadDisplayPortletInstanceConfigurationAction.class);
	
	/**
	 * getJspPath: Return the path to our configuration jsp file.
	 * @param request The servlet request.
	 * @return String The path
	 */
	@Override
	public String getJspPath(HttpServletRequest request) {
		return "/configuration.jsp";
	}
	
	/**
	 * processAction: This is used to process the configuration form submission.
	 * @param portletConfig The portlet configuration.
	 * @param actionRequest The action request.
	 * @param actionResponse The action response.
	 * @throws Exception in case of error.
	 */
	@Override
	public void processAction(
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse)
		throws Exception {
		
		// extract all of the parameters from the request.

		String title = getParameter(actionRequest, "title");
		String subtitle = getParameter(
			actionRequest, "subtitle");
		String field1 = getParameter(
			actionRequest, "field1");
		String freeText = getParameter(
			actionRequest, "freeText");
		String displayStyle = getParameter(
			actionRequest, "displayStyle");
		String leadId = getParameter(actionRequest, "leadId");
		// lets log them for fun and giggles

		
		_log.info("Configuration setting:");
		_log.info("  leadId = [" + leadId + "]");
		_log.info("  title = [" + title + "]");
		_log.info("  subtitle = " + subtitle);
		_log.info("  field1 = " + field1);
		_log.info("  freeText = " + freeText);
		_log.info("  displayStyle = " + displayStyle);

		// Set the preference values
		
		
		setPreference(actionRequest, "title", title);
		setPreference(actionRequest, "subtitle", subtitle);
		setPreference(actionRequest, "field1", field1);
		setPreference(actionRequest, "freeText", freeText);
		setPreference(actionRequest, "displayStyle", displayStyle);
		setPreference(actionRequest, "leadId", leadId);
	
		// fall through to the super action for the rest of the handling

		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	@Override
	public void include(PortletConfig portletConfig, HttpServletRequest httpServletRequest,
	        HttpServletResponse httpServletResponse) throws Exception {
		addCampignsAttributes(httpServletRequest);
		
		super.include(portletConfig, httpServletRequest, httpServletResponse);
	}
	
	/**
	 * 
	 * @param request
	 */
	private void addCampignsAttributes(HttpServletRequest request) {
		
		ThemeDisplay themeDisplay =
				(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		List<Lead> leads = _leadService.getLeadsByGroupId(themeDisplay.getScopeGroupId());
		request.setAttribute("leads", leads);
	}

	/**
	 * setServletContext: Sets the servlet context, use your portlet's bnd.bnd Bundle-SymbolicName value.
	 * @param servletContext The servlet context to use.
	 */
	@Override
	@Reference(
		target = "(osgi.web.symbolicname=mx.movistar.col.lead.display.web)",
		unbind = "-"
	)
	public void setServletContext(ServletContext servletContext) {
		super.setServletContext(servletContext);
	}
	
	@Reference
	private LeadService _leadService;
	
}

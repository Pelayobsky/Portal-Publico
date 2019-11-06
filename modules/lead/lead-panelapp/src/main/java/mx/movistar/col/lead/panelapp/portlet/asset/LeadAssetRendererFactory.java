/**
 * 
 */
package mx.movistar.col.lead.panelapp.portlet.asset;

import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLFactory;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.Html;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PortalUtil;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;
import mx.movistar.col.lead.permission.LeadPermissionChecker;
import mx.movistar.col.lead.service.LeadLocalService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + LeadsPortletKeys.LeadsPanelApp
		}, 
		service = AssetRendererFactory.class
	)
public class LeadAssetRendererFactory extends BaseAssetRendererFactory<Lead> {
	
	private static Log _logger = LogFactoryUtil.getLog(LeadAssetRendererFactory.class);
	
	public LeadAssetRendererFactory() {
		_logger.info(">>>>>Inicializando  LeadAssetRendererFactory");
		setClassName(CLASS_NAME);
		setLinkable(true);
		setPortletId(LeadsPortletKeys.LeadsPanelApp);
		setSearchable(true);
	}

	@Override
	public AssetRenderer<Lead> getAssetRenderer(long classPK, int type)
		throws PortalException {

		Lead lead = _leadLocalService.getLead(classPK);

		LeadAssetRenderer leadAssetRenderer =
			new LeadAssetRenderer(lead, this);

		leadAssetRenderer.setAssetRendererType(type);
		return leadAssetRenderer;
	}

	@Override
	public String getType() {

		return TYPE;
	}

	@Override
	public PortletURL getURLAdd(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse, long classTypeId) {

		PortletURL portletURL = PortalUtil.getControlPanelPortletURL(
				liferayPortletRequest, LeadsPortletKeys.LeadsPanelApp,
				PortletRequest.RENDER_PHASE);

			portletURL.setParameter(
				"mvcRenderCommandName", MVCCommandNames.EDIT_LEAD);
			return portletURL;
	}

	public LeadLocalService getLeadLocalService() {

		return _leadLocalService;
	}

	public Portal getPortal() {

		return _portal;
	}

	public LeadPermissionChecker leadPermissionChecker() {

		return _leadPermissionChecker;
	}

	public Html getHtml() {

		return _html;
	}

	public PortletURLFactory getPortletURLFactory() {

		return _portletURLFactory;
	}

	@Override
	public boolean hasAddPermission(
		PermissionChecker permissionChecker, long groupId, long classTypeId)
		throws Exception {
		_logger.info("hasAddPermission");
		return _leadPermissionChecker.containsTopLevel(
			permissionChecker, groupId,
			LeadPermissionChecker.ADD_LEAD);
	}

	@Override
	public boolean hasPermission(
		PermissionChecker permissionChecker, long classPK, String actionId)
		throws Exception {
		_logger.info("hasPermission");
		Lead lead = _leadLocalService.getLead(classPK);

		return _leadPermissionChecker.contains(
			permissionChecker, lead.getGroupId(),
			lead.getLeadId(), actionId);
	}

	@Reference(target = "(osgi.web.symbolicname=mx.movistar.col.lead.panelapp)")
	private ServletContext _servletContext;

	@Reference
	private LeadLocalService _leadLocalService;

	@Reference
	private Portal _portal;

	@Reference
	private Html _html;

	@Reference
	private PortletURLFactory _portletURLFactory;

	@Reference
	private LeadPermissionChecker _leadPermissionChecker;

	public static final String CLASS_NAME = Lead.class.getName();
	public static final String TYPE = "lead";

}

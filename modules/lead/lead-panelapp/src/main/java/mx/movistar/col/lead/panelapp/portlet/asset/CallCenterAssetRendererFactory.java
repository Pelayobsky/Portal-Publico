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

import mx.movistar.col.lead.model.CallCenter;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;
import mx.movistar.col.lead.permission.CallCenterPermissionChecker;
import mx.movistar.col.lead.service.CallCenterLocalService;


@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + LeadsPortletKeys.CallCenterPanelApp
		}, 
		service = AssetRendererFactory.class
	)
public class CallCenterAssetRendererFactory extends BaseAssetRendererFactory<CallCenter> {
	
	private static Log _logger = LogFactoryUtil.getLog(CallCenterAssetRendererFactory.class);
	
	public CallCenterAssetRendererFactory() {
		_logger.info(">>>>>Inicializando  CallCenterAssetRendererFactory");
		setClassName(CLASS_NAME);
		setLinkable(true);
		setPortletId(LeadsPortletKeys.CallCenterPanelApp);
		setSearchable(true);
	}

	@Override
	public AssetRenderer<CallCenter> getAssetRenderer(long classPK, int type)
		throws PortalException {

		CallCenter callCenter = _callCenterLocalService.getCallCenter(classPK);

		CallCenterAssetRenderer callCenterAssetRenderer =
			new CallCenterAssetRenderer(callCenter, this);

		callCenterAssetRenderer.setAssetRendererType(type);
		return callCenterAssetRenderer;
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
				liferayPortletRequest, LeadsPortletKeys.CallCenterPanelApp,
				PortletRequest.RENDER_PHASE);

			portletURL.setParameter(
				"mvcRenderCommandName", MVCCommandNames.EDIT_CALLCENTER);
			return portletURL;
	}

	public CallCenterLocalService getCallCenterLocalService() {

		return _callCenterLocalService;
	}

	public Portal getPortal() {

		return _portal;
	}

	public CallCenterPermissionChecker callCenterPermissionChecker() {

		return _callCenterPermissionChecker;
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
		return _callCenterPermissionChecker.containsTopLevel(
			permissionChecker, groupId,
			CallCenterPermissionChecker.ADD_CALLCENTER);
	}

	@Override
	public boolean hasPermission(
		PermissionChecker permissionChecker, long classPK, String actionId)
		throws Exception {
		_logger.info("hasPermission");
		CallCenter callCenter = _callCenterLocalService.getCallCenter(classPK);

		return _callCenterPermissionChecker.contains(
			permissionChecker, callCenter.getGroupId(),
			callCenter.getCallCenterId(), actionId);
	}

	@Reference(target = "(osgi.web.symbolicname=mx.movistar.col.lead.panelapp)")
	private ServletContext _servletContext;

	@Reference
	private CallCenterLocalService _callCenterLocalService;

	@Reference
	private Portal _portal;

	@Reference
	private Html _html;

	@Reference
	private PortletURLFactory _portletURLFactory;

	@Reference
	private CallCenterPermissionChecker _callCenterPermissionChecker;

	public static final String CLASS_NAME = CallCenter.class.getName();
	public static final String TYPE = "lead";

}


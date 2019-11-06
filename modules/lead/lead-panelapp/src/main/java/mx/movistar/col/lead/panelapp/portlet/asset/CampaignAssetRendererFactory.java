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

import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;
import mx.movistar.col.lead.permission.CampaignPermissionChecker;
import mx.movistar.col.lead.service.CampaignLocalService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + LeadsPortletKeys.CampaignPanelApp
		}, 
		service = AssetRendererFactory.class
	)
public class CampaignAssetRendererFactory extends BaseAssetRendererFactory<Campaign> {
	
	private static Log _logger = LogFactoryUtil.getLog(CampaignAssetRendererFactory.class);
	
	public CampaignAssetRendererFactory() {
		_logger.info(">>>>>Inicializando  CampaignAssetRendererFactory");
		setClassName(CLASS_NAME);
		setLinkable(true);
		setPortletId(LeadsPortletKeys.CampaignPanelApp);
		setSearchable(true);
	}

	@Override
	public AssetRenderer<Campaign> getAssetRenderer(long classPK, int type)
		throws PortalException {

		Campaign campaign = _campaignLocalService.getCampaign(classPK);

		CampaignAssetRenderer campaignAssetRenderer =
			new CampaignAssetRenderer(campaign, this);

		campaignAssetRenderer.setAssetRendererType(type);
		return campaignAssetRenderer;
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
				liferayPortletRequest, LeadsPortletKeys.CampaignPanelApp,
				PortletRequest.RENDER_PHASE);

			portletURL.setParameter(
				"mvcRenderCommandName", MVCCommandNames.EDIT_CAMPAIGN);
			return portletURL;
	}

	public CampaignLocalService getCampaignLocalService() {

		return _campaignLocalService;
	}

	public Portal getPortal() {

		return _portal;
	}

	public CampaignPermissionChecker campaignPermissionChecker() {

		return _campaignPermissionChecker;
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
		return _campaignPermissionChecker.containsTopLevel(
			permissionChecker, groupId,
			CampaignPermissionChecker.ADD_CAMPAIGN);
	}

	@Override
	public boolean hasPermission(
		PermissionChecker permissionChecker, long classPK, String actionId)
		throws Exception {
		Campaign campaign = _campaignLocalService.getCampaign(classPK);

		return _campaignPermissionChecker.contains(
			permissionChecker, campaign.getGroupId(),
			campaign.getCampaignId(), actionId);
	}

	@Reference(target = "(osgi.web.symbolicname=mx.movistar.col.lead.panelapp)")
	private ServletContext _servletContext;

	@Reference
	private CampaignLocalService _campaignLocalService;

	@Reference
	private Portal _portal;

	@Reference
	private Html _html;

	@Reference
	private PortletURLFactory _portletURLFactory;

	@Reference
	private CampaignPermissionChecker _campaignPermissionChecker;

	public static final String CLASS_NAME = Campaign.class.getName();
	public static final String TYPE = "campaign";
	
}

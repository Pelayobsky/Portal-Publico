/**
 * 
 */
package mx.movistar.col.lead.panelapp.portlet.asset;

import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys;
import mx.movistar.col.lead.panelapp.constants.MVCCommandNames;

/**
 * @author hectorsv
 *
 */
public class CampaignAssetRenderer extends BaseJSPAssetRenderer<Campaign> {
	
	public CampaignAssetRenderer(Campaign campaign,CampaignAssetRendererFactory assetRendererFactory) {
		_campaignAssetRendererFactory = assetRendererFactory;
		_campaign = campaign;
	}

	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker)
		throws PortalException {

		return _campaignAssetRendererFactory.campaignPermissionChecker().contains(
			permissionChecker, _campaign.getGroupId(),
			_campaign.getCampaignId(), ActionKeys.UPDATE);
	}

	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker)
		throws PortalException {

		
		return _campaignAssetRendererFactory.campaignPermissionChecker().contains(
			permissionChecker, _campaign.getGroupId(),
			_campaign.getCampaignId(), ActionKeys.VIEW);
	}

	@Override
	public Campaign getAssetObject() {

		return _campaign;
	}

	@Override
	public long getGroupId() {

		return _campaign.getGroupId();
	}

	@Override
	public long getUserId() {

		return _campaign.getUserId();
	}

	@Override
	public String getUserName() {

		return _campaign.getUserName();
	}

	@Override
	public String getUuid() {

		return _campaign.getUuid();
	}

	@Override
	public String getClassName() {

		return Campaign.class.getName();
	}

	@Override
	public long getClassPK() {

		return _campaign.getCampaignId();
	}

	@Override
	public String getSummary(
		PortletRequest portletRequest, PortletResponse portletResponse) {

		return HtmlUtil.extractText(_campaign.getDescription());
	}

	@Override
	public String getTitle(Locale locale) {

		return _campaign.getTitle(locale);
	}

	@Override
	public boolean include(
			HttpServletRequest request, HttpServletResponse response,
			String template)
		throws Exception {

		request.setAttribute("campaign", _campaign);
		request.setAttribute("HtmlUtil", HtmlUtil.getHtml());
		request.setAttribute("StringUtil", new StringUtil());
		request.setAttribute(
			"ABSTRACTLENGTH", GetterUtil.getInteger(
					request.getAttribute(WebKeys.ASSET_ENTRY_ABSTRACT_LENGTH), 200));
		
		return super.include(request, response, template);
	}

	@Override
	public String getJspPath(HttpServletRequest request, String template) {
		return "/asset/campaign/" + template + ".jsp";
	}
	
	@Override
	public PortletURL getURLEdit(
			LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse)
		throws Exception {

		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
			getControlPanelPlid(liferayPortletRequest),
			LeadsPortletKeys.CampaignPanelApp, PortletRequest.RENDER_PHASE);

		portletURL.setParameter("mvcRenderCommandName", MVCCommandNames.EDIT_CAMPAIGN);
		portletURL.setParameter(
			"campaignId", String.valueOf(_campaign.getCampaignId()));
		portletURL.setParameter("showback", Boolean.FALSE.toString());
		
		return portletURL;
	}	

	@Override
	public String getURLViewInContext(
			LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse, 
			String noSuchEntryRedirect)
		throws Exception {

		try {
			long plid = PortalUtil.getPlidFromPortletId(
				_campaign.getGroupId(), 
				LeadsPortletKeys.CampaignPanelApp);
			
			PortletURL portletURL;
			if (plid == LayoutConstants.DEFAULT_PLID) {
				portletURL = liferayPortletResponse.createLiferayPortletURL(
					getControlPanelPlid(liferayPortletRequest),
					LeadsPortletKeys.CampaignPanelApp, 
					PortletRequest.RENDER_PHASE);
			}
			else {
				portletURL = PortletURLFactoryUtil.create(
					liferayPortletRequest, LeadsPortletKeys.CampaignPanelApp, 
					plid, PortletRequest.RENDER_PHASE);
			}
			
			portletURL.setParameter(
					"mvcRenderCommandName", MVCCommandNames.VIEW_CAMPAIGN);

			portletURL.setParameter(
				"campaignId", String.valueOf(_campaign.getCampaignId()));
			
			String currentUrl = PortalUtil.getCurrentURL(liferayPortletRequest);
			
			portletURL.setParameter("redirect", currentUrl);
			
			return portletURL.toString();
		
		}
		catch (PortalException e) {
			
		} 
		catch (SystemException e) {
		} 
		
		return noSuchEntryRedirect;
	}
	
	@Override
	public String getURLView(
			LiferayPortletResponse liferayPortletResponse, 
			WindowState windowState) 
		throws Exception {
		
		return super.getURLView(liferayPortletResponse, windowState);
	}
		
	private Campaign _campaign;
	private CampaignAssetRendererFactory _campaignAssetRendererFactory;
	
}

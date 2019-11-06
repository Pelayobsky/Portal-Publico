/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package mx.movistar.col.lead.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.permission.CampaignPermissionChecker;
import mx.movistar.col.lead.service.base.CampaignServiceBaseImpl;
import mx.movistar.col.lead.service.permission.impl.CampaignPermissionCheckerImpl;

/**
 * The implementation of the Campaign remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link mx.movistar.col.lead.service.CampaignService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CampaignServiceBaseImpl
 * @see mx.movistar.col.lead.service.CampaignServiceUtil
 */
public class CampaignServiceImpl extends CampaignServiceBaseImpl {
	private static final Log _logger = LogFactoryUtil.getLog(CampaignServiceImpl.class);
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link mx.movistar.col.lead.service.CampaignServiceUtil} to access the Campaign remote service.
	 */
	
	public Campaign addCampaign(long groupId, Map<Locale, String> title, String description, Date dueDate, ServiceContext serviceContext) throws PortalException {
		
		_logger.info("si llego aqui??");
		
		_logger.info("********");
		_logger.info("title"+title);
		_logger.info("description"+description);
		_logger.info("dueDate"+dueDate);
		_logger.info("serviceContext"+serviceContext);
		_logger.info("********");
		// Check permissions
		
		_campaignPermissionChecker.checkTopLevel(
				getPermissionChecker(), serviceContext.getScopeGroupId(),
				CampaignPermissionCheckerImpl.ADD_CAMPAIGN);
		
		return campaignLocalService.addCampaign(groupId, title, description, dueDate, serviceContext);
	}
	
	public Campaign deleteCampaign(long CampaignId) throws PortalException {
		Campaign Campaign = campaignLocalService.getCampaign(CampaignId);
		
		// Check permissions.
		
		_campaignPermissionChecker.check(
				getPermissionChecker(), Campaign.getGroupId(),
				Campaign.getCampaignId(), ActionKeys.DELETE);
		
		return campaignLocalService.deleteCampaign(Campaign);
	}
	
	public Campaign getCampaign(long CampaignId) throws PortalException {	
		Campaign Campaign = campaignLocalService.getCampaign(CampaignId);
		
		// Check permissions.
		
		_campaignPermissionChecker.check(
			getPermissionChecker(), Campaign.getGroupId(),
			Campaign.getCampaignId(), ActionKeys.VIEW);	
	
		return Campaign;
	}

	public List<Campaign> getCampaignsByGroupId(long groupId, int start, int end, OrderByComparator<Campaign> orderByComparator) {
		return campaignLocalService.getCampaignsByGroupId(groupId, start, end, orderByComparator);
	}
	
	public List<Campaign> getCampaignsByGroupId(long groupId) {
		return campaignLocalService.getCampaignsByGroupId(groupId);
	}
	
	public List<Campaign> getCampaignsByKeywords(long groupId, String keywords, int start, int end, int status, OrderByComparator<Campaign> orderByComparator) {
		return campaignLocalService.getCampaignsByKeywords(groupId, keywords, start, end, status, orderByComparator);
	}
	
	public long getCampaignsCountByKeywords(long groupId, String keywords, int status) {
		return campaignLocalService.getCampaignsCountByKeywords(groupId, keywords, status);
	}
	
	public Campaign updateCampaign(long campaignId, Map<Locale, String> titleMap, String description, Date dueDate, ServiceContext serviceContext) throws PortalException {

		Campaign Campaign = campaignLocalService.getCampaign(campaignId);
				
		// Check permissions.
		
		_campaignPermissionChecker.check(
				getPermissionChecker(), Campaign.getGroupId(),
				Campaign.getCampaignId(), ActionKeys.UPDATE);
		
		return campaignLocalService.updateCampaign(campaignId, titleMap, description, dueDate, serviceContext);
	}
	
	/**
	 * Service builder classes are not OSGi components but Spring beans and you cannot
	 * use the @Reference annotation. Use @ServiceReference instead.
	 */
	@ServiceReference(type = CampaignPermissionChecker.class)
	private CampaignPermissionChecker _campaignPermissionChecker;

}
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

import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.service.base.CampaignLocalServiceBaseImpl;
import mx.movistar.col.lead.service.validation.CampaignValidator;

/**
 * The implementation of the campaign local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link mx.movistar.col.lead.service.CampaignLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CampaignLocalServiceBaseImpl
 * @see mx.movistar.col.lead.service.CampaignLocalServiceUtil
 */
public class CampaignLocalServiceImpl extends CampaignLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * mx.movistar.col.lead.service.CampaignLocalServiceUtil} to access the campaign
	 * local service.
	 */

	// @Reference
	// private CampaignLocalService campaignLocalService;

	public Campaign updateEntry(long campaignId, String title, String description, Date dueDate) throws PortalException {

		Campaign campaign = campaignLocalService.getCampaign(campaignId);

		if (campaign == null) {
			return null;
		}
		campaign.setTitle(title);
		campaign.setDescription(description);
		campaign.setDueDate(dueDate);

		campaign = campaignPersistence.update(campaign);

		return campaign;
	}
	
	/**
	 * Adds an Campaign.
	 * 
	 * @param groupId
	 * @param titleMap
	 * @param description
	 * @param dueDate
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	@Indexable(
		type = IndexableType.REINDEX
	)
	public Campaign addCampaign(
		long groupId, Map<Locale, String> titleMap, String description,
		Date dueDate, ServiceContext serviceContext)
		throws PortalException {

		// Validate Campaign parameters.

		CampaignValidator.validate(titleMap, description, dueDate);

		// Get group and same time validate that it exists.

		Group group = groupPersistence.findByPrimaryKey(groupId);

		long userId = serviceContext.getUserId();

		User user = userLocalService.getUser(userId);

		// Generate primary key for the Campaign.

		long CampaignId =
			counterLocalService.increment(Campaign.class.getName());

		// Create campaign.

		Campaign Campaign = createCampaign(CampaignId);

		// Fill the Campaign

		Campaign.setCompanyId(group.getCompanyId());
		Campaign.setGroupId(groupId);
		Campaign.setUserId(userId);
		Campaign.setTitleMap(titleMap);
		Campaign.setDueDate(dueDate);
		Campaign.setDescription(description);
		Campaign.setStatus(WorkflowConstants.STATUS_DRAFT);
		Campaign.setStatusByUserId(userId);
		Campaign.setStatusByUserName(user.getFullName());
		Campaign.setStatusDate(serviceContext.getModifiedDate(null));
		Campaign.setUserName(user.getScreenName());

		Campaign.setCreateDate(serviceContext.getCreateDate(new Date()));
		Campaign.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		// Persist Campaign.

		Campaign = super.addCampaign(Campaign);

		// Add permission resources.
		
		boolean portletActions = false;
		boolean addGroupPermissions = true;
		boolean addGuestPermissions = true;

		resourceLocalService.addResources(
			group.getCompanyId(), groupId, userId, Campaign.class.getName(),
			Campaign.getCampaignId(), portletActions, addGroupPermissions,
			addGuestPermissions);

		// Update asset.

		updateAsset(Campaign, serviceContext);

		// Start workflow instance and return the Campaign.

		return startWorkflowInstance(userId, Campaign, serviceContext);
	}

	/**
	 * Adds an campaign (silenced)
	 * 
	 * This is an example how to "silence" generated method.
	 * 
	 * @param Campaign
	 * @return
	 */
	@Override
	public Campaign addCampaign(Campaign Campaign) {

		throw new UnsupportedOperationException(
			"please use instead addCampaign(Campaign, ServiceContext)");
	}

	@Indexable(
		type = IndexableType.DELETE
	)
	public Campaign deleteCampaign(long CampaignId)
		throws PortalException {

		Campaign Campaign = getCampaign(CampaignId);

		return deleteCampaign(Campaign);
	}

	/**
	 * Deletes Campaign.
	 * 
	 * @param Campaign
	 * @return
	 * @throws PortalException
	 */
	@Indexable(
		type = IndexableType.DELETE
	)
	public Campaign deleteCampaign(Campaign Campaign)
		 {

		// Delete permission resources.

		try {
			resourceLocalService.deleteResource(
				Campaign, ResourceConstants.SCOPE_INDIVIDUAL);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Delete asset data.

		try {
			assetEntryLocalService.deleteEntry(
				Campaign.class.getName(), Campaign.getCampaignId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Delete workflow instance.

		try {
			workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(
				Campaign.getCompanyId(), Campaign.getGroupId(),
				Campaign.class.getName(), Campaign.getCampaignId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Delete the Campaign

		return super.deleteCampaign(Campaign);
	}

	public List<Campaign> getCampaignsByGroupId(long groupId) {

		return campaignPersistence.findByGroupId(groupId);
	}

	public List<Campaign> getCampaignsByGroupId(
		long groupId, int start, int end) {

		return campaignPersistence.findByGroupId(groupId, start, end);
	}

	public List<Campaign> getCampaignsByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Campaign> orderByComparator) {

		return campaignPersistence.findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Gets Campaigns by keywords and status.
	 * 
	 * This example uses dynamic queries.
	 * 
	 * @param groupId
	 * @param keywords
	 * @param start
	 * @param end
	 * @param status
	 * @param orderByComparator
	 * @return
	 */
	public List<Campaign> getCampaignsByKeywords(
		long groupId, String keywords, int start, int end, int status,
		OrderByComparator<Campaign> orderByComparator) {

		DynamicQuery CampaignQuery =
			dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId));

		if (status != WorkflowConstants.STATUS_ANY) {
			CampaignQuery.add(RestrictionsFactoryUtil.eq("status", status));
		}

		if (Validator.isNotNull(keywords)) {
			Disjunction disjunctionQuery =
				RestrictionsFactoryUtil.disjunction();
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like("title", "%" + keywords + "%"));
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like(
					"description", "%" + keywords + "%"));
			CampaignQuery.add(disjunctionQuery);
		}

		return campaignLocalService.dynamicQuery(
			CampaignQuery, start, end, orderByComparator);
	}

	public List<Campaign> getCampaignsByStatus(int status) {

		return campaignPersistence.findByStatus(status);
	}

	
	public int getCampaignsCountByGroupId(long groupId) {

		return campaignPersistence.countByGroupId(groupId);
	}

	/**
	 * Get Campaign count by keywords and status.
	 * 
	 * This example uses dynamic queries.
	 * 
	 * @param groupId
	 * @param keywords
	 * @param status
	 * @return
	 */
	public long getCampaignsCountByKeywords(
		long groupId, String keywords, int status) {

		DynamicQuery CampaignQuery =
			dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId));

		if (status != WorkflowConstants.STATUS_ANY) {
			CampaignQuery.add(RestrictionsFactoryUtil.eq("status", status));
		}

		if (Validator.isNotNull(keywords)) {
			Disjunction disjunctionQuery =
				RestrictionsFactoryUtil.disjunction();
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like("title", "%" + keywords + "%"));
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like(
					"description", "%" + keywords + "%"));
			CampaignQuery.add(disjunctionQuery);
		}

		return campaignLocalService.dynamicQueryCount(CampaignQuery);
	}


	/**
	 * Updates Campaign.
	 * 
	 * @param CampaignId
	 * @param titleMap
	 * @param description
	 * @param dueDate
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	@Indexable(
		type = IndexableType.REINDEX
	)
	public Campaign updateCampaign(
		long CampaignId, Map<Locale, String> titleMap, String description,
		Date dueDate, ServiceContext serviceContext)
		throws PortalException {

		// Validate Campaign values

		CampaignValidator.validate(titleMap, description, dueDate);

		// Get Campaign

		Campaign Campaign = getCampaign(CampaignId);

		// Update the changes to Campaign

		Campaign.setModifiedDate(new Date());
		Campaign.setTitleMap(titleMap);
		Campaign.setDueDate(dueDate);
		Campaign.setDescription(description);

		Campaign = super.updateCampaign(Campaign);

		updateAsset(Campaign, serviceContext);

		return Campaign;
	}

	/**
	 * Updates campaign (silenced)
	 * 
	 * This is an example how to "silence" generated method.
	 * 
	 * @param Campaign
	 * @return
	 */
	@Override
	public Campaign updateCampaign(Campaign Campaign) {

		throw new UnsupportedOperationException(
			"please use instead updateCampaign(CampaignId, titleMap, description, dueDate, serviceContext)");
	}

	/**
	 * Updates model's workflow status.
	 * 
	 * @param userId
	 * @param CampaignId
	 * @param status
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public Campaign updateStatus(
		long userId, long CampaignId, int status,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		User user = userLocalService.getUser(userId);
		Campaign Campaign = getCampaign(CampaignId);

		Campaign.setStatus(status);
		Campaign.setStatusByUserId(userId);
		Campaign.setStatusByUserName(user.getFullName());
		Campaign.setStatusDate(new Date());

		campaignPersistence.update(Campaign);

		if (status == WorkflowConstants.STATUS_APPROVED) {

			assetEntryLocalService.updateVisible(
				Campaign.class.getName(), CampaignId, true);

		}
		else {

			assetEntryLocalService.updateVisible(
				Campaign.class.getName(), CampaignId, false);
		}

		return Campaign;
	}
	
	/**
	 * Starts model workflow instance.
	 * 
	 * @param userId
	 * @param Campaign
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	protected Campaign startWorkflowInstance(
		long userId, Campaign Campaign, ServiceContext serviceContext)
		throws PortalException {

		Map<String, Serializable> workflowContext = new HashMap<String, Serializable>();

		String userPortraitURL = StringPool.BLANK;
		String userURL = StringPool.BLANK;

		if (serviceContext.getThemeDisplay() != null) {
			User user = userLocalService.getUser(userId);

			userPortraitURL =
				user.getPortraitURL(serviceContext.getThemeDisplay());
			userURL = user.getDisplayURL(serviceContext.getThemeDisplay());
		}

		workflowContext.put(
			WorkflowConstants.CONTEXT_USER_PORTRAIT_URL, userPortraitURL);
		workflowContext.put(WorkflowConstants.CONTEXT_USER_URL, userURL);

		return WorkflowHandlerRegistryUtil.startWorkflowInstance(
			Campaign.getCompanyId(), Campaign.getGroupId(), userId,
			Campaign.class.getName(), Campaign.getCampaignId(),
			Campaign, serviceContext, workflowContext);
	}
	
	/**
	 * Updates asset model related asset.
	 * 
	 * @param Campaign
	 * @param serviceContext
	 * @throws PortalException
	 */
	private void updateAsset(
		Campaign Campaign, ServiceContext serviceContext)
		throws PortalException {

		assetEntryLocalService.updateEntry(
			serviceContext.getUserId(), serviceContext.getScopeGroupId(),
			Campaign.getCreateDate(), Campaign.getModifiedDate(),
			Campaign.class.getName(), Campaign.getCampaignId(),
			Campaign.getUuid(), 0, serviceContext.getAssetCategoryIds(),
			serviceContext.getAssetTagNames(), true, true,
			Campaign.getCreateDate(), null, null, null,
			ContentTypes.TEXT_HTML,
			Campaign.getTitle(serviceContext.getLocale()),
			Campaign.getDescription(), null, null, null, 0, 0,
			serviceContext.getAssetPriority());
	}	
	
	

}
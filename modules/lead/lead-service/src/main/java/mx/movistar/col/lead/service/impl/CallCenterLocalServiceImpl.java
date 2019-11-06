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
import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.model.LeadScoring;
import mx.movistar.col.lead.service.base.LeadLocalServiceBaseImpl;
import mx.movistar.col.lead.service.validation.LeadValidator;

import mx.movistar.col.lead.model.CallCenter;
import mx.movistar.col.lead.service.base.CallCenterLocalServiceBaseImpl;
import mx.movistar.col.lead.service.validation.CallCenterValidator;

/**
 * The implementation of the lead local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link mx.movistar.col.lead.service.LeadLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeadLocalServiceBaseImpl
 * @see mx.movistar.col.lead.service.LeadLocalServiceUtil
 */
public class CallCenterLocalServiceImpl extends CallCenterLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link mx.movistar.col.lead.service.LeadLocalServiceUtil} to access the lead local service.
	 */
	
	
	
	/**
	 * Incremeta el total scoring 
	 * @param lead
	 * @param increment
	 * @return
	 */
	public CallCenter incrementTotalScoring(CallCenter callCenter, int increment) {
		
		callCenter.setTotalScoring(increment);
		
		CallCenter callCenterUpdated= callCenterPersistence.update(callCenter);
		
		return callCenterUpdated;
	}
	
	
	/**
	 * Adds an Lead.
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
	public CallCenter addCallCenter(
		long groupId, Map<Locale, String> titleMap, String description,
		Date dueDate, Map<String, String> parameters, ServiceContext serviceContext)
		throws PortalException {

		// Validate Lead parameters.

		CallCenterValidator.validate(titleMap,parameters, description, dueDate);
		
		//parameters
		long campaignId = Long.valueOf(parameters.get("campaignId"));
		String type = parameters.get("type");
		String product = parameters.get("product");
		String source = parameters.get("source");
		Boolean name = Boolean.valueOf(parameters.get("hasName"));
		Boolean email = Boolean.valueOf(parameters.get("hasEmail"));
		Boolean phone = Boolean.valueOf(parameters.get("hasPhone"));
		Boolean extra1 = Boolean.valueOf(parameters.get("extra1"));
		Boolean extra2 = Boolean.valueOf(parameters.get("extra2"));
		Boolean extra3 = Boolean.valueOf(parameters.get("extra3"));
		
		// Get group and same time validate that it exists.

		Group group = groupPersistence.findByPrimaryKey(groupId);

		long userId = serviceContext.getUserId();

		User user = userLocalService.getUser(userId);

		// Generate primary key for the Lead.

		long callCenterId =
			counterLocalService.increment(CallCenter.class.getName());

		// Create assigment.

		CallCenter callCenter = createCallCenter(callCenterId);

		// Fill the Lead

		callCenter.setCompanyId(group.getCompanyId());
		callCenter.setGroupId(groupId);
		callCenter.setUserId(userId);
		callCenter.setTitleMap(titleMap);
		callCenter.setDueDate(dueDate);
		callCenter.setCampaignId(campaignId);
		callCenter.setDescription(description);
		callCenter.setStatus(WorkflowConstants.STATUS_DRAFT);
		callCenter.setUserName(user.getScreenName());

		callCenter.setCreateDate(serviceContext.getCreateDate(new Date()));
		callCenter.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		
		callCenter.setSource(source);
		callCenter.setType(type);
		callCenter.setProduct(product);
		callCenter.setHasEmail(email);
		callCenter.setHasPhone(phone);
		callCenter.setHasName(name);
		callCenter.setExtra1(extra1);
		callCenter.setExtra2(extra2);
		callCenter.setExtra3(extra3);


		// Persist Lead.

		callCenter = super.addCallCenter(callCenter);

		// Add permission resources.
		
		boolean portletActions = false;
		boolean addGroupPermissions = true;
		boolean addGuestPermissions = true;

		resourceLocalService.addResources(
			group.getCompanyId(), groupId, userId, CallCenter.class.getName(),
			callCenter.getCallCenterId(), portletActions, addGroupPermissions,
			addGuestPermissions);

		// Update asset.

		updateAsset(callCenter, serviceContext);

		// Start workflow instance and return the Lead.

		return startWorkflowInstance(userId, callCenter, serviceContext);
	}

	/**
	 * Adds an assigment (silenced)
	 * 
	 * This is an example how to "silence" generated method.
	 * 
	 * @param Lead
	 * @return
	 */
	@Override
	public CallCenter addCallCenter(CallCenter CallCenter) {

		throw new UnsupportedOperationException(
			"please use instead addCallCenter(CallCenter, ServiceContext)");
	}

	@Indexable(
		type = IndexableType.DELETE
	)
	public CallCenter deleteCallCenter(long CallCenterId)
		throws PortalException {

		CallCenter CallCenter = getCallCenter(CallCenterId);

		return deleteCallCenter(CallCenter);
	}

	/**
	 * Deletes Lead.
	 * 
	 * @param Lead
	 * @return
	 */
	@Indexable(
		type = IndexableType.DELETE
	)
	public CallCenter deleteCallCenter(CallCenter CallCenter) {

		// Delete permission resources.

		try {
			resourceLocalService.deleteResource(
				CallCenter, ResourceConstants.SCOPE_INDIVIDUAL);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Delete asset data.

		try {
			assetEntryLocalService.deleteEntry(
				CallCenter.class.getName(), CallCenter.getCallCenterId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Delete workflow instance.
		
		try {
			workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(
				CallCenter.getCompanyId(), CallCenter.getGroupId(),
				CallCenter.class.getName(), CallCenter.getCampaignId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Delete the Lead

		return super.deleteCallCenter(CallCenter);
	}

	public List<CallCenter> getCallCenterByGroupId(long groupId) {

		return callCenterPersistence.findByGroupId(groupId);
	}

	public List<CallCenter> getCallCenterByGroupId(
		long groupId, int start, int end) {

		return callCenterPersistence.findByGroupId(groupId, start, end);
	}

	public List<CallCenter> getCallCenterByGroupId(
		long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator) {

		return callCenterPersistence.findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Gets Leads by keywords and status.
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
	public List<CallCenter> getCallCenterByKeywords(
		long groupId, String keywords, int start, int end, int status,
		OrderByComparator<CallCenter> orderByComparator) {

		DynamicQuery CallCenterQuery =
			dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId));

		if (status != WorkflowConstants.STATUS_ANY) {
			CallCenterQuery.add(RestrictionsFactoryUtil.eq("status", status));
		}

		if (Validator.isNotNull(keywords)) {
			Disjunction disjunctionQuery =
				RestrictionsFactoryUtil.disjunction();
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like("title", "%" + keywords + "%"));
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like(
					"description", "%" + keywords + "%"));
			CallCenterQuery.add(disjunctionQuery);
		}

		return callCenterLocalService.dynamicQuery(
			CallCenterQuery, start, end, orderByComparator);
	}

	public List<CallCenter> getCallCenterByStatus(int status) {

		return callCenterPersistence.findByStatus(status);
	}
	
	public List<CallCenter> getCallCenterByGroupIdAndCampaignId(long groupId, long campaignId) {

		return callCenterPersistence.findByG_C(groupId, campaignId);
	}
	
	public int getCallCenterCountByGroupId(long groupId) {

		return callCenterPersistence.countByGroupId(groupId);
	}

	/**
	 * Get Lead count by keywords and status.
	 * 
	 * This example uses dynamic queries.
	 * 
	 * @param groupId
	 * @param keywords
	 * @param status
	 * @return
	 */
	public long getCallCenterCountByKeywords(
		long groupId, String keywords, int status) {

		DynamicQuery callCenterQuery =
			dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId));

		if (status != WorkflowConstants.STATUS_ANY) {
			callCenterQuery.add(RestrictionsFactoryUtil.eq("status", status));
		}

		if (Validator.isNotNull(keywords)) {
			Disjunction disjunctionQuery =
				RestrictionsFactoryUtil.disjunction();
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like("title", "%" + keywords + "%"));
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like(
					"description", "%" + keywords + "%"));
			callCenterQuery.add(disjunctionQuery);
		}

		return callCenterLocalService.dynamicQueryCount(callCenterQuery);
	}


	/**
	 * Updates Lead.
	 * 
	 * @param LeadId
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
	public CallCenter updateCallCenter(
		long CallCenterId, Map<Locale, String> titleMap, String description,
		Date dueDate,Map<String, String> parameters, ServiceContext serviceContext)
		throws PortalException {
		
		//get custom entity parameters
		// Validate Lead values

		CallCenterValidator.validate(titleMap,parameters, description, dueDate);
		
		//parameters
		long campaignId = Long.valueOf(parameters.get("campaignId"));
		String type = String.valueOf(parameters.get("type"));
		String product = String.valueOf(parameters.get("product"));
		String source = String.valueOf(parameters.get("source"));
		Boolean name = Boolean.valueOf(parameters.get("hasName"));
		Boolean email = Boolean.valueOf(parameters.get("hasEmail"));
		Boolean phone = Boolean.valueOf(parameters.get("hasPhone"));
		Boolean extra1 = Boolean.valueOf(parameters.get("extra1"));
		Boolean extra2 = Boolean.valueOf(parameters.get("extra2"));
		Boolean extra3 = Boolean.valueOf(parameters.get("extra3"));
		
		// Get Lead
		
		CallCenter callCenter = getCallCenter(CallCenterId);

		// Update the changes to Lead

		callCenter.setModifiedDate(new Date());
		callCenter.setTitleMap(titleMap);
		callCenter.setDueDate(dueDate);
		callCenter.setCampaignId(campaignId);
		callCenter.setDescription(description);
		
		callCenter.setSource(source);
		callCenter.setType(type);
		callCenter.setProduct(product);
		callCenter.setHasEmail(email);
		callCenter.setHasPhone(phone);
		callCenter.setHasName(name);
		callCenter.setExtra1(extra1);
		callCenter.setExtra2(extra2);
		callCenter.setExtra3(extra3);
		
		callCenter = super.updateCallCenter(callCenter);

		updateAsset(callCenter, serviceContext);

		return callCenter;
	}

	/**
	 * Updates assigment (silenced)
	 * 
	 * This is an example how to "silence" generated method.
	 * 
	 * @param Lead
	 * @return
	 */
	@Override
	public CallCenter updateCallCenter(CallCenter CallCenter) {

		throw new UnsupportedOperationException(
			"please use instead updateCallCenter(CallCenterId, titleMap, description, dueDate, serviceContext)");
	}
	
	/**
	 * Updates model's workflow status.
	 * 
	 * @param userId
	 * @param LeadId
	 * @param status
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public CallCenter updateStatus(
		long userId, long callCenterId, int status,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		User user = userLocalService.getUser(userId);
		CallCenter callCenter = getCallCenter(callCenterId);

		callCenter.setStatus(status);
		callCenter.setStatusByUserId(userId);
		callCenter.setStatusByUserName(user.getFullName());
		callCenter.setStatusDate(new Date());

		callCenterPersistence.update(callCenter);

		if (status == WorkflowConstants.STATUS_APPROVED) {

			assetEntryLocalService.updateVisible(
				CallCenter.class.getName(), callCenterId, true);

		}
		else {

			assetEntryLocalService.updateVisible(
				CallCenter.class.getName(), callCenterId, false);
		}

		return callCenter;
	}
	
	/**
	 * Starts model workflow instance.
	 * 
	 * @param userId
	 * @param Lead
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	protected CallCenter startWorkflowInstance(
		long userId, CallCenter CallCenter, ServiceContext serviceContext)
		throws PortalException {

		Map<String, Serializable> workflowContext = new HashMap();

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
			CallCenter.getCompanyId(), CallCenter.getGroupId(), userId,
			CallCenter.class.getName(), CallCenter.getCallCenterId(),
			CallCenter, serviceContext, workflowContext);
	}
	
	/**
	 * Updates asset model related asset.
	 * 
	 * @param Lead
	 * @param serviceContext
	 * @throws PortalException
	 */
	private void updateAsset(
		CallCenter callCenter, ServiceContext serviceContext)
		throws PortalException {

		assetEntryLocalService.updateEntry(
			serviceContext.getUserId(), serviceContext.getScopeGroupId(),
			callCenter.getCreateDate(), callCenter.getModifiedDate(),
			CallCenter.class.getName(), callCenter.getCallCenterId(),
			callCenter.getUuid(), 0, serviceContext.getAssetCategoryIds(),
			serviceContext.getAssetTagNames(), true, true,
			callCenter.getCreateDate(), null, null, null,
			ContentTypes.TEXT_HTML,
			callCenter.getTitle(serviceContext.getLocale()),
			callCenter.getDescription(), null, null, null, 0, 0,
			serviceContext.getAssetPriority());
	}
	
	public List<Campaign> getAllCampaigns() {
		
		return leadFinder.getAllCampaigns();
		
	}
	
	public List<Lead> getAllLeads() {
		
		return leadFinder.getAllLeads();
		
	}

	public List<LeadScoring> getAllLeadScorings() {
		
		return leadFinder.getAllLeadScorings();
		
	}
	
	public int countLeadReportEntriesByCampaignId(long groupId, int status, long campaignId) {
		
		return leadFinder.countLeadReportEntriesByCampaignId(groupId, status, campaignId);
		
	}
	
	public int countLeadReportEntriesByLeadId(long groupId, int status, long leadId) {
		
		return leadFinder.countLeadReportEntriesByLeadId(groupId, status, leadId);
		
	}
	
	public int countLeadReportEntriesByG_S_DateRange(long groupId, int status, Date fromDate, Date toDate) {
		
		return leadFinder.countLeadReportEntriesByG_S_DateRange(groupId, status, fromDate, toDate);
		
	}
	
	public List findLeadReportByG_S_DateRange(long groupId, int status, Date fromDate, Date toDate, int start, int end) {
		
		return leadFinder.findLeadReportByG_S_DateRange(groupId, status, fromDate, toDate, start, end);
		
	}
	
	public List findLeadReportEntryByPK(long leadScoringId) {
		
		return leadFinder.findLeadReportEntryByPK(leadScoringId);
		
	}


	@Override
	public int countCallCenterReportEntriesByCampaignId(long groupId, int status, long campaignId) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int countCallCenterReportEntriesByG_S_DateRange(long groupId, int status, Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int countCallCenterReportEntriesByCallCenterId(long groupId, int status, long callCenterId) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public List findCallCenterReportByG_S_DateRange(long groupId, int status, Date fromDate, Date toDate, int start,
			int end) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List findCallCenterReportEntryByPK(long leadScoringId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<CallCenter> getAllCallCenter() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Lead incrementTotalScoring(Lead lead, int increment) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

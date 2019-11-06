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
public class LeadLocalServiceImpl extends LeadLocalServiceBaseImpl {
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
	public Lead incrementTotalScoring(Lead lead, int increment) {
		
		lead.setTotalScoring(increment);
		
		Lead leadUpdated= leadPersistence.update(lead);
		
		return leadUpdated;
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
	public Lead addLead(
		long groupId, Map<Locale, String> titleMap, String description,
		Date dueDate, Map<String, String> parameters, ServiceContext serviceContext)
		throws PortalException {

		// Validate Lead parameters.

		LeadValidator.validate(titleMap,parameters, description, dueDate);
		
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

		long leadId =
			counterLocalService.increment(Lead.class.getName());

		// Create assigment.

		Lead lead = createLead(leadId);

		// Fill the Lead

		lead.setCompanyId(group.getCompanyId());
		lead.setGroupId(groupId);
		lead.setUserId(userId);
		lead.setTitleMap(titleMap);
		lead.setDueDate(dueDate);
		lead.setCampaignId(campaignId);
		lead.setDescription(description);
		lead.setStatus(WorkflowConstants.STATUS_DRAFT);
		lead.setUserName(user.getScreenName());

		lead.setCreateDate(serviceContext.getCreateDate(new Date()));
		lead.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		
		lead.setSource(source);
		lead.setType(type);
		lead.setProduct(product);
		lead.setHasEmail(email);
		lead.setHasPhone(phone);
		lead.setHasName(name);
		lead.setExtra1(extra1);
		lead.setExtra2(extra2);
		lead.setExtra3(extra3);


		// Persist Lead.

		lead = super.addLead(lead);

		// Add permission resources.
		
		boolean portletActions = false;
		boolean addGroupPermissions = true;
		boolean addGuestPermissions = true;

		resourceLocalService.addResources(
			group.getCompanyId(), groupId, userId, Lead.class.getName(),
			lead.getLeadId(), portletActions, addGroupPermissions,
			addGuestPermissions);

		// Update asset.

		updateAsset(lead, serviceContext);

		// Start workflow instance and return the Lead.

		return startWorkflowInstance(userId, lead, serviceContext);
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
	public Lead addLead(Lead Lead) {

		throw new UnsupportedOperationException(
			"please use instead addLead(Lead, ServiceContext)");
	}

	@Indexable(
		type = IndexableType.DELETE
	)
	public Lead deleteLead(long LeadId)
		throws PortalException {

		Lead Lead = getLead(LeadId);

		return deleteLead(Lead);
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
	public Lead deleteLead(Lead Lead) {

		// Delete permission resources.

		try {
			resourceLocalService.deleteResource(
				Lead, ResourceConstants.SCOPE_INDIVIDUAL);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Delete asset data.

		try {
			assetEntryLocalService.deleteEntry(
				Lead.class.getName(), Lead.getLeadId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Delete workflow instance.
		
		try {
			workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(
				Lead.getCompanyId(), Lead.getGroupId(),
				Lead.class.getName(), Lead.getCampaignId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Delete the Lead

		return super.deleteLead(Lead);
	}

	public List<Lead> getLeadsByGroupId(long groupId) {

		return leadPersistence.findByGroupId(groupId);
	}

	public List<Lead> getLeadsByGroupId(
		long groupId, int start, int end) {

		return leadPersistence.findByGroupId(groupId, start, end);
	}

	public List<Lead> getLeadsByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return leadPersistence.findByGroupId(
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
	public List<Lead> getLeadsByKeywords(
		long groupId, String keywords, int start, int end, int status,
		OrderByComparator<Lead> orderByComparator) {

		DynamicQuery LeadQuery =
			dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId));

		if (status != WorkflowConstants.STATUS_ANY) {
			LeadQuery.add(RestrictionsFactoryUtil.eq("status", status));
		}

		if (Validator.isNotNull(keywords)) {
			Disjunction disjunctionQuery =
				RestrictionsFactoryUtil.disjunction();
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like("title", "%" + keywords + "%"));
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like(
					"description", "%" + keywords + "%"));
			LeadQuery.add(disjunctionQuery);
		}

		return leadLocalService.dynamicQuery(
			LeadQuery, start, end, orderByComparator);
	}

	public List<Lead> getLeadsByStatus(int status) {

		return leadPersistence.findByStatus(status);
	}
	
	public List<Lead> getLeadsByGroupIdAndCampaignId(long groupId, long campaignId) {

		return leadPersistence.findByG_C(groupId, campaignId);
	}
	
	public int getLeadsCountByGroupId(long groupId) {

		return leadPersistence.countByGroupId(groupId);
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
	public long getLeadsCountByKeywords(
		long groupId, String keywords, int status) {

		DynamicQuery leadQuery =
			dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId));

		if (status != WorkflowConstants.STATUS_ANY) {
			leadQuery.add(RestrictionsFactoryUtil.eq("status", status));
		}

		if (Validator.isNotNull(keywords)) {
			Disjunction disjunctionQuery =
				RestrictionsFactoryUtil.disjunction();
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like("title", "%" + keywords + "%"));
			disjunctionQuery.add(
				RestrictionsFactoryUtil.like(
					"description", "%" + keywords + "%"));
			leadQuery.add(disjunctionQuery);
		}

		return leadLocalService.dynamicQueryCount(leadQuery);
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
	public Lead updateLead(
		long LeadId, Map<Locale, String> titleMap, String description,
		Date dueDate,Map<String, String> parameters, ServiceContext serviceContext)
		throws PortalException {
		
		//get custom entity parameters
		// Validate Lead values

		LeadValidator.validate(titleMap,parameters, description, dueDate);
		
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
		
		Lead lead = getLead(LeadId);

		// Update the changes to Lead

		lead.setModifiedDate(new Date());
		lead.setTitleMap(titleMap);
		lead.setDueDate(dueDate);
		lead.setCampaignId(campaignId);
		lead.setDescription(description);
		
		lead.setSource(source);
		lead.setType(type);
		lead.setProduct(product);
		lead.setHasEmail(email);
		lead.setHasPhone(phone);
		lead.setHasName(name);
		lead.setExtra1(extra1);
		lead.setExtra2(extra2);
		lead.setExtra3(extra3);
		
		lead = super.updateLead(lead);

		updateAsset(lead, serviceContext);

		return lead;
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
	public Lead updateLead(Lead Lead) {

		throw new UnsupportedOperationException(
			"please use instead updateLead(LeadId, titleMap, description, dueDate, serviceContext)");
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
	public Lead updateStatus(
		long userId, long leadId, int status,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		User user = userLocalService.getUser(userId);
		Lead lead = getLead(leadId);

		lead.setStatus(status);
		lead.setStatusByUserId(userId);
		lead.setStatusByUserName(user.getFullName());
		lead.setStatusDate(new Date());

		leadPersistence.update(lead);

		if (status == WorkflowConstants.STATUS_APPROVED) {

			assetEntryLocalService.updateVisible(
				Lead.class.getName(), leadId, true);

		}
		else {

			assetEntryLocalService.updateVisible(
				Lead.class.getName(), leadId, false);
		}

		return lead;
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
	protected Lead startWorkflowInstance(
		long userId, Lead Lead, ServiceContext serviceContext)
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
			Lead.getCompanyId(), Lead.getGroupId(), userId,
			Lead.class.getName(), Lead.getLeadId(),
			Lead, serviceContext, workflowContext);
	}
	
	/**
	 * Updates asset model related asset.
	 * 
	 * @param Lead
	 * @param serviceContext
	 * @throws PortalException
	 */
	private void updateAsset(
		Lead lead, ServiceContext serviceContext)
		throws PortalException {

		assetEntryLocalService.updateEntry(
			serviceContext.getUserId(), serviceContext.getScopeGroupId(),
			lead.getCreateDate(), lead.getModifiedDate(),
			Lead.class.getName(), lead.getLeadId(),
			lead.getUuid(), 0, serviceContext.getAssetCategoryIds(),
			serviceContext.getAssetTagNames(), true, true,
			lead.getCreateDate(), null, null, null,
			ContentTypes.TEXT_HTML,
			lead.getTitle(serviceContext.getLocale()),
			lead.getDescription(), null, null, null, 0, 0,
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
	
}

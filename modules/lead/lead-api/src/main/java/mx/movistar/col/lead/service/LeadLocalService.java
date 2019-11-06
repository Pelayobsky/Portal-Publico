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

package mx.movistar.col.lead.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.model.LeadScoring;

/**
 * Provides the local service interface for Lead. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see LeadLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface LeadLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LeadLocalServiceUtil} to access the lead local service. Add custom service methods to <code>mx.movistar.col.lead.service.impl.LeadLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the lead to the database. Also notifies the appropriate model listeners.
	 *
	 * @param lead the lead
	 * @return the lead that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Lead addLead(Lead lead);

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
	@Indexable(type = IndexableType.REINDEX)
	public Lead addLead(
			long groupId, Map<Locale, String> titleMap, String description,
			Date dueDate, Map<String, String> parameters,
			ServiceContext serviceContext)
		throws PortalException;

	public int countLeadReportEntriesByCampaignId(
		long groupId, int status, long campaignId);

	public int countLeadReportEntriesByG_S_DateRange(
		long groupId, int status, Date fromDate, Date toDate);

	public int countLeadReportEntriesByLeadId(
		long groupId, int status, long leadId);

	/**
	 * Creates a new lead with the primary key. Does not add the lead to the database.
	 *
	 * @param leadId the primary key for the new lead
	 * @return the new lead
	 */
	@Transactional(enabled = false)
	public Lead createLead(long leadId);

	/**
	 * Deletes the lead from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lead the lead
	 * @return the lead that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Lead deleteLead(Lead lead);

	/**
	 * Deletes the lead with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead that was removed
	 * @throws PortalException if a lead with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Lead deleteLead(long leadId) throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Lead fetchLead(long leadId);

	/**
	 * Returns the lead matching the UUID and group.
	 *
	 * @param uuid the lead's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lead, or <code>null</code> if a matching lead could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Lead fetchLeadByUuidAndGroupId(String uuid, long groupId);

	public List findLeadReportByG_S_DateRange(
		long groupId, int status, Date fromDate, Date toDate, int start,
		int end);

	public List findLeadReportEntryByPK(long leadScoringId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Campaign> getAllCampaigns();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Lead> getAllLeads();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<LeadScoring> getAllLeadScorings();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the lead with the primary key.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead
	 * @throws PortalException if a lead with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Lead getLead(long leadId) throws PortalException;

	/**
	 * Returns the lead matching the UUID and group.
	 *
	 * @param uuid the lead's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lead
	 * @throws PortalException if a matching lead could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Lead getLeadByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the leads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of leads
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Lead> getLeads(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Lead> getLeadsByGroupId(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Lead> getLeadsByGroupId(long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Lead> getLeadsByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Lead> getLeadsByGroupIdAndCampaignId(
		long groupId, long campaignId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Lead> getLeadsByKeywords(
		long groupId, String keywords, int start, int end, int status,
		OrderByComparator<Lead> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Lead> getLeadsByStatus(int status);

	/**
	 * Returns all the leads matching the UUID and company.
	 *
	 * @param uuid the UUID of the leads
	 * @param companyId the primary key of the company
	 * @return the matching leads, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Lead> getLeadsByUuidAndCompanyId(String uuid, long companyId);

	/**
	 * Returns a range of leads matching the UUID and company.
	 *
	 * @param uuid the UUID of the leads
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching leads, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Lead> getLeadsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the number of leads.
	 *
	 * @return the number of leads
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getLeadsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getLeadsCountByGroupId(long groupId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getLeadsCountByKeywords(
		long groupId, String keywords, int status);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Incremeta el total scoring
	 *
	 * @param lead
	 * @param increment
	 * @return
	 */
	public Lead incrementTotalScoring(Lead lead, int increment);

	/**
	 * Updates the lead in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param lead the lead
	 * @return the lead that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Lead updateLead(Lead lead);

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
	@Indexable(type = IndexableType.REINDEX)
	public Lead updateLead(
			long LeadId, Map<Locale, String> titleMap, String description,
			Date dueDate, Map<String, String> parameters,
			ServiceContext serviceContext)
		throws PortalException;

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
			long userId, long leadId, int status, ServiceContext serviceContext)
		throws PortalException, SystemException;

}
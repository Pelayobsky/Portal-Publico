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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LeadLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeadLocalService
 * @generated
 */
@ProviderType
public class LeadLocalServiceWrapper
	implements LeadLocalService, ServiceWrapper<LeadLocalService> {

	public LeadLocalServiceWrapper(LeadLocalService leadLocalService) {
		_leadLocalService = leadLocalService;
	}

	/**
	 * Adds the lead to the database. Also notifies the appropriate model listeners.
	 *
	 * @param lead the lead
	 * @return the lead that was added
	 */
	@Override
	public mx.movistar.col.lead.model.Lead addLead(
		mx.movistar.col.lead.model.Lead lead) {

		return _leadLocalService.addLead(lead);
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
	@Override
	public mx.movistar.col.lead.model.Lead addLead(
			long groupId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadLocalService.addLead(
			groupId, titleMap, description, dueDate, parameters,
			serviceContext);
	}

	@Override
	public int countLeadReportEntriesByCampaignId(
		long groupId, int status, long campaignId) {

		return _leadLocalService.countLeadReportEntriesByCampaignId(
			groupId, status, campaignId);
	}

	@Override
	public int countLeadReportEntriesByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate) {

		return _leadLocalService.countLeadReportEntriesByG_S_DateRange(
			groupId, status, fromDate, toDate);
	}

	@Override
	public int countLeadReportEntriesByLeadId(
		long groupId, int status, long leadId) {

		return _leadLocalService.countLeadReportEntriesByLeadId(
			groupId, status, leadId);
	}

	/**
	 * Creates a new lead with the primary key. Does not add the lead to the database.
	 *
	 * @param leadId the primary key for the new lead
	 * @return the new lead
	 */
	@Override
	public mx.movistar.col.lead.model.Lead createLead(long leadId) {
		return _leadLocalService.createLead(leadId);
	}

	/**
	 * Deletes the lead from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lead the lead
	 * @return the lead that was removed
	 */
	@Override
	public mx.movistar.col.lead.model.Lead deleteLead(
		mx.movistar.col.lead.model.Lead lead) {

		return _leadLocalService.deleteLead(lead);
	}

	/**
	 * Deletes the lead with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead that was removed
	 * @throws PortalException if a lead with the primary key could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.Lead deleteLead(long leadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadLocalService.deleteLead(leadId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _leadLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _leadLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _leadLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _leadLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _leadLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _leadLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public mx.movistar.col.lead.model.Lead fetchLead(long leadId) {
		return _leadLocalService.fetchLead(leadId);
	}

	/**
	 * Returns the lead matching the UUID and group.
	 *
	 * @param uuid the lead's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lead, or <code>null</code> if a matching lead could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.Lead fetchLeadByUuidAndGroupId(
		String uuid, long groupId) {

		return _leadLocalService.fetchLeadByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List findLeadReportByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate, int start, int end) {

		return _leadLocalService.findLeadReportByG_S_DateRange(
			groupId, status, fromDate, toDate, start, end);
	}

	@Override
	public java.util.List findLeadReportEntryByPK(long leadScoringId) {
		return _leadLocalService.findLeadReportEntryByPK(leadScoringId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _leadLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Campaign>
		getAllCampaigns() {

		return _leadLocalService.getAllCampaigns();
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getAllLeads() {
		return _leadLocalService.getAllLeads();
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.LeadScoring>
		getAllLeadScorings() {

		return _leadLocalService.getAllLeadScorings();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _leadLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _leadLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the lead with the primary key.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead
	 * @throws PortalException if a lead with the primary key could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.Lead getLead(long leadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadLocalService.getLead(leadId);
	}

	/**
	 * Returns the lead matching the UUID and group.
	 *
	 * @param uuid the lead's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lead
	 * @throws PortalException if a matching lead could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.Lead getLeadByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadLocalService.getLeadByUuidAndGroupId(uuid, groupId);
	}

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
	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getLeads(
		int start, int end) {

		return _leadLocalService.getLeads(start, end);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getLeadsByGroupId(
		long groupId) {

		return _leadLocalService.getLeadsByGroupId(groupId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getLeadsByGroupId(
		long groupId, int start, int end) {

		return _leadLocalService.getLeadsByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getLeadsByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<mx.movistar.col.lead.model.Lead> orderByComparator) {

		return _leadLocalService.getLeadsByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByGroupIdAndCampaignId(long groupId, long campaignId) {

		return _leadLocalService.getLeadsByGroupIdAndCampaignId(
			groupId, campaignId);
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
	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getLeadsByKeywords(
		long groupId, String keywords, int start, int end, int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<mx.movistar.col.lead.model.Lead> orderByComparator) {

		return _leadLocalService.getLeadsByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getLeadsByStatus(
		int status) {

		return _leadLocalService.getLeadsByStatus(status);
	}

	/**
	 * Returns all the leads matching the UUID and company.
	 *
	 * @param uuid the UUID of the leads
	 * @param companyId the primary key of the company
	 * @return the matching leads, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByUuidAndCompanyId(String uuid, long companyId) {

		return _leadLocalService.getLeadsByUuidAndCompanyId(uuid, companyId);
	}

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
	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Lead> orderByComparator) {

		return _leadLocalService.getLeadsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of leads.
	 *
	 * @return the number of leads
	 */
	@Override
	public int getLeadsCount() {
		return _leadLocalService.getLeadsCount();
	}

	@Override
	public int getLeadsCountByGroupId(long groupId) {
		return _leadLocalService.getLeadsCountByGroupId(groupId);
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
	@Override
	public long getLeadsCountByKeywords(
		long groupId, String keywords, int status) {

		return _leadLocalService.getLeadsCountByKeywords(
			groupId, keywords, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _leadLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Incremeta el total scoring
	 *
	 * @param lead
	 * @param increment
	 * @return
	 */
	@Override
	public mx.movistar.col.lead.model.Lead incrementTotalScoring(
		mx.movistar.col.lead.model.Lead lead, int increment) {

		return _leadLocalService.incrementTotalScoring(lead, increment);
	}

	/**
	 * Updates the lead in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param lead the lead
	 * @return the lead that was updated
	 */
	@Override
	public mx.movistar.col.lead.model.Lead updateLead(
		mx.movistar.col.lead.model.Lead lead) {

		return _leadLocalService.updateLead(lead);
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
	@Override
	public mx.movistar.col.lead.model.Lead updateLead(
			long LeadId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadLocalService.updateLead(
			LeadId, titleMap, description, dueDate, parameters, serviceContext);
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
	@Override
	public mx.movistar.col.lead.model.Lead updateStatus(
			long userId, long leadId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _leadLocalService.updateStatus(
			userId, leadId, status, serviceContext);
	}

	@Override
	public LeadLocalService getWrappedService() {
		return _leadLocalService;
	}

	@Override
	public void setWrappedService(LeadLocalService leadLocalService) {
		_leadLocalService = leadLocalService;
	}

	private LeadLocalService _leadLocalService;

}
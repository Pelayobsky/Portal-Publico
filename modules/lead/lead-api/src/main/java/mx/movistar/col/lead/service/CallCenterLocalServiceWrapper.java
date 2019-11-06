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
 * Provides a wrapper for {@link CallCenterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CallCenterLocalService
 * @generated
 */
@ProviderType
public class CallCenterLocalServiceWrapper
	implements CallCenterLocalService, ServiceWrapper<CallCenterLocalService> {

	public CallCenterLocalServiceWrapper(
		CallCenterLocalService callCenterLocalService) {

		_callCenterLocalService = callCenterLocalService;
	}

	/**
	 * Adds the call center to the database. Also notifies the appropriate model listeners.
	 *
	 * @param callCenter the call center
	 * @return the call center that was added
	 */
	@Override
	public mx.movistar.col.lead.model.CallCenter addCallCenter(
		mx.movistar.col.lead.model.CallCenter callCenter) {

		return _callCenterLocalService.addCallCenter(callCenter);
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
	public mx.movistar.col.lead.model.CallCenter addCallCenter(
			long groupId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterLocalService.addCallCenter(
			groupId, titleMap, description, dueDate, parameters,
			serviceContext);
	}

	@Override
	public int countCallCenterReportEntriesByCallCenterId(
		long groupId, int status, long callCenterId) {

		return _callCenterLocalService.
			countCallCenterReportEntriesByCallCenterId(
				groupId, status, callCenterId);
	}

	@Override
	public int countCallCenterReportEntriesByCampaignId(
		long groupId, int status, long campaignId) {

		return _callCenterLocalService.countCallCenterReportEntriesByCampaignId(
			groupId, status, campaignId);
	}

	@Override
	public int countCallCenterReportEntriesByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate) {

		return _callCenterLocalService.
			countCallCenterReportEntriesByG_S_DateRange(
				groupId, status, fromDate, toDate);
	}

	@Override
	public int countLeadReportEntriesByCampaignId(
		long groupId, int status, long campaignId) {

		return _callCenterLocalService.countLeadReportEntriesByCampaignId(
			groupId, status, campaignId);
	}

	@Override
	public int countLeadReportEntriesByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate) {

		return _callCenterLocalService.countLeadReportEntriesByG_S_DateRange(
			groupId, status, fromDate, toDate);
	}

	@Override
	public int countLeadReportEntriesByLeadId(
		long groupId, int status, long leadId) {

		return _callCenterLocalService.countLeadReportEntriesByLeadId(
			groupId, status, leadId);
	}

	/**
	 * Creates a new call center with the primary key. Does not add the call center to the database.
	 *
	 * @param callCenterId the primary key for the new call center
	 * @return the new call center
	 */
	@Override
	public mx.movistar.col.lead.model.CallCenter createCallCenter(
		long callCenterId) {

		return _callCenterLocalService.createCallCenter(callCenterId);
	}

	/**
	 * Deletes the call center from the database. Also notifies the appropriate model listeners.
	 *
	 * @param callCenter the call center
	 * @return the call center that was removed
	 */
	@Override
	public mx.movistar.col.lead.model.CallCenter deleteCallCenter(
		mx.movistar.col.lead.model.CallCenter callCenter) {

		return _callCenterLocalService.deleteCallCenter(callCenter);
	}

	/**
	 * Deletes the call center with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param callCenterId the primary key of the call center
	 * @return the call center that was removed
	 * @throws PortalException if a call center with the primary key could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.CallCenter deleteCallCenter(
			long callCenterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterLocalService.deleteCallCenter(callCenterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _callCenterLocalService.dynamicQuery();
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

		return _callCenterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _callCenterLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _callCenterLocalService.dynamicQuery(
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

		return _callCenterLocalService.dynamicQueryCount(dynamicQuery);
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

		return _callCenterLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public mx.movistar.col.lead.model.CallCenter fetchCallCenter(
		long callCenterId) {

		return _callCenterLocalService.fetchCallCenter(callCenterId);
	}

	/**
	 * Returns the call center matching the UUID and group.
	 *
	 * @param uuid the call center's UUID
	 * @param groupId the primary key of the group
	 * @return the matching call center, or <code>null</code> if a matching call center could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.CallCenter
		fetchCallCenterByUuidAndGroupId(String uuid, long groupId) {

		return _callCenterLocalService.fetchCallCenterByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List findCallCenterReportByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate, int start, int end) {

		return _callCenterLocalService.findCallCenterReportByG_S_DateRange(
			groupId, status, fromDate, toDate, start, end);
	}

	@Override
	public java.util.List findCallCenterReportEntryByPK(long leadScoringId) {
		return _callCenterLocalService.findCallCenterReportEntryByPK(
			leadScoringId);
	}

	@Override
	public java.util.List findLeadReportByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate, int start, int end) {

		return _callCenterLocalService.findLeadReportByG_S_DateRange(
			groupId, status, fromDate, toDate, start, end);
	}

	@Override
	public java.util.List findLeadReportEntryByPK(long leadScoringId) {
		return _callCenterLocalService.findLeadReportEntryByPK(leadScoringId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _callCenterLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getAllCallCenter() {

		return _callCenterLocalService.getAllCallCenter();
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Campaign>
		getAllCampaigns() {

		return _callCenterLocalService.getAllCampaigns();
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getAllLeads() {
		return _callCenterLocalService.getAllLeads();
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.LeadScoring>
		getAllLeadScorings() {

		return _callCenterLocalService.getAllLeadScorings();
	}

	/**
	 * Returns the call center with the primary key.
	 *
	 * @param callCenterId the primary key of the call center
	 * @return the call center
	 * @throws PortalException if a call center with the primary key could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.CallCenter getCallCenter(
			long callCenterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterLocalService.getCallCenter(callCenterId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(long groupId) {

		return _callCenterLocalService.getCallCenterByGroupId(groupId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(long groupId, int start, int end) {

		return _callCenterLocalService.getCallCenterByGroupId(
			groupId, start, end);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return _callCenterLocalService.getCallCenterByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupIdAndCampaignId(long groupId, long campaignId) {

		return _callCenterLocalService.getCallCenterByGroupIdAndCampaignId(
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
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return _callCenterLocalService.getCallCenterByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByStatus(int status) {

		return _callCenterLocalService.getCallCenterByStatus(status);
	}

	/**
	 * Returns the call center matching the UUID and group.
	 *
	 * @param uuid the call center's UUID
	 * @param groupId the primary key of the group
	 * @return the matching call center
	 * @throws PortalException if a matching call center could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.CallCenter getCallCenterByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterLocalService.getCallCenterByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public int getCallCenterCountByGroupId(long groupId) {
		return _callCenterLocalService.getCallCenterCountByGroupId(groupId);
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
	public long getCallCenterCountByKeywords(
		long groupId, String keywords, int status) {

		return _callCenterLocalService.getCallCenterCountByKeywords(
			groupId, keywords, status);
	}

	/**
	 * Returns a range of all the call centers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @return the range of call centers
	 */
	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter> getCallCenters(
		int start, int end) {

		return _callCenterLocalService.getCallCenters(start, end);
	}

	/**
	 * Returns all the call centers matching the UUID and company.
	 *
	 * @param uuid the UUID of the call centers
	 * @param companyId the primary key of the company
	 * @return the matching call centers, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByUuidAndCompanyId(String uuid, long companyId) {

		return _callCenterLocalService.getCallCentersByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of call centers matching the UUID and company.
	 *
	 * @param uuid the UUID of the call centers
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching call centers, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return _callCenterLocalService.getCallCentersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of call centers.
	 *
	 * @return the number of call centers
	 */
	@Override
	public int getCallCentersCount() {
		return _callCenterLocalService.getCallCentersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _callCenterLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _callCenterLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _callCenterLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Incremeta el total scoring
	 *
	 * @param lead
	 * @param increment
	 * @return
	 */
	@Override
	public mx.movistar.col.lead.model.CallCenter incrementTotalScoring(
		mx.movistar.col.lead.model.CallCenter callCenter, int increment) {

		return _callCenterLocalService.incrementTotalScoring(
			callCenter, increment);
	}

	@Override
	public mx.movistar.col.lead.model.Lead incrementTotalScoring(
		mx.movistar.col.lead.model.Lead lead, int increment) {

		return _callCenterLocalService.incrementTotalScoring(lead, increment);
	}

	/**
	 * Updates the call center in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param callCenter the call center
	 * @return the call center that was updated
	 */
	@Override
	public mx.movistar.col.lead.model.CallCenter updateCallCenter(
		mx.movistar.col.lead.model.CallCenter callCenter) {

		return _callCenterLocalService.updateCallCenter(callCenter);
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
	public mx.movistar.col.lead.model.CallCenter updateCallCenter(
			long CallCenterId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterLocalService.updateCallCenter(
			CallCenterId, titleMap, description, dueDate, parameters,
			serviceContext);
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
	public mx.movistar.col.lead.model.CallCenter updateStatus(
			long userId, long callCenterId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _callCenterLocalService.updateStatus(
			userId, callCenterId, status, serviceContext);
	}

	@Override
	public CallCenterLocalService getWrappedService() {
		return _callCenterLocalService;
	}

	@Override
	public void setWrappedService(
		CallCenterLocalService callCenterLocalService) {

		_callCenterLocalService = callCenterLocalService;
	}

	private CallCenterLocalService _callCenterLocalService;

}
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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CallCenter. This utility wraps
 * <code>mx.movistar.col.lead.service.impl.CallCenterLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CallCenterLocalService
 * @generated
 */
@ProviderType
public class CallCenterLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>mx.movistar.col.lead.service.impl.CallCenterLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the call center to the database. Also notifies the appropriate model listeners.
	 *
	 * @param callCenter the call center
	 * @return the call center that was added
	 */
	public static mx.movistar.col.lead.model.CallCenter addCallCenter(
		mx.movistar.col.lead.model.CallCenter callCenter) {

		return getService().addCallCenter(callCenter);
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
	public static mx.movistar.col.lead.model.CallCenter addCallCenter(
			long groupId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCallCenter(
			groupId, titleMap, description, dueDate, parameters,
			serviceContext);
	}

	public static int countCallCenterReportEntriesByCallCenterId(
		long groupId, int status, long callCenterId) {

		return getService().countCallCenterReportEntriesByCallCenterId(
			groupId, status, callCenterId);
	}

	public static int countCallCenterReportEntriesByCampaignId(
		long groupId, int status, long campaignId) {

		return getService().countCallCenterReportEntriesByCampaignId(
			groupId, status, campaignId);
	}

	public static int countCallCenterReportEntriesByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate) {

		return getService().countCallCenterReportEntriesByG_S_DateRange(
			groupId, status, fromDate, toDate);
	}

	public static int countLeadReportEntriesByCampaignId(
		long groupId, int status, long campaignId) {

		return getService().countLeadReportEntriesByCampaignId(
			groupId, status, campaignId);
	}

	public static int countLeadReportEntriesByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate) {

		return getService().countLeadReportEntriesByG_S_DateRange(
			groupId, status, fromDate, toDate);
	}

	public static int countLeadReportEntriesByLeadId(
		long groupId, int status, long leadId) {

		return getService().countLeadReportEntriesByLeadId(
			groupId, status, leadId);
	}

	/**
	 * Creates a new call center with the primary key. Does not add the call center to the database.
	 *
	 * @param callCenterId the primary key for the new call center
	 * @return the new call center
	 */
	public static mx.movistar.col.lead.model.CallCenter createCallCenter(
		long callCenterId) {

		return getService().createCallCenter(callCenterId);
	}

	/**
	 * Deletes the call center from the database. Also notifies the appropriate model listeners.
	 *
	 * @param callCenter the call center
	 * @return the call center that was removed
	 */
	public static mx.movistar.col.lead.model.CallCenter deleteCallCenter(
		mx.movistar.col.lead.model.CallCenter callCenter) {

		return getService().deleteCallCenter(callCenter);
	}

	/**
	 * Deletes the call center with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param callCenterId the primary key of the call center
	 * @return the call center that was removed
	 * @throws PortalException if a call center with the primary key could not be found
	 */
	public static mx.movistar.col.lead.model.CallCenter deleteCallCenter(
			long callCenterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCallCenter(callCenterId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static mx.movistar.col.lead.model.CallCenter fetchCallCenter(
		long callCenterId) {

		return getService().fetchCallCenter(callCenterId);
	}

	/**
	 * Returns the call center matching the UUID and group.
	 *
	 * @param uuid the call center's UUID
	 * @param groupId the primary key of the group
	 * @return the matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static mx.movistar.col.lead.model.CallCenter
		fetchCallCenterByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchCallCenterByUuidAndGroupId(uuid, groupId);
	}

	public static java.util.List findCallCenterReportByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate, int start, int end) {

		return getService().findCallCenterReportByG_S_DateRange(
			groupId, status, fromDate, toDate, start, end);
	}

	public static java.util.List findCallCenterReportEntryByPK(
		long leadScoringId) {

		return getService().findCallCenterReportEntryByPK(leadScoringId);
	}

	public static java.util.List findLeadReportByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate, int start, int end) {

		return getService().findLeadReportByG_S_DateRange(
			groupId, status, fromDate, toDate, start, end);
	}

	public static java.util.List findLeadReportEntryByPK(long leadScoringId) {
		return getService().findLeadReportEntryByPK(leadScoringId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getAllCallCenter() {

		return getService().getAllCallCenter();
	}

	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getAllCampaigns() {

		return getService().getAllCampaigns();
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getAllLeads() {

		return getService().getAllLeads();
	}

	public static java.util.List<mx.movistar.col.lead.model.LeadScoring>
		getAllLeadScorings() {

		return getService().getAllLeadScorings();
	}

	/**
	 * Returns the call center with the primary key.
	 *
	 * @param callCenterId the primary key of the call center
	 * @return the call center
	 * @throws PortalException if a call center with the primary key could not be found
	 */
	public static mx.movistar.col.lead.model.CallCenter getCallCenter(
			long callCenterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCallCenter(callCenterId);
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(long groupId) {

		return getService().getCallCenterByGroupId(groupId);
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(long groupId, int start, int end) {

		return getService().getCallCenterByGroupId(groupId, start, end);
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return getService().getCallCenterByGroupId(
			groupId, start, end, orderByComparator);
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupIdAndCampaignId(long groupId, long campaignId) {

		return getService().getCallCenterByGroupIdAndCampaignId(
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
	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return getService().getCallCenterByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByStatus(int status) {

		return getService().getCallCenterByStatus(status);
	}

	/**
	 * Returns the call center matching the UUID and group.
	 *
	 * @param uuid the call center's UUID
	 * @param groupId the primary key of the group
	 * @return the matching call center
	 * @throws PortalException if a matching call center could not be found
	 */
	public static mx.movistar.col.lead.model.CallCenter
			getCallCenterByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCallCenterByUuidAndGroupId(uuid, groupId);
	}

	public static int getCallCenterCountByGroupId(long groupId) {
		return getService().getCallCenterCountByGroupId(groupId);
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
	public static long getCallCenterCountByKeywords(
		long groupId, String keywords, int status) {

		return getService().getCallCenterCountByKeywords(
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
	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenters(int start, int end) {

		return getService().getCallCenters(start, end);
	}

	/**
	 * Returns all the call centers matching the UUID and company.
	 *
	 * @param uuid the UUID of the call centers
	 * @param companyId the primary key of the company
	 * @return the matching call centers, or an empty list if no matches were found
	 */
	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getCallCentersByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return getService().getCallCentersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of call centers.
	 *
	 * @return the number of call centers
	 */
	public static int getCallCentersCount() {
		return getService().getCallCentersCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Incremeta el total scoring
	 *
	 * @param lead
	 * @param increment
	 * @return
	 */
	public static mx.movistar.col.lead.model.CallCenter incrementTotalScoring(
		mx.movistar.col.lead.model.CallCenter callCenter, int increment) {

		return getService().incrementTotalScoring(callCenter, increment);
	}

	public static mx.movistar.col.lead.model.Lead incrementTotalScoring(
		mx.movistar.col.lead.model.Lead lead, int increment) {

		return getService().incrementTotalScoring(lead, increment);
	}

	/**
	 * Updates the call center in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param callCenter the call center
	 * @return the call center that was updated
	 */
	public static mx.movistar.col.lead.model.CallCenter updateCallCenter(
		mx.movistar.col.lead.model.CallCenter callCenter) {

		return getService().updateCallCenter(callCenter);
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
	public static mx.movistar.col.lead.model.CallCenter updateCallCenter(
			long CallCenterId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCallCenter(
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
	public static mx.movistar.col.lead.model.CallCenter updateStatus(
			long userId, long callCenterId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().updateStatus(
			userId, callCenterId, status, serviceContext);
	}

	public static CallCenterLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<CallCenterLocalService, CallCenterLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CallCenterLocalService.class);

		ServiceTracker<CallCenterLocalService, CallCenterLocalService>
			serviceTracker =
				new ServiceTracker
					<CallCenterLocalService, CallCenterLocalService>(
						bundle.getBundleContext(), CallCenterLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
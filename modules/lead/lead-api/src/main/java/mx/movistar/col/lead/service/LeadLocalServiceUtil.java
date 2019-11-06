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
 * Provides the local service utility for Lead. This utility wraps
 * <code>mx.movistar.col.lead.service.impl.LeadLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LeadLocalService
 * @generated
 */
@ProviderType
public class LeadLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>mx.movistar.col.lead.service.impl.LeadLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the lead to the database. Also notifies the appropriate model listeners.
	 *
	 * @param lead the lead
	 * @return the lead that was added
	 */
	public static mx.movistar.col.lead.model.Lead addLead(
		mx.movistar.col.lead.model.Lead lead) {

		return getService().addLead(lead);
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
	public static mx.movistar.col.lead.model.Lead addLead(
			long groupId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addLead(
			groupId, titleMap, description, dueDate, parameters,
			serviceContext);
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
	 * Creates a new lead with the primary key. Does not add the lead to the database.
	 *
	 * @param leadId the primary key for the new lead
	 * @return the new lead
	 */
	public static mx.movistar.col.lead.model.Lead createLead(long leadId) {
		return getService().createLead(leadId);
	}

	/**
	 * Deletes the lead from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lead the lead
	 * @return the lead that was removed
	 */
	public static mx.movistar.col.lead.model.Lead deleteLead(
		mx.movistar.col.lead.model.Lead lead) {

		return getService().deleteLead(lead);
	}

	/**
	 * Deletes the lead with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead that was removed
	 * @throws PortalException if a lead with the primary key could not be found
	 */
	public static mx.movistar.col.lead.model.Lead deleteLead(long leadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteLead(leadId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static mx.movistar.col.lead.model.Lead fetchLead(long leadId) {
		return getService().fetchLead(leadId);
	}

	/**
	 * Returns the lead matching the UUID and group.
	 *
	 * @param uuid the lead's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static mx.movistar.col.lead.model.Lead fetchLeadByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchLeadByUuidAndGroupId(uuid, groupId);
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
	 * Returns the lead with the primary key.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead
	 * @throws PortalException if a lead with the primary key could not be found
	 */
	public static mx.movistar.col.lead.model.Lead getLead(long leadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getLead(leadId);
	}

	/**
	 * Returns the lead matching the UUID and group.
	 *
	 * @param uuid the lead's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lead
	 * @throws PortalException if a matching lead could not be found
	 */
	public static mx.movistar.col.lead.model.Lead getLeadByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getLeadByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<mx.movistar.col.lead.model.Lead> getLeads(
		int start, int end) {

		return getService().getLeads(start, end);
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByGroupId(long groupId) {

		return getService().getLeadsByGroupId(groupId);
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByGroupId(long groupId, int start, int end) {

		return getService().getLeadsByGroupId(groupId, start, end);
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Lead> orderByComparator) {

		return getService().getLeadsByGroupId(
			groupId, start, end, orderByComparator);
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByGroupIdAndCampaignId(long groupId, long campaignId) {

		return getService().getLeadsByGroupIdAndCampaignId(groupId, campaignId);
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
	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Lead> orderByComparator) {

		return getService().getLeadsByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByStatus(int status) {

		return getService().getLeadsByStatus(status);
	}

	/**
	 * Returns all the leads matching the UUID and company.
	 *
	 * @param uuid the UUID of the leads
	 * @param companyId the primary key of the company
	 * @return the matching leads, or an empty list if no matches were found
	 */
	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getLeadsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Lead> orderByComparator) {

		return getService().getLeadsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of leads.
	 *
	 * @return the number of leads
	 */
	public static int getLeadsCount() {
		return getService().getLeadsCount();
	}

	public static int getLeadsCountByGroupId(long groupId) {
		return getService().getLeadsCountByGroupId(groupId);
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
	public static long getLeadsCountByKeywords(
		long groupId, String keywords, int status) {

		return getService().getLeadsCountByKeywords(groupId, keywords, status);
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
	public static mx.movistar.col.lead.model.Lead incrementTotalScoring(
		mx.movistar.col.lead.model.Lead lead, int increment) {

		return getService().incrementTotalScoring(lead, increment);
	}

	/**
	 * Updates the lead in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param lead the lead
	 * @return the lead that was updated
	 */
	public static mx.movistar.col.lead.model.Lead updateLead(
		mx.movistar.col.lead.model.Lead lead) {

		return getService().updateLead(lead);
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
	public static mx.movistar.col.lead.model.Lead updateLead(
			long LeadId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateLead(
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
	public static mx.movistar.col.lead.model.Lead updateStatus(
			long userId, long leadId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().updateStatus(
			userId, leadId, status, serviceContext);
	}

	public static LeadLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LeadLocalService, LeadLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LeadLocalService.class);

		ServiceTracker<LeadLocalService, LeadLocalService> serviceTracker =
			new ServiceTracker<LeadLocalService, LeadLocalService>(
				bundle.getBundleContext(), LeadLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
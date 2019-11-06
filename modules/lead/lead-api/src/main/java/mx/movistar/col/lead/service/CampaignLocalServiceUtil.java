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
 * Provides the local service utility for Campaign. This utility wraps
 * <code>mx.movistar.col.lead.service.impl.CampaignLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CampaignLocalService
 * @generated
 */
@ProviderType
public class CampaignLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>mx.movistar.col.lead.service.impl.CampaignLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the campaign to the database. Also notifies the appropriate model listeners.
	 *
	 * @param campaign the campaign
	 * @return the campaign that was added
	 */
	public static mx.movistar.col.lead.model.Campaign addCampaign(
		mx.movistar.col.lead.model.Campaign campaign) {

		return getService().addCampaign(campaign);
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
	public static mx.movistar.col.lead.model.Campaign addCampaign(
			long groupId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCampaign(
			groupId, titleMap, description, dueDate, serviceContext);
	}

	/**
	 * Creates a new campaign with the primary key. Does not add the campaign to the database.
	 *
	 * @param campaignId the primary key for the new campaign
	 * @return the new campaign
	 */
	public static mx.movistar.col.lead.model.Campaign createCampaign(
		long campaignId) {

		return getService().createCampaign(campaignId);
	}

	/**
	 * Deletes the campaign from the database. Also notifies the appropriate model listeners.
	 *
	 * @param campaign the campaign
	 * @return the campaign that was removed
	 */
	public static mx.movistar.col.lead.model.Campaign deleteCampaign(
		mx.movistar.col.lead.model.Campaign campaign) {

		return getService().deleteCampaign(campaign);
	}

	/**
	 * Deletes the campaign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param campaignId the primary key of the campaign
	 * @return the campaign that was removed
	 * @throws PortalException if a campaign with the primary key could not be found
	 */
	public static mx.movistar.col.lead.model.Campaign deleteCampaign(
			long campaignId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCampaign(campaignId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.CampaignModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.CampaignModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static mx.movistar.col.lead.model.Campaign fetchCampaign(
		long campaignId) {

		return getService().fetchCampaign(campaignId);
	}

	/**
	 * Returns the campaign matching the UUID and group.
	 *
	 * @param uuid the campaign's UUID
	 * @param groupId the primary key of the group
	 * @return the matching campaign, or <code>null</code> if a matching campaign could not be found
	 */
	public static mx.movistar.col.lead.model.Campaign
		fetchCampaignByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchCampaignByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the campaign with the primary key.
	 *
	 * @param campaignId the primary key of the campaign
	 * @return the campaign
	 * @throws PortalException if a campaign with the primary key could not be found
	 */
	public static mx.movistar.col.lead.model.Campaign getCampaign(
			long campaignId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCampaign(campaignId);
	}

	/**
	 * Returns the campaign matching the UUID and group.
	 *
	 * @param uuid the campaign's UUID
	 * @param groupId the primary key of the group
	 * @return the matching campaign
	 * @throws PortalException if a matching campaign could not be found
	 */
	public static mx.movistar.col.lead.model.Campaign
			getCampaignByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCampaignByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the campaigns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.CampaignModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of campaigns
	 * @param end the upper bound of the range of campaigns (not inclusive)
	 * @return the range of campaigns
	 */
	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaigns(int start, int end) {

		return getService().getCampaigns(start, end);
	}

	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByGroupId(long groupId) {

		return getService().getCampaignsByGroupId(groupId);
	}

	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByGroupId(long groupId, int start, int end) {

		return getService().getCampaignsByGroupId(groupId, start, end);
	}

	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Campaign> orderByComparator) {

		return getService().getCampaignsByGroupId(
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
	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Campaign> orderByComparator) {

		return getService().getCampaignsByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByStatus(int status) {

		return getService().getCampaignsByStatus(status);
	}

	/**
	 * Returns all the campaigns matching the UUID and company.
	 *
	 * @param uuid the UUID of the campaigns
	 * @param companyId the primary key of the company
	 * @return the matching campaigns, or an empty list if no matches were found
	 */
	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getCampaignsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of campaigns matching the UUID and company.
	 *
	 * @param uuid the UUID of the campaigns
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of campaigns
	 * @param end the upper bound of the range of campaigns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching campaigns, or an empty list if no matches were found
	 */
	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Campaign> orderByComparator) {

		return getService().getCampaignsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of campaigns.
	 *
	 * @return the number of campaigns
	 */
	public static int getCampaignsCount() {
		return getService().getCampaignsCount();
	}

	public static int getCampaignsCountByGroupId(long groupId) {
		return getService().getCampaignsCountByGroupId(groupId);
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
	public static long getCampaignsCountByKeywords(
		long groupId, String keywords, int status) {

		return getService().getCampaignsCountByKeywords(
			groupId, keywords, status);
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
	 * Updates the campaign in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param campaign the campaign
	 * @return the campaign that was updated
	 */
	public static mx.movistar.col.lead.model.Campaign updateCampaign(
		mx.movistar.col.lead.model.Campaign campaign) {

		return getService().updateCampaign(campaign);
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
	public static mx.movistar.col.lead.model.Campaign updateCampaign(
			long CampaignId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCampaign(
			CampaignId, titleMap, description, dueDate, serviceContext);
	}

	public static mx.movistar.col.lead.model.Campaign updateEntry(
			long campaignId, String title, String description,
			java.util.Date dueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateEntry(
			campaignId, title, description, dueDate);
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
	public static mx.movistar.col.lead.model.Campaign updateStatus(
			long userId, long CampaignId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().updateStatus(
			userId, CampaignId, status, serviceContext);
	}

	public static CampaignLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CampaignLocalService, CampaignLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CampaignLocalService.class);

		ServiceTracker<CampaignLocalService, CampaignLocalService>
			serviceTracker =
				new ServiceTracker<CampaignLocalService, CampaignLocalService>(
					bundle.getBundleContext(), CampaignLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
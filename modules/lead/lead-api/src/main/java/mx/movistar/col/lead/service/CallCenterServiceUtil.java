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
 * Provides the remote service utility for CallCenter. This utility wraps
 * <code>mx.movistar.col.lead.service.impl.CallCenterServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CallCenterService
 * @generated
 */
@ProviderType
public class CallCenterServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>mx.movistar.col.lead.service.impl.CallCenterServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static mx.movistar.col.lead.model.CallCenter addCallCenter(
			long groupId, java.util.Map<java.util.Locale, String> title,
			String description, java.util.Map<String, String> parameters,
			java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCallCenter(
			groupId, title, description, parameters, dueDate, serviceContext);
	}

	public static mx.movistar.col.lead.model.CallCenter deleteCallCenter(
			long CallCenterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCallCenter(CallCenterId);
	}

	public static mx.movistar.col.lead.model.CallCenter getCallCenter(
			long CallCenterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCallCenter(CallCenterId);
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(long groupId) {

		return getService().getCallCenterByGroupId(groupId);
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

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return getService().getCallCenterByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	public static long getCallCenterCountByKeywords(
		long groupId, String keywords, int status) {

		return getService().getCallCenterCountByKeywords(
			groupId, keywords, status);
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByGroupId(long groupId) {

		return getService().getCallCentersByGroupId(groupId);
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return getService().getCallCentersByGroupId(
			groupId, start, end, orderByComparator);
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByGroupIdAndCampaignId(long groupId, long campaignId) {

		return getService().getCallCentersByGroupIdAndCampaignId(
			groupId, campaignId);
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return getService().getCallCentersByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	public static long getCallCentersCountByKeywords(
		long groupId, String keywords, int status) {

		return getService().getCallCentersCountByKeywords(
			groupId, keywords, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

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

	public static CallCenterService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CallCenterService, CallCenterService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CallCenterService.class);

		ServiceTracker<CallCenterService, CallCenterService> serviceTracker =
			new ServiceTracker<CallCenterService, CallCenterService>(
				bundle.getBundleContext(), CallCenterService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
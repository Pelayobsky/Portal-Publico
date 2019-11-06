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
 * Provides the remote service utility for Campaign. This utility wraps
 * <code>mx.movistar.col.lead.service.impl.CampaignServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CampaignService
 * @generated
 */
@ProviderType
public class CampaignServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>mx.movistar.col.lead.service.impl.CampaignServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static mx.movistar.col.lead.model.Campaign addCampaign(
			long groupId, java.util.Map<java.util.Locale, String> title,
			String description, java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCampaign(
			groupId, title, description, dueDate, serviceContext);
	}

	public static mx.movistar.col.lead.model.Campaign deleteCampaign(
			long CampaignId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCampaign(CampaignId);
	}

	public static mx.movistar.col.lead.model.Campaign getCampaign(
			long CampaignId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCampaign(CampaignId);
	}

	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByGroupId(long groupId) {

		return getService().getCampaignsByGroupId(groupId);
	}

	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Campaign> orderByComparator) {

		return getService().getCampaignsByGroupId(
			groupId, start, end, orderByComparator);
	}

	public static java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Campaign> orderByComparator) {

		return getService().getCampaignsByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	public static long getCampaignsCountByKeywords(
		long groupId, String keywords, int status) {

		return getService().getCampaignsCountByKeywords(
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

	public static mx.movistar.col.lead.model.Campaign updateCampaign(
			long campaignId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCampaign(
			campaignId, titleMap, description, dueDate, serviceContext);
	}

	public static CampaignService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CampaignService, CampaignService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CampaignService.class);

		ServiceTracker<CampaignService, CampaignService> serviceTracker =
			new ServiceTracker<CampaignService, CampaignService>(
				bundle.getBundleContext(), CampaignService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
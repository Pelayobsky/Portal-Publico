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
 * Provides the remote service utility for Lead. This utility wraps
 * <code>mx.movistar.col.lead.service.impl.LeadServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see LeadService
 * @generated
 */
@ProviderType
public class LeadServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>mx.movistar.col.lead.service.impl.LeadServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static mx.movistar.col.lead.model.Lead addLead(
			long groupId, java.util.Map<java.util.Locale, String> title,
			String description, java.util.Map<String, String> parameters,
			java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addLead(
			groupId, title, description, parameters, dueDate, serviceContext);
	}

	public static mx.movistar.col.lead.model.Lead deleteLead(long LeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteLead(LeadId);
	}

	public static mx.movistar.col.lead.model.Lead getLead(long LeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getLead(LeadId);
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByGroupId(long groupId) {

		return getService().getLeadsByGroupId(groupId);
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

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Lead> orderByComparator) {

		return getService().getLeadsByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

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

	public static mx.movistar.col.lead.model.Lead updateLead(
			long LeadId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateLead(
			LeadId, titleMap, description, dueDate, parameters, serviceContext);
	}

	public static LeadService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LeadService, LeadService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LeadService.class);

		ServiceTracker<LeadService, LeadService> serviceTracker =
			new ServiceTracker<LeadService, LeadService>(
				bundle.getBundleContext(), LeadService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
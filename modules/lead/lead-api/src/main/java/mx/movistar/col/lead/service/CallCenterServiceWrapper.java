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
 * Provides a wrapper for {@link CallCenterService}.
 *
 * @author Brian Wing Shun Chan
 * @see CallCenterService
 * @generated
 */
@ProviderType
public class CallCenterServiceWrapper
	implements CallCenterService, ServiceWrapper<CallCenterService> {

	public CallCenterServiceWrapper(CallCenterService callCenterService) {
		_callCenterService = callCenterService;
	}

	@Override
	public mx.movistar.col.lead.model.CallCenter addCallCenter(
			long groupId, java.util.Map<java.util.Locale, String> title,
			String description, java.util.Map<String, String> parameters,
			java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterService.addCallCenter(
			groupId, title, description, parameters, dueDate, serviceContext);
	}

	@Override
	public mx.movistar.col.lead.model.CallCenter deleteCallCenter(
			long CallCenterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterService.deleteCallCenter(CallCenterId);
	}

	@Override
	public mx.movistar.col.lead.model.CallCenter getCallCenter(
			long CallCenterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterService.getCallCenter(CallCenterId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(long groupId) {

		return _callCenterService.getCallCenterByGroupId(groupId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return _callCenterService.getCallCenterByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupIdAndCampaignId(long groupId, long campaignId) {

		return _callCenterService.getCallCenterByGroupIdAndCampaignId(
			groupId, campaignId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return _callCenterService.getCallCenterByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	@Override
	public long getCallCenterCountByKeywords(
		long groupId, String keywords, int status) {

		return _callCenterService.getCallCenterCountByKeywords(
			groupId, keywords, status);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByGroupId(long groupId) {

		return _callCenterService.getCallCentersByGroupId(groupId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return _callCenterService.getCallCentersByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByGroupIdAndCampaignId(long groupId, long campaignId) {

		return _callCenterService.getCallCentersByGroupIdAndCampaignId(
			groupId, campaignId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		return _callCenterService.getCallCentersByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	@Override
	public long getCallCentersCountByKeywords(
		long groupId, String keywords, int status) {

		return _callCenterService.getCallCentersCountByKeywords(
			groupId, keywords, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _callCenterService.getOSGiServiceIdentifier();
	}

	@Override
	public mx.movistar.col.lead.model.CallCenter updateCallCenter(
			long CallCenterId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _callCenterService.updateCallCenter(
			CallCenterId, titleMap, description, dueDate, parameters,
			serviceContext);
	}

	@Override
	public CallCenterService getWrappedService() {
		return _callCenterService;
	}

	@Override
	public void setWrappedService(CallCenterService callCenterService) {
		_callCenterService = callCenterService;
	}

	private CallCenterService _callCenterService;

}
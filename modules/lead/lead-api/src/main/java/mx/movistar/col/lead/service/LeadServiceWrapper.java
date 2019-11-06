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
 * Provides a wrapper for {@link LeadService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeadService
 * @generated
 */
@ProviderType
public class LeadServiceWrapper
	implements LeadService, ServiceWrapper<LeadService> {

	public LeadServiceWrapper(LeadService leadService) {
		_leadService = leadService;
	}

	@Override
	public mx.movistar.col.lead.model.Lead addLead(
			long groupId, java.util.Map<java.util.Locale, String> title,
			String description, java.util.Map<String, String> parameters,
			java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadService.addLead(
			groupId, title, description, parameters, dueDate, serviceContext);
	}

	@Override
	public mx.movistar.col.lead.model.Lead deleteLead(long LeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadService.deleteLead(LeadId);
	}

	@Override
	public mx.movistar.col.lead.model.Lead getLead(long LeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadService.getLead(LeadId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getLeadsByGroupId(
		long groupId) {

		return _leadService.getLeadsByGroupId(groupId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getLeadsByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<mx.movistar.col.lead.model.Lead> orderByComparator) {

		return _leadService.getLeadsByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByGroupIdAndCampaignId(long groupId, long campaignId) {

		return _leadService.getLeadsByGroupIdAndCampaignId(groupId, campaignId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Lead> getLeadsByKeywords(
		long groupId, String keywords, int start, int end, int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<mx.movistar.col.lead.model.Lead> orderByComparator) {

		return _leadService.getLeadsByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	@Override
	public long getLeadsCountByKeywords(
		long groupId, String keywords, int status) {

		return _leadService.getLeadsCountByKeywords(groupId, keywords, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _leadService.getOSGiServiceIdentifier();
	}

	@Override
	public mx.movistar.col.lead.model.Lead updateLead(
			long LeadId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadService.updateLead(
			LeadId, titleMap, description, dueDate, parameters, serviceContext);
	}

	@Override
	public LeadService getWrappedService() {
		return _leadService;
	}

	@Override
	public void setWrappedService(LeadService leadService) {
		_leadService = leadService;
	}

	private LeadService _leadService;

}
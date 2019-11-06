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
 * Provides a wrapper for {@link CampaignService}.
 *
 * @author Brian Wing Shun Chan
 * @see CampaignService
 * @generated
 */
@ProviderType
public class CampaignServiceWrapper
	implements CampaignService, ServiceWrapper<CampaignService> {

	public CampaignServiceWrapper(CampaignService campaignService) {
		_campaignService = campaignService;
	}

	@Override
	public mx.movistar.col.lead.model.Campaign addCampaign(
			long groupId, java.util.Map<java.util.Locale, String> title,
			String description, java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _campaignService.addCampaign(
			groupId, title, description, dueDate, serviceContext);
	}

	@Override
	public mx.movistar.col.lead.model.Campaign deleteCampaign(long CampaignId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _campaignService.deleteCampaign(CampaignId);
	}

	@Override
	public mx.movistar.col.lead.model.Campaign getCampaign(long CampaignId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _campaignService.getCampaign(CampaignId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByGroupId(long groupId) {

		return _campaignService.getCampaignsByGroupId(groupId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Campaign> orderByComparator) {

		return _campaignService.getCampaignsByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Campaign>
		getCampaignsByKeywords(
			long groupId, String keywords, int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Campaign> orderByComparator) {

		return _campaignService.getCampaignsByKeywords(
			groupId, keywords, start, end, status, orderByComparator);
	}

	@Override
	public long getCampaignsCountByKeywords(
		long groupId, String keywords, int status) {

		return _campaignService.getCampaignsCountByKeywords(
			groupId, keywords, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _campaignService.getOSGiServiceIdentifier();
	}

	@Override
	public mx.movistar.col.lead.model.Campaign updateCampaign(
			long campaignId, java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _campaignService.updateCampaign(
			campaignId, titleMap, description, dueDate, serviceContext);
	}

	@Override
	public CampaignService getWrappedService() {
		return _campaignService;
	}

	@Override
	public void setWrappedService(CampaignService campaignService) {
		_campaignService = campaignService;
	}

	private CampaignService _campaignService;

}
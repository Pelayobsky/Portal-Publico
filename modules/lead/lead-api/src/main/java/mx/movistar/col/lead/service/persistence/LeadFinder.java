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

package mx.movistar.col.lead.service.persistence;

import aQute.bnd.annotation.ProviderType;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public interface LeadFinder {

	public java.util.List<mx.movistar.col.lead.model.Campaign>
		getAllCampaigns();

	public java.util.List<mx.movistar.col.lead.model.Lead> getAllLeads();

	public java.util.List<mx.movistar.col.lead.model.LeadScoring>
		getAllLeadScorings();

	public int countLeadReportEntriesByCampaignId(
		long groupId, int status, long campaignId);

	public int countLeadReportEntriesByLeadId(
		long groupId, int status, long leadId);

	public int countLeadReportEntriesByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate);

	public java.util.List findLeadReportByG_S_DateRange(
		long groupId, int status, java.util.Date fromDate,
		java.util.Date toDate, int start, int end);

	public java.util.List findLeadReportEntryByPK(long leadScoringId);

}
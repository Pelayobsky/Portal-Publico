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

package mx.movistar.col.lead.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.permission.LeadPermissionChecker;
import mx.movistar.col.lead.service.base.LeadServiceBaseImpl;
import mx.movistar.col.lead.service.permission.impl.LeadPermissionCheckerImpl;

/**
 * The implementation of the lead remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link mx.movistar.col.lead.service.LeadService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeadServiceBaseImpl
 * @see mx.movistar.col.lead.service.LeadServiceUtil
 */
public class LeadServiceImpl extends LeadServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link mx.movistar.col.lead.service.LeadServiceUtil} to access the lead remote service.
	 */
	
	public Lead addLead(long groupId, Map<Locale, String> title, String description, Map<String, String> parameters, Date dueDate, ServiceContext serviceContext) throws PortalException {

		// Check permissions
		
		_leadPermissionChecker.checkTopLevel(
				getPermissionChecker(), serviceContext.getScopeGroupId(),
				LeadPermissionCheckerImpl.ADD_LEAD);
		
		return leadLocalService.addLead(groupId, title, description, dueDate, parameters, serviceContext);
	}
	
	public Lead deleteLead(long LeadId) throws PortalException {
		Lead Lead = leadLocalService.getLead(LeadId);
		
		// Check permissions.
		
		_leadPermissionChecker.check(
				getPermissionChecker(), Lead.getGroupId(),
				Lead.getLeadId(), ActionKeys.DELETE);
		
		return leadLocalService.deleteLead(Lead);
	}
	
	public Lead getLead(long LeadId) throws PortalException {	
		Lead Lead = leadLocalService.getLead(LeadId);
		
		// Check permissions.
		
		_leadPermissionChecker.check(
			getPermissionChecker(), Lead.getGroupId(),
			Lead.getLeadId(), ActionKeys.VIEW);	
	
		return Lead;
	}
	
	public List<Lead> getLeadsByGroupIdAndCampaignId(long groupId, long campaignId) {
		return leadLocalService.getLeadsByGroupIdAndCampaignId(groupId, campaignId);
	}

	public List<Lead> getLeadsByGroupId(long groupId, int start, int end, OrderByComparator<Lead> orderByComparator) {
		return leadLocalService.getLeadsByGroupId(groupId, start, end, orderByComparator);
	}
	
	public List<Lead> getLeadsByGroupId(long groupId) {
		return leadLocalService.getLeadsByGroupId(groupId);
	}
	
	public List<Lead> getLeadsByKeywords(long groupId, String keywords, int start, int end, int status, OrderByComparator<Lead> orderByComparator) {
		return leadLocalService.getLeadsByKeywords(groupId, keywords, start, end, status, orderByComparator);
	}
	
	public long getLeadsCountByKeywords(long groupId, String keywords, int status) {
		return leadLocalService.getLeadsCountByKeywords(groupId, keywords, status);
	}
	
	public Lead updateLead(long LeadId, Map<Locale, String> titleMap, String description, Date dueDate, Map<String, String> parameters, ServiceContext serviceContext) throws PortalException {

		Lead Lead = leadLocalService.getLead(LeadId);
				
		// Check permissions.
		
		_leadPermissionChecker.check(
				getPermissionChecker(), Lead.getGroupId(),
				Lead.getLeadId(), ActionKeys.UPDATE);
		
		return leadLocalService.updateLead(LeadId, titleMap, description, dueDate, parameters, serviceContext);
	}
	
	/**
	 * Service builder classes are not OSGi components but Spring beans and you cannot
	 * use the @Reference annotation. Use @ServiceReference instead.
	 */
	@ServiceReference(type = 
			mx.movistar.col.lead.permission.LeadPermissionChecker.class)
	private LeadPermissionChecker _leadPermissionChecker;
}

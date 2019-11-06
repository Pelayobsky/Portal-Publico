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

import mx.movistar.col.lead.model.CallCenter;
import mx.movistar.col.lead.permission.CallCenterPermissionChecker;
import mx.movistar.col.lead.service.base.CallCenterServiceBaseImpl;
import mx.movistar.col.lead.service.permission.impl.CallCenterPermissionCheckerImpl;


/**
 * The implementation of the lead remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link mx.movistar.col.lead.service.CallCenterService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CallCenterServiceBaseImpl
 * @see mx.movistar.col.lead.service.CallCenterServiceUtil
 */
public class CallCenterServiceImpl extends CallCenterServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link mx.movistar.col.lead.service.CallCenterServiceUtil} to access the lead remote service.
	 */
	
	public CallCenter addCallCenter(long groupId, Map<Locale, String> title, String description, Map<String, String> parameters, Date dueDate, ServiceContext serviceContext) throws PortalException {

		// Check permissions
		
		_callCenterPermissionChecker.checkTopLevel(
				getPermissionChecker(), serviceContext.getScopeGroupId(),
				CallCenterPermissionCheckerImpl.ADD_CALLCENTER);
		
		return callCenterLocalService.addCallCenter(groupId, title, description, dueDate, parameters, serviceContext);
	}
	
	public CallCenter deleteCallCenter(long CallCenterId) throws PortalException {
		CallCenter CallCenter = callCenterLocalService.getCallCenter(CallCenterId);
		
		// Check permissions.
		
		_callCenterPermissionChecker.check(
				getPermissionChecker(), CallCenter.getGroupId(),
				CallCenter.getCallCenterId(), ActionKeys.DELETE);
		
		return callCenterLocalService.deleteCallCenter(CallCenter);
	}
	
	public CallCenter getCallCenter(long CallCenterId) throws PortalException {	
		CallCenter CallCenter = callCenterLocalService.getCallCenter(CallCenterId);
		
		// Check permissions.
		
		_callCenterPermissionChecker.check(
			getPermissionChecker(), CallCenter.getGroupId(),
			CallCenter.getCallCenterId(), ActionKeys.VIEW);	
	
		return CallCenter;
	}
	
	public List<CallCenter> getCallCentersByGroupIdAndCampaignId(long groupId, long campaignId) {
		return callCenterLocalService.getCallCenterByGroupIdAndCampaignId(groupId, campaignId);
	}

	public List<CallCenter> getCallCentersByGroupId(long groupId, int start, int end, OrderByComparator<CallCenter> orderByComparator) {
		return callCenterLocalService.getCallCenterByGroupId(groupId, start, end, orderByComparator);
	}
	
	public List<CallCenter> getCallCentersByGroupId(long groupId) {
		return callCenterLocalService.getCallCenterByGroupId(groupId);
	}
	
	public List<CallCenter> getCallCentersByKeywords(long groupId, String keywords, int start, int end, int status, OrderByComparator<CallCenter> orderByComparator) {
		return callCenterLocalService.getCallCenterByKeywords(groupId, keywords, start, end, status, orderByComparator);
	}
	
	public long getCallCentersCountByKeywords(long groupId, String keywords, int status) {
		return callCenterLocalService.getCallCenterCountByKeywords(groupId, keywords, status);
	}
	
	public CallCenter updateCallCenter(long CallCenterId, Map<Locale, String> titleMap, String description, Date dueDate, Map<String, String> parameters, ServiceContext serviceContext) throws PortalException {

		CallCenter CallCenter = callCenterLocalService.getCallCenter(CallCenterId);
				
		// Check permissions.
		
		_callCenterPermissionChecker.check(
				getPermissionChecker(), CallCenter.getGroupId(),
				CallCenter.getCallCenterId(), ActionKeys.UPDATE);
		
		return callCenterLocalService.updateCallCenter(CallCenterId, titleMap, description, dueDate, parameters, serviceContext);
	}
	
	/**
	 * Service builder classes are not OSGi components but Spring beans and you cannot
	 * use the @Reference annotation. Use @ServiceReference instead.
	 */
	@ServiceReference(type = 
			mx.movistar.col.lead.permission.CallCenterPermissionChecker.class)
	private CallCenterPermissionChecker _callCenterPermissionChecker;

	@Override
	public List<CallCenter> getCallCenterByGroupId(long groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CallCenter> getCallCenterByGroupId(long groupId, int start, int end,
			OrderByComparator<CallCenter> orderByComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CallCenter> getCallCenterByGroupIdAndCampaignId(long groupId, long campaignId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CallCenter> getCallCenterByKeywords(long groupId, String keywords, int start, int end, int status,
			OrderByComparator<CallCenter> orderByComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCallCenterCountByKeywords(long groupId, String keywords, int status) {
		// TODO Auto-generated method stub
		return 0;
	}
}

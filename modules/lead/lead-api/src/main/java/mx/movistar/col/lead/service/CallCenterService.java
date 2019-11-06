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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import mx.movistar.col.lead.model.CallCenter;

/**
 * Provides the remote service interface for CallCenter. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CallCenterServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(
	property = {
		"json.web.service.context.name=lead",
		"json.web.service.context.path=CallCenter"
	},
	service = CallCenterService.class
)
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface CallCenterService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CallCenterServiceUtil} to access the call center remote service. Add custom service methods to <code>mx.movistar.col.lead.service.impl.CallCenterServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public CallCenter addCallCenter(
			long groupId, Map<Locale, String> title, String description,
			Map<String, String> parameters, Date dueDate,
			ServiceContext serviceContext)
		throws PortalException;

	public CallCenter deleteCallCenter(long CallCenterId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CallCenter getCallCenter(long CallCenterId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CallCenter> getCallCenterByGroupId(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CallCenter> getCallCenterByGroupId(
		long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CallCenter> getCallCenterByGroupIdAndCampaignId(
		long groupId, long campaignId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CallCenter> getCallCenterByKeywords(
		long groupId, String keywords, int start, int end, int status,
		OrderByComparator<CallCenter> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getCallCenterCountByKeywords(
		long groupId, String keywords, int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CallCenter> getCallCentersByGroupId(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CallCenter> getCallCentersByGroupId(
		long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CallCenter> getCallCentersByGroupIdAndCampaignId(
		long groupId, long campaignId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CallCenter> getCallCentersByKeywords(
		long groupId, String keywords, int start, int end, int status,
		OrderByComparator<CallCenter> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getCallCentersCountByKeywords(
		long groupId, String keywords, int status);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public CallCenter updateCallCenter(
			long CallCenterId, Map<Locale, String> titleMap, String description,
			Date dueDate, Map<String, String> parameters,
			ServiceContext serviceContext)
		throws PortalException;

}
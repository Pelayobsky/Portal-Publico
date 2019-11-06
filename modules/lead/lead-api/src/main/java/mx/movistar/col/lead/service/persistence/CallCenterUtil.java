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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import mx.movistar.col.lead.model.CallCenter;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the call center service. This utility wraps <code>mx.movistar.col.lead.service.persistence.impl.CallCenterPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CallCenterPersistence
 * @generated
 */
@ProviderType
public class CallCenterUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CallCenter callCenter) {
		getPersistence().clearCache(callCenter);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CallCenter> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CallCenter> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CallCenter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CallCenter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CallCenter update(CallCenter callCenter) {
		return getPersistence().update(callCenter);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CallCenter update(
		CallCenter callCenter, ServiceContext serviceContext) {

		return getPersistence().update(callCenter, serviceContext);
	}

	/**
	 * Returns all the call centers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching call centers
	 */
	public static List<CallCenter> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the call centers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @return the range of matching call centers
	 */
	public static List<CallCenter> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the call centers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching call centers
	 */
	@Deprecated
	public static List<CallCenter> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the call centers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching call centers
	 */
	public static List<CallCenter> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByUuid_First(
			String uuid, OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByUuid_First(
		String uuid, OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByUuid_Last(
			String uuid, OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByUuid_Last(
		String uuid, OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the call centers before and after the current call center in the ordered set where uuid = &#63;.
	 *
	 * @param callCenterId the primary key of the current call center
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public static CallCenter[] findByUuid_PrevAndNext(
			long callCenterId, String uuid,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByUuid_PrevAndNext(
			callCenterId, uuid, orderByComparator);
	}

	/**
	 * Removes all the call centers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of call centers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching call centers
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the call center where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCallCenterException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByUUID_G(String uuid, long groupId)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the call center where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching call center, or <code>null</code> if a matching call center could not be found
	 */
	@Deprecated
	public static CallCenter fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Returns the call center where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Removes the call center where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the call center that was removed
	 */
	public static CallCenter removeByUUID_G(String uuid, long groupId)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of call centers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching call centers
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the call centers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching call centers
	 */
	public static List<CallCenter> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the call centers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @return the range of matching call centers
	 */
	public static List<CallCenter> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the call centers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching call centers
	 */
	@Deprecated
	public static List<CallCenter> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the call centers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching call centers
	 */
	public static List<CallCenter> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the call centers before and after the current call center in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param callCenterId the primary key of the current call center
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public static CallCenter[] findByUuid_C_PrevAndNext(
			long callCenterId, String uuid, long companyId,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByUuid_C_PrevAndNext(
			callCenterId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the call centers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of call centers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching call centers
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the call centers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching call centers
	 */
	public static List<CallCenter> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the call centers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @return the range of matching call centers
	 */
	public static List<CallCenter> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the call centers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByGroupId(long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching call centers
	 */
	@Deprecated
	public static List<CallCenter> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the call centers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching call centers
	 */
	public static List<CallCenter> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByGroupId_First(
			long groupId, OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByGroupId_First(
		long groupId, OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByGroupId_Last(
			long groupId, OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByGroupId_Last(
		long groupId, OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the call centers before and after the current call center in the ordered set where groupId = &#63;.
	 *
	 * @param callCenterId the primary key of the current call center
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public static CallCenter[] findByGroupId_PrevAndNext(
			long callCenterId, long groupId,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByGroupId_PrevAndNext(
			callCenterId, groupId, orderByComparator);
	}

	/**
	 * Removes all the call centers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of call centers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching call centers
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the call centers where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching call centers
	 */
	public static List<CallCenter> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

	/**
	 * Returns a range of all the call centers where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @return the range of matching call centers
	 */
	public static List<CallCenter> findByStatus(
		int status, int start, int end) {

		return getPersistence().findByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the call centers where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByStatus(int, int, int, OrderByComparator)}
	 * @param status the status
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching call centers
	 */
	@Deprecated
	public static List<CallCenter> findByStatus(
		int status, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the call centers where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching call centers
	 */
	public static List<CallCenter> findByStatus(
		int status, int start, int end,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByStatus_First(
			int status, OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByStatus_First(
		int status, OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByStatus_Last(
			int status, OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByStatus_Last(
		int status, OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the call centers before and after the current call center in the ordered set where status = &#63;.
	 *
	 * @param callCenterId the primary key of the current call center
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public static CallCenter[] findByStatus_PrevAndNext(
			long callCenterId, int status,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByStatus_PrevAndNext(
			callCenterId, status, orderByComparator);
	}

	/**
	 * Removes all the call centers where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	 * Returns the number of call centers where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching call centers
	 */
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	 * Returns all the call centers where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the matching call centers
	 */
	public static List<CallCenter> findByG_S(int status, long groupId) {
		return getPersistence().findByG_S(status, groupId);
	}

	/**
	 * Returns a range of all the call centers where status = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @return the range of matching call centers
	 */
	public static List<CallCenter> findByG_S(
		int status, long groupId, int start, int end) {

		return getPersistence().findByG_S(status, groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the call centers where status = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByG_S(int,long, int, int, OrderByComparator)}
	 * @param status the status
	 * @param groupId the group ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching call centers
	 */
	@Deprecated
	public static List<CallCenter> findByG_S(
		int status, long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_S(
			status, groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the call centers where status = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching call centers
	 */
	public static List<CallCenter> findByG_S(
		int status, long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().findByG_S(
			status, groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByG_S_First(
			int status, long groupId,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByG_S_First(
			status, groupId, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByG_S_First(
		int status, long groupId,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			status, groupId, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByG_S_Last(
			int status, long groupId,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByG_S_Last(
			status, groupId, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByG_S_Last(
		int status, long groupId,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			status, groupId, orderByComparator);
	}

	/**
	 * Returns the call centers before and after the current call center in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param callCenterId the primary key of the current call center
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public static CallCenter[] findByG_S_PrevAndNext(
			long callCenterId, int status, long groupId,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByG_S_PrevAndNext(
			callCenterId, status, groupId, orderByComparator);
	}

	/**
	 * Removes all the call centers where status = &#63; and groupId = &#63; from the database.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 */
	public static void removeByG_S(int status, long groupId) {
		getPersistence().removeByG_S(status, groupId);
	}

	/**
	 * Returns the number of call centers where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the number of matching call centers
	 */
	public static int countByG_S(int status, long groupId) {
		return getPersistence().countByG_S(status, groupId);
	}

	/**
	 * Returns all the call centers where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the matching call centers
	 */
	public static List<CallCenter> findByG_C(long groupId, long campaignId) {
		return getPersistence().findByG_C(groupId, campaignId);
	}

	/**
	 * Returns a range of all the call centers where groupId = &#63; and campaignId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @return the range of matching call centers
	 */
	public static List<CallCenter> findByG_C(
		long groupId, long campaignId, int start, int end) {

		return getPersistence().findByG_C(groupId, campaignId, start, end);
	}

	/**
	 * Returns an ordered range of all the call centers where groupId = &#63; and campaignId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByG_C(long,long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching call centers
	 */
	@Deprecated
	public static List<CallCenter> findByG_C(
		long groupId, long campaignId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_C(
			groupId, campaignId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the call centers where groupId = &#63; and campaignId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching call centers
	 */
	public static List<CallCenter> findByG_C(
		long groupId, long campaignId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().findByG_C(
			groupId, campaignId, start, end, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByG_C_First(
			long groupId, long campaignId,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByG_C_First(
			groupId, campaignId, orderByComparator);
	}

	/**
	 * Returns the first call center in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByG_C_First(
		long groupId, long campaignId,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByG_C_First(
			groupId, campaignId, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public static CallCenter findByG_C_Last(
			long groupId, long campaignId,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByG_C_Last(
			groupId, campaignId, orderByComparator);
	}

	/**
	 * Returns the last call center in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public static CallCenter fetchByG_C_Last(
		long groupId, long campaignId,
		OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().fetchByG_C_Last(
			groupId, campaignId, orderByComparator);
	}

	/**
	 * Returns the call centers before and after the current call center in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param callCenterId the primary key of the current call center
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public static CallCenter[] findByG_C_PrevAndNext(
			long callCenterId, long groupId, long campaignId,
			OrderByComparator<CallCenter> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByG_C_PrevAndNext(
			callCenterId, groupId, campaignId, orderByComparator);
	}

	/**
	 * Removes all the call centers where groupId = &#63; and campaignId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 */
	public static void removeByG_C(long groupId, long campaignId) {
		getPersistence().removeByG_C(groupId, campaignId);
	}

	/**
	 * Returns the number of call centers where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the number of matching call centers
	 */
	public static int countByG_C(long groupId, long campaignId) {
		return getPersistence().countByG_C(groupId, campaignId);
	}

	/**
	 * Caches the call center in the entity cache if it is enabled.
	 *
	 * @param callCenter the call center
	 */
	public static void cacheResult(CallCenter callCenter) {
		getPersistence().cacheResult(callCenter);
	}

	/**
	 * Caches the call centers in the entity cache if it is enabled.
	 *
	 * @param callCenters the call centers
	 */
	public static void cacheResult(List<CallCenter> callCenters) {
		getPersistence().cacheResult(callCenters);
	}

	/**
	 * Creates a new call center with the primary key. Does not add the call center to the database.
	 *
	 * @param callCenterId the primary key for the new call center
	 * @return the new call center
	 */
	public static CallCenter create(long callCenterId) {
		return getPersistence().create(callCenterId);
	}

	/**
	 * Removes the call center with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param callCenterId the primary key of the call center
	 * @return the call center that was removed
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public static CallCenter remove(long callCenterId)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().remove(callCenterId);
	}

	public static CallCenter updateImpl(CallCenter callCenter) {
		return getPersistence().updateImpl(callCenter);
	}

	/**
	 * Returns the call center with the primary key or throws a <code>NoSuchCallCenterException</code> if it could not be found.
	 *
	 * @param callCenterId the primary key of the call center
	 * @return the call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public static CallCenter findByPrimaryKey(long callCenterId)
		throws mx.movistar.col.lead.exception.NoSuchCallCenterException {

		return getPersistence().findByPrimaryKey(callCenterId);
	}

	/**
	 * Returns the call center with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param callCenterId the primary key of the call center
	 * @return the call center, or <code>null</code> if a call center with the primary key could not be found
	 */
	public static CallCenter fetchByPrimaryKey(long callCenterId) {
		return getPersistence().fetchByPrimaryKey(callCenterId);
	}

	/**
	 * Returns all the call centers.
	 *
	 * @return the call centers
	 */
	public static List<CallCenter> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the call centers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @return the range of call centers
	 */
	public static List<CallCenter> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the call centers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of call centers
	 */
	@Deprecated
	public static List<CallCenter> findAll(
		int start, int end, OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the call centers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CallCenterModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of call centers
	 * @param end the upper bound of the range of call centers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of call centers
	 */
	public static List<CallCenter> findAll(
		int start, int end, OrderByComparator<CallCenter> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the call centers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of call centers.
	 *
	 * @return the number of call centers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CallCenterPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CallCenterPersistence, CallCenterPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CallCenterPersistence.class);

		ServiceTracker<CallCenterPersistence, CallCenterPersistence>
			serviceTracker =
				new ServiceTracker
					<CallCenterPersistence, CallCenterPersistence>(
						bundle.getBundleContext(), CallCenterPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

import mx.movistar.col.lead.exception.NoSuchCallCenterException;
import mx.movistar.col.lead.model.CallCenter;

/**
 * The persistence interface for the call center service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CallCenterUtil
 * @generated
 */
@ProviderType
public interface CallCenterPersistence extends BasePersistence<CallCenter> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CallCenterUtil} to access the call center persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, CallCenter> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the call centers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching call centers
	 */
	public java.util.List<CallCenter> findByUuid(String uuid);

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
	public java.util.List<CallCenter> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<CallCenter> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<CallCenter> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the first call center in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByUuid_First(
			String uuid, OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the first call center in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByUuid_First(
		String uuid, OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the last call center in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByUuid_Last(
			String uuid, OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the last call center in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByUuid_Last(
		String uuid, OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the call centers before and after the current call center in the ordered set where uuid = &#63;.
	 *
	 * @param callCenterId the primary key of the current call center
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public CallCenter[] findByUuid_PrevAndNext(
			long callCenterId, String uuid,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Removes all the call centers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of call centers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching call centers
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the call center where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCallCenterException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByUUID_G(String uuid, long groupId)
		throws NoSuchCallCenterException;

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
	public CallCenter fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the call center where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the call center where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the call center that was removed
	 */
	public CallCenter removeByUUID_G(String uuid, long groupId)
		throws NoSuchCallCenterException;

	/**
	 * Returns the number of call centers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching call centers
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the call centers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching call centers
	 */
	public java.util.List<CallCenter> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<CallCenter> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<CallCenter> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<CallCenter> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the first call center in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the first call center in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the last call center in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the last call center in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CallCenter> orderByComparator);

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
	public CallCenter[] findByUuid_C_PrevAndNext(
			long callCenterId, String uuid, long companyId,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Removes all the call centers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of call centers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching call centers
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the call centers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching call centers
	 */
	public java.util.List<CallCenter> findByGroupId(long groupId);

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
	public java.util.List<CallCenter> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<CallCenter> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<CallCenter> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the first call center in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByGroupId_First(
			long groupId, OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the first call center in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByGroupId_First(
		long groupId, OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the last call center in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByGroupId_Last(
			long groupId, OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the last call center in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByGroupId_Last(
		long groupId, OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the call centers before and after the current call center in the ordered set where groupId = &#63;.
	 *
	 * @param callCenterId the primary key of the current call center
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public CallCenter[] findByGroupId_PrevAndNext(
			long callCenterId, long groupId,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Removes all the call centers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of call centers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching call centers
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the call centers where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching call centers
	 */
	public java.util.List<CallCenter> findByStatus(int status);

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
	public java.util.List<CallCenter> findByStatus(
		int status, int start, int end);

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
	public java.util.List<CallCenter> findByStatus(
		int status, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<CallCenter> findByStatus(
		int status, int start, int end,
		OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the first call center in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByStatus_First(
			int status, OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the first call center in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByStatus_First(
		int status, OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the last call center in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByStatus_Last(
			int status, OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the last call center in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByStatus_Last(
		int status, OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the call centers before and after the current call center in the ordered set where status = &#63;.
	 *
	 * @param callCenterId the primary key of the current call center
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public CallCenter[] findByStatus_PrevAndNext(
			long callCenterId, int status,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Removes all the call centers where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeByStatus(int status);

	/**
	 * Returns the number of call centers where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching call centers
	 */
	public int countByStatus(int status);

	/**
	 * Returns all the call centers where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the matching call centers
	 */
	public java.util.List<CallCenter> findByG_S(int status, long groupId);

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
	public java.util.List<CallCenter> findByG_S(
		int status, long groupId, int start, int end);

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
	public java.util.List<CallCenter> findByG_S(
		int status, long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<CallCenter> findByG_S(
		int status, long groupId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the first call center in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByG_S_First(
			int status, long groupId,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the first call center in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByG_S_First(
		int status, long groupId,
		OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the last call center in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByG_S_Last(
			int status, long groupId,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the last call center in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByG_S_Last(
		int status, long groupId,
		OrderByComparator<CallCenter> orderByComparator);

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
	public CallCenter[] findByG_S_PrevAndNext(
			long callCenterId, int status, long groupId,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Removes all the call centers where status = &#63; and groupId = &#63; from the database.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 */
	public void removeByG_S(int status, long groupId);

	/**
	 * Returns the number of call centers where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the number of matching call centers
	 */
	public int countByG_S(int status, long groupId);

	/**
	 * Returns all the call centers where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the matching call centers
	 */
	public java.util.List<CallCenter> findByG_C(long groupId, long campaignId);

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
	public java.util.List<CallCenter> findByG_C(
		long groupId, long campaignId, int start, int end);

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
	public java.util.List<CallCenter> findByG_C(
		long groupId, long campaignId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<CallCenter> findByG_C(
		long groupId, long campaignId, int start, int end,
		OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the first call center in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByG_C_First(
			long groupId, long campaignId,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the first call center in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByG_C_First(
		long groupId, long campaignId,
		OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Returns the last call center in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center
	 * @throws NoSuchCallCenterException if a matching call center could not be found
	 */
	public CallCenter findByG_C_Last(
			long groupId, long campaignId,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Returns the last call center in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching call center, or <code>null</code> if a matching call center could not be found
	 */
	public CallCenter fetchByG_C_Last(
		long groupId, long campaignId,
		OrderByComparator<CallCenter> orderByComparator);

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
	public CallCenter[] findByG_C_PrevAndNext(
			long callCenterId, long groupId, long campaignId,
			OrderByComparator<CallCenter> orderByComparator)
		throws NoSuchCallCenterException;

	/**
	 * Removes all the call centers where groupId = &#63; and campaignId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 */
	public void removeByG_C(long groupId, long campaignId);

	/**
	 * Returns the number of call centers where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the number of matching call centers
	 */
	public int countByG_C(long groupId, long campaignId);

	/**
	 * Caches the call center in the entity cache if it is enabled.
	 *
	 * @param callCenter the call center
	 */
	public void cacheResult(CallCenter callCenter);

	/**
	 * Caches the call centers in the entity cache if it is enabled.
	 *
	 * @param callCenters the call centers
	 */
	public void cacheResult(java.util.List<CallCenter> callCenters);

	/**
	 * Creates a new call center with the primary key. Does not add the call center to the database.
	 *
	 * @param callCenterId the primary key for the new call center
	 * @return the new call center
	 */
	public CallCenter create(long callCenterId);

	/**
	 * Removes the call center with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param callCenterId the primary key of the call center
	 * @return the call center that was removed
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public CallCenter remove(long callCenterId)
		throws NoSuchCallCenterException;

	public CallCenter updateImpl(CallCenter callCenter);

	/**
	 * Returns the call center with the primary key or throws a <code>NoSuchCallCenterException</code> if it could not be found.
	 *
	 * @param callCenterId the primary key of the call center
	 * @return the call center
	 * @throws NoSuchCallCenterException if a call center with the primary key could not be found
	 */
	public CallCenter findByPrimaryKey(long callCenterId)
		throws NoSuchCallCenterException;

	/**
	 * Returns the call center with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param callCenterId the primary key of the call center
	 * @return the call center, or <code>null</code> if a call center with the primary key could not be found
	 */
	public CallCenter fetchByPrimaryKey(long callCenterId);

	/**
	 * Returns all the call centers.
	 *
	 * @return the call centers
	 */
	public java.util.List<CallCenter> findAll();

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
	public java.util.List<CallCenter> findAll(int start, int end);

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
	public java.util.List<CallCenter> findAll(
		int start, int end, OrderByComparator<CallCenter> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<CallCenter> findAll(
		int start, int end, OrderByComparator<CallCenter> orderByComparator);

	/**
	 * Removes all the call centers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of call centers.
	 *
	 * @return the number of call centers
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}
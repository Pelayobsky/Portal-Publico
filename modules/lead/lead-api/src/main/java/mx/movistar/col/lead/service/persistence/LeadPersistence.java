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

import mx.movistar.col.lead.exception.NoSuchLeadException;
import mx.movistar.col.lead.model.Lead;

/**
 * The persistence interface for the lead service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeadUtil
 * @generated
 */
@ProviderType
public interface LeadPersistence extends BasePersistence<Lead> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LeadUtil} to access the lead persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Lead> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the leads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching leads
	 */
	public java.util.List<Lead> findByUuid(String uuid);

	/**
	 * Returns a range of all the leads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of matching leads
	 */
	public java.util.List<Lead> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the leads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leads
	 */
	@Deprecated
	public java.util.List<Lead> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the leads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leads
	 */
	public java.util.List<Lead> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the first lead in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByUuid_First(
			String uuid, OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the first lead in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByUuid_First(
		String uuid, OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the last lead in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByUuid_Last(
			String uuid, OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the last lead in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByUuid_Last(
		String uuid, OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the leads before and after the current lead in the ordered set where uuid = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead[] findByUuid_PrevAndNext(
			long leadId, String uuid, OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Removes all the leads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of leads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching leads
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the lead where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLeadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByUUID_G(String uuid, long groupId)
		throws NoSuchLeadException;

	/**
	 * Returns the lead where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching lead, or <code>null</code> if a matching lead could not be found
	 */
	@Deprecated
	public Lead fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the lead where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the lead where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the lead that was removed
	 */
	public Lead removeByUUID_G(String uuid, long groupId)
		throws NoSuchLeadException;

	/**
	 * Returns the number of leads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching leads
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the leads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching leads
	 */
	public java.util.List<Lead> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the leads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of matching leads
	 */
	public java.util.List<Lead> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the leads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leads
	 */
	@Deprecated
	public java.util.List<Lead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the leads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leads
	 */
	public java.util.List<Lead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the first lead in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the first lead in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByUuid_C_First(
		String uuid, long companyId, OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the last lead in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the last lead in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByUuid_C_Last(
		String uuid, long companyId, OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the leads before and after the current lead in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead[] findByUuid_C_PrevAndNext(
			long leadId, String uuid, long companyId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Removes all the leads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of leads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching leads
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the leads where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching leads
	 */
	public java.util.List<Lead> findByGroupId(long groupId);

	/**
	 * Returns a range of all the leads where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of matching leads
	 */
	public java.util.List<Lead> findByGroupId(long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the leads where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByGroupId(long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leads
	 */
	@Deprecated
	public java.util.List<Lead> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the leads where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leads
	 */
	public java.util.List<Lead> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the first lead in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByGroupId_First(
			long groupId, OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the first lead in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByGroupId_First(
		long groupId, OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the last lead in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByGroupId_Last(
			long groupId, OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the last lead in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByGroupId_Last(
		long groupId, OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the leads before and after the current lead in the ordered set where groupId = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead[] findByGroupId_PrevAndNext(
			long leadId, long groupId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns all the leads that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching leads that the user has permission to view
	 */
	public java.util.List<Lead> filterFindByGroupId(long groupId);

	/**
	 * Returns a range of all the leads that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of matching leads that the user has permission to view
	 */
	public java.util.List<Lead> filterFindByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the leads that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leads that the user has permission to view
	 */
	public java.util.List<Lead> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the leads before and after the current lead in the ordered set of leads that the user has permission to view where groupId = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead[] filterFindByGroupId_PrevAndNext(
			long leadId, long groupId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Removes all the leads where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of leads where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching leads
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of leads that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching leads that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the leads where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching leads
	 */
	public java.util.List<Lead> findByStatus(int status);

	/**
	 * Returns a range of all the leads where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of matching leads
	 */
	public java.util.List<Lead> findByStatus(int status, int start, int end);

	/**
	 * Returns an ordered range of all the leads where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByStatus(int, int, int, OrderByComparator)}
	 * @param status the status
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leads
	 */
	@Deprecated
	public java.util.List<Lead> findByStatus(
		int status, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the leads where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leads
	 */
	public java.util.List<Lead> findByStatus(
		int status, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the first lead in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByStatus_First(
			int status, OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the first lead in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByStatus_First(
		int status, OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the last lead in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByStatus_Last(
			int status, OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the last lead in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByStatus_Last(
		int status, OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the leads before and after the current lead in the ordered set where status = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead[] findByStatus_PrevAndNext(
			long leadId, int status, OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Removes all the leads where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeByStatus(int status);

	/**
	 * Returns the number of leads where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching leads
	 */
	public int countByStatus(int status);

	/**
	 * Returns all the leads where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the matching leads
	 */
	public java.util.List<Lead> findByG_S(int status, long groupId);

	/**
	 * Returns a range of all the leads where status = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of matching leads
	 */
	public java.util.List<Lead> findByG_S(
		int status, long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the leads where status = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByG_S(int,long, int, int, OrderByComparator)}
	 * @param status the status
	 * @param groupId the group ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leads
	 */
	@Deprecated
	public java.util.List<Lead> findByG_S(
		int status, long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the leads where status = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leads
	 */
	public java.util.List<Lead> findByG_S(
		int status, long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the first lead in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByG_S_First(
			int status, long groupId, OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the first lead in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByG_S_First(
		int status, long groupId, OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the last lead in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByG_S_Last(
			int status, long groupId, OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the last lead in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByG_S_Last(
		int status, long groupId, OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the leads before and after the current lead in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead[] findByG_S_PrevAndNext(
			long leadId, int status, long groupId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns all the leads that the user has permission to view where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the matching leads that the user has permission to view
	 */
	public java.util.List<Lead> filterFindByG_S(int status, long groupId);

	/**
	 * Returns a range of all the leads that the user has permission to view where status = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of matching leads that the user has permission to view
	 */
	public java.util.List<Lead> filterFindByG_S(
		int status, long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the leads that the user has permissions to view where status = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leads that the user has permission to view
	 */
	public java.util.List<Lead> filterFindByG_S(
		int status, long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the leads before and after the current lead in the ordered set of leads that the user has permission to view where status = &#63; and groupId = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead[] filterFindByG_S_PrevAndNext(
			long leadId, int status, long groupId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Removes all the leads where status = &#63; and groupId = &#63; from the database.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 */
	public void removeByG_S(int status, long groupId);

	/**
	 * Returns the number of leads where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the number of matching leads
	 */
	public int countByG_S(int status, long groupId);

	/**
	 * Returns the number of leads that the user has permission to view where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the number of matching leads that the user has permission to view
	 */
	public int filterCountByG_S(int status, long groupId);

	/**
	 * Returns all the leads where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the matching leads
	 */
	public java.util.List<Lead> findByG_C(long groupId, long campaignId);

	/**
	 * Returns a range of all the leads where groupId = &#63; and campaignId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of matching leads
	 */
	public java.util.List<Lead> findByG_C(
		long groupId, long campaignId, int start, int end);

	/**
	 * Returns an ordered range of all the leads where groupId = &#63; and campaignId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByG_C(long,long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leads
	 */
	@Deprecated
	public java.util.List<Lead> findByG_C(
		long groupId, long campaignId, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the leads where groupId = &#63; and campaignId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leads
	 */
	public java.util.List<Lead> findByG_C(
		long groupId, long campaignId, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the first lead in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByG_C_First(
			long groupId, long campaignId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the first lead in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByG_C_First(
		long groupId, long campaignId,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the last lead in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public Lead findByG_C_Last(
			long groupId, long campaignId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns the last lead in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public Lead fetchByG_C_Last(
		long groupId, long campaignId,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the leads before and after the current lead in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead[] findByG_C_PrevAndNext(
			long leadId, long groupId, long campaignId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Returns all the leads that the user has permission to view where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the matching leads that the user has permission to view
	 */
	public java.util.List<Lead> filterFindByG_C(long groupId, long campaignId);

	/**
	 * Returns a range of all the leads that the user has permission to view where groupId = &#63; and campaignId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of matching leads that the user has permission to view
	 */
	public java.util.List<Lead> filterFindByG_C(
		long groupId, long campaignId, int start, int end);

	/**
	 * Returns an ordered range of all the leads that the user has permissions to view where groupId = &#63; and campaignId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leads that the user has permission to view
	 */
	public java.util.List<Lead> filterFindByG_C(
		long groupId, long campaignId, int start, int end,
		OrderByComparator<Lead> orderByComparator);

	/**
	 * Returns the leads before and after the current lead in the ordered set of leads that the user has permission to view where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead[] filterFindByG_C_PrevAndNext(
			long leadId, long groupId, long campaignId,
			OrderByComparator<Lead> orderByComparator)
		throws NoSuchLeadException;

	/**
	 * Removes all the leads where groupId = &#63; and campaignId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 */
	public void removeByG_C(long groupId, long campaignId);

	/**
	 * Returns the number of leads where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the number of matching leads
	 */
	public int countByG_C(long groupId, long campaignId);

	/**
	 * Returns the number of leads that the user has permission to view where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the number of matching leads that the user has permission to view
	 */
	public int filterCountByG_C(long groupId, long campaignId);

	/**
	 * Caches the lead in the entity cache if it is enabled.
	 *
	 * @param lead the lead
	 */
	public void cacheResult(Lead lead);

	/**
	 * Caches the leads in the entity cache if it is enabled.
	 *
	 * @param leads the leads
	 */
	public void cacheResult(java.util.List<Lead> leads);

	/**
	 * Creates a new lead with the primary key. Does not add the lead to the database.
	 *
	 * @param leadId the primary key for the new lead
	 * @return the new lead
	 */
	public Lead create(long leadId);

	/**
	 * Removes the lead with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead that was removed
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead remove(long leadId) throws NoSuchLeadException;

	public Lead updateImpl(Lead lead);

	/**
	 * Returns the lead with the primary key or throws a <code>NoSuchLeadException</code> if it could not be found.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public Lead findByPrimaryKey(long leadId) throws NoSuchLeadException;

	/**
	 * Returns the lead with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead, or <code>null</code> if a lead with the primary key could not be found
	 */
	public Lead fetchByPrimaryKey(long leadId);

	/**
	 * Returns all the leads.
	 *
	 * @return the leads
	 */
	public java.util.List<Lead> findAll();

	/**
	 * Returns a range of all the leads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @return the range of leads
	 */
	public java.util.List<Lead> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the leads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of leads
	 */
	@Deprecated
	public java.util.List<Lead> findAll(
		int start, int end, OrderByComparator<Lead> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the leads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of leads
	 * @param end the upper bound of the range of leads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of leads
	 */
	public java.util.List<Lead> findAll(
		int start, int end, OrderByComparator<Lead> orderByComparator);

	/**
	 * Removes all the leads from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of leads.
	 *
	 * @return the number of leads
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}
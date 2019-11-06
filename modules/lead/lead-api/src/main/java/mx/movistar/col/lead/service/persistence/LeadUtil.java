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

import mx.movistar.col.lead.model.Lead;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the lead service. This utility wraps <code>mx.movistar.col.lead.service.persistence.impl.LeadPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeadPersistence
 * @generated
 */
@ProviderType
public class LeadUtil {

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
	public static void clearCache(Lead lead) {
		getPersistence().clearCache(lead);
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
	public static Map<Serializable, Lead> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Lead> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Lead> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Lead> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Lead update(Lead lead) {
		return getPersistence().update(lead);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Lead update(Lead lead, ServiceContext serviceContext) {
		return getPersistence().update(lead, serviceContext);
	}

	/**
	 * Returns all the leads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching leads
	 */
	public static List<Lead> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Lead> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Lead> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

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
	public static List<Lead> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByUuid_First(
			String uuid, OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByUuid_First(
		String uuid, OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByUuid_Last(
			String uuid, OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByUuid_Last(
		String uuid, OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the leads before and after the current lead in the ordered set where uuid = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public static Lead[] findByUuid_PrevAndNext(
			long leadId, String uuid, OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByUuid_PrevAndNext(
			leadId, uuid, orderByComparator);
	}

	/**
	 * Removes all the leads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of leads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching leads
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the lead where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLeadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByUUID_G(String uuid, long groupId)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

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
	public static Lead fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Returns the lead where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Removes the lead where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the lead that was removed
	 */
	public static Lead removeByUUID_G(String uuid, long groupId)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of leads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching leads
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the leads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching leads
	 */
	public static List<Lead> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Lead> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Lead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

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
	public static List<Lead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static Lead[] findByUuid_C_PrevAndNext(
			long leadId, String uuid, long companyId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByUuid_C_PrevAndNext(
			leadId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the leads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of leads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching leads
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the leads where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching leads
	 */
	public static List<Lead> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<Lead> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<Lead> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

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
	public static List<Lead> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByGroupId_First(
			long groupId, OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByGroupId_First(
		long groupId, OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByGroupId_Last(
			long groupId, OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByGroupId_Last(
		long groupId, OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the leads before and after the current lead in the ordered set where groupId = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public static Lead[] findByGroupId_PrevAndNext(
			long leadId, long groupId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByGroupId_PrevAndNext(
			leadId, groupId, orderByComparator);
	}

	/**
	 * Returns all the leads that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching leads that the user has permission to view
	 */
	public static List<Lead> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

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
	public static List<Lead> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

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
	public static List<Lead> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the leads before and after the current lead in the ordered set of leads that the user has permission to view where groupId = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public static Lead[] filterFindByGroupId_PrevAndNext(
			long leadId, long groupId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			leadId, groupId, orderByComparator);
	}

	/**
	 * Removes all the leads where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of leads where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching leads
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of leads that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching leads that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the leads where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching leads
	 */
	public static List<Lead> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

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
	public static List<Lead> findByStatus(int status, int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

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
	public static List<Lead> findByStatus(
		int status, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

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
	public static List<Lead> findByStatus(
		int status, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByStatus_First(
			int status, OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByStatus_First(
		int status, OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByStatus_Last(
			int status, OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByStatus_Last(
		int status, OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the leads before and after the current lead in the ordered set where status = &#63;.
	 *
	 * @param leadId the primary key of the current lead
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public static Lead[] findByStatus_PrevAndNext(
			long leadId, int status, OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByStatus_PrevAndNext(
			leadId, status, orderByComparator);
	}

	/**
	 * Removes all the leads where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	 * Returns the number of leads where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching leads
	 */
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	 * Returns all the leads where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the matching leads
	 */
	public static List<Lead> findByG_S(int status, long groupId) {
		return getPersistence().findByG_S(status, groupId);
	}

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
	public static List<Lead> findByG_S(
		int status, long groupId, int start, int end) {

		return getPersistence().findByG_S(status, groupId, start, end);
	}

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
	public static List<Lead> findByG_S(
		int status, long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_S(
			status, groupId, start, end, orderByComparator, useFinderCache);
	}

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
	public static List<Lead> findByG_S(
		int status, long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().findByG_S(
			status, groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByG_S_First(
			int status, long groupId, OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByG_S_First(
			status, groupId, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByG_S_First(
		int status, long groupId, OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			status, groupId, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByG_S_Last(
			int status, long groupId, OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByG_S_Last(
			status, groupId, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByG_S_Last(
		int status, long groupId, OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			status, groupId, orderByComparator);
	}

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
	public static Lead[] findByG_S_PrevAndNext(
			long leadId, int status, long groupId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByG_S_PrevAndNext(
			leadId, status, groupId, orderByComparator);
	}

	/**
	 * Returns all the leads that the user has permission to view where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the matching leads that the user has permission to view
	 */
	public static List<Lead> filterFindByG_S(int status, long groupId) {
		return getPersistence().filterFindByG_S(status, groupId);
	}

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
	public static List<Lead> filterFindByG_S(
		int status, long groupId, int start, int end) {

		return getPersistence().filterFindByG_S(status, groupId, start, end);
	}

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
	public static List<Lead> filterFindByG_S(
		int status, long groupId, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().filterFindByG_S(
			status, groupId, start, end, orderByComparator);
	}

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
	public static Lead[] filterFindByG_S_PrevAndNext(
			long leadId, int status, long groupId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().filterFindByG_S_PrevAndNext(
			leadId, status, groupId, orderByComparator);
	}

	/**
	 * Removes all the leads where status = &#63; and groupId = &#63; from the database.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 */
	public static void removeByG_S(int status, long groupId) {
		getPersistence().removeByG_S(status, groupId);
	}

	/**
	 * Returns the number of leads where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the number of matching leads
	 */
	public static int countByG_S(int status, long groupId) {
		return getPersistence().countByG_S(status, groupId);
	}

	/**
	 * Returns the number of leads that the user has permission to view where status = &#63; and groupId = &#63;.
	 *
	 * @param status the status
	 * @param groupId the group ID
	 * @return the number of matching leads that the user has permission to view
	 */
	public static int filterCountByG_S(int status, long groupId) {
		return getPersistence().filterCountByG_S(status, groupId);
	}

	/**
	 * Returns all the leads where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the matching leads
	 */
	public static List<Lead> findByG_C(long groupId, long campaignId) {
		return getPersistence().findByG_C(groupId, campaignId);
	}

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
	public static List<Lead> findByG_C(
		long groupId, long campaignId, int start, int end) {

		return getPersistence().findByG_C(groupId, campaignId, start, end);
	}

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
	public static List<Lead> findByG_C(
		long groupId, long campaignId, int start, int end,
		OrderByComparator<Lead> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_C(
			groupId, campaignId, start, end, orderByComparator, useFinderCache);
	}

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
	public static List<Lead> findByG_C(
		long groupId, long campaignId, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().findByG_C(
			groupId, campaignId, start, end, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByG_C_First(
			long groupId, long campaignId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByG_C_First(
			groupId, campaignId, orderByComparator);
	}

	/**
	 * Returns the first lead in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByG_C_First(
		long groupId, long campaignId,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByG_C_First(
			groupId, campaignId, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead
	 * @throws NoSuchLeadException if a matching lead could not be found
	 */
	public static Lead findByG_C_Last(
			long groupId, long campaignId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByG_C_Last(
			groupId, campaignId, orderByComparator);
	}

	/**
	 * Returns the last lead in the ordered set where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead, or <code>null</code> if a matching lead could not be found
	 */
	public static Lead fetchByG_C_Last(
		long groupId, long campaignId,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().fetchByG_C_Last(
			groupId, campaignId, orderByComparator);
	}

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
	public static Lead[] findByG_C_PrevAndNext(
			long leadId, long groupId, long campaignId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByG_C_PrevAndNext(
			leadId, groupId, campaignId, orderByComparator);
	}

	/**
	 * Returns all the leads that the user has permission to view where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the matching leads that the user has permission to view
	 */
	public static List<Lead> filterFindByG_C(long groupId, long campaignId) {
		return getPersistence().filterFindByG_C(groupId, campaignId);
	}

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
	public static List<Lead> filterFindByG_C(
		long groupId, long campaignId, int start, int end) {

		return getPersistence().filterFindByG_C(
			groupId, campaignId, start, end);
	}

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
	public static List<Lead> filterFindByG_C(
		long groupId, long campaignId, int start, int end,
		OrderByComparator<Lead> orderByComparator) {

		return getPersistence().filterFindByG_C(
			groupId, campaignId, start, end, orderByComparator);
	}

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
	public static Lead[] filterFindByG_C_PrevAndNext(
			long leadId, long groupId, long campaignId,
			OrderByComparator<Lead> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().filterFindByG_C_PrevAndNext(
			leadId, groupId, campaignId, orderByComparator);
	}

	/**
	 * Removes all the leads where groupId = &#63; and campaignId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 */
	public static void removeByG_C(long groupId, long campaignId) {
		getPersistence().removeByG_C(groupId, campaignId);
	}

	/**
	 * Returns the number of leads where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the number of matching leads
	 */
	public static int countByG_C(long groupId, long campaignId) {
		return getPersistence().countByG_C(groupId, campaignId);
	}

	/**
	 * Returns the number of leads that the user has permission to view where groupId = &#63; and campaignId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param campaignId the campaign ID
	 * @return the number of matching leads that the user has permission to view
	 */
	public static int filterCountByG_C(long groupId, long campaignId) {
		return getPersistence().filterCountByG_C(groupId, campaignId);
	}

	/**
	 * Caches the lead in the entity cache if it is enabled.
	 *
	 * @param lead the lead
	 */
	public static void cacheResult(Lead lead) {
		getPersistence().cacheResult(lead);
	}

	/**
	 * Caches the leads in the entity cache if it is enabled.
	 *
	 * @param leads the leads
	 */
	public static void cacheResult(List<Lead> leads) {
		getPersistence().cacheResult(leads);
	}

	/**
	 * Creates a new lead with the primary key. Does not add the lead to the database.
	 *
	 * @param leadId the primary key for the new lead
	 * @return the new lead
	 */
	public static Lead create(long leadId) {
		return getPersistence().create(leadId);
	}

	/**
	 * Removes the lead with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead that was removed
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public static Lead remove(long leadId)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().remove(leadId);
	}

	public static Lead updateImpl(Lead lead) {
		return getPersistence().updateImpl(lead);
	}

	/**
	 * Returns the lead with the primary key or throws a <code>NoSuchLeadException</code> if it could not be found.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead
	 * @throws NoSuchLeadException if a lead with the primary key could not be found
	 */
	public static Lead findByPrimaryKey(long leadId)
		throws mx.movistar.col.lead.exception.NoSuchLeadException {

		return getPersistence().findByPrimaryKey(leadId);
	}

	/**
	 * Returns the lead with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leadId the primary key of the lead
	 * @return the lead, or <code>null</code> if a lead with the primary key could not be found
	 */
	public static Lead fetchByPrimaryKey(long leadId) {
		return getPersistence().fetchByPrimaryKey(leadId);
	}

	/**
	 * Returns all the leads.
	 *
	 * @return the leads
	 */
	public static List<Lead> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Lead> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Lead> findAll(
		int start, int end, OrderByComparator<Lead> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

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
	public static List<Lead> findAll(
		int start, int end, OrderByComparator<Lead> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the leads from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of leads.
	 *
	 * @return the number of leads
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static LeadPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LeadPersistence, LeadPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LeadPersistence.class);

		ServiceTracker<LeadPersistence, LeadPersistence> serviceTracker =
			new ServiceTracker<LeadPersistence, LeadPersistence>(
				bundle.getBundleContext(), LeadPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
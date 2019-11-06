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

import mx.movistar.col.lead.model.LeadScoring;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the lead scoring service. This utility wraps <code>mx.movistar.col.lead.service.persistence.impl.LeadScoringPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeadScoringPersistence
 * @generated
 */
@ProviderType
public class LeadScoringUtil {

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
	public static void clearCache(LeadScoring leadScoring) {
		getPersistence().clearCache(leadScoring);
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
	public static Map<Serializable, LeadScoring> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LeadScoring> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LeadScoring> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LeadScoring> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LeadScoring> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LeadScoring update(LeadScoring leadScoring) {
		return getPersistence().update(leadScoring);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LeadScoring update(
		LeadScoring leadScoring, ServiceContext serviceContext) {

		return getPersistence().update(leadScoring, serviceContext);
	}

	/**
	 * Returns all the lead scorings where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching lead scorings
	 */
	public static List<LeadScoring> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the lead scorings where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadScoringModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lead scorings
	 * @param end the upper bound of the range of lead scorings (not inclusive)
	 * @return the range of matching lead scorings
	 */
	public static List<LeadScoring> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the lead scorings where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadScoringModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByGroupId(long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lead scorings
	 * @param end the upper bound of the range of lead scorings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching lead scorings
	 */
	@Deprecated
	public static List<LeadScoring> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<LeadScoring> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the lead scorings where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadScoringModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lead scorings
	 * @param end the upper bound of the range of lead scorings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lead scorings
	 */
	public static List<LeadScoring> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<LeadScoring> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the first lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead scoring
	 * @throws NoSuchLeadScoringException if a matching lead scoring could not be found
	 */
	public static LeadScoring findByGroupId_First(
			long groupId, OrderByComparator<LeadScoring> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadScoringException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead scoring, or <code>null</code> if a matching lead scoring could not be found
	 */
	public static LeadScoring fetchByGroupId_First(
		long groupId, OrderByComparator<LeadScoring> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead scoring
	 * @throws NoSuchLeadScoringException if a matching lead scoring could not be found
	 */
	public static LeadScoring findByGroupId_Last(
			long groupId, OrderByComparator<LeadScoring> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadScoringException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead scoring, or <code>null</code> if a matching lead scoring could not be found
	 */
	public static LeadScoring fetchByGroupId_Last(
		long groupId, OrderByComparator<LeadScoring> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the lead scorings before and after the current lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param leadScoringId the primary key of the current lead scoring
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead scoring
	 * @throws NoSuchLeadScoringException if a lead scoring with the primary key could not be found
	 */
	public static LeadScoring[] findByGroupId_PrevAndNext(
			long leadScoringId, long groupId,
			OrderByComparator<LeadScoring> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchLeadScoringException {

		return getPersistence().findByGroupId_PrevAndNext(
			leadScoringId, groupId, orderByComparator);
	}

	/**
	 * Removes all the lead scorings where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of lead scorings where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching lead scorings
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Caches the lead scoring in the entity cache if it is enabled.
	 *
	 * @param leadScoring the lead scoring
	 */
	public static void cacheResult(LeadScoring leadScoring) {
		getPersistence().cacheResult(leadScoring);
	}

	/**
	 * Caches the lead scorings in the entity cache if it is enabled.
	 *
	 * @param leadScorings the lead scorings
	 */
	public static void cacheResult(List<LeadScoring> leadScorings) {
		getPersistence().cacheResult(leadScorings);
	}

	/**
	 * Creates a new lead scoring with the primary key. Does not add the lead scoring to the database.
	 *
	 * @param leadScoringId the primary key for the new lead scoring
	 * @return the new lead scoring
	 */
	public static LeadScoring create(long leadScoringId) {
		return getPersistence().create(leadScoringId);
	}

	/**
	 * Removes the lead scoring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring that was removed
	 * @throws NoSuchLeadScoringException if a lead scoring with the primary key could not be found
	 */
	public static LeadScoring remove(long leadScoringId)
		throws mx.movistar.col.lead.exception.NoSuchLeadScoringException {

		return getPersistence().remove(leadScoringId);
	}

	public static LeadScoring updateImpl(LeadScoring leadScoring) {
		return getPersistence().updateImpl(leadScoring);
	}

	/**
	 * Returns the lead scoring with the primary key or throws a <code>NoSuchLeadScoringException</code> if it could not be found.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring
	 * @throws NoSuchLeadScoringException if a lead scoring with the primary key could not be found
	 */
	public static LeadScoring findByPrimaryKey(long leadScoringId)
		throws mx.movistar.col.lead.exception.NoSuchLeadScoringException {

		return getPersistence().findByPrimaryKey(leadScoringId);
	}

	/**
	 * Returns the lead scoring with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring, or <code>null</code> if a lead scoring with the primary key could not be found
	 */
	public static LeadScoring fetchByPrimaryKey(long leadScoringId) {
		return getPersistence().fetchByPrimaryKey(leadScoringId);
	}

	/**
	 * Returns all the lead scorings.
	 *
	 * @return the lead scorings
	 */
	public static List<LeadScoring> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the lead scorings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadScoringModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lead scorings
	 * @param end the upper bound of the range of lead scorings (not inclusive)
	 * @return the range of lead scorings
	 */
	public static List<LeadScoring> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the lead scorings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadScoringModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of lead scorings
	 * @param end the upper bound of the range of lead scorings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of lead scorings
	 */
	@Deprecated
	public static List<LeadScoring> findAll(
		int start, int end, OrderByComparator<LeadScoring> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the lead scorings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LeadScoringModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lead scorings
	 * @param end the upper bound of the range of lead scorings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lead scorings
	 */
	public static List<LeadScoring> findAll(
		int start, int end, OrderByComparator<LeadScoring> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the lead scorings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of lead scorings.
	 *
	 * @return the number of lead scorings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LeadScoringPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<LeadScoringPersistence, LeadScoringPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LeadScoringPersistence.class);

		ServiceTracker<LeadScoringPersistence, LeadScoringPersistence>
			serviceTracker =
				new ServiceTracker
					<LeadScoringPersistence, LeadScoringPersistence>(
						bundle.getBundleContext(), LeadScoringPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
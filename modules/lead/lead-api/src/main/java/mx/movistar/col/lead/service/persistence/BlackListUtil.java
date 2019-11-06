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

import mx.movistar.col.lead.model.BlackList;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the black list service. This utility wraps <code>mx.movistar.col.lead.service.persistence.impl.BlackListPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BlackListPersistence
 * @generated
 */
@ProviderType
public class BlackListUtil {

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
	public static void clearCache(BlackList blackList) {
		getPersistence().clearCache(blackList);
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
	public static Map<Serializable, BlackList> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BlackList> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BlackList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BlackList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BlackList> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BlackList update(BlackList blackList) {
		return getPersistence().update(blackList);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BlackList update(
		BlackList blackList, ServiceContext serviceContext) {

		return getPersistence().update(blackList, serviceContext);
	}

	/**
	 * Returns all the black lists where numero = &#63;.
	 *
	 * @param numero the numero
	 * @return the matching black lists
	 */
	public static List<BlackList> findBynumero(String numero) {
		return getPersistence().findBynumero(numero);
	}

	/**
	 * Returns a range of all the black lists where numero = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>BlackListModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param numero the numero
	 * @param start the lower bound of the range of black lists
	 * @param end the upper bound of the range of black lists (not inclusive)
	 * @return the range of matching black lists
	 */
	public static List<BlackList> findBynumero(
		String numero, int start, int end) {

		return getPersistence().findBynumero(numero, start, end);
	}

	/**
	 * Returns an ordered range of all the black lists where numero = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>BlackListModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findBynumero(String, int, int, OrderByComparator)}
	 * @param numero the numero
	 * @param start the lower bound of the range of black lists
	 * @param end the upper bound of the range of black lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching black lists
	 */
	@Deprecated
	public static List<BlackList> findBynumero(
		String numero, int start, int end,
		OrderByComparator<BlackList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBynumero(
			numero, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the black lists where numero = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>BlackListModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param numero the numero
	 * @param start the lower bound of the range of black lists
	 * @param end the upper bound of the range of black lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching black lists
	 */
	public static List<BlackList> findBynumero(
		String numero, int start, int end,
		OrderByComparator<BlackList> orderByComparator) {

		return getPersistence().findBynumero(
			numero, start, end, orderByComparator);
	}

	/**
	 * Returns the first black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching black list
	 * @throws NoSuchBlackListException if a matching black list could not be found
	 */
	public static BlackList findBynumero_First(
			String numero, OrderByComparator<BlackList> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchBlackListException {

		return getPersistence().findBynumero_First(numero, orderByComparator);
	}

	/**
	 * Returns the first black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching black list, or <code>null</code> if a matching black list could not be found
	 */
	public static BlackList fetchBynumero_First(
		String numero, OrderByComparator<BlackList> orderByComparator) {

		return getPersistence().fetchBynumero_First(numero, orderByComparator);
	}

	/**
	 * Returns the last black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching black list
	 * @throws NoSuchBlackListException if a matching black list could not be found
	 */
	public static BlackList findBynumero_Last(
			String numero, OrderByComparator<BlackList> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchBlackListException {

		return getPersistence().findBynumero_Last(numero, orderByComparator);
	}

	/**
	 * Returns the last black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching black list, or <code>null</code> if a matching black list could not be found
	 */
	public static BlackList fetchBynumero_Last(
		String numero, OrderByComparator<BlackList> orderByComparator) {

		return getPersistence().fetchBynumero_Last(numero, orderByComparator);
	}

	/**
	 * Returns the black lists before and after the current black list in the ordered set where numero = &#63;.
	 *
	 * @param blackListId the primary key of the current black list
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next black list
	 * @throws NoSuchBlackListException if a black list with the primary key could not be found
	 */
	public static BlackList[] findBynumero_PrevAndNext(
			long blackListId, String numero,
			OrderByComparator<BlackList> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchBlackListException {

		return getPersistence().findBynumero_PrevAndNext(
			blackListId, numero, orderByComparator);
	}

	/**
	 * Removes all the black lists where numero = &#63; from the database.
	 *
	 * @param numero the numero
	 */
	public static void removeBynumero(String numero) {
		getPersistence().removeBynumero(numero);
	}

	/**
	 * Returns the number of black lists where numero = &#63;.
	 *
	 * @param numero the numero
	 * @return the number of matching black lists
	 */
	public static int countBynumero(String numero) {
		return getPersistence().countBynumero(numero);
	}

	/**
	 * Caches the black list in the entity cache if it is enabled.
	 *
	 * @param blackList the black list
	 */
	public static void cacheResult(BlackList blackList) {
		getPersistence().cacheResult(blackList);
	}

	/**
	 * Caches the black lists in the entity cache if it is enabled.
	 *
	 * @param blackLists the black lists
	 */
	public static void cacheResult(List<BlackList> blackLists) {
		getPersistence().cacheResult(blackLists);
	}

	/**
	 * Creates a new black list with the primary key. Does not add the black list to the database.
	 *
	 * @param blackListId the primary key for the new black list
	 * @return the new black list
	 */
	public static BlackList create(long blackListId) {
		return getPersistence().create(blackListId);
	}

	/**
	 * Removes the black list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list that was removed
	 * @throws NoSuchBlackListException if a black list with the primary key could not be found
	 */
	public static BlackList remove(long blackListId)
		throws mx.movistar.col.lead.exception.NoSuchBlackListException {

		return getPersistence().remove(blackListId);
	}

	public static BlackList updateImpl(BlackList blackList) {
		return getPersistence().updateImpl(blackList);
	}

	/**
	 * Returns the black list with the primary key or throws a <code>NoSuchBlackListException</code> if it could not be found.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list
	 * @throws NoSuchBlackListException if a black list with the primary key could not be found
	 */
	public static BlackList findByPrimaryKey(long blackListId)
		throws mx.movistar.col.lead.exception.NoSuchBlackListException {

		return getPersistence().findByPrimaryKey(blackListId);
	}

	/**
	 * Returns the black list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list, or <code>null</code> if a black list with the primary key could not be found
	 */
	public static BlackList fetchByPrimaryKey(long blackListId) {
		return getPersistence().fetchByPrimaryKey(blackListId);
	}

	/**
	 * Returns all the black lists.
	 *
	 * @return the black lists
	 */
	public static List<BlackList> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the black lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>BlackListModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of black lists
	 * @param end the upper bound of the range of black lists (not inclusive)
	 * @return the range of black lists
	 */
	public static List<BlackList> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the black lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>BlackListModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of black lists
	 * @param end the upper bound of the range of black lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of black lists
	 */
	@Deprecated
	public static List<BlackList> findAll(
		int start, int end, OrderByComparator<BlackList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the black lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>BlackListModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of black lists
	 * @param end the upper bound of the range of black lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of black lists
	 */
	public static List<BlackList> findAll(
		int start, int end, OrderByComparator<BlackList> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the black lists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of black lists.
	 *
	 * @return the number of black lists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BlackListPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BlackListPersistence, BlackListPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(BlackListPersistence.class);

		ServiceTracker<BlackListPersistence, BlackListPersistence>
			serviceTracker =
				new ServiceTracker<BlackListPersistence, BlackListPersistence>(
					bundle.getBundleContext(), BlackListPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
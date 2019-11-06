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

import mx.movistar.col.lead.model.Nir;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the nir service. This utility wraps <code>mx.movistar.col.lead.service.persistence.impl.NirPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NirPersistence
 * @generated
 */
@ProviderType
public class NirUtil {

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
	public static void clearCache(Nir nir) {
		getPersistence().clearCache(nir);
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
	public static Map<Serializable, Nir> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Nir> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Nir> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Nir> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Nir> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Nir update(Nir nir) {
		return getPersistence().update(nir);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Nir update(Nir nir, ServiceContext serviceContext) {
		return getPersistence().update(nir, serviceContext);
	}

	/**
	 * Returns all the nirs where lada = &#63;.
	 *
	 * @param lada the lada
	 * @return the matching nirs
	 */
	public static List<Nir> findBylada(String lada) {
		return getPersistence().findBylada(lada);
	}

	/**
	 * Returns a range of all the nirs where lada = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lada the lada
	 * @param start the lower bound of the range of nirs
	 * @param end the upper bound of the range of nirs (not inclusive)
	 * @return the range of matching nirs
	 */
	public static List<Nir> findBylada(String lada, int start, int end) {
		return getPersistence().findBylada(lada, start, end);
	}

	/**
	 * Returns an ordered range of all the nirs where lada = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findBylada(String, int, int, OrderByComparator)}
	 * @param lada the lada
	 * @param start the lower bound of the range of nirs
	 * @param end the upper bound of the range of nirs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching nirs
	 */
	@Deprecated
	public static List<Nir> findBylada(
		String lada, int start, int end,
		OrderByComparator<Nir> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBylada(
			lada, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the nirs where lada = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lada the lada
	 * @param start the lower bound of the range of nirs
	 * @param end the upper bound of the range of nirs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nirs
	 */
	public static List<Nir> findBylada(
		String lada, int start, int end,
		OrderByComparator<Nir> orderByComparator) {

		return getPersistence().findBylada(lada, start, end, orderByComparator);
	}

	/**
	 * Returns the first nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	public static Nir findBylada_First(
			String lada, OrderByComparator<Nir> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchNirException {

		return getPersistence().findBylada_First(lada, orderByComparator);
	}

	/**
	 * Returns the first nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir, or <code>null</code> if a matching nir could not be found
	 */
	public static Nir fetchBylada_First(
		String lada, OrderByComparator<Nir> orderByComparator) {

		return getPersistence().fetchBylada_First(lada, orderByComparator);
	}

	/**
	 * Returns the last nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	public static Nir findBylada_Last(
			String lada, OrderByComparator<Nir> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchNirException {

		return getPersistence().findBylada_Last(lada, orderByComparator);
	}

	/**
	 * Returns the last nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir, or <code>null</code> if a matching nir could not be found
	 */
	public static Nir fetchBylada_Last(
		String lada, OrderByComparator<Nir> orderByComparator) {

		return getPersistence().fetchBylada_Last(lada, orderByComparator);
	}

	/**
	 * Returns the nirs before and after the current nir in the ordered set where lada = &#63;.
	 *
	 * @param nirPK the primary key of the current nir
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nir
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	public static Nir[] findBylada_PrevAndNext(
			mx.movistar.col.lead.service.persistence.NirPK nirPK, String lada,
			OrderByComparator<Nir> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchNirException {

		return getPersistence().findBylada_PrevAndNext(
			nirPK, lada, orderByComparator);
	}

	/**
	 * Removes all the nirs where lada = &#63; from the database.
	 *
	 * @param lada the lada
	 */
	public static void removeBylada(String lada) {
		getPersistence().removeBylada(lada);
	}

	/**
	 * Returns the number of nirs where lada = &#63;.
	 *
	 * @param lada the lada
	 * @return the number of matching nirs
	 */
	public static int countBylada(String lada) {
		return getPersistence().countBylada(lada);
	}

	/**
	 * Returns all the nirs where serie = &#63;.
	 *
	 * @param serie the serie
	 * @return the matching nirs
	 */
	public static List<Nir> findByserie(String serie) {
		return getPersistence().findByserie(serie);
	}

	/**
	 * Returns a range of all the nirs where serie = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serie the serie
	 * @param start the lower bound of the range of nirs
	 * @param end the upper bound of the range of nirs (not inclusive)
	 * @return the range of matching nirs
	 */
	public static List<Nir> findByserie(String serie, int start, int end) {
		return getPersistence().findByserie(serie, start, end);
	}

	/**
	 * Returns an ordered range of all the nirs where serie = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByserie(String, int, int, OrderByComparator)}
	 * @param serie the serie
	 * @param start the lower bound of the range of nirs
	 * @param end the upper bound of the range of nirs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching nirs
	 */
	@Deprecated
	public static List<Nir> findByserie(
		String serie, int start, int end,
		OrderByComparator<Nir> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByserie(
			serie, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the nirs where serie = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serie the serie
	 * @param start the lower bound of the range of nirs
	 * @param end the upper bound of the range of nirs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nirs
	 */
	public static List<Nir> findByserie(
		String serie, int start, int end,
		OrderByComparator<Nir> orderByComparator) {

		return getPersistence().findByserie(
			serie, start, end, orderByComparator);
	}

	/**
	 * Returns the first nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	public static Nir findByserie_First(
			String serie, OrderByComparator<Nir> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchNirException {

		return getPersistence().findByserie_First(serie, orderByComparator);
	}

	/**
	 * Returns the first nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir, or <code>null</code> if a matching nir could not be found
	 */
	public static Nir fetchByserie_First(
		String serie, OrderByComparator<Nir> orderByComparator) {

		return getPersistence().fetchByserie_First(serie, orderByComparator);
	}

	/**
	 * Returns the last nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	public static Nir findByserie_Last(
			String serie, OrderByComparator<Nir> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchNirException {

		return getPersistence().findByserie_Last(serie, orderByComparator);
	}

	/**
	 * Returns the last nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir, or <code>null</code> if a matching nir could not be found
	 */
	public static Nir fetchByserie_Last(
		String serie, OrderByComparator<Nir> orderByComparator) {

		return getPersistence().fetchByserie_Last(serie, orderByComparator);
	}

	/**
	 * Returns the nirs before and after the current nir in the ordered set where serie = &#63;.
	 *
	 * @param nirPK the primary key of the current nir
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nir
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	public static Nir[] findByserie_PrevAndNext(
			mx.movistar.col.lead.service.persistence.NirPK nirPK, String serie,
			OrderByComparator<Nir> orderByComparator)
		throws mx.movistar.col.lead.exception.NoSuchNirException {

		return getPersistence().findByserie_PrevAndNext(
			nirPK, serie, orderByComparator);
	}

	/**
	 * Removes all the nirs where serie = &#63; from the database.
	 *
	 * @param serie the serie
	 */
	public static void removeByserie(String serie) {
		getPersistence().removeByserie(serie);
	}

	/**
	 * Returns the number of nirs where serie = &#63;.
	 *
	 * @param serie the serie
	 * @return the number of matching nirs
	 */
	public static int countByserie(String serie) {
		return getPersistence().countByserie(serie);
	}

	/**
	 * Caches the nir in the entity cache if it is enabled.
	 *
	 * @param nir the nir
	 */
	public static void cacheResult(Nir nir) {
		getPersistence().cacheResult(nir);
	}

	/**
	 * Caches the nirs in the entity cache if it is enabled.
	 *
	 * @param nirs the nirs
	 */
	public static void cacheResult(List<Nir> nirs) {
		getPersistence().cacheResult(nirs);
	}

	/**
	 * Creates a new nir with the primary key. Does not add the nir to the database.
	 *
	 * @param nirPK the primary key for the new nir
	 * @return the new nir
	 */
	public static Nir create(
		mx.movistar.col.lead.service.persistence.NirPK nirPK) {

		return getPersistence().create(nirPK);
	}

	/**
	 * Removes the nir with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir that was removed
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	public static Nir remove(
			mx.movistar.col.lead.service.persistence.NirPK nirPK)
		throws mx.movistar.col.lead.exception.NoSuchNirException {

		return getPersistence().remove(nirPK);
	}

	public static Nir updateImpl(Nir nir) {
		return getPersistence().updateImpl(nir);
	}

	/**
	 * Returns the nir with the primary key or throws a <code>NoSuchNirException</code> if it could not be found.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	public static Nir findByPrimaryKey(
			mx.movistar.col.lead.service.persistence.NirPK nirPK)
		throws mx.movistar.col.lead.exception.NoSuchNirException {

		return getPersistence().findByPrimaryKey(nirPK);
	}

	/**
	 * Returns the nir with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir, or <code>null</code> if a nir with the primary key could not be found
	 */
	public static Nir fetchByPrimaryKey(
		mx.movistar.col.lead.service.persistence.NirPK nirPK) {

		return getPersistence().fetchByPrimaryKey(nirPK);
	}

	/**
	 * Returns all the nirs.
	 *
	 * @return the nirs
	 */
	public static List<Nir> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the nirs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nirs
	 * @param end the upper bound of the range of nirs (not inclusive)
	 * @return the range of nirs
	 */
	public static List<Nir> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the nirs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of nirs
	 * @param end the upper bound of the range of nirs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of nirs
	 */
	@Deprecated
	public static List<Nir> findAll(
		int start, int end, OrderByComparator<Nir> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the nirs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nirs
	 * @param end the upper bound of the range of nirs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nirs
	 */
	public static List<Nir> findAll(
		int start, int end, OrderByComparator<Nir> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the nirs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of nirs.
	 *
	 * @return the number of nirs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static NirPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NirPersistence, NirPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(NirPersistence.class);

		ServiceTracker<NirPersistence, NirPersistence> serviceTracker =
			new ServiceTracker<NirPersistence, NirPersistence>(
				bundle.getBundleContext(), NirPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
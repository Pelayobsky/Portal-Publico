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

import mx.movistar.col.lead.exception.NoSuchNirException;
import mx.movistar.col.lead.model.Nir;

/**
 * The persistence interface for the nir service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NirUtil
 * @generated
 */
@ProviderType
public interface NirPersistence extends BasePersistence<Nir> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NirUtil} to access the nir persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Nir> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the nirs where lada = &#63;.
	 *
	 * @param lada the lada
	 * @return the matching nirs
	 */
	public java.util.List<Nir> findBylada(String lada);

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
	public java.util.List<Nir> findBylada(String lada, int start, int end);

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
	public java.util.List<Nir> findBylada(
		String lada, int start, int end,
		OrderByComparator<Nir> orderByComparator, boolean useFinderCache);

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
	public java.util.List<Nir> findBylada(
		String lada, int start, int end,
		OrderByComparator<Nir> orderByComparator);

	/**
	 * Returns the first nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	public Nir findBylada_First(
			String lada, OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException;

	/**
	 * Returns the first nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir, or <code>null</code> if a matching nir could not be found
	 */
	public Nir fetchBylada_First(
		String lada, OrderByComparator<Nir> orderByComparator);

	/**
	 * Returns the last nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	public Nir findBylada_Last(
			String lada, OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException;

	/**
	 * Returns the last nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir, or <code>null</code> if a matching nir could not be found
	 */
	public Nir fetchBylada_Last(
		String lada, OrderByComparator<Nir> orderByComparator);

	/**
	 * Returns the nirs before and after the current nir in the ordered set where lada = &#63;.
	 *
	 * @param nirPK the primary key of the current nir
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nir
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	public Nir[] findBylada_PrevAndNext(
			mx.movistar.col.lead.service.persistence.NirPK nirPK, String lada,
			OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException;

	/**
	 * Removes all the nirs where lada = &#63; from the database.
	 *
	 * @param lada the lada
	 */
	public void removeBylada(String lada);

	/**
	 * Returns the number of nirs where lada = &#63;.
	 *
	 * @param lada the lada
	 * @return the number of matching nirs
	 */
	public int countBylada(String lada);

	/**
	 * Returns all the nirs where serie = &#63;.
	 *
	 * @param serie the serie
	 * @return the matching nirs
	 */
	public java.util.List<Nir> findByserie(String serie);

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
	public java.util.List<Nir> findByserie(String serie, int start, int end);

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
	public java.util.List<Nir> findByserie(
		String serie, int start, int end,
		OrderByComparator<Nir> orderByComparator, boolean useFinderCache);

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
	public java.util.List<Nir> findByserie(
		String serie, int start, int end,
		OrderByComparator<Nir> orderByComparator);

	/**
	 * Returns the first nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	public Nir findByserie_First(
			String serie, OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException;

	/**
	 * Returns the first nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir, or <code>null</code> if a matching nir could not be found
	 */
	public Nir fetchByserie_First(
		String serie, OrderByComparator<Nir> orderByComparator);

	/**
	 * Returns the last nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	public Nir findByserie_Last(
			String serie, OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException;

	/**
	 * Returns the last nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir, or <code>null</code> if a matching nir could not be found
	 */
	public Nir fetchByserie_Last(
		String serie, OrderByComparator<Nir> orderByComparator);

	/**
	 * Returns the nirs before and after the current nir in the ordered set where serie = &#63;.
	 *
	 * @param nirPK the primary key of the current nir
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nir
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	public Nir[] findByserie_PrevAndNext(
			mx.movistar.col.lead.service.persistence.NirPK nirPK, String serie,
			OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException;

	/**
	 * Removes all the nirs where serie = &#63; from the database.
	 *
	 * @param serie the serie
	 */
	public void removeByserie(String serie);

	/**
	 * Returns the number of nirs where serie = &#63;.
	 *
	 * @param serie the serie
	 * @return the number of matching nirs
	 */
	public int countByserie(String serie);

	/**
	 * Caches the nir in the entity cache if it is enabled.
	 *
	 * @param nir the nir
	 */
	public void cacheResult(Nir nir);

	/**
	 * Caches the nirs in the entity cache if it is enabled.
	 *
	 * @param nirs the nirs
	 */
	public void cacheResult(java.util.List<Nir> nirs);

	/**
	 * Creates a new nir with the primary key. Does not add the nir to the database.
	 *
	 * @param nirPK the primary key for the new nir
	 * @return the new nir
	 */
	public Nir create(mx.movistar.col.lead.service.persistence.NirPK nirPK);

	/**
	 * Removes the nir with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir that was removed
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	public Nir remove(mx.movistar.col.lead.service.persistence.NirPK nirPK)
		throws NoSuchNirException;

	public Nir updateImpl(Nir nir);

	/**
	 * Returns the nir with the primary key or throws a <code>NoSuchNirException</code> if it could not be found.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	public Nir findByPrimaryKey(
			mx.movistar.col.lead.service.persistence.NirPK nirPK)
		throws NoSuchNirException;

	/**
	 * Returns the nir with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir, or <code>null</code> if a nir with the primary key could not be found
	 */
	public Nir fetchByPrimaryKey(
		mx.movistar.col.lead.service.persistence.NirPK nirPK);

	/**
	 * Returns all the nirs.
	 *
	 * @return the nirs
	 */
	public java.util.List<Nir> findAll();

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
	public java.util.List<Nir> findAll(int start, int end);

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
	public java.util.List<Nir> findAll(
		int start, int end, OrderByComparator<Nir> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<Nir> findAll(
		int start, int end, OrderByComparator<Nir> orderByComparator);

	/**
	 * Removes all the nirs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of nirs.
	 *
	 * @return the number of nirs
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}
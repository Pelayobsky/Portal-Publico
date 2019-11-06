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

package mx.movistar.col.lead.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import mx.movistar.col.lead.exception.NoSuchNirException;
import mx.movistar.col.lead.model.Nir;
import mx.movistar.col.lead.model.impl.NirImpl;
import mx.movistar.col.lead.model.impl.NirModelImpl;
import mx.movistar.col.lead.service.persistence.NirPK;
import mx.movistar.col.lead.service.persistence.NirPersistence;

/**
 * The persistence implementation for the nir service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class NirPersistenceImpl
	extends BasePersistenceImpl<Nir> implements NirPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NirUtil</code> to access the nir persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NirImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBylada;
	private FinderPath _finderPathWithoutPaginationFindBylada;
	private FinderPath _finderPathCountBylada;

	/**
	 * Returns all the nirs where lada = &#63;.
	 *
	 * @param lada the lada
	 * @return the matching nirs
	 */
	@Override
	public List<Nir> findBylada(String lada) {
		return findBylada(lada, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Nir> findBylada(String lada, int start, int end) {
		return findBylada(lada, start, end, null);
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
	@Override
	public List<Nir> findBylada(
		String lada, int start, int end,
		OrderByComparator<Nir> orderByComparator, boolean useFinderCache) {

		return findBylada(lada, start, end, orderByComparator);
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
	@Override
	public List<Nir> findBylada(
		String lada, int start, int end,
		OrderByComparator<Nir> orderByComparator) {

		lada = Objects.toString(lada, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindBylada;
			finderArgs = new Object[] {lada};
		}
		else {
			finderPath = _finderPathWithPaginationFindBylada;
			finderArgs = new Object[] {lada, start, end, orderByComparator};
		}

		List<Nir> list = (List<Nir>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Nir nir : list) {
				if (!lada.equals(nir.getLada())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_NIR_WHERE);

			boolean bindLada = false;

			if (lada.isEmpty()) {
				query.append(_FINDER_COLUMN_LADA_LADA_3);
			}
			else {
				bindLada = true;

				query.append(_FINDER_COLUMN_LADA_LADA_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(NirModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLada) {
					qPos.add(lada);
				}

				if (!pagination) {
					list = (List<Nir>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Nir>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	@Override
	public Nir findBylada_First(
			String lada, OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException {

		Nir nir = fetchBylada_First(lada, orderByComparator);

		if (nir != null) {
			return nir;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lada=");
		msg.append(lada);

		msg.append("}");

		throw new NoSuchNirException(msg.toString());
	}

	/**
	 * Returns the first nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir, or <code>null</code> if a matching nir could not be found
	 */
	@Override
	public Nir fetchBylada_First(
		String lada, OrderByComparator<Nir> orderByComparator) {

		List<Nir> list = findBylada(lada, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	@Override
	public Nir findBylada_Last(
			String lada, OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException {

		Nir nir = fetchBylada_Last(lada, orderByComparator);

		if (nir != null) {
			return nir;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lada=");
		msg.append(lada);

		msg.append("}");

		throw new NoSuchNirException(msg.toString());
	}

	/**
	 * Returns the last nir in the ordered set where lada = &#63;.
	 *
	 * @param lada the lada
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir, or <code>null</code> if a matching nir could not be found
	 */
	@Override
	public Nir fetchBylada_Last(
		String lada, OrderByComparator<Nir> orderByComparator) {

		int count = countBylada(lada);

		if (count == 0) {
			return null;
		}

		List<Nir> list = findBylada(lada, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Nir[] findBylada_PrevAndNext(
			NirPK nirPK, String lada, OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException {

		lada = Objects.toString(lada, "");

		Nir nir = findByPrimaryKey(nirPK);

		Session session = null;

		try {
			session = openSession();

			Nir[] array = new NirImpl[3];

			array[0] = getBylada_PrevAndNext(
				session, nir, lada, orderByComparator, true);

			array[1] = nir;

			array[2] = getBylada_PrevAndNext(
				session, nir, lada, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Nir getBylada_PrevAndNext(
		Session session, Nir nir, String lada,
		OrderByComparator<Nir> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NIR_WHERE);

		boolean bindLada = false;

		if (lada.isEmpty()) {
			query.append(_FINDER_COLUMN_LADA_LADA_3);
		}
		else {
			bindLada = true;

			query.append(_FINDER_COLUMN_LADA_LADA_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NirModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLada) {
			qPos.add(lada);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(nir)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Nir> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nirs where lada = &#63; from the database.
	 *
	 * @param lada the lada
	 */
	@Override
	public void removeBylada(String lada) {
		for (Nir nir :
				findBylada(lada, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(nir);
		}
	}

	/**
	 * Returns the number of nirs where lada = &#63;.
	 *
	 * @param lada the lada
	 * @return the number of matching nirs
	 */
	@Override
	public int countBylada(String lada) {
		lada = Objects.toString(lada, "");

		FinderPath finderPath = _finderPathCountBylada;

		Object[] finderArgs = new Object[] {lada};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_NIR_WHERE);

			boolean bindLada = false;

			if (lada.isEmpty()) {
				query.append(_FINDER_COLUMN_LADA_LADA_3);
			}
			else {
				bindLada = true;

				query.append(_FINDER_COLUMN_LADA_LADA_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLada) {
					qPos.add(lada);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_LADA_LADA_2 = "nir.id.lada = ?";

	private static final String _FINDER_COLUMN_LADA_LADA_3 =
		"(nir.id.lada IS NULL OR nir.id.lada = '')";

	private FinderPath _finderPathWithPaginationFindByserie;
	private FinderPath _finderPathWithoutPaginationFindByserie;
	private FinderPath _finderPathCountByserie;

	/**
	 * Returns all the nirs where serie = &#63;.
	 *
	 * @param serie the serie
	 * @return the matching nirs
	 */
	@Override
	public List<Nir> findByserie(String serie) {
		return findByserie(serie, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Nir> findByserie(String serie, int start, int end) {
		return findByserie(serie, start, end, null);
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
	@Override
	public List<Nir> findByserie(
		String serie, int start, int end,
		OrderByComparator<Nir> orderByComparator, boolean useFinderCache) {

		return findByserie(serie, start, end, orderByComparator);
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
	@Override
	public List<Nir> findByserie(
		String serie, int start, int end,
		OrderByComparator<Nir> orderByComparator) {

		serie = Objects.toString(serie, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByserie;
			finderArgs = new Object[] {serie};
		}
		else {
			finderPath = _finderPathWithPaginationFindByserie;
			finderArgs = new Object[] {serie, start, end, orderByComparator};
		}

		List<Nir> list = (List<Nir>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Nir nir : list) {
				if (!serie.equals(nir.getSerie())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_NIR_WHERE);

			boolean bindSerie = false;

			if (serie.isEmpty()) {
				query.append(_FINDER_COLUMN_SERIE_SERIE_3);
			}
			else {
				bindSerie = true;

				query.append(_FINDER_COLUMN_SERIE_SERIE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(NirModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSerie) {
					qPos.add(serie);
				}

				if (!pagination) {
					list = (List<Nir>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Nir>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	@Override
	public Nir findByserie_First(
			String serie, OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException {

		Nir nir = fetchByserie_First(serie, orderByComparator);

		if (nir != null) {
			return nir;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serie=");
		msg.append(serie);

		msg.append("}");

		throw new NoSuchNirException(msg.toString());
	}

	/**
	 * Returns the first nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nir, or <code>null</code> if a matching nir could not be found
	 */
	@Override
	public Nir fetchByserie_First(
		String serie, OrderByComparator<Nir> orderByComparator) {

		List<Nir> list = findByserie(serie, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir
	 * @throws NoSuchNirException if a matching nir could not be found
	 */
	@Override
	public Nir findByserie_Last(
			String serie, OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException {

		Nir nir = fetchByserie_Last(serie, orderByComparator);

		if (nir != null) {
			return nir;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serie=");
		msg.append(serie);

		msg.append("}");

		throw new NoSuchNirException(msg.toString());
	}

	/**
	 * Returns the last nir in the ordered set where serie = &#63;.
	 *
	 * @param serie the serie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nir, or <code>null</code> if a matching nir could not be found
	 */
	@Override
	public Nir fetchByserie_Last(
		String serie, OrderByComparator<Nir> orderByComparator) {

		int count = countByserie(serie);

		if (count == 0) {
			return null;
		}

		List<Nir> list = findByserie(
			serie, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Nir[] findByserie_PrevAndNext(
			NirPK nirPK, String serie, OrderByComparator<Nir> orderByComparator)
		throws NoSuchNirException {

		serie = Objects.toString(serie, "");

		Nir nir = findByPrimaryKey(nirPK);

		Session session = null;

		try {
			session = openSession();

			Nir[] array = new NirImpl[3];

			array[0] = getByserie_PrevAndNext(
				session, nir, serie, orderByComparator, true);

			array[1] = nir;

			array[2] = getByserie_PrevAndNext(
				session, nir, serie, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Nir getByserie_PrevAndNext(
		Session session, Nir nir, String serie,
		OrderByComparator<Nir> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NIR_WHERE);

		boolean bindSerie = false;

		if (serie.isEmpty()) {
			query.append(_FINDER_COLUMN_SERIE_SERIE_3);
		}
		else {
			bindSerie = true;

			query.append(_FINDER_COLUMN_SERIE_SERIE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NirModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSerie) {
			qPos.add(serie);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(nir)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Nir> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nirs where serie = &#63; from the database.
	 *
	 * @param serie the serie
	 */
	@Override
	public void removeByserie(String serie) {
		for (Nir nir :
				findByserie(
					serie, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(nir);
		}
	}

	/**
	 * Returns the number of nirs where serie = &#63;.
	 *
	 * @param serie the serie
	 * @return the number of matching nirs
	 */
	@Override
	public int countByserie(String serie) {
		serie = Objects.toString(serie, "");

		FinderPath finderPath = _finderPathCountByserie;

		Object[] finderArgs = new Object[] {serie};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_NIR_WHERE);

			boolean bindSerie = false;

			if (serie.isEmpty()) {
				query.append(_FINDER_COLUMN_SERIE_SERIE_3);
			}
			else {
				bindSerie = true;

				query.append(_FINDER_COLUMN_SERIE_SERIE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSerie) {
					qPos.add(serie);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_SERIE_SERIE_2 =
		"nir.id.serie = ?";

	private static final String _FINDER_COLUMN_SERIE_SERIE_3 =
		"(nir.id.serie IS NULL OR nir.id.serie = '')";

	public NirPersistenceImpl() {
		setModelClass(Nir.class);
	}

	/**
	 * Caches the nir in the entity cache if it is enabled.
	 *
	 * @param nir the nir
	 */
	@Override
	public void cacheResult(Nir nir) {
		entityCache.putResult(
			NirModelImpl.ENTITY_CACHE_ENABLED, NirImpl.class,
			nir.getPrimaryKey(), nir);

		nir.resetOriginalValues();
	}

	/**
	 * Caches the nirs in the entity cache if it is enabled.
	 *
	 * @param nirs the nirs
	 */
	@Override
	public void cacheResult(List<Nir> nirs) {
		for (Nir nir : nirs) {
			if (entityCache.getResult(
					NirModelImpl.ENTITY_CACHE_ENABLED, NirImpl.class,
					nir.getPrimaryKey()) == null) {

				cacheResult(nir);
			}
			else {
				nir.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nirs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NirImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nir.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Nir nir) {
		entityCache.removeResult(
			NirModelImpl.ENTITY_CACHE_ENABLED, NirImpl.class,
			nir.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Nir> nirs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Nir nir : nirs) {
			entityCache.removeResult(
				NirModelImpl.ENTITY_CACHE_ENABLED, NirImpl.class,
				nir.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nir with the primary key. Does not add the nir to the database.
	 *
	 * @param nirPK the primary key for the new nir
	 * @return the new nir
	 */
	@Override
	public Nir create(NirPK nirPK) {
		Nir nir = new NirImpl();

		nir.setNew(true);
		nir.setPrimaryKey(nirPK);

		return nir;
	}

	/**
	 * Removes the nir with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir that was removed
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	@Override
	public Nir remove(NirPK nirPK) throws NoSuchNirException {
		return remove((Serializable)nirPK);
	}

	/**
	 * Removes the nir with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nir
	 * @return the nir that was removed
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	@Override
	public Nir remove(Serializable primaryKey) throws NoSuchNirException {
		Session session = null;

		try {
			session = openSession();

			Nir nir = (Nir)session.get(NirImpl.class, primaryKey);

			if (nir == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNirException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(nir);
		}
		catch (NoSuchNirException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Nir removeImpl(Nir nir) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nir)) {
				nir = (Nir)session.get(NirImpl.class, nir.getPrimaryKeyObj());
			}

			if (nir != null) {
				session.delete(nir);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nir != null) {
			clearCache(nir);
		}

		return nir;
	}

	@Override
	public Nir updateImpl(Nir nir) {
		boolean isNew = nir.isNew();

		if (!(nir instanceof NirModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(nir.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(nir);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in nir proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Nir implementation " +
					nir.getClass());
		}

		NirModelImpl nirModelImpl = (NirModelImpl)nir;

		Session session = null;

		try {
			session = openSession();

			if (nir.isNew()) {
				session.save(nir);

				nir.setNew(false);
			}
			else {
				nir = (Nir)session.merge(nir);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!NirModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {nirModelImpl.getLada()};

			finderCache.removeResult(_finderPathCountBylada, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBylada, args);

			args = new Object[] {nirModelImpl.getSerie()};

			finderCache.removeResult(_finderPathCountByserie, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByserie, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((nirModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBylada.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {nirModelImpl.getOriginalLada()};

				finderCache.removeResult(_finderPathCountBylada, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBylada, args);

				args = new Object[] {nirModelImpl.getLada()};

				finderCache.removeResult(_finderPathCountBylada, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBylada, args);
			}

			if ((nirModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByserie.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {nirModelImpl.getOriginalSerie()};

				finderCache.removeResult(_finderPathCountByserie, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByserie, args);

				args = new Object[] {nirModelImpl.getSerie()};

				finderCache.removeResult(_finderPathCountByserie, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByserie, args);
			}
		}

		entityCache.putResult(
			NirModelImpl.ENTITY_CACHE_ENABLED, NirImpl.class,
			nir.getPrimaryKey(), nir, false);

		nir.resetOriginalValues();

		return nir;
	}

	/**
	 * Returns the nir with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nir
	 * @return the nir
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	@Override
	public Nir findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNirException {

		Nir nir = fetchByPrimaryKey(primaryKey);

		if (nir == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNirException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return nir;
	}

	/**
	 * Returns the nir with the primary key or throws a <code>NoSuchNirException</code> if it could not be found.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir
	 * @throws NoSuchNirException if a nir with the primary key could not be found
	 */
	@Override
	public Nir findByPrimaryKey(NirPK nirPK) throws NoSuchNirException {
		return findByPrimaryKey((Serializable)nirPK);
	}

	/**
	 * Returns the nir with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nir
	 * @return the nir, or <code>null</code> if a nir with the primary key could not be found
	 */
	@Override
	public Nir fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			NirModelImpl.ENTITY_CACHE_ENABLED, NirImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Nir nir = (Nir)serializable;

		if (nir == null) {
			Session session = null;

			try {
				session = openSession();

				nir = (Nir)session.get(NirImpl.class, primaryKey);

				if (nir != null) {
					cacheResult(nir);
				}
				else {
					entityCache.putResult(
						NirModelImpl.ENTITY_CACHE_ENABLED, NirImpl.class,
						primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(
					NirModelImpl.ENTITY_CACHE_ENABLED, NirImpl.class,
					primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nir;
	}

	/**
	 * Returns the nir with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir, or <code>null</code> if a nir with the primary key could not be found
	 */
	@Override
	public Nir fetchByPrimaryKey(NirPK nirPK) {
		return fetchByPrimaryKey((Serializable)nirPK);
	}

	@Override
	public Map<Serializable, Nir> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Nir> map = new HashMap<Serializable, Nir>();

		for (Serializable primaryKey : primaryKeys) {
			Nir nir = fetchByPrimaryKey(primaryKey);

			if (nir != null) {
				map.put(primaryKey, nir);
			}
		}

		return map;
	}

	/**
	 * Returns all the nirs.
	 *
	 * @return the nirs
	 */
	@Override
	public List<Nir> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Nir> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Nir> findAll(
		int start, int end, OrderByComparator<Nir> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
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
	@Override
	public List<Nir> findAll(
		int start, int end, OrderByComparator<Nir> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Nir> list = (List<Nir>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_NIR);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NIR;

				if (pagination) {
					sql = sql.concat(NirModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Nir>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Nir>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the nirs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Nir nir : findAll()) {
			remove(nir);
		}
	}

	/**
	 * Returns the number of nirs.
	 *
	 * @return the number of nirs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NIR);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NirModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the nir persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			NirModelImpl.ENTITY_CACHE_ENABLED,
			NirModelImpl.FINDER_CACHE_ENABLED, NirImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			NirModelImpl.ENTITY_CACHE_ENABLED,
			NirModelImpl.FINDER_CACHE_ENABLED, NirImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			NirModelImpl.ENTITY_CACHE_ENABLED,
			NirModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindBylada = new FinderPath(
			NirModelImpl.ENTITY_CACHE_ENABLED,
			NirModelImpl.FINDER_CACHE_ENABLED, NirImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBylada",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBylada = new FinderPath(
			NirModelImpl.ENTITY_CACHE_ENABLED,
			NirModelImpl.FINDER_CACHE_ENABLED, NirImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBylada",
			new String[] {String.class.getName()},
			NirModelImpl.LADA_COLUMN_BITMASK);

		_finderPathCountBylada = new FinderPath(
			NirModelImpl.ENTITY_CACHE_ENABLED,
			NirModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBylada",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByserie = new FinderPath(
			NirModelImpl.ENTITY_CACHE_ENABLED,
			NirModelImpl.FINDER_CACHE_ENABLED, NirImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByserie",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByserie = new FinderPath(
			NirModelImpl.ENTITY_CACHE_ENABLED,
			NirModelImpl.FINDER_CACHE_ENABLED, NirImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByserie",
			new String[] {String.class.getName()},
			NirModelImpl.SERIE_COLUMN_BITMASK);

		_finderPathCountByserie = new FinderPath(
			NirModelImpl.ENTITY_CACHE_ENABLED,
			NirModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByserie",
			new String[] {String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(NirImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NIR = "SELECT nir FROM Nir nir";

	private static final String _SQL_SELECT_NIR_WHERE =
		"SELECT nir FROM Nir nir WHERE ";

	private static final String _SQL_COUNT_NIR =
		"SELECT COUNT(nir) FROM Nir nir";

	private static final String _SQL_COUNT_NIR_WHERE =
		"SELECT COUNT(nir) FROM Nir nir WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "nir.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Nir exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Nir exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NirPersistenceImpl.class);

	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(
		new String[] {"lada", "serie"});

}
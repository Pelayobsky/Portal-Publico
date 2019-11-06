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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import mx.movistar.col.lead.exception.NoSuchBlackListException;
import mx.movistar.col.lead.model.BlackList;
import mx.movistar.col.lead.model.impl.BlackListImpl;
import mx.movistar.col.lead.model.impl.BlackListModelImpl;
import mx.movistar.col.lead.service.persistence.BlackListPersistence;

/**
 * The persistence implementation for the black list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class BlackListPersistenceImpl
	extends BasePersistenceImpl<BlackList> implements BlackListPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BlackListUtil</code> to access the black list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BlackListImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBynumero;
	private FinderPath _finderPathWithoutPaginationFindBynumero;
	private FinderPath _finderPathCountBynumero;

	/**
	 * Returns all the black lists where numero = &#63;.
	 *
	 * @param numero the numero
	 * @return the matching black lists
	 */
	@Override
	public List<BlackList> findBynumero(String numero) {
		return findBynumero(numero, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<BlackList> findBynumero(String numero, int start, int end) {
		return findBynumero(numero, start, end, null);
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
	@Override
	public List<BlackList> findBynumero(
		String numero, int start, int end,
		OrderByComparator<BlackList> orderByComparator,
		boolean useFinderCache) {

		return findBynumero(numero, start, end, orderByComparator);
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
	@Override
	public List<BlackList> findBynumero(
		String numero, int start, int end,
		OrderByComparator<BlackList> orderByComparator) {

		numero = Objects.toString(numero, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindBynumero;
			finderArgs = new Object[] {numero};
		}
		else {
			finderPath = _finderPathWithPaginationFindBynumero;
			finderArgs = new Object[] {numero, start, end, orderByComparator};
		}

		List<BlackList> list = (List<BlackList>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BlackList blackList : list) {
				if (!numero.equals(blackList.getNumero())) {
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

			query.append(_SQL_SELECT_BLACKLIST_WHERE);

			boolean bindNumero = false;

			if (numero.isEmpty()) {
				query.append(_FINDER_COLUMN_NUMERO_NUMERO_3);
			}
			else {
				bindNumero = true;

				query.append(_FINDER_COLUMN_NUMERO_NUMERO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(BlackListModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNumero) {
					qPos.add(numero);
				}

				if (!pagination) {
					list = (List<BlackList>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BlackList>)QueryUtil.list(
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
	 * Returns the first black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching black list
	 * @throws NoSuchBlackListException if a matching black list could not be found
	 */
	@Override
	public BlackList findBynumero_First(
			String numero, OrderByComparator<BlackList> orderByComparator)
		throws NoSuchBlackListException {

		BlackList blackList = fetchBynumero_First(numero, orderByComparator);

		if (blackList != null) {
			return blackList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("numero=");
		msg.append(numero);

		msg.append("}");

		throw new NoSuchBlackListException(msg.toString());
	}

	/**
	 * Returns the first black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching black list, or <code>null</code> if a matching black list could not be found
	 */
	@Override
	public BlackList fetchBynumero_First(
		String numero, OrderByComparator<BlackList> orderByComparator) {

		List<BlackList> list = findBynumero(numero, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching black list
	 * @throws NoSuchBlackListException if a matching black list could not be found
	 */
	@Override
	public BlackList findBynumero_Last(
			String numero, OrderByComparator<BlackList> orderByComparator)
		throws NoSuchBlackListException {

		BlackList blackList = fetchBynumero_Last(numero, orderByComparator);

		if (blackList != null) {
			return blackList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("numero=");
		msg.append(numero);

		msg.append("}");

		throw new NoSuchBlackListException(msg.toString());
	}

	/**
	 * Returns the last black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching black list, or <code>null</code> if a matching black list could not be found
	 */
	@Override
	public BlackList fetchBynumero_Last(
		String numero, OrderByComparator<BlackList> orderByComparator) {

		int count = countBynumero(numero);

		if (count == 0) {
			return null;
		}

		List<BlackList> list = findBynumero(
			numero, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public BlackList[] findBynumero_PrevAndNext(
			long blackListId, String numero,
			OrderByComparator<BlackList> orderByComparator)
		throws NoSuchBlackListException {

		numero = Objects.toString(numero, "");

		BlackList blackList = findByPrimaryKey(blackListId);

		Session session = null;

		try {
			session = openSession();

			BlackList[] array = new BlackListImpl[3];

			array[0] = getBynumero_PrevAndNext(
				session, blackList, numero, orderByComparator, true);

			array[1] = blackList;

			array[2] = getBynumero_PrevAndNext(
				session, blackList, numero, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BlackList getBynumero_PrevAndNext(
		Session session, BlackList blackList, String numero,
		OrderByComparator<BlackList> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BLACKLIST_WHERE);

		boolean bindNumero = false;

		if (numero.isEmpty()) {
			query.append(_FINDER_COLUMN_NUMERO_NUMERO_3);
		}
		else {
			bindNumero = true;

			query.append(_FINDER_COLUMN_NUMERO_NUMERO_2);
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
			query.append(BlackListModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNumero) {
			qPos.add(numero);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(blackList)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<BlackList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the black lists where numero = &#63; from the database.
	 *
	 * @param numero the numero
	 */
	@Override
	public void removeBynumero(String numero) {
		for (BlackList blackList :
				findBynumero(
					numero, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(blackList);
		}
	}

	/**
	 * Returns the number of black lists where numero = &#63;.
	 *
	 * @param numero the numero
	 * @return the number of matching black lists
	 */
	@Override
	public int countBynumero(String numero) {
		numero = Objects.toString(numero, "");

		FinderPath finderPath = _finderPathCountBynumero;

		Object[] finderArgs = new Object[] {numero};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BLACKLIST_WHERE);

			boolean bindNumero = false;

			if (numero.isEmpty()) {
				query.append(_FINDER_COLUMN_NUMERO_NUMERO_3);
			}
			else {
				bindNumero = true;

				query.append(_FINDER_COLUMN_NUMERO_NUMERO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNumero) {
					qPos.add(numero);
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

	private static final String _FINDER_COLUMN_NUMERO_NUMERO_2 =
		"blackList.numero = ?";

	private static final String _FINDER_COLUMN_NUMERO_NUMERO_3 =
		"(blackList.numero IS NULL OR blackList.numero = '')";

	public BlackListPersistenceImpl() {
		setModelClass(BlackList.class);
	}

	/**
	 * Caches the black list in the entity cache if it is enabled.
	 *
	 * @param blackList the black list
	 */
	@Override
	public void cacheResult(BlackList blackList) {
		entityCache.putResult(
			BlackListModelImpl.ENTITY_CACHE_ENABLED, BlackListImpl.class,
			blackList.getPrimaryKey(), blackList);

		blackList.resetOriginalValues();
	}

	/**
	 * Caches the black lists in the entity cache if it is enabled.
	 *
	 * @param blackLists the black lists
	 */
	@Override
	public void cacheResult(List<BlackList> blackLists) {
		for (BlackList blackList : blackLists) {
			if (entityCache.getResult(
					BlackListModelImpl.ENTITY_CACHE_ENABLED,
					BlackListImpl.class, blackList.getPrimaryKey()) == null) {

				cacheResult(blackList);
			}
			else {
				blackList.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all black lists.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BlackListImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the black list.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BlackList blackList) {
		entityCache.removeResult(
			BlackListModelImpl.ENTITY_CACHE_ENABLED, BlackListImpl.class,
			blackList.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BlackList> blackLists) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BlackList blackList : blackLists) {
			entityCache.removeResult(
				BlackListModelImpl.ENTITY_CACHE_ENABLED, BlackListImpl.class,
				blackList.getPrimaryKey());
		}
	}

	/**
	 * Creates a new black list with the primary key. Does not add the black list to the database.
	 *
	 * @param blackListId the primary key for the new black list
	 * @return the new black list
	 */
	@Override
	public BlackList create(long blackListId) {
		BlackList blackList = new BlackListImpl();

		blackList.setNew(true);
		blackList.setPrimaryKey(blackListId);

		return blackList;
	}

	/**
	 * Removes the black list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list that was removed
	 * @throws NoSuchBlackListException if a black list with the primary key could not be found
	 */
	@Override
	public BlackList remove(long blackListId) throws NoSuchBlackListException {
		return remove((Serializable)blackListId);
	}

	/**
	 * Removes the black list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the black list
	 * @return the black list that was removed
	 * @throws NoSuchBlackListException if a black list with the primary key could not be found
	 */
	@Override
	public BlackList remove(Serializable primaryKey)
		throws NoSuchBlackListException {

		Session session = null;

		try {
			session = openSession();

			BlackList blackList = (BlackList)session.get(
				BlackListImpl.class, primaryKey);

			if (blackList == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBlackListException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(blackList);
		}
		catch (NoSuchBlackListException nsee) {
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
	protected BlackList removeImpl(BlackList blackList) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(blackList)) {
				blackList = (BlackList)session.get(
					BlackListImpl.class, blackList.getPrimaryKeyObj());
			}

			if (blackList != null) {
				session.delete(blackList);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (blackList != null) {
			clearCache(blackList);
		}

		return blackList;
	}

	@Override
	public BlackList updateImpl(BlackList blackList) {
		boolean isNew = blackList.isNew();

		if (!(blackList instanceof BlackListModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(blackList.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(blackList);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in blackList proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom BlackList implementation " +
					blackList.getClass());
		}

		BlackListModelImpl blackListModelImpl = (BlackListModelImpl)blackList;

		Session session = null;

		try {
			session = openSession();

			if (blackList.isNew()) {
				session.save(blackList);

				blackList.setNew(false);
			}
			else {
				blackList = (BlackList)session.merge(blackList);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!BlackListModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {blackListModelImpl.getNumero()};

			finderCache.removeResult(_finderPathCountBynumero, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBynumero, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((blackListModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBynumero.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					blackListModelImpl.getOriginalNumero()
				};

				finderCache.removeResult(_finderPathCountBynumero, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBynumero, args);

				args = new Object[] {blackListModelImpl.getNumero()};

				finderCache.removeResult(_finderPathCountBynumero, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBynumero, args);
			}
		}

		entityCache.putResult(
			BlackListModelImpl.ENTITY_CACHE_ENABLED, BlackListImpl.class,
			blackList.getPrimaryKey(), blackList, false);

		blackList.resetOriginalValues();

		return blackList;
	}

	/**
	 * Returns the black list with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the black list
	 * @return the black list
	 * @throws NoSuchBlackListException if a black list with the primary key could not be found
	 */
	@Override
	public BlackList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBlackListException {

		BlackList blackList = fetchByPrimaryKey(primaryKey);

		if (blackList == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBlackListException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return blackList;
	}

	/**
	 * Returns the black list with the primary key or throws a <code>NoSuchBlackListException</code> if it could not be found.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list
	 * @throws NoSuchBlackListException if a black list with the primary key could not be found
	 */
	@Override
	public BlackList findByPrimaryKey(long blackListId)
		throws NoSuchBlackListException {

		return findByPrimaryKey((Serializable)blackListId);
	}

	/**
	 * Returns the black list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the black list
	 * @return the black list, or <code>null</code> if a black list with the primary key could not be found
	 */
	@Override
	public BlackList fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			BlackListModelImpl.ENTITY_CACHE_ENABLED, BlackListImpl.class,
			primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		BlackList blackList = (BlackList)serializable;

		if (blackList == null) {
			Session session = null;

			try {
				session = openSession();

				blackList = (BlackList)session.get(
					BlackListImpl.class, primaryKey);

				if (blackList != null) {
					cacheResult(blackList);
				}
				else {
					entityCache.putResult(
						BlackListModelImpl.ENTITY_CACHE_ENABLED,
						BlackListImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(
					BlackListModelImpl.ENTITY_CACHE_ENABLED,
					BlackListImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return blackList;
	}

	/**
	 * Returns the black list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list, or <code>null</code> if a black list with the primary key could not be found
	 */
	@Override
	public BlackList fetchByPrimaryKey(long blackListId) {
		return fetchByPrimaryKey((Serializable)blackListId);
	}

	@Override
	public Map<Serializable, BlackList> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, BlackList> map =
			new HashMap<Serializable, BlackList>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			BlackList blackList = fetchByPrimaryKey(primaryKey);

			if (blackList != null) {
				map.put(primaryKey, blackList);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				BlackListModelImpl.ENTITY_CACHE_ENABLED, BlackListImpl.class,
				primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (BlackList)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler(
			uncachedPrimaryKeys.size() * 2 + 1);

		query.append(_SQL_SELECT_BLACKLIST_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (BlackList blackList : (List<BlackList>)q.list()) {
				map.put(blackList.getPrimaryKeyObj(), blackList);

				cacheResult(blackList);

				uncachedPrimaryKeys.remove(blackList.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					BlackListModelImpl.ENTITY_CACHE_ENABLED,
					BlackListImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the black lists.
	 *
	 * @return the black lists
	 */
	@Override
	public List<BlackList> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<BlackList> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<BlackList> findAll(
		int start, int end, OrderByComparator<BlackList> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
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
	@Override
	public List<BlackList> findAll(
		int start, int end, OrderByComparator<BlackList> orderByComparator) {

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

		List<BlackList> list = (List<BlackList>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BLACKLIST);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BLACKLIST;

				if (pagination) {
					sql = sql.concat(BlackListModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BlackList>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BlackList>)QueryUtil.list(
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
	 * Removes all the black lists from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BlackList blackList : findAll()) {
			remove(blackList);
		}
	}

	/**
	 * Returns the number of black lists.
	 *
	 * @return the number of black lists
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BLACKLIST);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return BlackListModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the black list persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			BlackListModelImpl.ENTITY_CACHE_ENABLED,
			BlackListModelImpl.FINDER_CACHE_ENABLED, BlackListImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			BlackListModelImpl.ENTITY_CACHE_ENABLED,
			BlackListModelImpl.FINDER_CACHE_ENABLED, BlackListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			BlackListModelImpl.ENTITY_CACHE_ENABLED,
			BlackListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindBynumero = new FinderPath(
			BlackListModelImpl.ENTITY_CACHE_ENABLED,
			BlackListModelImpl.FINDER_CACHE_ENABLED, BlackListImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBynumero",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBynumero = new FinderPath(
			BlackListModelImpl.ENTITY_CACHE_ENABLED,
			BlackListModelImpl.FINDER_CACHE_ENABLED, BlackListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBynumero",
			new String[] {String.class.getName()},
			BlackListModelImpl.NUMERO_COLUMN_BITMASK);

		_finderPathCountBynumero = new FinderPath(
			BlackListModelImpl.ENTITY_CACHE_ENABLED,
			BlackListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBynumero",
			new String[] {String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(BlackListImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_BLACKLIST =
		"SELECT blackList FROM BlackList blackList";

	private static final String _SQL_SELECT_BLACKLIST_WHERE_PKS_IN =
		"SELECT blackList FROM BlackList blackList WHERE blackListId IN (";

	private static final String _SQL_SELECT_BLACKLIST_WHERE =
		"SELECT blackList FROM BlackList blackList WHERE ";

	private static final String _SQL_COUNT_BLACKLIST =
		"SELECT COUNT(blackList) FROM BlackList blackList";

	private static final String _SQL_COUNT_BLACKLIST_WHERE =
		"SELECT COUNT(blackList) FROM BlackList blackList WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "blackList.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No BlackList exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No BlackList exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		BlackListPersistenceImpl.class);

}
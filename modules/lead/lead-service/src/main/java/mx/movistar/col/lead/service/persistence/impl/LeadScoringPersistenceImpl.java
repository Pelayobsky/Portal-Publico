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
import java.util.Set;

import mx.movistar.col.lead.exception.NoSuchLeadScoringException;
import mx.movistar.col.lead.model.LeadScoring;
import mx.movistar.col.lead.model.impl.LeadScoringImpl;
import mx.movistar.col.lead.model.impl.LeadScoringModelImpl;
import mx.movistar.col.lead.service.persistence.LeadScoringPersistence;

/**
 * The persistence implementation for the lead scoring service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class LeadScoringPersistenceImpl
	extends BasePersistenceImpl<LeadScoring> implements LeadScoringPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>LeadScoringUtil</code> to access the lead scoring persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		LeadScoringImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByGroupId;
	private FinderPath _finderPathWithoutPaginationFindByGroupId;
	private FinderPath _finderPathCountByGroupId;

	/**
	 * Returns all the lead scorings where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching lead scorings
	 */
	@Override
	public List<LeadScoring> findByGroupId(long groupId) {
		return findByGroupId(
			groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeadScoring> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<LeadScoring> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<LeadScoring> orderByComparator,
		boolean useFinderCache) {

		return findByGroupId(groupId, start, end, orderByComparator);
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
	@Override
	public List<LeadScoring> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<LeadScoring> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByGroupId;
			finderArgs = new Object[] {groupId};
		}
		else {
			finderPath = _finderPathWithPaginationFindByGroupId;
			finderArgs = new Object[] {groupId, start, end, orderByComparator};
		}

		List<LeadScoring> list = (List<LeadScoring>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LeadScoring leadScoring : list) {
				if ((groupId != leadScoring.getGroupId())) {
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

			query.append(_SQL_SELECT_LEADSCORING_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(LeadScoringModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<LeadScoring>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LeadScoring>)QueryUtil.list(
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
	 * Returns the first lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead scoring
	 * @throws NoSuchLeadScoringException if a matching lead scoring could not be found
	 */
	@Override
	public LeadScoring findByGroupId_First(
			long groupId, OrderByComparator<LeadScoring> orderByComparator)
		throws NoSuchLeadScoringException {

		LeadScoring leadScoring = fetchByGroupId_First(
			groupId, orderByComparator);

		if (leadScoring != null) {
			return leadScoring;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchLeadScoringException(msg.toString());
	}

	/**
	 * Returns the first lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead scoring, or <code>null</code> if a matching lead scoring could not be found
	 */
	@Override
	public LeadScoring fetchByGroupId_First(
		long groupId, OrderByComparator<LeadScoring> orderByComparator) {

		List<LeadScoring> list = findByGroupId(
			groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead scoring
	 * @throws NoSuchLeadScoringException if a matching lead scoring could not be found
	 */
	@Override
	public LeadScoring findByGroupId_Last(
			long groupId, OrderByComparator<LeadScoring> orderByComparator)
		throws NoSuchLeadScoringException {

		LeadScoring leadScoring = fetchByGroupId_Last(
			groupId, orderByComparator);

		if (leadScoring != null) {
			return leadScoring;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchLeadScoringException(msg.toString());
	}

	/**
	 * Returns the last lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead scoring, or <code>null</code> if a matching lead scoring could not be found
	 */
	@Override
	public LeadScoring fetchByGroupId_Last(
		long groupId, OrderByComparator<LeadScoring> orderByComparator) {

		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<LeadScoring> list = findByGroupId(
			groupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LeadScoring[] findByGroupId_PrevAndNext(
			long leadScoringId, long groupId,
			OrderByComparator<LeadScoring> orderByComparator)
		throws NoSuchLeadScoringException {

		LeadScoring leadScoring = findByPrimaryKey(leadScoringId);

		Session session = null;

		try {
			session = openSession();

			LeadScoring[] array = new LeadScoringImpl[3];

			array[0] = getByGroupId_PrevAndNext(
				session, leadScoring, groupId, orderByComparator, true);

			array[1] = leadScoring;

			array[2] = getByGroupId_PrevAndNext(
				session, leadScoring, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LeadScoring getByGroupId_PrevAndNext(
		Session session, LeadScoring leadScoring, long groupId,
		OrderByComparator<LeadScoring> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LEADSCORING_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(LeadScoringModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(leadScoring)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<LeadScoring> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lead scorings where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (LeadScoring leadScoring :
				findByGroupId(
					groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(leadScoring);
		}
	}

	/**
	 * Returns the number of lead scorings where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching lead scorings
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = _finderPathCountByGroupId;

		Object[] finderArgs = new Object[] {groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LEADSCORING_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 =
		"leadScoring.groupId = ?";

	public LeadScoringPersistenceImpl() {
		setModelClass(LeadScoring.class);
	}

	/**
	 * Caches the lead scoring in the entity cache if it is enabled.
	 *
	 * @param leadScoring the lead scoring
	 */
	@Override
	public void cacheResult(LeadScoring leadScoring) {
		entityCache.putResult(
			LeadScoringModelImpl.ENTITY_CACHE_ENABLED, LeadScoringImpl.class,
			leadScoring.getPrimaryKey(), leadScoring);

		leadScoring.resetOriginalValues();
	}

	/**
	 * Caches the lead scorings in the entity cache if it is enabled.
	 *
	 * @param leadScorings the lead scorings
	 */
	@Override
	public void cacheResult(List<LeadScoring> leadScorings) {
		for (LeadScoring leadScoring : leadScorings) {
			if (entityCache.getResult(
					LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
					LeadScoringImpl.class, leadScoring.getPrimaryKey()) ==
						null) {

				cacheResult(leadScoring);
			}
			else {
				leadScoring.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lead scorings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LeadScoringImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lead scoring.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LeadScoring leadScoring) {
		entityCache.removeResult(
			LeadScoringModelImpl.ENTITY_CACHE_ENABLED, LeadScoringImpl.class,
			leadScoring.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LeadScoring> leadScorings) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LeadScoring leadScoring : leadScorings) {
			entityCache.removeResult(
				LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
				LeadScoringImpl.class, leadScoring.getPrimaryKey());
		}
	}

	/**
	 * Creates a new lead scoring with the primary key. Does not add the lead scoring to the database.
	 *
	 * @param leadScoringId the primary key for the new lead scoring
	 * @return the new lead scoring
	 */
	@Override
	public LeadScoring create(long leadScoringId) {
		LeadScoring leadScoring = new LeadScoringImpl();

		leadScoring.setNew(true);
		leadScoring.setPrimaryKey(leadScoringId);

		return leadScoring;
	}

	/**
	 * Removes the lead scoring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring that was removed
	 * @throws NoSuchLeadScoringException if a lead scoring with the primary key could not be found
	 */
	@Override
	public LeadScoring remove(long leadScoringId)
		throws NoSuchLeadScoringException {

		return remove((Serializable)leadScoringId);
	}

	/**
	 * Removes the lead scoring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lead scoring
	 * @return the lead scoring that was removed
	 * @throws NoSuchLeadScoringException if a lead scoring with the primary key could not be found
	 */
	@Override
	public LeadScoring remove(Serializable primaryKey)
		throws NoSuchLeadScoringException {

		Session session = null;

		try {
			session = openSession();

			LeadScoring leadScoring = (LeadScoring)session.get(
				LeadScoringImpl.class, primaryKey);

			if (leadScoring == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLeadScoringException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(leadScoring);
		}
		catch (NoSuchLeadScoringException nsee) {
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
	protected LeadScoring removeImpl(LeadScoring leadScoring) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(leadScoring)) {
				leadScoring = (LeadScoring)session.get(
					LeadScoringImpl.class, leadScoring.getPrimaryKeyObj());
			}

			if (leadScoring != null) {
				session.delete(leadScoring);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (leadScoring != null) {
			clearCache(leadScoring);
		}

		return leadScoring;
	}

	@Override
	public LeadScoring updateImpl(LeadScoring leadScoring) {
		boolean isNew = leadScoring.isNew();

		if (!(leadScoring instanceof LeadScoringModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(leadScoring.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(leadScoring);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in leadScoring proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom LeadScoring implementation " +
					leadScoring.getClass());
		}

		LeadScoringModelImpl leadScoringModelImpl =
			(LeadScoringModelImpl)leadScoring;

		Session session = null;

		try {
			session = openSession();

			if (leadScoring.isNew()) {
				session.save(leadScoring);

				leadScoring.setNew(false);
			}
			else {
				leadScoring = (LeadScoring)session.merge(leadScoring);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!LeadScoringModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {leadScoringModelImpl.getGroupId()};

			finderCache.removeResult(_finderPathCountByGroupId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByGroupId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((leadScoringModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByGroupId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					leadScoringModelImpl.getOriginalGroupId()
				};

				finderCache.removeResult(_finderPathCountByGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByGroupId, args);

				args = new Object[] {leadScoringModelImpl.getGroupId()};

				finderCache.removeResult(_finderPathCountByGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByGroupId, args);
			}
		}

		entityCache.putResult(
			LeadScoringModelImpl.ENTITY_CACHE_ENABLED, LeadScoringImpl.class,
			leadScoring.getPrimaryKey(), leadScoring, false);

		leadScoring.resetOriginalValues();

		return leadScoring;
	}

	/**
	 * Returns the lead scoring with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lead scoring
	 * @return the lead scoring
	 * @throws NoSuchLeadScoringException if a lead scoring with the primary key could not be found
	 */
	@Override
	public LeadScoring findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLeadScoringException {

		LeadScoring leadScoring = fetchByPrimaryKey(primaryKey);

		if (leadScoring == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLeadScoringException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return leadScoring;
	}

	/**
	 * Returns the lead scoring with the primary key or throws a <code>NoSuchLeadScoringException</code> if it could not be found.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring
	 * @throws NoSuchLeadScoringException if a lead scoring with the primary key could not be found
	 */
	@Override
	public LeadScoring findByPrimaryKey(long leadScoringId)
		throws NoSuchLeadScoringException {

		return findByPrimaryKey((Serializable)leadScoringId);
	}

	/**
	 * Returns the lead scoring with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lead scoring
	 * @return the lead scoring, or <code>null</code> if a lead scoring with the primary key could not be found
	 */
	@Override
	public LeadScoring fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			LeadScoringModelImpl.ENTITY_CACHE_ENABLED, LeadScoringImpl.class,
			primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LeadScoring leadScoring = (LeadScoring)serializable;

		if (leadScoring == null) {
			Session session = null;

			try {
				session = openSession();

				leadScoring = (LeadScoring)session.get(
					LeadScoringImpl.class, primaryKey);

				if (leadScoring != null) {
					cacheResult(leadScoring);
				}
				else {
					entityCache.putResult(
						LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
						LeadScoringImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(
					LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
					LeadScoringImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return leadScoring;
	}

	/**
	 * Returns the lead scoring with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring, or <code>null</code> if a lead scoring with the primary key could not be found
	 */
	@Override
	public LeadScoring fetchByPrimaryKey(long leadScoringId) {
		return fetchByPrimaryKey((Serializable)leadScoringId);
	}

	@Override
	public Map<Serializable, LeadScoring> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LeadScoring> map =
			new HashMap<Serializable, LeadScoring>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LeadScoring leadScoring = fetchByPrimaryKey(primaryKey);

			if (leadScoring != null) {
				map.put(primaryKey, leadScoring);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
				LeadScoringImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LeadScoring)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler(
			uncachedPrimaryKeys.size() * 2 + 1);

		query.append(_SQL_SELECT_LEADSCORING_WHERE_PKS_IN);

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

			for (LeadScoring leadScoring : (List<LeadScoring>)q.list()) {
				map.put(leadScoring.getPrimaryKeyObj(), leadScoring);

				cacheResult(leadScoring);

				uncachedPrimaryKeys.remove(leadScoring.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
					LeadScoringImpl.class, primaryKey, nullModel);
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
	 * Returns all the lead scorings.
	 *
	 * @return the lead scorings
	 */
	@Override
	public List<LeadScoring> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeadScoring> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<LeadScoring> findAll(
		int start, int end, OrderByComparator<LeadScoring> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
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
	@Override
	public List<LeadScoring> findAll(
		int start, int end, OrderByComparator<LeadScoring> orderByComparator) {

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

		List<LeadScoring> list = (List<LeadScoring>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LEADSCORING);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LEADSCORING;

				if (pagination) {
					sql = sql.concat(LeadScoringModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LeadScoring>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LeadScoring>)QueryUtil.list(
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
	 * Removes all the lead scorings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LeadScoring leadScoring : findAll()) {
			remove(leadScoring);
		}
	}

	/**
	 * Returns the number of lead scorings.
	 *
	 * @return the number of lead scorings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LEADSCORING);

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
		return LeadScoringModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the lead scoring persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
			LeadScoringModelImpl.FINDER_CACHE_ENABLED, LeadScoringImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
			LeadScoringModelImpl.FINDER_CACHE_ENABLED, LeadScoringImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
			LeadScoringModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByGroupId = new FinderPath(
			LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
			LeadScoringModelImpl.FINDER_CACHE_ENABLED, LeadScoringImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByGroupId = new FinderPath(
			LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
			LeadScoringModelImpl.FINDER_CACHE_ENABLED, LeadScoringImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] {Long.class.getName()},
			LeadScoringModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByGroupId = new FinderPath(
			LeadScoringModelImpl.ENTITY_CACHE_ENABLED,
			LeadScoringModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] {Long.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(LeadScoringImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_LEADSCORING =
		"SELECT leadScoring FROM LeadScoring leadScoring";

	private static final String _SQL_SELECT_LEADSCORING_WHERE_PKS_IN =
		"SELECT leadScoring FROM LeadScoring leadScoring WHERE leadScoringId IN (";

	private static final String _SQL_SELECT_LEADSCORING_WHERE =
		"SELECT leadScoring FROM LeadScoring leadScoring WHERE ";

	private static final String _SQL_COUNT_LEADSCORING =
		"SELECT COUNT(leadScoring) FROM LeadScoring leadScoring";

	private static final String _SQL_COUNT_LEADSCORING_WHERE =
		"SELECT COUNT(leadScoring) FROM LeadScoring leadScoring WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "leadScoring.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No LeadScoring exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No LeadScoring exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		LeadScoringPersistenceImpl.class);

}
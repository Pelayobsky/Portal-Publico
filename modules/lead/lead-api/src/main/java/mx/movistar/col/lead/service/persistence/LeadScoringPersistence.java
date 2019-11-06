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

import mx.movistar.col.lead.exception.NoSuchLeadScoringException;
import mx.movistar.col.lead.model.LeadScoring;

/**
 * The persistence interface for the lead scoring service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeadScoringUtil
 * @generated
 */
@ProviderType
public interface LeadScoringPersistence extends BasePersistence<LeadScoring> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LeadScoringUtil} to access the lead scoring persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, LeadScoring> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the lead scorings where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching lead scorings
	 */
	public java.util.List<LeadScoring> findByGroupId(long groupId);

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
	public java.util.List<LeadScoring> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<LeadScoring> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<LeadScoring> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<LeadScoring> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<LeadScoring> orderByComparator);

	/**
	 * Returns the first lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead scoring
	 * @throws NoSuchLeadScoringException if a matching lead scoring could not be found
	 */
	public LeadScoring findByGroupId_First(
			long groupId, OrderByComparator<LeadScoring> orderByComparator)
		throws NoSuchLeadScoringException;

	/**
	 * Returns the first lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lead scoring, or <code>null</code> if a matching lead scoring could not be found
	 */
	public LeadScoring fetchByGroupId_First(
		long groupId, OrderByComparator<LeadScoring> orderByComparator);

	/**
	 * Returns the last lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead scoring
	 * @throws NoSuchLeadScoringException if a matching lead scoring could not be found
	 */
	public LeadScoring findByGroupId_Last(
			long groupId, OrderByComparator<LeadScoring> orderByComparator)
		throws NoSuchLeadScoringException;

	/**
	 * Returns the last lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lead scoring, or <code>null</code> if a matching lead scoring could not be found
	 */
	public LeadScoring fetchByGroupId_Last(
		long groupId, OrderByComparator<LeadScoring> orderByComparator);

	/**
	 * Returns the lead scorings before and after the current lead scoring in the ordered set where groupId = &#63;.
	 *
	 * @param leadScoringId the primary key of the current lead scoring
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lead scoring
	 * @throws NoSuchLeadScoringException if a lead scoring with the primary key could not be found
	 */
	public LeadScoring[] findByGroupId_PrevAndNext(
			long leadScoringId, long groupId,
			OrderByComparator<LeadScoring> orderByComparator)
		throws NoSuchLeadScoringException;

	/**
	 * Removes all the lead scorings where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of lead scorings where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching lead scorings
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the lead scoring in the entity cache if it is enabled.
	 *
	 * @param leadScoring the lead scoring
	 */
	public void cacheResult(LeadScoring leadScoring);

	/**
	 * Caches the lead scorings in the entity cache if it is enabled.
	 *
	 * @param leadScorings the lead scorings
	 */
	public void cacheResult(java.util.List<LeadScoring> leadScorings);

	/**
	 * Creates a new lead scoring with the primary key. Does not add the lead scoring to the database.
	 *
	 * @param leadScoringId the primary key for the new lead scoring
	 * @return the new lead scoring
	 */
	public LeadScoring create(long leadScoringId);

	/**
	 * Removes the lead scoring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring that was removed
	 * @throws NoSuchLeadScoringException if a lead scoring with the primary key could not be found
	 */
	public LeadScoring remove(long leadScoringId)
		throws NoSuchLeadScoringException;

	public LeadScoring updateImpl(LeadScoring leadScoring);

	/**
	 * Returns the lead scoring with the primary key or throws a <code>NoSuchLeadScoringException</code> if it could not be found.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring
	 * @throws NoSuchLeadScoringException if a lead scoring with the primary key could not be found
	 */
	public LeadScoring findByPrimaryKey(long leadScoringId)
		throws NoSuchLeadScoringException;

	/**
	 * Returns the lead scoring with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring, or <code>null</code> if a lead scoring with the primary key could not be found
	 */
	public LeadScoring fetchByPrimaryKey(long leadScoringId);

	/**
	 * Returns all the lead scorings.
	 *
	 * @return the lead scorings
	 */
	public java.util.List<LeadScoring> findAll();

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
	public java.util.List<LeadScoring> findAll(int start, int end);

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
	public java.util.List<LeadScoring> findAll(
		int start, int end, OrderByComparator<LeadScoring> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<LeadScoring> findAll(
		int start, int end, OrderByComparator<LeadScoring> orderByComparator);

	/**
	 * Removes all the lead scorings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of lead scorings.
	 *
	 * @return the number of lead scorings
	 */
	public int countAll();

}
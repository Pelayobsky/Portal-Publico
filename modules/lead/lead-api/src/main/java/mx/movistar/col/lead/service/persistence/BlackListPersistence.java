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

import mx.movistar.col.lead.exception.NoSuchBlackListException;
import mx.movistar.col.lead.model.BlackList;

/**
 * The persistence interface for the black list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BlackListUtil
 * @generated
 */
@ProviderType
public interface BlackListPersistence extends BasePersistence<BlackList> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BlackListUtil} to access the black list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, BlackList> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the black lists where numero = &#63;.
	 *
	 * @param numero the numero
	 * @return the matching black lists
	 */
	public java.util.List<BlackList> findBynumero(String numero);

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
	public java.util.List<BlackList> findBynumero(
		String numero, int start, int end);

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
	public java.util.List<BlackList> findBynumero(
		String numero, int start, int end,
		OrderByComparator<BlackList> orderByComparator, boolean useFinderCache);

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
	public java.util.List<BlackList> findBynumero(
		String numero, int start, int end,
		OrderByComparator<BlackList> orderByComparator);

	/**
	 * Returns the first black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching black list
	 * @throws NoSuchBlackListException if a matching black list could not be found
	 */
	public BlackList findBynumero_First(
			String numero, OrderByComparator<BlackList> orderByComparator)
		throws NoSuchBlackListException;

	/**
	 * Returns the first black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching black list, or <code>null</code> if a matching black list could not be found
	 */
	public BlackList fetchBynumero_First(
		String numero, OrderByComparator<BlackList> orderByComparator);

	/**
	 * Returns the last black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching black list
	 * @throws NoSuchBlackListException if a matching black list could not be found
	 */
	public BlackList findBynumero_Last(
			String numero, OrderByComparator<BlackList> orderByComparator)
		throws NoSuchBlackListException;

	/**
	 * Returns the last black list in the ordered set where numero = &#63;.
	 *
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching black list, or <code>null</code> if a matching black list could not be found
	 */
	public BlackList fetchBynumero_Last(
		String numero, OrderByComparator<BlackList> orderByComparator);

	/**
	 * Returns the black lists before and after the current black list in the ordered set where numero = &#63;.
	 *
	 * @param blackListId the primary key of the current black list
	 * @param numero the numero
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next black list
	 * @throws NoSuchBlackListException if a black list with the primary key could not be found
	 */
	public BlackList[] findBynumero_PrevAndNext(
			long blackListId, String numero,
			OrderByComparator<BlackList> orderByComparator)
		throws NoSuchBlackListException;

	/**
	 * Removes all the black lists where numero = &#63; from the database.
	 *
	 * @param numero the numero
	 */
	public void removeBynumero(String numero);

	/**
	 * Returns the number of black lists where numero = &#63;.
	 *
	 * @param numero the numero
	 * @return the number of matching black lists
	 */
	public int countBynumero(String numero);

	/**
	 * Caches the black list in the entity cache if it is enabled.
	 *
	 * @param blackList the black list
	 */
	public void cacheResult(BlackList blackList);

	/**
	 * Caches the black lists in the entity cache if it is enabled.
	 *
	 * @param blackLists the black lists
	 */
	public void cacheResult(java.util.List<BlackList> blackLists);

	/**
	 * Creates a new black list with the primary key. Does not add the black list to the database.
	 *
	 * @param blackListId the primary key for the new black list
	 * @return the new black list
	 */
	public BlackList create(long blackListId);

	/**
	 * Removes the black list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list that was removed
	 * @throws NoSuchBlackListException if a black list with the primary key could not be found
	 */
	public BlackList remove(long blackListId) throws NoSuchBlackListException;

	public BlackList updateImpl(BlackList blackList);

	/**
	 * Returns the black list with the primary key or throws a <code>NoSuchBlackListException</code> if it could not be found.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list
	 * @throws NoSuchBlackListException if a black list with the primary key could not be found
	 */
	public BlackList findByPrimaryKey(long blackListId)
		throws NoSuchBlackListException;

	/**
	 * Returns the black list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list, or <code>null</code> if a black list with the primary key could not be found
	 */
	public BlackList fetchByPrimaryKey(long blackListId);

	/**
	 * Returns all the black lists.
	 *
	 * @return the black lists
	 */
	public java.util.List<BlackList> findAll();

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
	public java.util.List<BlackList> findAll(int start, int end);

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
	public java.util.List<BlackList> findAll(
		int start, int end, OrderByComparator<BlackList> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<BlackList> findAll(
		int start, int end, OrderByComparator<BlackList> orderByComparator);

	/**
	 * Removes all the black lists from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of black lists.
	 *
	 * @return the number of black lists
	 */
	public int countAll();

}
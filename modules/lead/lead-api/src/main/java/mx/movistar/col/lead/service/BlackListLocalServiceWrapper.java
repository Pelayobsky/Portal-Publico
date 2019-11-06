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

package mx.movistar.col.lead.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BlackListLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BlackListLocalService
 * @generated
 */
@ProviderType
public class BlackListLocalServiceWrapper
	implements BlackListLocalService, ServiceWrapper<BlackListLocalService> {

	public BlackListLocalServiceWrapper(
		BlackListLocalService blackListLocalService) {

		_blackListLocalService = blackListLocalService;
	}

	/**
	 * Adds the black list to the database. Also notifies the appropriate model listeners.
	 *
	 * @param blackList the black list
	 * @return the black list that was added
	 */
	@Override
	public mx.movistar.col.lead.model.BlackList addBlackList(
		mx.movistar.col.lead.model.BlackList blackList) {

		return _blackListLocalService.addBlackList(blackList);
	}

	/**
	 * Creates a new black list with the primary key. Does not add the black list to the database.
	 *
	 * @param blackListId the primary key for the new black list
	 * @return the new black list
	 */
	@Override
	public mx.movistar.col.lead.model.BlackList createBlackList(
		long blackListId) {

		return _blackListLocalService.createBlackList(blackListId);
	}

	/**
	 * Deletes the black list from the database. Also notifies the appropriate model listeners.
	 *
	 * @param blackList the black list
	 * @return the black list that was removed
	 */
	@Override
	public mx.movistar.col.lead.model.BlackList deleteBlackList(
		mx.movistar.col.lead.model.BlackList blackList) {

		return _blackListLocalService.deleteBlackList(blackList);
	}

	/**
	 * Deletes the black list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list that was removed
	 * @throws PortalException if a black list with the primary key could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.BlackList deleteBlackList(
			long blackListId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _blackListLocalService.deleteBlackList(blackListId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _blackListLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _blackListLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _blackListLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.BlackListModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _blackListLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.BlackListModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _blackListLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _blackListLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _blackListLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public mx.movistar.col.lead.model.BlackList fetchBlackList(
		long blackListId) {

		return _blackListLocalService.fetchBlackList(blackListId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _blackListLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the black list with the primary key.
	 *
	 * @param blackListId the primary key of the black list
	 * @return the black list
	 * @throws PortalException if a black list with the primary key could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.BlackList getBlackList(long blackListId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _blackListLocalService.getBlackList(blackListId);
	}

	/**
	 * Returns a range of all the black lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.BlackListModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of black lists
	 * @param end the upper bound of the range of black lists (not inclusive)
	 * @return the range of black lists
	 */
	@Override
	public java.util.List<mx.movistar.col.lead.model.BlackList> getBlackLists(
		int start, int end) {

		return _blackListLocalService.getBlackLists(start, end);
	}

	/**
	 * Returns the number of black lists.
	 *
	 * @return the number of black lists
	 */
	@Override
	public int getBlackListsCount() {
		return _blackListLocalService.getBlackListsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _blackListLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _blackListLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _blackListLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.BlackList> getPhone(
		String number) {

		return _blackListLocalService.getPhone(number);
	}

	/**
	 * Updates the black list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param blackList the black list
	 * @return the black list that was updated
	 */
	@Override
	public mx.movistar.col.lead.model.BlackList updateBlackList(
		mx.movistar.col.lead.model.BlackList blackList) {

		return _blackListLocalService.updateBlackList(blackList);
	}

	@Override
	public BlackListLocalService getWrappedService() {
		return _blackListLocalService;
	}

	@Override
	public void setWrappedService(BlackListLocalService blackListLocalService) {
		_blackListLocalService = blackListLocalService;
	}

	private BlackListLocalService _blackListLocalService;

}
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
 * Provides a wrapper for {@link NirLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NirLocalService
 * @generated
 */
@ProviderType
public class NirLocalServiceWrapper
	implements NirLocalService, ServiceWrapper<NirLocalService> {

	public NirLocalServiceWrapper(NirLocalService nirLocalService) {
		_nirLocalService = nirLocalService;
	}

	/**
	 * Adds the nir to the database. Also notifies the appropriate model listeners.
	 *
	 * @param nir the nir
	 * @return the nir that was added
	 */
	@Override
	public mx.movistar.col.lead.model.Nir addNir(
		mx.movistar.col.lead.model.Nir nir) {

		return _nirLocalService.addNir(nir);
	}

	/**
	 * Creates a new nir with the primary key. Does not add the nir to the database.
	 *
	 * @param nirPK the primary key for the new nir
	 * @return the new nir
	 */
	@Override
	public mx.movistar.col.lead.model.Nir createNir(
		mx.movistar.col.lead.service.persistence.NirPK nirPK) {

		return _nirLocalService.createNir(nirPK);
	}

	/**
	 * Deletes the nir from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nir the nir
	 * @return the nir that was removed
	 */
	@Override
	public mx.movistar.col.lead.model.Nir deleteNir(
		mx.movistar.col.lead.model.Nir nir) {

		return _nirLocalService.deleteNir(nir);
	}

	/**
	 * Deletes the nir with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir that was removed
	 * @throws PortalException if a nir with the primary key could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.Nir deleteNir(
			mx.movistar.col.lead.service.persistence.NirPK nirPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _nirLocalService.deleteNir(nirPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _nirLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _nirLocalService.dynamicQuery();
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

		return _nirLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _nirLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _nirLocalService.dynamicQuery(
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

		return _nirLocalService.dynamicQueryCount(dynamicQuery);
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

		return _nirLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public mx.movistar.col.lead.model.Nir fetchNir(
		mx.movistar.col.lead.service.persistence.NirPK nirPK) {

		return _nirLocalService.fetchNir(nirPK);
	}

	/**
	 * Returns the nir with the primary key.
	 *
	 * @param nirPK the primary key of the nir
	 * @return the nir
	 * @throws PortalException if a nir with the primary key could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.Nir getNir(
			mx.movistar.col.lead.service.persistence.NirPK nirPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _nirLocalService.getNir(nirPK);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.Nir> getNirByNumber(
		String number) {

		return _nirLocalService.getNirByNumber(number);
	}

	/**
	 * Returns a range of all the nirs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.NirModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nirs
	 * @param end the upper bound of the range of nirs (not inclusive)
	 * @return the range of nirs
	 */
	@Override
	public java.util.List<mx.movistar.col.lead.model.Nir> getNirs(
		int start, int end) {

		return _nirLocalService.getNirs(start, end);
	}

	/**
	 * Returns the number of nirs.
	 *
	 * @return the number of nirs
	 */
	@Override
	public int getNirsCount() {
		return _nirLocalService.getNirsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _nirLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _nirLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the nir in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param nir the nir
	 * @return the nir that was updated
	 */
	@Override
	public mx.movistar.col.lead.model.Nir updateNir(
		mx.movistar.col.lead.model.Nir nir) {

		return _nirLocalService.updateNir(nir);
	}

	@Override
	public NirLocalService getWrappedService() {
		return _nirLocalService;
	}

	@Override
	public void setWrappedService(NirLocalService nirLocalService) {
		_nirLocalService = nirLocalService;
	}

	private NirLocalService _nirLocalService;

}
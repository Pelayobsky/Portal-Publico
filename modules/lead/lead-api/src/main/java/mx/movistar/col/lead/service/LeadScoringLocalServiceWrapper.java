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
 * Provides a wrapper for {@link LeadScoringLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeadScoringLocalService
 * @generated
 */
@ProviderType
public class LeadScoringLocalServiceWrapper
	implements LeadScoringLocalService,
			   ServiceWrapper<LeadScoringLocalService> {

	public LeadScoringLocalServiceWrapper(
		LeadScoringLocalService leadScoringLocalService) {

		_leadScoringLocalService = leadScoringLocalService;
	}

	/**
	 * Adds the lead scoring to the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoring the lead scoring
	 * @return the lead scoring that was added
	 */
	@Override
	public mx.movistar.col.lead.model.LeadScoring addLeadScoring(
		mx.movistar.col.lead.model.LeadScoring leadScoring) {

		return _leadScoringLocalService.addLeadScoring(leadScoring);
	}

	/**
	 * Creates a new lead scoring with the primary key. Does not add the lead scoring to the database.
	 *
	 * @param leadScoringId the primary key for the new lead scoring
	 * @return the new lead scoring
	 */
	@Override
	public mx.movistar.col.lead.model.LeadScoring createLeadScoring(
		long leadScoringId) {

		return _leadScoringLocalService.createLeadScoring(leadScoringId);
	}

	/**
	 * Deletes the lead scoring from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoring the lead scoring
	 * @return the lead scoring that was removed
	 */
	@Override
	public mx.movistar.col.lead.model.LeadScoring deleteLeadScoring(
		mx.movistar.col.lead.model.LeadScoring leadScoring) {

		return _leadScoringLocalService.deleteLeadScoring(leadScoring);
	}

	/**
	 * Deletes the lead scoring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring that was removed
	 * @throws PortalException if a lead scoring with the primary key could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.LeadScoring deleteLeadScoring(
			long leadScoringId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadScoringLocalService.deleteLeadScoring(leadScoringId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadScoringLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _leadScoringLocalService.dynamicQuery();
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

		return _leadScoringLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.LeadScoringModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _leadScoringLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.LeadScoringModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _leadScoringLocalService.dynamicQuery(
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

		return _leadScoringLocalService.dynamicQueryCount(dynamicQuery);
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

		return _leadScoringLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public mx.movistar.col.lead.model.LeadScoring fetchLeadScoring(
		long leadScoringId) {

		return _leadScoringLocalService.fetchLeadScoring(leadScoringId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _leadScoringLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _leadScoringLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the lead scoring with the primary key.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring
	 * @throws PortalException if a lead scoring with the primary key could not be found
	 */
	@Override
	public mx.movistar.col.lead.model.LeadScoring getLeadScoring(
			long leadScoringId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadScoringLocalService.getLeadScoring(leadScoringId);
	}

	@Override
	public java.util.List<mx.movistar.col.lead.model.LeadScoring>
		getLeadScoringByPhoneAndIdLead(String phone, long idLead) {

		return _leadScoringLocalService.getLeadScoringByPhoneAndIdLead(
			phone, idLead);
	}

	/**
	 * Returns a range of all the lead scorings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.movistar.col.lead.model.impl.LeadScoringModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lead scorings
	 * @param end the upper bound of the range of lead scorings (not inclusive)
	 * @return the range of lead scorings
	 */
	@Override
	public java.util.List<mx.movistar.col.lead.model.LeadScoring>
		getLeadScorings(int start, int end) {

		return _leadScoringLocalService.getLeadScorings(start, end);
	}

	/**
	 * Returns the number of lead scorings.
	 *
	 * @return the number of lead scorings
	 */
	@Override
	public int getLeadScoringsCount() {
		return _leadScoringLocalService.getLeadScoringsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _leadScoringLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leadScoringLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the lead scoring in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoring the lead scoring
	 * @return the lead scoring that was updated
	 */
	@Override
	public mx.movistar.col.lead.model.LeadScoring updateLeadScoring(
		mx.movistar.col.lead.model.LeadScoring leadScoring) {

		return _leadScoringLocalService.updateLeadScoring(leadScoring);
	}

	@Override
	public LeadScoringLocalService getWrappedService() {
		return _leadScoringLocalService;
	}

	@Override
	public void setWrappedService(
		LeadScoringLocalService leadScoringLocalService) {

		_leadScoringLocalService = leadScoringLocalService;
	}

	private LeadScoringLocalService _leadScoringLocalService;

}
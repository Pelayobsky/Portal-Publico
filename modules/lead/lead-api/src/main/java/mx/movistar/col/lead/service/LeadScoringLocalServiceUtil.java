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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for LeadScoring. This utility wraps
 * <code>mx.movistar.col.lead.service.impl.LeadScoringLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LeadScoringLocalService
 * @generated
 */
@ProviderType
public class LeadScoringLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>mx.movistar.col.lead.service.impl.LeadScoringLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the lead scoring to the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoring the lead scoring
	 * @return the lead scoring that was added
	 */
	public static mx.movistar.col.lead.model.LeadScoring addLeadScoring(
		mx.movistar.col.lead.model.LeadScoring leadScoring) {

		return getService().addLeadScoring(leadScoring);
	}

	/**
	 * Creates a new lead scoring with the primary key. Does not add the lead scoring to the database.
	 *
	 * @param leadScoringId the primary key for the new lead scoring
	 * @return the new lead scoring
	 */
	public static mx.movistar.col.lead.model.LeadScoring createLeadScoring(
		long leadScoringId) {

		return getService().createLeadScoring(leadScoringId);
	}

	/**
	 * Deletes the lead scoring from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoring the lead scoring
	 * @return the lead scoring that was removed
	 */
	public static mx.movistar.col.lead.model.LeadScoring deleteLeadScoring(
		mx.movistar.col.lead.model.LeadScoring leadScoring) {

		return getService().deleteLeadScoring(leadScoring);
	}

	/**
	 * Deletes the lead scoring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring that was removed
	 * @throws PortalException if a lead scoring with the primary key could not be found
	 */
	public static mx.movistar.col.lead.model.LeadScoring deleteLeadScoring(
			long leadScoringId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteLeadScoring(leadScoringId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static mx.movistar.col.lead.model.LeadScoring fetchLeadScoring(
		long leadScoringId) {

		return getService().fetchLeadScoring(leadScoringId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the lead scoring with the primary key.
	 *
	 * @param leadScoringId the primary key of the lead scoring
	 * @return the lead scoring
	 * @throws PortalException if a lead scoring with the primary key could not be found
	 */
	public static mx.movistar.col.lead.model.LeadScoring getLeadScoring(
			long leadScoringId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getLeadScoring(leadScoringId);
	}

	public static java.util.List<mx.movistar.col.lead.model.LeadScoring>
		getLeadScoringByPhoneAndIdLead(String phone, long idLead) {

		return getService().getLeadScoringByPhoneAndIdLead(phone, idLead);
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
	public static java.util.List<mx.movistar.col.lead.model.LeadScoring>
		getLeadScorings(int start, int end) {

		return getService().getLeadScorings(start, end);
	}

	/**
	 * Returns the number of lead scorings.
	 *
	 * @return the number of lead scorings
	 */
	public static int getLeadScoringsCount() {
		return getService().getLeadScoringsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the lead scoring in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param leadScoring the lead scoring
	 * @return the lead scoring that was updated
	 */
	public static mx.movistar.col.lead.model.LeadScoring updateLeadScoring(
		mx.movistar.col.lead.model.LeadScoring leadScoring) {

		return getService().updateLeadScoring(leadScoring);
	}

	public static LeadScoringLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<LeadScoringLocalService, LeadScoringLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LeadScoringLocalService.class);

		ServiceTracker<LeadScoringLocalService, LeadScoringLocalService>
			serviceTracker =
				new ServiceTracker
					<LeadScoringLocalService, LeadScoringLocalService>(
						bundle.getBundleContext(),
						LeadScoringLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
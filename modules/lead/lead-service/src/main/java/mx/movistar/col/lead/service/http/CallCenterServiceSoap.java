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

package mx.movistar.col.lead.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

import mx.movistar.col.lead.service.CallCenterServiceUtil;

/**
 * Provides the SOAP utility for the
 * <code>CallCenterServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>mx.movistar.col.lead.model.CallCenterSoap</code>. If the method in the
 * service utility returns a
 * <code>mx.movistar.col.lead.model.CallCenter</code>, that is translated to a
 * <code>mx.movistar.col.lead.model.CallCenterSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CallCenterServiceHttp
 * @generated
 */
@ProviderType
public class CallCenterServiceSoap {

	public static mx.movistar.col.lead.model.CallCenterSoap deleteCallCenter(
			long CallCenterId)
		throws RemoteException {

		try {
			mx.movistar.col.lead.model.CallCenter returnValue =
				CallCenterServiceUtil.deleteCallCenter(CallCenterId);

			return mx.movistar.col.lead.model.CallCenterSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CallCenterSoap getCallCenter(
			long CallCenterId)
		throws RemoteException {

		try {
			mx.movistar.col.lead.model.CallCenter returnValue =
				CallCenterServiceUtil.getCallCenter(CallCenterId);

			return mx.movistar.col.lead.model.CallCenterSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CallCenterSoap[]
			getCallCentersByGroupIdAndCampaignId(long groupId, long campaignId)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.CallCenter> returnValue =
				CallCenterServiceUtil.getCallCentersByGroupIdAndCampaignId(
					groupId, campaignId);

			return mx.movistar.col.lead.model.CallCenterSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CallCenterSoap[]
			getCallCentersByGroupId(
				long groupId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<mx.movistar.col.lead.model.CallCenter> orderByComparator)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.CallCenter> returnValue =
				CallCenterServiceUtil.getCallCentersByGroupId(
					groupId, start, end, orderByComparator);

			return mx.movistar.col.lead.model.CallCenterSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CallCenterSoap[]
			getCallCentersByGroupId(long groupId)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.CallCenter> returnValue =
				CallCenterServiceUtil.getCallCentersByGroupId(groupId);

			return mx.movistar.col.lead.model.CallCenterSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CallCenterSoap[]
			getCallCentersByKeywords(
				long groupId, String keywords, int start, int end, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<mx.movistar.col.lead.model.CallCenter> orderByComparator)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.CallCenter> returnValue =
				CallCenterServiceUtil.getCallCentersByKeywords(
					groupId, keywords, start, end, status, orderByComparator);

			return mx.movistar.col.lead.model.CallCenterSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static long getCallCentersCountByKeywords(
			long groupId, String keywords, int status)
		throws RemoteException {

		try {
			long returnValue =
				CallCenterServiceUtil.getCallCentersCountByKeywords(
					groupId, keywords, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CallCenterSoap[]
			getCallCenterByGroupId(long groupId)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.CallCenter> returnValue =
				CallCenterServiceUtil.getCallCenterByGroupId(groupId);

			return mx.movistar.col.lead.model.CallCenterSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CallCenterSoap[]
			getCallCenterByGroupId(
				long groupId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<mx.movistar.col.lead.model.CallCenter> orderByComparator)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.CallCenter> returnValue =
				CallCenterServiceUtil.getCallCenterByGroupId(
					groupId, start, end, orderByComparator);

			return mx.movistar.col.lead.model.CallCenterSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CallCenterSoap[]
			getCallCenterByGroupIdAndCampaignId(long groupId, long campaignId)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.CallCenter> returnValue =
				CallCenterServiceUtil.getCallCenterByGroupIdAndCampaignId(
					groupId, campaignId);

			return mx.movistar.col.lead.model.CallCenterSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CallCenterSoap[]
			getCallCenterByKeywords(
				long groupId, String keywords, int start, int end, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<mx.movistar.col.lead.model.CallCenter> orderByComparator)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.CallCenter> returnValue =
				CallCenterServiceUtil.getCallCenterByKeywords(
					groupId, keywords, start, end, status, orderByComparator);

			return mx.movistar.col.lead.model.CallCenterSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static long getCallCenterCountByKeywords(
			long groupId, String keywords, int status)
		throws RemoteException {

		try {
			long returnValue =
				CallCenterServiceUtil.getCallCenterCountByKeywords(
					groupId, keywords, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		CallCenterServiceSoap.class);

}
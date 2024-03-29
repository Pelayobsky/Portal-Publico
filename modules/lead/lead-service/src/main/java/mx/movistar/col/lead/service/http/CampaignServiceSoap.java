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
import com.liferay.portal.kernel.util.LocalizationUtil;

import java.rmi.RemoteException;

import java.util.Locale;
import java.util.Map;

import mx.movistar.col.lead.service.CampaignServiceUtil;

/**
 * Provides the SOAP utility for the
 * <code>CampaignServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>mx.movistar.col.lead.model.CampaignSoap</code>. If the method in the
 * service utility returns a
 * <code>mx.movistar.col.lead.model.Campaign</code>, that is translated to a
 * <code>mx.movistar.col.lead.model.CampaignSoap</code>. Methods that SOAP
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
 * @see CampaignServiceHttp
 * @generated
 */
@ProviderType
public class CampaignServiceSoap {

	public static mx.movistar.col.lead.model.CampaignSoap addCampaign(
			long groupId, String[] titleLanguageIds, String[] titleValues,
			String description, java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			Map<Locale, String> title = LocalizationUtil.getLocalizationMap(
				titleLanguageIds, titleValues);

			mx.movistar.col.lead.model.Campaign returnValue =
				CampaignServiceUtil.addCampaign(
					groupId, title, description, dueDate, serviceContext);

			return mx.movistar.col.lead.model.CampaignSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CampaignSoap deleteCampaign(
			long CampaignId)
		throws RemoteException {

		try {
			mx.movistar.col.lead.model.Campaign returnValue =
				CampaignServiceUtil.deleteCampaign(CampaignId);

			return mx.movistar.col.lead.model.CampaignSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CampaignSoap getCampaign(
			long CampaignId)
		throws RemoteException {

		try {
			mx.movistar.col.lead.model.Campaign returnValue =
				CampaignServiceUtil.getCampaign(CampaignId);

			return mx.movistar.col.lead.model.CampaignSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CampaignSoap[]
			getCampaignsByGroupId(
				long groupId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<mx.movistar.col.lead.model.Campaign> orderByComparator)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.Campaign> returnValue =
				CampaignServiceUtil.getCampaignsByGroupId(
					groupId, start, end, orderByComparator);

			return mx.movistar.col.lead.model.CampaignSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CampaignSoap[]
			getCampaignsByGroupId(long groupId)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.Campaign> returnValue =
				CampaignServiceUtil.getCampaignsByGroupId(groupId);

			return mx.movistar.col.lead.model.CampaignSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CampaignSoap[]
			getCampaignsByKeywords(
				long groupId, String keywords, int start, int end, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<mx.movistar.col.lead.model.Campaign> orderByComparator)
		throws RemoteException {

		try {
			java.util.List<mx.movistar.col.lead.model.Campaign> returnValue =
				CampaignServiceUtil.getCampaignsByKeywords(
					groupId, keywords, start, end, status, orderByComparator);

			return mx.movistar.col.lead.model.CampaignSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static long getCampaignsCountByKeywords(
			long groupId, String keywords, int status)
		throws RemoteException {

		try {
			long returnValue = CampaignServiceUtil.getCampaignsCountByKeywords(
				groupId, keywords, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mx.movistar.col.lead.model.CampaignSoap updateCampaign(
			long campaignId, String[] titleMapLanguageIds,
			String[] titleMapValues, String description, java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(
				titleMapLanguageIds, titleMapValues);

			mx.movistar.col.lead.model.Campaign returnValue =
				CampaignServiceUtil.updateCampaign(
					campaignId, titleMap, description, dueDate, serviceContext);

			return mx.movistar.col.lead.model.CampaignSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CampaignServiceSoap.class);

}
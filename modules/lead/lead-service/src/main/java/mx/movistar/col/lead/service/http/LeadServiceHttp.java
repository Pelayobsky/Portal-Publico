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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import mx.movistar.col.lead.service.LeadServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>LeadServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeadServiceSoap
 * @generated
 */
@ProviderType
public class LeadServiceHttp {

	public static mx.movistar.col.lead.model.Lead addLead(
			HttpPrincipal httpPrincipal, long groupId,
			java.util.Map<java.util.Locale, String> title, String description,
			java.util.Map<String, String> parameters, java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				LeadServiceUtil.class, "addLead", _addLeadParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, title, description, parameters, dueDate,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (mx.movistar.col.lead.model.Lead)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static mx.movistar.col.lead.model.Lead deleteLead(
			HttpPrincipal httpPrincipal, long LeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				LeadServiceUtil.class, "deleteLead",
				_deleteLeadParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, LeadId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (mx.movistar.col.lead.model.Lead)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static mx.movistar.col.lead.model.Lead getLead(
			HttpPrincipal httpPrincipal, long LeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				LeadServiceUtil.class, "getLead", _getLeadParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, LeadId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (mx.movistar.col.lead.model.Lead)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByGroupIdAndCampaignId(
			HttpPrincipal httpPrincipal, long groupId, long campaignId) {

		try {
			MethodKey methodKey = new MethodKey(
				LeadServiceUtil.class, "getLeadsByGroupIdAndCampaignId",
				_getLeadsByGroupIdAndCampaignIdParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, campaignId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<mx.movistar.col.lead.model.Lead>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByGroupId(
			HttpPrincipal httpPrincipal, long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Lead> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				LeadServiceUtil.class, "getLeadsByGroupId",
				_getLeadsByGroupIdParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<mx.movistar.col.lead.model.Lead>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByGroupId(HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				LeadServiceUtil.class, "getLeadsByGroupId",
				_getLeadsByGroupIdParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<mx.movistar.col.lead.model.Lead>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.Lead>
		getLeadsByKeywords(
			HttpPrincipal httpPrincipal, long groupId, String keywords,
			int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.Lead> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				LeadServiceUtil.class, "getLeadsByKeywords",
				_getLeadsByKeywordsParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, keywords, start, end, status,
				orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<mx.movistar.col.lead.model.Lead>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long getLeadsCountByKeywords(
		HttpPrincipal httpPrincipal, long groupId, String keywords,
		int status) {

		try {
			MethodKey methodKey = new MethodKey(
				LeadServiceUtil.class, "getLeadsCountByKeywords",
				_getLeadsCountByKeywordsParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, keywords, status);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static mx.movistar.col.lead.model.Lead updateLead(
			HttpPrincipal httpPrincipal, long LeadId,
			java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				LeadServiceUtil.class, "updateLead",
				_updateLeadParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, LeadId, titleMap, description, dueDate, parameters,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (mx.movistar.col.lead.model.Lead)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LeadServiceHttp.class);

	private static final Class<?>[] _addLeadParameterTypes0 = new Class[] {
		long.class, java.util.Map.class, String.class, java.util.Map.class,
		java.util.Date.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _deleteLeadParameterTypes1 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getLeadParameterTypes2 = new Class[] {
		long.class
	};
	private static final Class<?>[]
		_getLeadsByGroupIdAndCampaignIdParameterTypes3 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _getLeadsByGroupIdParameterTypes4 =
		new Class[] {
			long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getLeadsByGroupIdParameterTypes5 =
		new Class[] {long.class};
	private static final Class<?>[] _getLeadsByKeywordsParameterTypes6 =
		new Class[] {
			long.class, String.class, int.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getLeadsCountByKeywordsParameterTypes7 =
		new Class[] {long.class, String.class, int.class};
	private static final Class<?>[] _updateLeadParameterTypes8 = new Class[] {
		long.class, java.util.Map.class, String.class, java.util.Date.class,
		java.util.Map.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};

}
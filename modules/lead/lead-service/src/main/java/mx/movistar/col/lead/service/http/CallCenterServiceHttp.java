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

import mx.movistar.col.lead.service.CallCenterServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>CallCenterServiceUtil</code> service
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
 * @see CallCenterServiceSoap
 * @generated
 */
@ProviderType
public class CallCenterServiceHttp {

	public static mx.movistar.col.lead.model.CallCenter addCallCenter(
			HttpPrincipal httpPrincipal, long groupId,
			java.util.Map<java.util.Locale, String> title, String description,
			java.util.Map<String, String> parameters, java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "addCallCenter",
				_addCallCenterParameterTypes0);

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

			return (mx.movistar.col.lead.model.CallCenter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static mx.movistar.col.lead.model.CallCenter deleteCallCenter(
			HttpPrincipal httpPrincipal, long CallCenterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "deleteCallCenter",
				_deleteCallCenterParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, CallCenterId);

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

			return (mx.movistar.col.lead.model.CallCenter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static mx.movistar.col.lead.model.CallCenter getCallCenter(
			HttpPrincipal httpPrincipal, long CallCenterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "getCallCenter",
				_getCallCenterParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, CallCenterId);

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

			return (mx.movistar.col.lead.model.CallCenter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByGroupIdAndCampaignId(
			HttpPrincipal httpPrincipal, long groupId, long campaignId) {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class,
				"getCallCentersByGroupIdAndCampaignId",
				_getCallCentersByGroupIdAndCampaignIdParameterTypes3);

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

			return (java.util.List<mx.movistar.col.lead.model.CallCenter>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByGroupId(
			HttpPrincipal httpPrincipal, long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "getCallCentersByGroupId",
				_getCallCentersByGroupIdParameterTypes4);

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

			return (java.util.List<mx.movistar.col.lead.model.CallCenter>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByGroupId(HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "getCallCentersByGroupId",
				_getCallCentersByGroupIdParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<mx.movistar.col.lead.model.CallCenter>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCentersByKeywords(
			HttpPrincipal httpPrincipal, long groupId, String keywords,
			int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "getCallCentersByKeywords",
				_getCallCentersByKeywordsParameterTypes6);

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

			return (java.util.List<mx.movistar.col.lead.model.CallCenter>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long getCallCentersCountByKeywords(
		HttpPrincipal httpPrincipal, long groupId, String keywords,
		int status) {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "getCallCentersCountByKeywords",
				_getCallCentersCountByKeywordsParameterTypes7);

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

	public static mx.movistar.col.lead.model.CallCenter updateCallCenter(
			HttpPrincipal httpPrincipal, long CallCenterId,
			java.util.Map<java.util.Locale, String> titleMap,
			String description, java.util.Date dueDate,
			java.util.Map<String, String> parameters,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "updateCallCenter",
				_updateCallCenterParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, CallCenterId, titleMap, description, dueDate,
				parameters, serviceContext);

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

			return (mx.movistar.col.lead.model.CallCenter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "getCallCenterByGroupId",
				_getCallCenterByGroupIdParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<mx.movistar.col.lead.model.CallCenter>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupId(
			HttpPrincipal httpPrincipal, long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "getCallCenterByGroupId",
				_getCallCenterByGroupIdParameterTypes10);

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

			return (java.util.List<mx.movistar.col.lead.model.CallCenter>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByGroupIdAndCampaignId(
			HttpPrincipal httpPrincipal, long groupId, long campaignId) {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class,
				"getCallCenterByGroupIdAndCampaignId",
				_getCallCenterByGroupIdAndCampaignIdParameterTypes11);

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

			return (java.util.List<mx.movistar.col.lead.model.CallCenter>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<mx.movistar.col.lead.model.CallCenter>
		getCallCenterByKeywords(
			HttpPrincipal httpPrincipal, long groupId, String keywords,
			int start, int end, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.movistar.col.lead.model.CallCenter> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "getCallCenterByKeywords",
				_getCallCenterByKeywordsParameterTypes12);

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

			return (java.util.List<mx.movistar.col.lead.model.CallCenter>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long getCallCenterCountByKeywords(
		HttpPrincipal httpPrincipal, long groupId, String keywords,
		int status) {

		try {
			MethodKey methodKey = new MethodKey(
				CallCenterServiceUtil.class, "getCallCenterCountByKeywords",
				_getCallCenterCountByKeywordsParameterTypes13);

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

	private static Log _log = LogFactoryUtil.getLog(
		CallCenterServiceHttp.class);

	private static final Class<?>[] _addCallCenterParameterTypes0 =
		new Class[] {
			long.class, java.util.Map.class, String.class, java.util.Map.class,
			java.util.Date.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteCallCenterParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _getCallCenterParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[]
		_getCallCentersByGroupIdAndCampaignIdParameterTypes3 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _getCallCentersByGroupIdParameterTypes4 =
		new Class[] {
			long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getCallCentersByGroupIdParameterTypes5 =
		new Class[] {long.class};
	private static final Class<?>[] _getCallCentersByKeywordsParameterTypes6 =
		new Class[] {
			long.class, String.class, int.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[]
		_getCallCentersCountByKeywordsParameterTypes7 = new Class[] {
			long.class, String.class, int.class
		};
	private static final Class<?>[] _updateCallCenterParameterTypes8 =
		new Class[] {
			long.class, java.util.Map.class, String.class, java.util.Date.class,
			java.util.Map.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _getCallCenterByGroupIdParameterTypes9 =
		new Class[] {long.class};
	private static final Class<?>[] _getCallCenterByGroupIdParameterTypes10 =
		new Class[] {
			long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[]
		_getCallCenterByGroupIdAndCampaignIdParameterTypes11 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _getCallCenterByKeywordsParameterTypes12 =
		new Class[] {
			long.class, String.class, int.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[]
		_getCallCenterCountByKeywordsParameterTypes13 = new Class[] {
			long.class, String.class, int.class
		};

}
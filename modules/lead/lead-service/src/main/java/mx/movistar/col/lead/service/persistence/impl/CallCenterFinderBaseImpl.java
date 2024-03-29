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

package mx.movistar.col.lead.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import mx.movistar.col.lead.model.CallCenter;
import mx.movistar.col.lead.service.persistence.CallCenterPersistence;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CallCenterFinderBaseImpl extends BasePersistenceImpl<CallCenter> {

	public CallCenterFinderBaseImpl() {
		setModelClass(CallCenter.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("type", "type_");

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
				"_dbColumnNames");

			field.setAccessible(true);

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getCallCenterPersistence().getBadColumnNames();
	}

	/**
	 * Returns the call center persistence.
	 *
	 * @return the call center persistence
	 */
	public CallCenterPersistence getCallCenterPersistence() {
		return callCenterPersistence;
	}

	/**
	 * Sets the call center persistence.
	 *
	 * @param callCenterPersistence the call center persistence
	 */
	public void setCallCenterPersistence(
		CallCenterPersistence callCenterPersistence) {

		this.callCenterPersistence = callCenterPersistence;
	}

	@BeanReference(type = CallCenterPersistence.class)
	protected CallCenterPersistence callCenterPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		CallCenterFinderBaseImpl.class);

}
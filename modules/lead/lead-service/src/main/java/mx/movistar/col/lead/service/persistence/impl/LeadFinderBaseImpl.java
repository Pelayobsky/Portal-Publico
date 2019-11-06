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

import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.service.persistence.LeadPersistence;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LeadFinderBaseImpl extends BasePersistenceImpl<Lead> {

	public LeadFinderBaseImpl() {
		setModelClass(Lead.class);

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
		return getLeadPersistence().getBadColumnNames();
	}

	/**
	 * Returns the lead persistence.
	 *
	 * @return the lead persistence
	 */
	public LeadPersistence getLeadPersistence() {
		return leadPersistence;
	}

	/**
	 * Sets the lead persistence.
	 *
	 * @param leadPersistence the lead persistence
	 */
	public void setLeadPersistence(LeadPersistence leadPersistence) {
		this.leadPersistence = leadPersistence;
	}

	@BeanReference(type = LeadPersistence.class)
	protected LeadPersistence leadPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		LeadFinderBaseImpl.class);

}
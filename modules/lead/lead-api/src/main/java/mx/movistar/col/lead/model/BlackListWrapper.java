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

package mx.movistar.col.lead.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link BlackList}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BlackList
 * @generated
 */
@ProviderType
public class BlackListWrapper implements BlackList, ModelWrapper<BlackList> {

	public BlackListWrapper(BlackList blackList) {
		_blackList = blackList;
	}

	@Override
	public Class<?> getModelClass() {
		return BlackList.class;
	}

	@Override
	public String getModelClassName() {
		return BlackList.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("blackListId", getBlackListId());
		attributes.put("numero", getNumero());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long blackListId = (Long)attributes.get("blackListId");

		if (blackListId != null) {
			setBlackListId(blackListId);
		}

		String numero = (String)attributes.get("numero");

		if (numero != null) {
			setNumero(numero);
		}
	}

	@Override
	public Object clone() {
		return new BlackListWrapper((BlackList)_blackList.clone());
	}

	@Override
	public int compareTo(mx.movistar.col.lead.model.BlackList blackList) {
		return _blackList.compareTo(blackList);
	}

	/**
	 * Returns the black list ID of this black list.
	 *
	 * @return the black list ID of this black list
	 */
	@Override
	public long getBlackListId() {
		return _blackList.getBlackListId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _blackList.getExpandoBridge();
	}

	/**
	 * Returns the numero of this black list.
	 *
	 * @return the numero of this black list
	 */
	@Override
	public String getNumero() {
		return _blackList.getNumero();
	}

	/**
	 * Returns the primary key of this black list.
	 *
	 * @return the primary key of this black list
	 */
	@Override
	public long getPrimaryKey() {
		return _blackList.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _blackList.getPrimaryKeyObj();
	}

	@Override
	public int hashCode() {
		return _blackList.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _blackList.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _blackList.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _blackList.isNew();
	}

	@Override
	public void persist() {
		_blackList.persist();
	}

	/**
	 * Sets the black list ID of this black list.
	 *
	 * @param blackListId the black list ID of this black list
	 */
	@Override
	public void setBlackListId(long blackListId) {
		_blackList.setBlackListId(blackListId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_blackList.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_blackList.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_blackList.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_blackList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_blackList.setNew(n);
	}

	/**
	 * Sets the numero of this black list.
	 *
	 * @param numero the numero of this black list
	 */
	@Override
	public void setNumero(String numero) {
		_blackList.setNumero(numero);
	}

	/**
	 * Sets the primary key of this black list.
	 *
	 * @param primaryKey the primary key of this black list
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_blackList.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_blackList.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<mx.movistar.col.lead.model.BlackList> toCacheModel() {

		return _blackList.toCacheModel();
	}

	@Override
	public mx.movistar.col.lead.model.BlackList toEscapedModel() {
		return new BlackListWrapper(_blackList.toEscapedModel());
	}

	@Override
	public String toString() {
		return _blackList.toString();
	}

	@Override
	public mx.movistar.col.lead.model.BlackList toUnescapedModel() {
		return new BlackListWrapper(_blackList.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _blackList.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BlackListWrapper)) {
			return false;
		}

		BlackListWrapper blackListWrapper = (BlackListWrapper)obj;

		if (Objects.equals(_blackList, blackListWrapper._blackList)) {
			return true;
		}

		return false;
	}

	@Override
	public BlackList getWrappedModel() {
		return _blackList;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _blackList.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _blackList.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_blackList.resetOriginalValues();
	}

	private final BlackList _blackList;

}
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
 * This class is a wrapper for {@link Nir}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Nir
 * @generated
 */
@ProviderType
public class NirWrapper implements Nir, ModelWrapper<Nir> {

	public NirWrapper(Nir nir) {
		_nir = nir;
	}

	@Override
	public Class<?> getModelClass() {
		return Nir.class;
	}

	@Override
	public String getModelClassName() {
		return Nir.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lada", getLada());
		attributes.put("serie", getSerie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String lada = (String)attributes.get("lada");

		if (lada != null) {
			setLada(lada);
		}

		String serie = (String)attributes.get("serie");

		if (serie != null) {
			setSerie(serie);
		}
	}

	@Override
	public Object clone() {
		return new NirWrapper((Nir)_nir.clone());
	}

	@Override
	public int compareTo(mx.movistar.col.lead.model.Nir nir) {
		return _nir.compareTo(nir);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _nir.getExpandoBridge();
	}

	/**
	 * Returns the lada of this nir.
	 *
	 * @return the lada of this nir
	 */
	@Override
	public String getLada() {
		return _nir.getLada();
	}

	/**
	 * Returns the primary key of this nir.
	 *
	 * @return the primary key of this nir
	 */
	@Override
	public mx.movistar.col.lead.service.persistence.NirPK getPrimaryKey() {
		return _nir.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _nir.getPrimaryKeyObj();
	}

	/**
	 * Returns the serie of this nir.
	 *
	 * @return the serie of this nir
	 */
	@Override
	public String getSerie() {
		return _nir.getSerie();
	}

	@Override
	public int hashCode() {
		return _nir.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _nir.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _nir.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _nir.isNew();
	}

	@Override
	public void persist() {
		_nir.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nir.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_nir.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_nir.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_nir.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the lada of this nir.
	 *
	 * @param lada the lada of this nir
	 */
	@Override
	public void setLada(String lada) {
		_nir.setLada(lada);
	}

	@Override
	public void setNew(boolean n) {
		_nir.setNew(n);
	}

	/**
	 * Sets the primary key of this nir.
	 *
	 * @param primaryKey the primary key of this nir
	 */
	@Override
	public void setPrimaryKey(
		mx.movistar.col.lead.service.persistence.NirPK primaryKey) {

		_nir.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_nir.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the serie of this nir.
	 *
	 * @param serie the serie of this nir
	 */
	@Override
	public void setSerie(String serie) {
		_nir.setSerie(serie);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<mx.movistar.col.lead.model.Nir> toCacheModel() {

		return _nir.toCacheModel();
	}

	@Override
	public mx.movistar.col.lead.model.Nir toEscapedModel() {
		return new NirWrapper(_nir.toEscapedModel());
	}

	@Override
	public String toString() {
		return _nir.toString();
	}

	@Override
	public mx.movistar.col.lead.model.Nir toUnescapedModel() {
		return new NirWrapper(_nir.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _nir.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NirWrapper)) {
			return false;
		}

		NirWrapper nirWrapper = (NirWrapper)obj;

		if (Objects.equals(_nir, nirWrapper._nir)) {
			return true;
		}

		return false;
	}

	@Override
	public Nir getWrappedModel() {
		return _nir;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _nir.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _nir.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_nir.resetOriginalValues();
	}

	private final Nir _nir;

}
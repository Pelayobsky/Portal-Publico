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

package mx.movistar.col.lead.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import mx.movistar.col.lead.model.Nir;
import mx.movistar.col.lead.service.persistence.NirPK;

/**
 * The cache model class for representing Nir in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class NirCacheModel implements CacheModel<Nir>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NirCacheModel)) {
			return false;
		}

		NirCacheModel nirCacheModel = (NirCacheModel)obj;

		if (nirPK.equals(nirCacheModel.nirPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, nirPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{lada=");
		sb.append(lada);
		sb.append(", serie=");
		sb.append(serie);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Nir toEntityModel() {
		NirImpl nirImpl = new NirImpl();

		if (lada == null) {
			nirImpl.setLada("");
		}
		else {
			nirImpl.setLada(lada);
		}

		if (serie == null) {
			nirImpl.setSerie("");
		}
		else {
			nirImpl.setSerie(serie);
		}

		nirImpl.resetOriginalValues();

		return nirImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		lada = objectInput.readUTF();
		serie = objectInput.readUTF();

		nirPK = new NirPK(lada, serie);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (lada == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lada);
		}

		if (serie == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serie);
		}
	}

	public String lada;
	public String serie;
	public transient NirPK nirPK;

}
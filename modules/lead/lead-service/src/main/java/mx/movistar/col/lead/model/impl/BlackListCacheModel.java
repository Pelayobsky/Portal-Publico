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

import mx.movistar.col.lead.model.BlackList;

/**
 * The cache model class for representing BlackList in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class BlackListCacheModel
	implements CacheModel<BlackList>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BlackListCacheModel)) {
			return false;
		}

		BlackListCacheModel blackListCacheModel = (BlackListCacheModel)obj;

		if (blackListId == blackListCacheModel.blackListId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, blackListId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{blackListId=");
		sb.append(blackListId);
		sb.append(", numero=");
		sb.append(numero);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BlackList toEntityModel() {
		BlackListImpl blackListImpl = new BlackListImpl();

		blackListImpl.setBlackListId(blackListId);

		if (numero == null) {
			blackListImpl.setNumero("");
		}
		else {
			blackListImpl.setNumero(numero);
		}

		blackListImpl.resetOriginalValues();

		return blackListImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		blackListId = objectInput.readLong();
		numero = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(blackListId);

		if (numero == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numero);
		}
	}

	public long blackListId;
	public String numero;

}
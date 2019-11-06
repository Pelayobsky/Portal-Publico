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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link mx.movistar.col.lead.service.http.BlackListServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class BlackListSoap implements Serializable {

	public static BlackListSoap toSoapModel(BlackList model) {
		BlackListSoap soapModel = new BlackListSoap();

		soapModel.setBlackListId(model.getBlackListId());
		soapModel.setNumero(model.getNumero());

		return soapModel;
	}

	public static BlackListSoap[] toSoapModels(BlackList[] models) {
		BlackListSoap[] soapModels = new BlackListSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BlackListSoap[][] toSoapModels(BlackList[][] models) {
		BlackListSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BlackListSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BlackListSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BlackListSoap[] toSoapModels(List<BlackList> models) {
		List<BlackListSoap> soapModels = new ArrayList<BlackListSoap>(
			models.size());

		for (BlackList model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BlackListSoap[soapModels.size()]);
	}

	public BlackListSoap() {
	}

	public long getPrimaryKey() {
		return _blackListId;
	}

	public void setPrimaryKey(long pk) {
		setBlackListId(pk);
	}

	public long getBlackListId() {
		return _blackListId;
	}

	public void setBlackListId(long blackListId) {
		_blackListId = blackListId;
	}

	public String getNumero() {
		return _numero;
	}

	public void setNumero(String numero) {
		_numero = numero;
	}

	private long _blackListId;
	private String _numero;

}
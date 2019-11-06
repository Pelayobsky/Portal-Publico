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

import mx.movistar.col.lead.service.persistence.NirPK;

/**
 * This class is used by SOAP remote services, specifically {@link mx.movistar.col.lead.service.http.NirServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class NirSoap implements Serializable {

	public static NirSoap toSoapModel(Nir model) {
		NirSoap soapModel = new NirSoap();

		soapModel.setLada(model.getLada());
		soapModel.setSerie(model.getSerie());

		return soapModel;
	}

	public static NirSoap[] toSoapModels(Nir[] models) {
		NirSoap[] soapModels = new NirSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NirSoap[][] toSoapModels(Nir[][] models) {
		NirSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NirSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NirSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NirSoap[] toSoapModels(List<Nir> models) {
		List<NirSoap> soapModels = new ArrayList<NirSoap>(models.size());

		for (Nir model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NirSoap[soapModels.size()]);
	}

	public NirSoap() {
	}

	public NirPK getPrimaryKey() {
		return new NirPK(_lada, _serie);
	}

	public void setPrimaryKey(NirPK pk) {
		setLada(pk.lada);
		setSerie(pk.serie);
	}

	public String getLada() {
		return _lada;
	}

	public void setLada(String lada) {
		_lada = lada;
	}

	public String getSerie() {
		return _serie;
	}

	public void setSerie(String serie) {
		_serie = serie;
	}

	private String _lada;
	private String _serie;

}
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

package mx.movistar.col.lead.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class NirPK implements Comparable<NirPK>, Serializable {

	public String lada;
	public String serie;

	public NirPK() {
	}

	public NirPK(String lada, String serie) {
		this.lada = lada;
		this.serie = serie;
	}

	public String getLada() {
		return lada;
	}

	public void setLada(String lada) {
		this.lada = lada;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Override
	public int compareTo(NirPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = lada.compareTo(pk.lada);

		if (value != 0) {
			return value;
		}

		value = serie.compareTo(pk.serie);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NirPK)) {
			return false;
		}

		NirPK pk = (NirPK)obj;

		if (lada.equals(pk.lada) && serie.equals(pk.serie)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, lada);
		hashCode = HashUtil.hash(hashCode, serie);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("lada=");

		sb.append(lada);
		sb.append(", serie=");

		sb.append(serie);

		sb.append("}");

		return sb.toString();
	}

}
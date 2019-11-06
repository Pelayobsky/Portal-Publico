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

import java.util.Date;

import mx.movistar.col.lead.model.LeadScoring;

/**
 * The cache model class for representing LeadScoring in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class LeadScoringCacheModel
	implements CacheModel<LeadScoring>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeadScoringCacheModel)) {
			return false;
		}

		LeadScoringCacheModel leadScoringCacheModel =
			(LeadScoringCacheModel)obj;

		if (leadScoringId == leadScoringCacheModel.leadScoringId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, leadScoringId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{leadScoringId=");
		sb.append(leadScoringId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", leadId=");
		sb.append(leadId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", msisdn=");
		sb.append(msisdn);
		sb.append(", email=");
		sb.append(email);
		sb.append(", name=");
		sb.append(name);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", extra1=");
		sb.append(extra1);
		sb.append(", extra2=");
		sb.append(extra2);
		sb.append(", extra3=");
		sb.append(extra3);
		sb.append(", dateSchedule=");
		sb.append(dateSchedule);
		sb.append(", url=");
		sb.append(url);
		sb.append(", utmSource=");
		sb.append(utmSource);
		sb.append(", utmMedium=");
		sb.append(utmMedium);
		sb.append(", utmContent=");
		sb.append(utmContent);
		sb.append(", utmCampaign=");
		sb.append(utmCampaign);
		sb.append(", utmTerm=");
		sb.append(utmTerm);
		sb.append(", otherSource=");
		sb.append(otherSource);
		sb.append(", responseWS=");
		sb.append(responseWS);
		sb.append(", idCCWS=");
		sb.append(idCCWS);
		sb.append(", reTryDate=");
		sb.append(reTryDate);
		sb.append(", ipCliente=");
		sb.append(ipCliente);
		sb.append(", origen=");
		sb.append(origen);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LeadScoring toEntityModel() {
		LeadScoringImpl leadScoringImpl = new LeadScoringImpl();

		leadScoringImpl.setLeadScoringId(leadScoringId);
		leadScoringImpl.setGroupId(groupId);
		leadScoringImpl.setLeadId(leadId);

		if (createDate == Long.MIN_VALUE) {
			leadScoringImpl.setCreateDate(null);
		}
		else {
			leadScoringImpl.setCreateDate(new Date(createDate));
		}

		if (msisdn == null) {
			leadScoringImpl.setMsisdn("");
		}
		else {
			leadScoringImpl.setMsisdn(msisdn);
		}

		if (email == null) {
			leadScoringImpl.setEmail("");
		}
		else {
			leadScoringImpl.setEmail(email);
		}

		if (name == null) {
			leadScoringImpl.setName("");
		}
		else {
			leadScoringImpl.setName(name);
		}

		if (surname == null) {
			leadScoringImpl.setSurname("");
		}
		else {
			leadScoringImpl.setSurname(surname);
		}

		if (extra1 == null) {
			leadScoringImpl.setExtra1("");
		}
		else {
			leadScoringImpl.setExtra1(extra1);
		}

		if (extra2 == null) {
			leadScoringImpl.setExtra2("");
		}
		else {
			leadScoringImpl.setExtra2(extra2);
		}

		if (extra3 == null) {
			leadScoringImpl.setExtra3("");
		}
		else {
			leadScoringImpl.setExtra3(extra3);
		}

		if (dateSchedule == Long.MIN_VALUE) {
			leadScoringImpl.setDateSchedule(null);
		}
		else {
			leadScoringImpl.setDateSchedule(new Date(dateSchedule));
		}

		if (url == null) {
			leadScoringImpl.setUrl("");
		}
		else {
			leadScoringImpl.setUrl(url);
		}

		if (utmSource == null) {
			leadScoringImpl.setUtmSource("");
		}
		else {
			leadScoringImpl.setUtmSource(utmSource);
		}

		if (utmMedium == null) {
			leadScoringImpl.setUtmMedium("");
		}
		else {
			leadScoringImpl.setUtmMedium(utmMedium);
		}

		if (utmContent == null) {
			leadScoringImpl.setUtmContent("");
		}
		else {
			leadScoringImpl.setUtmContent(utmContent);
		}

		if (utmCampaign == null) {
			leadScoringImpl.setUtmCampaign("");
		}
		else {
			leadScoringImpl.setUtmCampaign(utmCampaign);
		}

		if (utmTerm == null) {
			leadScoringImpl.setUtmTerm("");
		}
		else {
			leadScoringImpl.setUtmTerm(utmTerm);
		}

		if (otherSource == null) {
			leadScoringImpl.setOtherSource("");
		}
		else {
			leadScoringImpl.setOtherSource(otherSource);
		}

		if (responseWS == null) {
			leadScoringImpl.setResponseWS("");
		}
		else {
			leadScoringImpl.setResponseWS(responseWS);
		}

		if (idCCWS == null) {
			leadScoringImpl.setIdCCWS("");
		}
		else {
			leadScoringImpl.setIdCCWS(idCCWS);
		}

		if (reTryDate == Long.MIN_VALUE) {
			leadScoringImpl.setReTryDate(null);
		}
		else {
			leadScoringImpl.setReTryDate(new Date(reTryDate));
		}

		if (ipCliente == null) {
			leadScoringImpl.setIpCliente("");
		}
		else {
			leadScoringImpl.setIpCliente(ipCliente);
		}

		if (origen == null) {
			leadScoringImpl.setOrigen("");
		}
		else {
			leadScoringImpl.setOrigen(origen);
		}

		leadScoringImpl.resetOriginalValues();

		return leadScoringImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		leadScoringId = objectInput.readLong();

		groupId = objectInput.readLong();

		leadId = objectInput.readLong();
		createDate = objectInput.readLong();
		msisdn = objectInput.readUTF();
		email = objectInput.readUTF();
		name = objectInput.readUTF();
		surname = objectInput.readUTF();
		extra1 = objectInput.readUTF();
		extra2 = objectInput.readUTF();
		extra3 = objectInput.readUTF();
		dateSchedule = objectInput.readLong();
		url = objectInput.readUTF();
		utmSource = objectInput.readUTF();
		utmMedium = objectInput.readUTF();
		utmContent = objectInput.readUTF();
		utmCampaign = objectInput.readUTF();
		utmTerm = objectInput.readUTF();
		otherSource = objectInput.readUTF();
		responseWS = objectInput.readUTF();
		idCCWS = objectInput.readUTF();
		reTryDate = objectInput.readLong();
		ipCliente = objectInput.readUTF();
		origen = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(leadScoringId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(leadId);
		objectOutput.writeLong(createDate);

		if (msisdn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(msisdn);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (surname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surname);
		}

		if (extra1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(extra1);
		}

		if (extra2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(extra2);
		}

		if (extra3 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(extra3);
		}

		objectOutput.writeLong(dateSchedule);

		if (url == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (utmSource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(utmSource);
		}

		if (utmMedium == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(utmMedium);
		}

		if (utmContent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(utmContent);
		}

		if (utmCampaign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(utmCampaign);
		}

		if (utmTerm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(utmTerm);
		}

		if (otherSource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherSource);
		}

		if (responseWS == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(responseWS);
		}

		if (idCCWS == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(idCCWS);
		}

		objectOutput.writeLong(reTryDate);

		if (ipCliente == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ipCliente);
		}

		if (origen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(origen);
		}
	}

	public long leadScoringId;
	public long groupId;
	public long leadId;
	public long createDate;
	public String msisdn;
	public String email;
	public String name;
	public String surname;
	public String extra1;
	public String extra2;
	public String extra3;
	public long dateSchedule;
	public String url;
	public String utmSource;
	public String utmMedium;
	public String utmContent;
	public String utmCampaign;
	public String utmTerm;
	public String otherSource;
	public String responseWS;
	public String idCCWS;
	public long reTryDate;
	public String ipCliente;
	public String origen;

}
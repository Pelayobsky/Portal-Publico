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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class LeadScoringSoap implements Serializable {

	public static LeadScoringSoap toSoapModel(LeadScoring model) {
		LeadScoringSoap soapModel = new LeadScoringSoap();

		soapModel.setLeadScoringId(model.getLeadScoringId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setLeadId(model.getLeadId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setMsisdn(model.getMsisdn());
		soapModel.setEmail(model.getEmail());
		soapModel.setName(model.getName());
		soapModel.setSurname(model.getSurname());
		soapModel.setExtra1(model.getExtra1());
		soapModel.setExtra2(model.getExtra2());
		soapModel.setExtra3(model.getExtra3());
		soapModel.setDateSchedule(model.getDateSchedule());
		soapModel.setUrl(model.getUrl());
		soapModel.setUtmSource(model.getUtmSource());
		soapModel.setUtmMedium(model.getUtmMedium());
		soapModel.setUtmContent(model.getUtmContent());
		soapModel.setUtmCampaign(model.getUtmCampaign());
		soapModel.setUtmTerm(model.getUtmTerm());
		soapModel.setOtherSource(model.getOtherSource());
		soapModel.setResponseWS(model.getResponseWS());
		soapModel.setIdCCWS(model.getIdCCWS());
		soapModel.setReTryDate(model.getReTryDate());
		soapModel.setIpCliente(model.getIpCliente());
		soapModel.setOrigen(model.getOrigen());

		return soapModel;
	}

	public static LeadScoringSoap[] toSoapModels(LeadScoring[] models) {
		LeadScoringSoap[] soapModels = new LeadScoringSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LeadScoringSoap[][] toSoapModels(LeadScoring[][] models) {
		LeadScoringSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LeadScoringSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LeadScoringSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LeadScoringSoap[] toSoapModels(List<LeadScoring> models) {
		List<LeadScoringSoap> soapModels = new ArrayList<LeadScoringSoap>(
			models.size());

		for (LeadScoring model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LeadScoringSoap[soapModels.size()]);
	}

	public LeadScoringSoap() {
	}

	public long getPrimaryKey() {
		return _leadScoringId;
	}

	public void setPrimaryKey(long pk) {
		setLeadScoringId(pk);
	}

	public long getLeadScoringId() {
		return _leadScoringId;
	}

	public void setLeadScoringId(long leadScoringId) {
		_leadScoringId = leadScoringId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getLeadId() {
		return _leadId;
	}

	public void setLeadId(long leadId) {
		_leadId = leadId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getMsisdn() {
		return _msisdn;
	}

	public void setMsisdn(String msisdn) {
		_msisdn = msisdn;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getSurname() {
		return _surname;
	}

	public void setSurname(String surname) {
		_surname = surname;
	}

	public String getExtra1() {
		return _extra1;
	}

	public void setExtra1(String extra1) {
		_extra1 = extra1;
	}

	public String getExtra2() {
		return _extra2;
	}

	public void setExtra2(String extra2) {
		_extra2 = extra2;
	}

	public String getExtra3() {
		return _extra3;
	}

	public void setExtra3(String extra3) {
		_extra3 = extra3;
	}

	public Date getDateSchedule() {
		return _dateSchedule;
	}

	public void setDateSchedule(Date dateSchedule) {
		_dateSchedule = dateSchedule;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getUtmSource() {
		return _utmSource;
	}

	public void setUtmSource(String utmSource) {
		_utmSource = utmSource;
	}

	public String getUtmMedium() {
		return _utmMedium;
	}

	public void setUtmMedium(String utmMedium) {
		_utmMedium = utmMedium;
	}

	public String getUtmContent() {
		return _utmContent;
	}

	public void setUtmContent(String utmContent) {
		_utmContent = utmContent;
	}

	public String getUtmCampaign() {
		return _utmCampaign;
	}

	public void setUtmCampaign(String utmCampaign) {
		_utmCampaign = utmCampaign;
	}

	public String getUtmTerm() {
		return _utmTerm;
	}

	public void setUtmTerm(String utmTerm) {
		_utmTerm = utmTerm;
	}

	public String getOtherSource() {
		return _otherSource;
	}

	public void setOtherSource(String otherSource) {
		_otherSource = otherSource;
	}

	public String getResponseWS() {
		return _responseWS;
	}

	public void setResponseWS(String responseWS) {
		_responseWS = responseWS;
	}

	public String getIdCCWS() {
		return _idCCWS;
	}

	public void setIdCCWS(String idCCWS) {
		_idCCWS = idCCWS;
	}

	public Date getReTryDate() {
		return _reTryDate;
	}

	public void setReTryDate(Date reTryDate) {
		_reTryDate = reTryDate;
	}

	public String getIpCliente() {
		return _ipCliente;
	}

	public void setIpCliente(String ipCliente) {
		_ipCliente = ipCliente;
	}

	public String getOrigen() {
		return _origen;
	}

	public void setOrigen(String origen) {
		_origen = origen;
	}

	private long _leadScoringId;
	private long _groupId;
	private long _leadId;
	private Date _createDate;
	private String _msisdn;
	private String _email;
	private String _name;
	private String _surname;
	private String _extra1;
	private String _extra2;
	private String _extra3;
	private Date _dateSchedule;
	private String _url;
	private String _utmSource;
	private String _utmMedium;
	private String _utmContent;
	private String _utmCampaign;
	private String _utmTerm;
	private String _otherSource;
	private String _responseWS;
	private String _idCCWS;
	private Date _reTryDate;
	private String _ipCliente;
	private String _origen;

}
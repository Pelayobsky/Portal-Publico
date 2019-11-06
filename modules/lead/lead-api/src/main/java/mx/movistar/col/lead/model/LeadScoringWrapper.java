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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link LeadScoring}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeadScoring
 * @generated
 */
@ProviderType
public class LeadScoringWrapper
	implements LeadScoring, ModelWrapper<LeadScoring> {

	public LeadScoringWrapper(LeadScoring leadScoring) {
		_leadScoring = leadScoring;
	}

	@Override
	public Class<?> getModelClass() {
		return LeadScoring.class;
	}

	@Override
	public String getModelClassName() {
		return LeadScoring.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("leadScoringId", getLeadScoringId());
		attributes.put("groupId", getGroupId());
		attributes.put("leadId", getLeadId());
		attributes.put("createDate", getCreateDate());
		attributes.put("msisdn", getMsisdn());
		attributes.put("email", getEmail());
		attributes.put("name", getName());
		attributes.put("surname", getSurname());
		attributes.put("extra1", getExtra1());
		attributes.put("extra2", getExtra2());
		attributes.put("extra3", getExtra3());
		attributes.put("dateSchedule", getDateSchedule());
		attributes.put("url", getUrl());
		attributes.put("utmSource", getUtmSource());
		attributes.put("utmMedium", getUtmMedium());
		attributes.put("utmContent", getUtmContent());
		attributes.put("utmCampaign", getUtmCampaign());
		attributes.put("utmTerm", getUtmTerm());
		attributes.put("otherSource", getOtherSource());
		attributes.put("responseWS", getResponseWS());
		attributes.put("idCCWS", getIdCCWS());
		attributes.put("reTryDate", getReTryDate());
		attributes.put("ipCliente", getIpCliente());
		attributes.put("origen", getOrigen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long leadScoringId = (Long)attributes.get("leadScoringId");

		if (leadScoringId != null) {
			setLeadScoringId(leadScoringId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long leadId = (Long)attributes.get("leadId");

		if (leadId != null) {
			setLeadId(leadId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String msisdn = (String)attributes.get("msisdn");

		if (msisdn != null) {
			setMsisdn(msisdn);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		String extra1 = (String)attributes.get("extra1");

		if (extra1 != null) {
			setExtra1(extra1);
		}

		String extra2 = (String)attributes.get("extra2");

		if (extra2 != null) {
			setExtra2(extra2);
		}

		String extra3 = (String)attributes.get("extra3");

		if (extra3 != null) {
			setExtra3(extra3);
		}

		Date dateSchedule = (Date)attributes.get("dateSchedule");

		if (dateSchedule != null) {
			setDateSchedule(dateSchedule);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String utmSource = (String)attributes.get("utmSource");

		if (utmSource != null) {
			setUtmSource(utmSource);
		}

		String utmMedium = (String)attributes.get("utmMedium");

		if (utmMedium != null) {
			setUtmMedium(utmMedium);
		}

		String utmContent = (String)attributes.get("utmContent");

		if (utmContent != null) {
			setUtmContent(utmContent);
		}

		String utmCampaign = (String)attributes.get("utmCampaign");

		if (utmCampaign != null) {
			setUtmCampaign(utmCampaign);
		}

		String utmTerm = (String)attributes.get("utmTerm");

		if (utmTerm != null) {
			setUtmTerm(utmTerm);
		}

		String otherSource = (String)attributes.get("otherSource");

		if (otherSource != null) {
			setOtherSource(otherSource);
		}

		String responseWS = (String)attributes.get("responseWS");

		if (responseWS != null) {
			setResponseWS(responseWS);
		}

		String idCCWS = (String)attributes.get("idCCWS");

		if (idCCWS != null) {
			setIdCCWS(idCCWS);
		}

		Date reTryDate = (Date)attributes.get("reTryDate");

		if (reTryDate != null) {
			setReTryDate(reTryDate);
		}

		String ipCliente = (String)attributes.get("ipCliente");

		if (ipCliente != null) {
			setIpCliente(ipCliente);
		}

		String origen = (String)attributes.get("origen");

		if (origen != null) {
			setOrigen(origen);
		}
	}

	@Override
	public Object clone() {
		return new LeadScoringWrapper((LeadScoring)_leadScoring.clone());
	}

	@Override
	public int compareTo(mx.movistar.col.lead.model.LeadScoring leadScoring) {
		return _leadScoring.compareTo(leadScoring);
	}

	/**
	 * Returns the create date of this lead scoring.
	 *
	 * @return the create date of this lead scoring
	 */
	@Override
	public Date getCreateDate() {
		return _leadScoring.getCreateDate();
	}

	/**
	 * Returns the date schedule of this lead scoring.
	 *
	 * @return the date schedule of this lead scoring
	 */
	@Override
	public Date getDateSchedule() {
		return _leadScoring.getDateSchedule();
	}

	/**
	 * Returns the email of this lead scoring.
	 *
	 * @return the email of this lead scoring
	 */
	@Override
	public String getEmail() {
		return _leadScoring.getEmail();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _leadScoring.getExpandoBridge();
	}

	/**
	 * Returns the extra1 of this lead scoring.
	 *
	 * @return the extra1 of this lead scoring
	 */
	@Override
	public String getExtra1() {
		return _leadScoring.getExtra1();
	}

	/**
	 * Returns the extra2 of this lead scoring.
	 *
	 * @return the extra2 of this lead scoring
	 */
	@Override
	public String getExtra2() {
		return _leadScoring.getExtra2();
	}

	/**
	 * Returns the extra3 of this lead scoring.
	 *
	 * @return the extra3 of this lead scoring
	 */
	@Override
	public String getExtra3() {
		return _leadScoring.getExtra3();
	}

	/**
	 * Returns the group ID of this lead scoring.
	 *
	 * @return the group ID of this lead scoring
	 */
	@Override
	public long getGroupId() {
		return _leadScoring.getGroupId();
	}

	/**
	 * Returns the id ccws of this lead scoring.
	 *
	 * @return the id ccws of this lead scoring
	 */
	@Override
	public String getIdCCWS() {
		return _leadScoring.getIdCCWS();
	}

	/**
	 * Returns the ip cliente of this lead scoring.
	 *
	 * @return the ip cliente of this lead scoring
	 */
	@Override
	public String getIpCliente() {
		return _leadScoring.getIpCliente();
	}

	/**
	 * Returns the lead ID of this lead scoring.
	 *
	 * @return the lead ID of this lead scoring
	 */
	@Override
	public long getLeadId() {
		return _leadScoring.getLeadId();
	}

	/**
	 * Returns the lead scoring ID of this lead scoring.
	 *
	 * @return the lead scoring ID of this lead scoring
	 */
	@Override
	public long getLeadScoringId() {
		return _leadScoring.getLeadScoringId();
	}

	/**
	 * Returns the msisdn of this lead scoring.
	 *
	 * @return the msisdn of this lead scoring
	 */
	@Override
	public String getMsisdn() {
		return _leadScoring.getMsisdn();
	}

	/**
	 * Returns the name of this lead scoring.
	 *
	 * @return the name of this lead scoring
	 */
	@Override
	public String getName() {
		return _leadScoring.getName();
	}

	/**
	 * Returns the origen of this lead scoring.
	 *
	 * @return the origen of this lead scoring
	 */
	@Override
	public String getOrigen() {
		return _leadScoring.getOrigen();
	}

	/**
	 * Returns the other source of this lead scoring.
	 *
	 * @return the other source of this lead scoring
	 */
	@Override
	public String getOtherSource() {
		return _leadScoring.getOtherSource();
	}

	/**
	 * Returns the primary key of this lead scoring.
	 *
	 * @return the primary key of this lead scoring
	 */
	@Override
	public long getPrimaryKey() {
		return _leadScoring.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _leadScoring.getPrimaryKeyObj();
	}

	/**
	 * Returns the response ws of this lead scoring.
	 *
	 * @return the response ws of this lead scoring
	 */
	@Override
	public String getResponseWS() {
		return _leadScoring.getResponseWS();
	}

	/**
	 * Returns the re try date of this lead scoring.
	 *
	 * @return the re try date of this lead scoring
	 */
	@Override
	public Date getReTryDate() {
		return _leadScoring.getReTryDate();
	}

	/**
	 * Returns the surname of this lead scoring.
	 *
	 * @return the surname of this lead scoring
	 */
	@Override
	public String getSurname() {
		return _leadScoring.getSurname();
	}

	/**
	 * Returns the url of this lead scoring.
	 *
	 * @return the url of this lead scoring
	 */
	@Override
	public String getUrl() {
		return _leadScoring.getUrl();
	}

	/**
	 * Returns the utm campaign of this lead scoring.
	 *
	 * @return the utm campaign of this lead scoring
	 */
	@Override
	public String getUtmCampaign() {
		return _leadScoring.getUtmCampaign();
	}

	/**
	 * Returns the utm content of this lead scoring.
	 *
	 * @return the utm content of this lead scoring
	 */
	@Override
	public String getUtmContent() {
		return _leadScoring.getUtmContent();
	}

	/**
	 * Returns the utm medium of this lead scoring.
	 *
	 * @return the utm medium of this lead scoring
	 */
	@Override
	public String getUtmMedium() {
		return _leadScoring.getUtmMedium();
	}

	/**
	 * Returns the utm source of this lead scoring.
	 *
	 * @return the utm source of this lead scoring
	 */
	@Override
	public String getUtmSource() {
		return _leadScoring.getUtmSource();
	}

	/**
	 * Returns the utm term of this lead scoring.
	 *
	 * @return the utm term of this lead scoring
	 */
	@Override
	public String getUtmTerm() {
		return _leadScoring.getUtmTerm();
	}

	@Override
	public int hashCode() {
		return _leadScoring.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _leadScoring.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _leadScoring.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _leadScoring.isNew();
	}

	@Override
	public void persist() {
		_leadScoring.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_leadScoring.setCachedModel(cachedModel);
	}

	/**
	 * Sets the create date of this lead scoring.
	 *
	 * @param createDate the create date of this lead scoring
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_leadScoring.setCreateDate(createDate);
	}

	/**
	 * Sets the date schedule of this lead scoring.
	 *
	 * @param dateSchedule the date schedule of this lead scoring
	 */
	@Override
	public void setDateSchedule(Date dateSchedule) {
		_leadScoring.setDateSchedule(dateSchedule);
	}

	/**
	 * Sets the email of this lead scoring.
	 *
	 * @param email the email of this lead scoring
	 */
	@Override
	public void setEmail(String email) {
		_leadScoring.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_leadScoring.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_leadScoring.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_leadScoring.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the extra1 of this lead scoring.
	 *
	 * @param extra1 the extra1 of this lead scoring
	 */
	@Override
	public void setExtra1(String extra1) {
		_leadScoring.setExtra1(extra1);
	}

	/**
	 * Sets the extra2 of this lead scoring.
	 *
	 * @param extra2 the extra2 of this lead scoring
	 */
	@Override
	public void setExtra2(String extra2) {
		_leadScoring.setExtra2(extra2);
	}

	/**
	 * Sets the extra3 of this lead scoring.
	 *
	 * @param extra3 the extra3 of this lead scoring
	 */
	@Override
	public void setExtra3(String extra3) {
		_leadScoring.setExtra3(extra3);
	}

	/**
	 * Sets the group ID of this lead scoring.
	 *
	 * @param groupId the group ID of this lead scoring
	 */
	@Override
	public void setGroupId(long groupId) {
		_leadScoring.setGroupId(groupId);
	}

	/**
	 * Sets the id ccws of this lead scoring.
	 *
	 * @param idCCWS the id ccws of this lead scoring
	 */
	@Override
	public void setIdCCWS(String idCCWS) {
		_leadScoring.setIdCCWS(idCCWS);
	}

	/**
	 * Sets the ip cliente of this lead scoring.
	 *
	 * @param ipCliente the ip cliente of this lead scoring
	 */
	@Override
	public void setIpCliente(String ipCliente) {
		_leadScoring.setIpCliente(ipCliente);
	}

	/**
	 * Sets the lead ID of this lead scoring.
	 *
	 * @param leadId the lead ID of this lead scoring
	 */
	@Override
	public void setLeadId(long leadId) {
		_leadScoring.setLeadId(leadId);
	}

	/**
	 * Sets the lead scoring ID of this lead scoring.
	 *
	 * @param leadScoringId the lead scoring ID of this lead scoring
	 */
	@Override
	public void setLeadScoringId(long leadScoringId) {
		_leadScoring.setLeadScoringId(leadScoringId);
	}

	/**
	 * Sets the msisdn of this lead scoring.
	 *
	 * @param msisdn the msisdn of this lead scoring
	 */
	@Override
	public void setMsisdn(String msisdn) {
		_leadScoring.setMsisdn(msisdn);
	}

	/**
	 * Sets the name of this lead scoring.
	 *
	 * @param name the name of this lead scoring
	 */
	@Override
	public void setName(String name) {
		_leadScoring.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_leadScoring.setNew(n);
	}

	/**
	 * Sets the origen of this lead scoring.
	 *
	 * @param origen the origen of this lead scoring
	 */
	@Override
	public void setOrigen(String origen) {
		_leadScoring.setOrigen(origen);
	}

	/**
	 * Sets the other source of this lead scoring.
	 *
	 * @param otherSource the other source of this lead scoring
	 */
	@Override
	public void setOtherSource(String otherSource) {
		_leadScoring.setOtherSource(otherSource);
	}

	/**
	 * Sets the primary key of this lead scoring.
	 *
	 * @param primaryKey the primary key of this lead scoring
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_leadScoring.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_leadScoring.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the response ws of this lead scoring.
	 *
	 * @param responseWS the response ws of this lead scoring
	 */
	@Override
	public void setResponseWS(String responseWS) {
		_leadScoring.setResponseWS(responseWS);
	}

	/**
	 * Sets the re try date of this lead scoring.
	 *
	 * @param reTryDate the re try date of this lead scoring
	 */
	@Override
	public void setReTryDate(Date reTryDate) {
		_leadScoring.setReTryDate(reTryDate);
	}

	/**
	 * Sets the surname of this lead scoring.
	 *
	 * @param surname the surname of this lead scoring
	 */
	@Override
	public void setSurname(String surname) {
		_leadScoring.setSurname(surname);
	}

	/**
	 * Sets the url of this lead scoring.
	 *
	 * @param url the url of this lead scoring
	 */
	@Override
	public void setUrl(String url) {
		_leadScoring.setUrl(url);
	}

	/**
	 * Sets the utm campaign of this lead scoring.
	 *
	 * @param utmCampaign the utm campaign of this lead scoring
	 */
	@Override
	public void setUtmCampaign(String utmCampaign) {
		_leadScoring.setUtmCampaign(utmCampaign);
	}

	/**
	 * Sets the utm content of this lead scoring.
	 *
	 * @param utmContent the utm content of this lead scoring
	 */
	@Override
	public void setUtmContent(String utmContent) {
		_leadScoring.setUtmContent(utmContent);
	}

	/**
	 * Sets the utm medium of this lead scoring.
	 *
	 * @param utmMedium the utm medium of this lead scoring
	 */
	@Override
	public void setUtmMedium(String utmMedium) {
		_leadScoring.setUtmMedium(utmMedium);
	}

	/**
	 * Sets the utm source of this lead scoring.
	 *
	 * @param utmSource the utm source of this lead scoring
	 */
	@Override
	public void setUtmSource(String utmSource) {
		_leadScoring.setUtmSource(utmSource);
	}

	/**
	 * Sets the utm term of this lead scoring.
	 *
	 * @param utmTerm the utm term of this lead scoring
	 */
	@Override
	public void setUtmTerm(String utmTerm) {
		_leadScoring.setUtmTerm(utmTerm);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<mx.movistar.col.lead.model.LeadScoring> toCacheModel() {

		return _leadScoring.toCacheModel();
	}

	@Override
	public mx.movistar.col.lead.model.LeadScoring toEscapedModel() {
		return new LeadScoringWrapper(_leadScoring.toEscapedModel());
	}

	@Override
	public String toString() {
		return _leadScoring.toString();
	}

	@Override
	public mx.movistar.col.lead.model.LeadScoring toUnescapedModel() {
		return new LeadScoringWrapper(_leadScoring.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _leadScoring.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeadScoringWrapper)) {
			return false;
		}

		LeadScoringWrapper leadScoringWrapper = (LeadScoringWrapper)obj;

		if (Objects.equals(_leadScoring, leadScoringWrapper._leadScoring)) {
			return true;
		}

		return false;
	}

	@Override
	public LeadScoring getWrappedModel() {
		return _leadScoring;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _leadScoring.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _leadScoring.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_leadScoring.resetOriginalValues();
	}

	private final LeadScoring _leadScoring;

}
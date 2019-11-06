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
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Lead}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Lead
 * @generated
 */
@ProviderType
public class LeadWrapper implements Lead, ModelWrapper<Lead> {

	public LeadWrapper(Lead lead) {
		_lead = lead;
	}

	@Override
	public Class<?> getModelClass() {
		return Lead.class;
	}

	@Override
	public String getModelClassName() {
		return Lead.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("leadId", getLeadId());
		attributes.put("campaignId", getCampaignId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dueDate", getDueDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("source", getSource());
		attributes.put("type", getType());
		attributes.put("product", getProduct());
		attributes.put("hasEmail", isHasEmail());
		attributes.put("hasPhone", isHasPhone());
		attributes.put("hasName", isHasName());
		attributes.put("extra1", isExtra1());
		attributes.put("extra2", isExtra2());
		attributes.put("extra3", isExtra3());
		attributes.put("totalScoring", getTotalScoring());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long leadId = (Long)attributes.get("leadId");

		if (leadId != null) {
			setLeadId(leadId);
		}

		Long campaignId = (Long)attributes.get("campaignId");

		if (campaignId != null) {
			setCampaignId(campaignId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date dueDate = (Date)attributes.get("dueDate");

		if (dueDate != null) {
			setDueDate(dueDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String source = (String)attributes.get("source");

		if (source != null) {
			setSource(source);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String product = (String)attributes.get("product");

		if (product != null) {
			setProduct(product);
		}

		Boolean hasEmail = (Boolean)attributes.get("hasEmail");

		if (hasEmail != null) {
			setHasEmail(hasEmail);
		}

		Boolean hasPhone = (Boolean)attributes.get("hasPhone");

		if (hasPhone != null) {
			setHasPhone(hasPhone);
		}

		Boolean hasName = (Boolean)attributes.get("hasName");

		if (hasName != null) {
			setHasName(hasName);
		}

		Boolean extra1 = (Boolean)attributes.get("extra1");

		if (extra1 != null) {
			setExtra1(extra1);
		}

		Boolean extra2 = (Boolean)attributes.get("extra2");

		if (extra2 != null) {
			setExtra2(extra2);
		}

		Boolean extra3 = (Boolean)attributes.get("extra3");

		if (extra3 != null) {
			setExtra3(extra3);
		}

		Integer totalScoring = (Integer)attributes.get("totalScoring");

		if (totalScoring != null) {
			setTotalScoring(totalScoring);
		}
	}

	@Override
	public Object clone() {
		return new LeadWrapper((Lead)_lead.clone());
	}

	@Override
	public int compareTo(mx.movistar.col.lead.model.Lead lead) {
		return _lead.compareTo(lead);
	}

	@Override
	public String[] getAvailableLanguageIds() {
		return _lead.getAvailableLanguageIds();
	}

	/**
	 * Returns the campaign ID of this lead.
	 *
	 * @return the campaign ID of this lead
	 */
	@Override
	public long getCampaignId() {
		return _lead.getCampaignId();
	}

	/**
	 * Returns the company ID of this lead.
	 *
	 * @return the company ID of this lead
	 */
	@Override
	public long getCompanyId() {
		return _lead.getCompanyId();
	}

	/**
	 * Returns the create date of this lead.
	 *
	 * @return the create date of this lead
	 */
	@Override
	public Date getCreateDate() {
		return _lead.getCreateDate();
	}

	@Override
	public String getDefaultLanguageId() {
		return _lead.getDefaultLanguageId();
	}

	/**
	 * Returns the description of this lead.
	 *
	 * @return the description of this lead
	 */
	@Override
	public String getDescription() {
		return _lead.getDescription();
	}

	/**
	 * Returns the due date of this lead.
	 *
	 * @return the due date of this lead
	 */
	@Override
	public Date getDueDate() {
		return _lead.getDueDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _lead.getExpandoBridge();
	}

	/**
	 * Returns the extra1 of this lead.
	 *
	 * @return the extra1 of this lead
	 */
	@Override
	public boolean getExtra1() {
		return _lead.getExtra1();
	}

	/**
	 * Returns the extra2 of this lead.
	 *
	 * @return the extra2 of this lead
	 */
	@Override
	public boolean getExtra2() {
		return _lead.getExtra2();
	}

	/**
	 * Returns the extra3 of this lead.
	 *
	 * @return the extra3 of this lead
	 */
	@Override
	public boolean getExtra3() {
		return _lead.getExtra3();
	}

	/**
	 * Returns the group ID of this lead.
	 *
	 * @return the group ID of this lead
	 */
	@Override
	public long getGroupId() {
		return _lead.getGroupId();
	}

	/**
	 * Returns the has email of this lead.
	 *
	 * @return the has email of this lead
	 */
	@Override
	public boolean getHasEmail() {
		return _lead.getHasEmail();
	}

	/**
	 * Returns the has name of this lead.
	 *
	 * @return the has name of this lead
	 */
	@Override
	public boolean getHasName() {
		return _lead.getHasName();
	}

	/**
	 * Returns the has phone of this lead.
	 *
	 * @return the has phone of this lead
	 */
	@Override
	public boolean getHasPhone() {
		return _lead.getHasPhone();
	}

	/**
	 * Returns the lead ID of this lead.
	 *
	 * @return the lead ID of this lead
	 */
	@Override
	public long getLeadId() {
		return _lead.getLeadId();
	}

	/**
	 * Returns the modified date of this lead.
	 *
	 * @return the modified date of this lead
	 */
	@Override
	public Date getModifiedDate() {
		return _lead.getModifiedDate();
	}

	/**
	 * Returns the primary key of this lead.
	 *
	 * @return the primary key of this lead
	 */
	@Override
	public long getPrimaryKey() {
		return _lead.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _lead.getPrimaryKeyObj();
	}

	/**
	 * Returns the product of this lead.
	 *
	 * @return the product of this lead
	 */
	@Override
	public String getProduct() {
		return _lead.getProduct();
	}

	/**
	 * Returns the source of this lead.
	 *
	 * @return the source of this lead
	 */
	@Override
	public String getSource() {
		return _lead.getSource();
	}

	/**
	 * Returns the status of this lead.
	 *
	 * @return the status of this lead
	 */
	@Override
	public int getStatus() {
		return _lead.getStatus();
	}

	/**
	 * Returns the status by user ID of this lead.
	 *
	 * @return the status by user ID of this lead
	 */
	@Override
	public long getStatusByUserId() {
		return _lead.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this lead.
	 *
	 * @return the status by user name of this lead
	 */
	@Override
	public String getStatusByUserName() {
		return _lead.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this lead.
	 *
	 * @return the status by user uuid of this lead
	 */
	@Override
	public String getStatusByUserUuid() {
		return _lead.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this lead.
	 *
	 * @return the status date of this lead
	 */
	@Override
	public Date getStatusDate() {
		return _lead.getStatusDate();
	}

	/**
	 * Returns the title of this lead.
	 *
	 * @return the title of this lead
	 */
	@Override
	public String getTitle() {
		return _lead.getTitle();
	}

	/**
	 * Returns the localized title of this lead in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized title of this lead
	 */
	@Override
	public String getTitle(java.util.Locale locale) {
		return _lead.getTitle(locale);
	}

	/**
	 * Returns the localized title of this lead in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this lead. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getTitle(java.util.Locale locale, boolean useDefault) {
		return _lead.getTitle(locale, useDefault);
	}

	/**
	 * Returns the localized title of this lead in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized title of this lead
	 */
	@Override
	public String getTitle(String languageId) {
		return _lead.getTitle(languageId);
	}

	/**
	 * Returns the localized title of this lead in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this lead
	 */
	@Override
	public String getTitle(String languageId, boolean useDefault) {
		return _lead.getTitle(languageId, useDefault);
	}

	@Override
	public String getTitleCurrentLanguageId() {
		return _lead.getTitleCurrentLanguageId();
	}

	@Override
	public String getTitleCurrentValue() {
		return _lead.getTitleCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized titles of this lead.
	 *
	 * @return the locales and localized titles of this lead
	 */
	@Override
	public Map<java.util.Locale, String> getTitleMap() {
		return _lead.getTitleMap();
	}

	/**
	 * Returns the total scoring of this lead.
	 *
	 * @return the total scoring of this lead
	 */
	@Override
	public int getTotalScoring() {
		return _lead.getTotalScoring();
	}

	/**
	 * Returns the type of this lead.
	 *
	 * @return the type of this lead
	 */
	@Override
	public String getType() {
		return _lead.getType();
	}

	/**
	 * Returns the user ID of this lead.
	 *
	 * @return the user ID of this lead
	 */
	@Override
	public long getUserId() {
		return _lead.getUserId();
	}

	/**
	 * Returns the user name of this lead.
	 *
	 * @return the user name of this lead
	 */
	@Override
	public String getUserName() {
		return _lead.getUserName();
	}

	/**
	 * Returns the user uuid of this lead.
	 *
	 * @return the user uuid of this lead
	 */
	@Override
	public String getUserUuid() {
		return _lead.getUserUuid();
	}

	/**
	 * Returns the uuid of this lead.
	 *
	 * @return the uuid of this lead
	 */
	@Override
	public String getUuid() {
		return _lead.getUuid();
	}

	@Override
	public int hashCode() {
		return _lead.hashCode();
	}

	/**
	 * Returns <code>true</code> if this lead is approved.
	 *
	 * @return <code>true</code> if this lead is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return _lead.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _lead.isCachedModel();
	}

	/**
	 * Returns <code>true</code> if this lead is denied.
	 *
	 * @return <code>true</code> if this lead is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return _lead.isDenied();
	}

	/**
	 * Returns <code>true</code> if this lead is a draft.
	 *
	 * @return <code>true</code> if this lead is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return _lead.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _lead.isEscapedModel();
	}

	/**
	 * Returns <code>true</code> if this lead is expired.
	 *
	 * @return <code>true</code> if this lead is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return _lead.isExpired();
	}

	/**
	 * Returns <code>true</code> if this lead is extra1.
	 *
	 * @return <code>true</code> if this lead is extra1; <code>false</code> otherwise
	 */
	@Override
	public boolean isExtra1() {
		return _lead.isExtra1();
	}

	/**
	 * Returns <code>true</code> if this lead is extra2.
	 *
	 * @return <code>true</code> if this lead is extra2; <code>false</code> otherwise
	 */
	@Override
	public boolean isExtra2() {
		return _lead.isExtra2();
	}

	/**
	 * Returns <code>true</code> if this lead is extra3.
	 *
	 * @return <code>true</code> if this lead is extra3; <code>false</code> otherwise
	 */
	@Override
	public boolean isExtra3() {
		return _lead.isExtra3();
	}

	/**
	 * Returns <code>true</code> if this lead is has email.
	 *
	 * @return <code>true</code> if this lead is has email; <code>false</code> otherwise
	 */
	@Override
	public boolean isHasEmail() {
		return _lead.isHasEmail();
	}

	/**
	 * Returns <code>true</code> if this lead is has name.
	 *
	 * @return <code>true</code> if this lead is has name; <code>false</code> otherwise
	 */
	@Override
	public boolean isHasName() {
		return _lead.isHasName();
	}

	/**
	 * Returns <code>true</code> if this lead is has phone.
	 *
	 * @return <code>true</code> if this lead is has phone; <code>false</code> otherwise
	 */
	@Override
	public boolean isHasPhone() {
		return _lead.isHasPhone();
	}

	/**
	 * Returns <code>true</code> if this lead is inactive.
	 *
	 * @return <code>true</code> if this lead is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return _lead.isInactive();
	}

	/**
	 * Returns <code>true</code> if this lead is incomplete.
	 *
	 * @return <code>true</code> if this lead is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return _lead.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _lead.isNew();
	}

	/**
	 * Returns <code>true</code> if this lead is pending.
	 *
	 * @return <code>true</code> if this lead is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return _lead.isPending();
	}

	/**
	 * Returns <code>true</code> if this lead is scheduled.
	 *
	 * @return <code>true</code> if this lead is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return _lead.isScheduled();
	}

	@Override
	public void persist() {
		_lead.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {

		_lead.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
			java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {

		_lead.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lead.setCachedModel(cachedModel);
	}

	/**
	 * Sets the campaign ID of this lead.
	 *
	 * @param campaignId the campaign ID of this lead
	 */
	@Override
	public void setCampaignId(long campaignId) {
		_lead.setCampaignId(campaignId);
	}

	/**
	 * Sets the company ID of this lead.
	 *
	 * @param companyId the company ID of this lead
	 */
	@Override
	public void setCompanyId(long companyId) {
		_lead.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this lead.
	 *
	 * @param createDate the create date of this lead
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_lead.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this lead.
	 *
	 * @param description the description of this lead
	 */
	@Override
	public void setDescription(String description) {
		_lead.setDescription(description);
	}

	/**
	 * Sets the due date of this lead.
	 *
	 * @param dueDate the due date of this lead
	 */
	@Override
	public void setDueDate(Date dueDate) {
		_lead.setDueDate(dueDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_lead.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_lead.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_lead.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets whether this lead is extra1.
	 *
	 * @param extra1 the extra1 of this lead
	 */
	@Override
	public void setExtra1(boolean extra1) {
		_lead.setExtra1(extra1);
	}

	/**
	 * Sets whether this lead is extra2.
	 *
	 * @param extra2 the extra2 of this lead
	 */
	@Override
	public void setExtra2(boolean extra2) {
		_lead.setExtra2(extra2);
	}

	/**
	 * Sets whether this lead is extra3.
	 *
	 * @param extra3 the extra3 of this lead
	 */
	@Override
	public void setExtra3(boolean extra3) {
		_lead.setExtra3(extra3);
	}

	/**
	 * Sets the group ID of this lead.
	 *
	 * @param groupId the group ID of this lead
	 */
	@Override
	public void setGroupId(long groupId) {
		_lead.setGroupId(groupId);
	}

	/**
	 * Sets whether this lead is has email.
	 *
	 * @param hasEmail the has email of this lead
	 */
	@Override
	public void setHasEmail(boolean hasEmail) {
		_lead.setHasEmail(hasEmail);
	}

	/**
	 * Sets whether this lead is has name.
	 *
	 * @param hasName the has name of this lead
	 */
	@Override
	public void setHasName(boolean hasName) {
		_lead.setHasName(hasName);
	}

	/**
	 * Sets whether this lead is has phone.
	 *
	 * @param hasPhone the has phone of this lead
	 */
	@Override
	public void setHasPhone(boolean hasPhone) {
		_lead.setHasPhone(hasPhone);
	}

	/**
	 * Sets the lead ID of this lead.
	 *
	 * @param leadId the lead ID of this lead
	 */
	@Override
	public void setLeadId(long leadId) {
		_lead.setLeadId(leadId);
	}

	/**
	 * Sets the modified date of this lead.
	 *
	 * @param modifiedDate the modified date of this lead
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_lead.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_lead.setNew(n);
	}

	/**
	 * Sets the primary key of this lead.
	 *
	 * @param primaryKey the primary key of this lead
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lead.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_lead.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the product of this lead.
	 *
	 * @param product the product of this lead
	 */
	@Override
	public void setProduct(String product) {
		_lead.setProduct(product);
	}

	/**
	 * Sets the source of this lead.
	 *
	 * @param source the source of this lead
	 */
	@Override
	public void setSource(String source) {
		_lead.setSource(source);
	}

	/**
	 * Sets the status of this lead.
	 *
	 * @param status the status of this lead
	 */
	@Override
	public void setStatus(int status) {
		_lead.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this lead.
	 *
	 * @param statusByUserId the status by user ID of this lead
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_lead.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this lead.
	 *
	 * @param statusByUserName the status by user name of this lead
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_lead.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this lead.
	 *
	 * @param statusByUserUuid the status by user uuid of this lead
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_lead.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this lead.
	 *
	 * @param statusDate the status date of this lead
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		_lead.setStatusDate(statusDate);
	}

	/**
	 * Sets the title of this lead.
	 *
	 * @param title the title of this lead
	 */
	@Override
	public void setTitle(String title) {
		_lead.setTitle(title);
	}

	/**
	 * Sets the localized title of this lead in the language.
	 *
	 * @param title the localized title of this lead
	 * @param locale the locale of the language
	 */
	@Override
	public void setTitle(String title, java.util.Locale locale) {
		_lead.setTitle(title, locale);
	}

	/**
	 * Sets the localized title of this lead in the language, and sets the default locale.
	 *
	 * @param title the localized title of this lead
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setTitle(
		String title, java.util.Locale locale, java.util.Locale defaultLocale) {

		_lead.setTitle(title, locale, defaultLocale);
	}

	@Override
	public void setTitleCurrentLanguageId(String languageId) {
		_lead.setTitleCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized titles of this lead from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this lead
	 */
	@Override
	public void setTitleMap(Map<java.util.Locale, String> titleMap) {
		_lead.setTitleMap(titleMap);
	}

	/**
	 * Sets the localized titles of this lead from the map of locales and localized titles, and sets the default locale.
	 *
	 * @param titleMap the locales and localized titles of this lead
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setTitleMap(
		Map<java.util.Locale, String> titleMap,
		java.util.Locale defaultLocale) {

		_lead.setTitleMap(titleMap, defaultLocale);
	}

	/**
	 * Sets the total scoring of this lead.
	 *
	 * @param totalScoring the total scoring of this lead
	 */
	@Override
	public void setTotalScoring(int totalScoring) {
		_lead.setTotalScoring(totalScoring);
	}

	/**
	 * Sets the type of this lead.
	 *
	 * @param type the type of this lead
	 */
	@Override
	public void setType(String type) {
		_lead.setType(type);
	}

	/**
	 * Sets the user ID of this lead.
	 *
	 * @param userId the user ID of this lead
	 */
	@Override
	public void setUserId(long userId) {
		_lead.setUserId(userId);
	}

	/**
	 * Sets the user name of this lead.
	 *
	 * @param userName the user name of this lead
	 */
	@Override
	public void setUserName(String userName) {
		_lead.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this lead.
	 *
	 * @param userUuid the user uuid of this lead
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_lead.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this lead.
	 *
	 * @param uuid the uuid of this lead
	 */
	@Override
	public void setUuid(String uuid) {
		_lead.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<mx.movistar.col.lead.model.Lead> toCacheModel() {

		return _lead.toCacheModel();
	}

	@Override
	public mx.movistar.col.lead.model.Lead toEscapedModel() {
		return new LeadWrapper(_lead.toEscapedModel());
	}

	@Override
	public String toString() {
		return _lead.toString();
	}

	@Override
	public mx.movistar.col.lead.model.Lead toUnescapedModel() {
		return new LeadWrapper(_lead.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _lead.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeadWrapper)) {
			return false;
		}

		LeadWrapper leadWrapper = (LeadWrapper)obj;

		if (Objects.equals(_lead, leadWrapper._lead)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _lead.getStagedModelType();
	}

	@Override
	public Lead getWrappedModel() {
		return _lead;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _lead.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _lead.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_lead.resetOriginalValues();
	}

	private final Lead _lead;

}
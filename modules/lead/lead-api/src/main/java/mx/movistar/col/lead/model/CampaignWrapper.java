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
 * This class is a wrapper for {@link Campaign}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Campaign
 * @generated
 */
@ProviderType
public class CampaignWrapper implements Campaign, ModelWrapper<Campaign> {

	public CampaignWrapper(Campaign campaign) {
		_campaign = campaign;
	}

	@Override
	public Class<?> getModelClass() {
		return Campaign.class;
	}

	@Override
	public String getModelClassName() {
		return Campaign.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
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

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
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
	}

	@Override
	public Object clone() {
		return new CampaignWrapper((Campaign)_campaign.clone());
	}

	@Override
	public int compareTo(mx.movistar.col.lead.model.Campaign campaign) {
		return _campaign.compareTo(campaign);
	}

	@Override
	public String[] getAvailableLanguageIds() {
		return _campaign.getAvailableLanguageIds();
	}

	/**
	 * Returns the campaign ID of this campaign.
	 *
	 * @return the campaign ID of this campaign
	 */
	@Override
	public long getCampaignId() {
		return _campaign.getCampaignId();
	}

	/**
	 * Returns the company ID of this campaign.
	 *
	 * @return the company ID of this campaign
	 */
	@Override
	public long getCompanyId() {
		return _campaign.getCompanyId();
	}

	/**
	 * Returns the create date of this campaign.
	 *
	 * @return the create date of this campaign
	 */
	@Override
	public Date getCreateDate() {
		return _campaign.getCreateDate();
	}

	@Override
	public String getDefaultLanguageId() {
		return _campaign.getDefaultLanguageId();
	}

	/**
	 * Returns the description of this campaign.
	 *
	 * @return the description of this campaign
	 */
	@Override
	public String getDescription() {
		return _campaign.getDescription();
	}

	/**
	 * Returns the due date of this campaign.
	 *
	 * @return the due date of this campaign
	 */
	@Override
	public Date getDueDate() {
		return _campaign.getDueDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _campaign.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this campaign.
	 *
	 * @return the group ID of this campaign
	 */
	@Override
	public long getGroupId() {
		return _campaign.getGroupId();
	}

	/**
	 * Returns the modified date of this campaign.
	 *
	 * @return the modified date of this campaign
	 */
	@Override
	public Date getModifiedDate() {
		return _campaign.getModifiedDate();
	}

	/**
	 * Returns the primary key of this campaign.
	 *
	 * @return the primary key of this campaign
	 */
	@Override
	public long getPrimaryKey() {
		return _campaign.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _campaign.getPrimaryKeyObj();
	}

	/**
	 * Returns the status of this campaign.
	 *
	 * @return the status of this campaign
	 */
	@Override
	public int getStatus() {
		return _campaign.getStatus();
	}

	/**
	 * Returns the status by user ID of this campaign.
	 *
	 * @return the status by user ID of this campaign
	 */
	@Override
	public long getStatusByUserId() {
		return _campaign.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this campaign.
	 *
	 * @return the status by user name of this campaign
	 */
	@Override
	public String getStatusByUserName() {
		return _campaign.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this campaign.
	 *
	 * @return the status by user uuid of this campaign
	 */
	@Override
	public String getStatusByUserUuid() {
		return _campaign.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this campaign.
	 *
	 * @return the status date of this campaign
	 */
	@Override
	public Date getStatusDate() {
		return _campaign.getStatusDate();
	}

	/**
	 * Returns the title of this campaign.
	 *
	 * @return the title of this campaign
	 */
	@Override
	public String getTitle() {
		return _campaign.getTitle();
	}

	/**
	 * Returns the localized title of this campaign in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized title of this campaign
	 */
	@Override
	public String getTitle(java.util.Locale locale) {
		return _campaign.getTitle(locale);
	}

	/**
	 * Returns the localized title of this campaign in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this campaign. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getTitle(java.util.Locale locale, boolean useDefault) {
		return _campaign.getTitle(locale, useDefault);
	}

	/**
	 * Returns the localized title of this campaign in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized title of this campaign
	 */
	@Override
	public String getTitle(String languageId) {
		return _campaign.getTitle(languageId);
	}

	/**
	 * Returns the localized title of this campaign in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this campaign
	 */
	@Override
	public String getTitle(String languageId, boolean useDefault) {
		return _campaign.getTitle(languageId, useDefault);
	}

	@Override
	public String getTitleCurrentLanguageId() {
		return _campaign.getTitleCurrentLanguageId();
	}

	@Override
	public String getTitleCurrentValue() {
		return _campaign.getTitleCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized titles of this campaign.
	 *
	 * @return the locales and localized titles of this campaign
	 */
	@Override
	public Map<java.util.Locale, String> getTitleMap() {
		return _campaign.getTitleMap();
	}

	/**
	 * Returns the user ID of this campaign.
	 *
	 * @return the user ID of this campaign
	 */
	@Override
	public long getUserId() {
		return _campaign.getUserId();
	}

	/**
	 * Returns the user name of this campaign.
	 *
	 * @return the user name of this campaign
	 */
	@Override
	public String getUserName() {
		return _campaign.getUserName();
	}

	/**
	 * Returns the user uuid of this campaign.
	 *
	 * @return the user uuid of this campaign
	 */
	@Override
	public String getUserUuid() {
		return _campaign.getUserUuid();
	}

	/**
	 * Returns the uuid of this campaign.
	 *
	 * @return the uuid of this campaign
	 */
	@Override
	public String getUuid() {
		return _campaign.getUuid();
	}

	@Override
	public int hashCode() {
		return _campaign.hashCode();
	}

	/**
	 * Returns <code>true</code> if this campaign is approved.
	 *
	 * @return <code>true</code> if this campaign is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return _campaign.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _campaign.isCachedModel();
	}

	/**
	 * Returns <code>true</code> if this campaign is denied.
	 *
	 * @return <code>true</code> if this campaign is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return _campaign.isDenied();
	}

	/**
	 * Returns <code>true</code> if this campaign is a draft.
	 *
	 * @return <code>true</code> if this campaign is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return _campaign.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _campaign.isEscapedModel();
	}

	/**
	 * Returns <code>true</code> if this campaign is expired.
	 *
	 * @return <code>true</code> if this campaign is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return _campaign.isExpired();
	}

	/**
	 * Returns <code>true</code> if this campaign is inactive.
	 *
	 * @return <code>true</code> if this campaign is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return _campaign.isInactive();
	}

	/**
	 * Returns <code>true</code> if this campaign is incomplete.
	 *
	 * @return <code>true</code> if this campaign is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return _campaign.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _campaign.isNew();
	}

	/**
	 * Returns <code>true</code> if this campaign is pending.
	 *
	 * @return <code>true</code> if this campaign is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return _campaign.isPending();
	}

	/**
	 * Returns <code>true</code> if this campaign is scheduled.
	 *
	 * @return <code>true</code> if this campaign is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return _campaign.isScheduled();
	}

	@Override
	public void persist() {
		_campaign.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {

		_campaign.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
			java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {

		_campaign.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_campaign.setCachedModel(cachedModel);
	}

	/**
	 * Sets the campaign ID of this campaign.
	 *
	 * @param campaignId the campaign ID of this campaign
	 */
	@Override
	public void setCampaignId(long campaignId) {
		_campaign.setCampaignId(campaignId);
	}

	/**
	 * Sets the company ID of this campaign.
	 *
	 * @param companyId the company ID of this campaign
	 */
	@Override
	public void setCompanyId(long companyId) {
		_campaign.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this campaign.
	 *
	 * @param createDate the create date of this campaign
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_campaign.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this campaign.
	 *
	 * @param description the description of this campaign
	 */
	@Override
	public void setDescription(String description) {
		_campaign.setDescription(description);
	}

	/**
	 * Sets the due date of this campaign.
	 *
	 * @param dueDate the due date of this campaign
	 */
	@Override
	public void setDueDate(Date dueDate) {
		_campaign.setDueDate(dueDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_campaign.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_campaign.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_campaign.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this campaign.
	 *
	 * @param groupId the group ID of this campaign
	 */
	@Override
	public void setGroupId(long groupId) {
		_campaign.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this campaign.
	 *
	 * @param modifiedDate the modified date of this campaign
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_campaign.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_campaign.setNew(n);
	}

	/**
	 * Sets the primary key of this campaign.
	 *
	 * @param primaryKey the primary key of this campaign
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_campaign.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_campaign.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the status of this campaign.
	 *
	 * @param status the status of this campaign
	 */
	@Override
	public void setStatus(int status) {
		_campaign.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this campaign.
	 *
	 * @param statusByUserId the status by user ID of this campaign
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_campaign.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this campaign.
	 *
	 * @param statusByUserName the status by user name of this campaign
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_campaign.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this campaign.
	 *
	 * @param statusByUserUuid the status by user uuid of this campaign
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_campaign.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this campaign.
	 *
	 * @param statusDate the status date of this campaign
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		_campaign.setStatusDate(statusDate);
	}

	/**
	 * Sets the title of this campaign.
	 *
	 * @param title the title of this campaign
	 */
	@Override
	public void setTitle(String title) {
		_campaign.setTitle(title);
	}

	/**
	 * Sets the localized title of this campaign in the language.
	 *
	 * @param title the localized title of this campaign
	 * @param locale the locale of the language
	 */
	@Override
	public void setTitle(String title, java.util.Locale locale) {
		_campaign.setTitle(title, locale);
	}

	/**
	 * Sets the localized title of this campaign in the language, and sets the default locale.
	 *
	 * @param title the localized title of this campaign
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setTitle(
		String title, java.util.Locale locale, java.util.Locale defaultLocale) {

		_campaign.setTitle(title, locale, defaultLocale);
	}

	@Override
	public void setTitleCurrentLanguageId(String languageId) {
		_campaign.setTitleCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized titles of this campaign from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this campaign
	 */
	@Override
	public void setTitleMap(Map<java.util.Locale, String> titleMap) {
		_campaign.setTitleMap(titleMap);
	}

	/**
	 * Sets the localized titles of this campaign from the map of locales and localized titles, and sets the default locale.
	 *
	 * @param titleMap the locales and localized titles of this campaign
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setTitleMap(
		Map<java.util.Locale, String> titleMap,
		java.util.Locale defaultLocale) {

		_campaign.setTitleMap(titleMap, defaultLocale);
	}

	/**
	 * Sets the user ID of this campaign.
	 *
	 * @param userId the user ID of this campaign
	 */
	@Override
	public void setUserId(long userId) {
		_campaign.setUserId(userId);
	}

	/**
	 * Sets the user name of this campaign.
	 *
	 * @param userName the user name of this campaign
	 */
	@Override
	public void setUserName(String userName) {
		_campaign.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this campaign.
	 *
	 * @param userUuid the user uuid of this campaign
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_campaign.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this campaign.
	 *
	 * @param uuid the uuid of this campaign
	 */
	@Override
	public void setUuid(String uuid) {
		_campaign.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<mx.movistar.col.lead.model.Campaign> toCacheModel() {

		return _campaign.toCacheModel();
	}

	@Override
	public mx.movistar.col.lead.model.Campaign toEscapedModel() {
		return new CampaignWrapper(_campaign.toEscapedModel());
	}

	@Override
	public String toString() {
		return _campaign.toString();
	}

	@Override
	public mx.movistar.col.lead.model.Campaign toUnescapedModel() {
		return new CampaignWrapper(_campaign.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _campaign.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CampaignWrapper)) {
			return false;
		}

		CampaignWrapper campaignWrapper = (CampaignWrapper)obj;

		if (Objects.equals(_campaign, campaignWrapper._campaign)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _campaign.getStagedModelType();
	}

	@Override
	public Campaign getWrappedModel() {
		return _campaign;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _campaign.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _campaign.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_campaign.resetOriginalValues();
	}

	private final Campaign _campaign;

}
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
 * This class is a wrapper for {@link CallCenter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CallCenter
 * @generated
 */
@ProviderType
public class CallCenterWrapper implements CallCenter, ModelWrapper<CallCenter> {

	public CallCenterWrapper(CallCenter callCenter) {
		_callCenter = callCenter;
	}

	@Override
	public Class<?> getModelClass() {
		return CallCenter.class;
	}

	@Override
	public String getModelClassName() {
		return CallCenter.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("callCenterId", getCallCenterId());
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

		Long callCenterId = (Long)attributes.get("callCenterId");

		if (callCenterId != null) {
			setCallCenterId(callCenterId);
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
		return new CallCenterWrapper((CallCenter)_callCenter.clone());
	}

	@Override
	public int compareTo(mx.movistar.col.lead.model.CallCenter callCenter) {
		return _callCenter.compareTo(callCenter);
	}

	@Override
	public String[] getAvailableLanguageIds() {
		return _callCenter.getAvailableLanguageIds();
	}

	/**
	 * Returns the call center ID of this call center.
	 *
	 * @return the call center ID of this call center
	 */
	@Override
	public long getCallCenterId() {
		return _callCenter.getCallCenterId();
	}

	/**
	 * Returns the campaign ID of this call center.
	 *
	 * @return the campaign ID of this call center
	 */
	@Override
	public long getCampaignId() {
		return _callCenter.getCampaignId();
	}

	/**
	 * Returns the company ID of this call center.
	 *
	 * @return the company ID of this call center
	 */
	@Override
	public long getCompanyId() {
		return _callCenter.getCompanyId();
	}

	/**
	 * Returns the create date of this call center.
	 *
	 * @return the create date of this call center
	 */
	@Override
	public Date getCreateDate() {
		return _callCenter.getCreateDate();
	}

	@Override
	public String getDefaultLanguageId() {
		return _callCenter.getDefaultLanguageId();
	}

	/**
	 * Returns the description of this call center.
	 *
	 * @return the description of this call center
	 */
	@Override
	public String getDescription() {
		return _callCenter.getDescription();
	}

	/**
	 * Returns the due date of this call center.
	 *
	 * @return the due date of this call center
	 */
	@Override
	public Date getDueDate() {
		return _callCenter.getDueDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _callCenter.getExpandoBridge();
	}

	/**
	 * Returns the extra1 of this call center.
	 *
	 * @return the extra1 of this call center
	 */
	@Override
	public boolean getExtra1() {
		return _callCenter.getExtra1();
	}

	/**
	 * Returns the extra2 of this call center.
	 *
	 * @return the extra2 of this call center
	 */
	@Override
	public boolean getExtra2() {
		return _callCenter.getExtra2();
	}

	/**
	 * Returns the extra3 of this call center.
	 *
	 * @return the extra3 of this call center
	 */
	@Override
	public boolean getExtra3() {
		return _callCenter.getExtra3();
	}

	/**
	 * Returns the group ID of this call center.
	 *
	 * @return the group ID of this call center
	 */
	@Override
	public long getGroupId() {
		return _callCenter.getGroupId();
	}

	/**
	 * Returns the has email of this call center.
	 *
	 * @return the has email of this call center
	 */
	@Override
	public boolean getHasEmail() {
		return _callCenter.getHasEmail();
	}

	/**
	 * Returns the has name of this call center.
	 *
	 * @return the has name of this call center
	 */
	@Override
	public boolean getHasName() {
		return _callCenter.getHasName();
	}

	/**
	 * Returns the has phone of this call center.
	 *
	 * @return the has phone of this call center
	 */
	@Override
	public boolean getHasPhone() {
		return _callCenter.getHasPhone();
	}

	/**
	 * Returns the modified date of this call center.
	 *
	 * @return the modified date of this call center
	 */
	@Override
	public Date getModifiedDate() {
		return _callCenter.getModifiedDate();
	}

	/**
	 * Returns the primary key of this call center.
	 *
	 * @return the primary key of this call center
	 */
	@Override
	public long getPrimaryKey() {
		return _callCenter.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _callCenter.getPrimaryKeyObj();
	}

	/**
	 * Returns the product of this call center.
	 *
	 * @return the product of this call center
	 */
	@Override
	public String getProduct() {
		return _callCenter.getProduct();
	}

	/**
	 * Returns the source of this call center.
	 *
	 * @return the source of this call center
	 */
	@Override
	public String getSource() {
		return _callCenter.getSource();
	}

	/**
	 * Returns the status of this call center.
	 *
	 * @return the status of this call center
	 */
	@Override
	public int getStatus() {
		return _callCenter.getStatus();
	}

	/**
	 * Returns the status by user ID of this call center.
	 *
	 * @return the status by user ID of this call center
	 */
	@Override
	public long getStatusByUserId() {
		return _callCenter.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this call center.
	 *
	 * @return the status by user name of this call center
	 */
	@Override
	public String getStatusByUserName() {
		return _callCenter.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this call center.
	 *
	 * @return the status by user uuid of this call center
	 */
	@Override
	public String getStatusByUserUuid() {
		return _callCenter.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this call center.
	 *
	 * @return the status date of this call center
	 */
	@Override
	public Date getStatusDate() {
		return _callCenter.getStatusDate();
	}

	/**
	 * Returns the title of this call center.
	 *
	 * @return the title of this call center
	 */
	@Override
	public String getTitle() {
		return _callCenter.getTitle();
	}

	/**
	 * Returns the localized title of this call center in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized title of this call center
	 */
	@Override
	public String getTitle(java.util.Locale locale) {
		return _callCenter.getTitle(locale);
	}

	/**
	 * Returns the localized title of this call center in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this call center. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getTitle(java.util.Locale locale, boolean useDefault) {
		return _callCenter.getTitle(locale, useDefault);
	}

	/**
	 * Returns the localized title of this call center in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized title of this call center
	 */
	@Override
	public String getTitle(String languageId) {
		return _callCenter.getTitle(languageId);
	}

	/**
	 * Returns the localized title of this call center in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this call center
	 */
	@Override
	public String getTitle(String languageId, boolean useDefault) {
		return _callCenter.getTitle(languageId, useDefault);
	}

	@Override
	public String getTitleCurrentLanguageId() {
		return _callCenter.getTitleCurrentLanguageId();
	}

	@Override
	public String getTitleCurrentValue() {
		return _callCenter.getTitleCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized titles of this call center.
	 *
	 * @return the locales and localized titles of this call center
	 */
	@Override
	public Map<java.util.Locale, String> getTitleMap() {
		return _callCenter.getTitleMap();
	}

	/**
	 * Returns the total scoring of this call center.
	 *
	 * @return the total scoring of this call center
	 */
	@Override
	public int getTotalScoring() {
		return _callCenter.getTotalScoring();
	}

	/**
	 * Returns the type of this call center.
	 *
	 * @return the type of this call center
	 */
	@Override
	public String getType() {
		return _callCenter.getType();
	}

	/**
	 * Returns the user ID of this call center.
	 *
	 * @return the user ID of this call center
	 */
	@Override
	public long getUserId() {
		return _callCenter.getUserId();
	}

	/**
	 * Returns the user name of this call center.
	 *
	 * @return the user name of this call center
	 */
	@Override
	public String getUserName() {
		return _callCenter.getUserName();
	}

	/**
	 * Returns the user uuid of this call center.
	 *
	 * @return the user uuid of this call center
	 */
	@Override
	public String getUserUuid() {
		return _callCenter.getUserUuid();
	}

	/**
	 * Returns the uuid of this call center.
	 *
	 * @return the uuid of this call center
	 */
	@Override
	public String getUuid() {
		return _callCenter.getUuid();
	}

	@Override
	public int hashCode() {
		return _callCenter.hashCode();
	}

	/**
	 * Returns <code>true</code> if this call center is approved.
	 *
	 * @return <code>true</code> if this call center is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return _callCenter.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _callCenter.isCachedModel();
	}

	/**
	 * Returns <code>true</code> if this call center is denied.
	 *
	 * @return <code>true</code> if this call center is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return _callCenter.isDenied();
	}

	/**
	 * Returns <code>true</code> if this call center is a draft.
	 *
	 * @return <code>true</code> if this call center is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return _callCenter.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _callCenter.isEscapedModel();
	}

	/**
	 * Returns <code>true</code> if this call center is expired.
	 *
	 * @return <code>true</code> if this call center is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return _callCenter.isExpired();
	}

	/**
	 * Returns <code>true</code> if this call center is extra1.
	 *
	 * @return <code>true</code> if this call center is extra1; <code>false</code> otherwise
	 */
	@Override
	public boolean isExtra1() {
		return _callCenter.isExtra1();
	}

	/**
	 * Returns <code>true</code> if this call center is extra2.
	 *
	 * @return <code>true</code> if this call center is extra2; <code>false</code> otherwise
	 */
	@Override
	public boolean isExtra2() {
		return _callCenter.isExtra2();
	}

	/**
	 * Returns <code>true</code> if this call center is extra3.
	 *
	 * @return <code>true</code> if this call center is extra3; <code>false</code> otherwise
	 */
	@Override
	public boolean isExtra3() {
		return _callCenter.isExtra3();
	}

	/**
	 * Returns <code>true</code> if this call center is has email.
	 *
	 * @return <code>true</code> if this call center is has email; <code>false</code> otherwise
	 */
	@Override
	public boolean isHasEmail() {
		return _callCenter.isHasEmail();
	}

	/**
	 * Returns <code>true</code> if this call center is has name.
	 *
	 * @return <code>true</code> if this call center is has name; <code>false</code> otherwise
	 */
	@Override
	public boolean isHasName() {
		return _callCenter.isHasName();
	}

	/**
	 * Returns <code>true</code> if this call center is has phone.
	 *
	 * @return <code>true</code> if this call center is has phone; <code>false</code> otherwise
	 */
	@Override
	public boolean isHasPhone() {
		return _callCenter.isHasPhone();
	}

	/**
	 * Returns <code>true</code> if this call center is inactive.
	 *
	 * @return <code>true</code> if this call center is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return _callCenter.isInactive();
	}

	/**
	 * Returns <code>true</code> if this call center is incomplete.
	 *
	 * @return <code>true</code> if this call center is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return _callCenter.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _callCenter.isNew();
	}

	/**
	 * Returns <code>true</code> if this call center is pending.
	 *
	 * @return <code>true</code> if this call center is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return _callCenter.isPending();
	}

	/**
	 * Returns <code>true</code> if this call center is scheduled.
	 *
	 * @return <code>true</code> if this call center is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return _callCenter.isScheduled();
	}

	@Override
	public void persist() {
		_callCenter.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {

		_callCenter.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
			java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {

		_callCenter.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_callCenter.setCachedModel(cachedModel);
	}

	/**
	 * Sets the call center ID of this call center.
	 *
	 * @param callCenterId the call center ID of this call center
	 */
	@Override
	public void setCallCenterId(long callCenterId) {
		_callCenter.setCallCenterId(callCenterId);
	}

	/**
	 * Sets the campaign ID of this call center.
	 *
	 * @param campaignId the campaign ID of this call center
	 */
	@Override
	public void setCampaignId(long campaignId) {
		_callCenter.setCampaignId(campaignId);
	}

	/**
	 * Sets the company ID of this call center.
	 *
	 * @param companyId the company ID of this call center
	 */
	@Override
	public void setCompanyId(long companyId) {
		_callCenter.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this call center.
	 *
	 * @param createDate the create date of this call center
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_callCenter.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this call center.
	 *
	 * @param description the description of this call center
	 */
	@Override
	public void setDescription(String description) {
		_callCenter.setDescription(description);
	}

	/**
	 * Sets the due date of this call center.
	 *
	 * @param dueDate the due date of this call center
	 */
	@Override
	public void setDueDate(Date dueDate) {
		_callCenter.setDueDate(dueDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_callCenter.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_callCenter.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_callCenter.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets whether this call center is extra1.
	 *
	 * @param extra1 the extra1 of this call center
	 */
	@Override
	public void setExtra1(boolean extra1) {
		_callCenter.setExtra1(extra1);
	}

	/**
	 * Sets whether this call center is extra2.
	 *
	 * @param extra2 the extra2 of this call center
	 */
	@Override
	public void setExtra2(boolean extra2) {
		_callCenter.setExtra2(extra2);
	}

	/**
	 * Sets whether this call center is extra3.
	 *
	 * @param extra3 the extra3 of this call center
	 */
	@Override
	public void setExtra3(boolean extra3) {
		_callCenter.setExtra3(extra3);
	}

	/**
	 * Sets the group ID of this call center.
	 *
	 * @param groupId the group ID of this call center
	 */
	@Override
	public void setGroupId(long groupId) {
		_callCenter.setGroupId(groupId);
	}

	/**
	 * Sets whether this call center is has email.
	 *
	 * @param hasEmail the has email of this call center
	 */
	@Override
	public void setHasEmail(boolean hasEmail) {
		_callCenter.setHasEmail(hasEmail);
	}

	/**
	 * Sets whether this call center is has name.
	 *
	 * @param hasName the has name of this call center
	 */
	@Override
	public void setHasName(boolean hasName) {
		_callCenter.setHasName(hasName);
	}

	/**
	 * Sets whether this call center is has phone.
	 *
	 * @param hasPhone the has phone of this call center
	 */
	@Override
	public void setHasPhone(boolean hasPhone) {
		_callCenter.setHasPhone(hasPhone);
	}

	/**
	 * Sets the modified date of this call center.
	 *
	 * @param modifiedDate the modified date of this call center
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_callCenter.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_callCenter.setNew(n);
	}

	/**
	 * Sets the primary key of this call center.
	 *
	 * @param primaryKey the primary key of this call center
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_callCenter.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_callCenter.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the product of this call center.
	 *
	 * @param product the product of this call center
	 */
	@Override
	public void setProduct(String product) {
		_callCenter.setProduct(product);
	}

	/**
	 * Sets the source of this call center.
	 *
	 * @param source the source of this call center
	 */
	@Override
	public void setSource(String source) {
		_callCenter.setSource(source);
	}

	/**
	 * Sets the status of this call center.
	 *
	 * @param status the status of this call center
	 */
	@Override
	public void setStatus(int status) {
		_callCenter.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this call center.
	 *
	 * @param statusByUserId the status by user ID of this call center
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_callCenter.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this call center.
	 *
	 * @param statusByUserName the status by user name of this call center
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_callCenter.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this call center.
	 *
	 * @param statusByUserUuid the status by user uuid of this call center
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_callCenter.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this call center.
	 *
	 * @param statusDate the status date of this call center
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		_callCenter.setStatusDate(statusDate);
	}

	/**
	 * Sets the title of this call center.
	 *
	 * @param title the title of this call center
	 */
	@Override
	public void setTitle(String title) {
		_callCenter.setTitle(title);
	}

	/**
	 * Sets the localized title of this call center in the language.
	 *
	 * @param title the localized title of this call center
	 * @param locale the locale of the language
	 */
	@Override
	public void setTitle(String title, java.util.Locale locale) {
		_callCenter.setTitle(title, locale);
	}

	/**
	 * Sets the localized title of this call center in the language, and sets the default locale.
	 *
	 * @param title the localized title of this call center
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setTitle(
		String title, java.util.Locale locale, java.util.Locale defaultLocale) {

		_callCenter.setTitle(title, locale, defaultLocale);
	}

	@Override
	public void setTitleCurrentLanguageId(String languageId) {
		_callCenter.setTitleCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized titles of this call center from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this call center
	 */
	@Override
	public void setTitleMap(Map<java.util.Locale, String> titleMap) {
		_callCenter.setTitleMap(titleMap);
	}

	/**
	 * Sets the localized titles of this call center from the map of locales and localized titles, and sets the default locale.
	 *
	 * @param titleMap the locales and localized titles of this call center
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setTitleMap(
		Map<java.util.Locale, String> titleMap,
		java.util.Locale defaultLocale) {

		_callCenter.setTitleMap(titleMap, defaultLocale);
	}

	/**
	 * Sets the total scoring of this call center.
	 *
	 * @param totalScoring the total scoring of this call center
	 */
	@Override
	public void setTotalScoring(int totalScoring) {
		_callCenter.setTotalScoring(totalScoring);
	}

	/**
	 * Sets the type of this call center.
	 *
	 * @param type the type of this call center
	 */
	@Override
	public void setType(String type) {
		_callCenter.setType(type);
	}

	/**
	 * Sets the user ID of this call center.
	 *
	 * @param userId the user ID of this call center
	 */
	@Override
	public void setUserId(long userId) {
		_callCenter.setUserId(userId);
	}

	/**
	 * Sets the user name of this call center.
	 *
	 * @param userName the user name of this call center
	 */
	@Override
	public void setUserName(String userName) {
		_callCenter.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this call center.
	 *
	 * @param userUuid the user uuid of this call center
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_callCenter.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this call center.
	 *
	 * @param uuid the uuid of this call center
	 */
	@Override
	public void setUuid(String uuid) {
		_callCenter.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<mx.movistar.col.lead.model.CallCenter> toCacheModel() {

		return _callCenter.toCacheModel();
	}

	@Override
	public mx.movistar.col.lead.model.CallCenter toEscapedModel() {
		return new CallCenterWrapper(_callCenter.toEscapedModel());
	}

	@Override
	public String toString() {
		return _callCenter.toString();
	}

	@Override
	public mx.movistar.col.lead.model.CallCenter toUnescapedModel() {
		return new CallCenterWrapper(_callCenter.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _callCenter.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CallCenterWrapper)) {
			return false;
		}

		CallCenterWrapper callCenterWrapper = (CallCenterWrapper)obj;

		if (Objects.equals(_callCenter, callCenterWrapper._callCenter)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _callCenter.getStagedModelType();
	}

	@Override
	public CallCenter getWrappedModel() {
		return _callCenter;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _callCenter.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _callCenter.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_callCenter.resetOriginalValues();
	}

	private final CallCenter _callCenter;

}
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
 * This class is used by SOAP remote services, specifically {@link mx.movistar.col.lead.service.http.LeadServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class LeadSoap implements Serializable {

	public static LeadSoap toSoapModel(Lead model) {
		LeadSoap soapModel = new LeadSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLeadId(model.getLeadId());
		soapModel.setCampaignId(model.getCampaignId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDueDate(model.getDueDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setSource(model.getSource());
		soapModel.setType(model.getType());
		soapModel.setProduct(model.getProduct());
		soapModel.setHasEmail(model.isHasEmail());
		soapModel.setHasPhone(model.isHasPhone());
		soapModel.setHasName(model.isHasName());
		soapModel.setExtra1(model.isExtra1());
		soapModel.setExtra2(model.isExtra2());
		soapModel.setExtra3(model.isExtra3());
		soapModel.setTotalScoring(model.getTotalScoring());

		return soapModel;
	}

	public static LeadSoap[] toSoapModels(Lead[] models) {
		LeadSoap[] soapModels = new LeadSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LeadSoap[][] toSoapModels(Lead[][] models) {
		LeadSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LeadSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LeadSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LeadSoap[] toSoapModels(List<Lead> models) {
		List<LeadSoap> soapModels = new ArrayList<LeadSoap>(models.size());

		for (Lead model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LeadSoap[soapModels.size()]);
	}

	public LeadSoap() {
	}

	public long getPrimaryKey() {
		return _leadId;
	}

	public void setPrimaryKey(long pk) {
		setLeadId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLeadId() {
		return _leadId;
	}

	public void setLeadId(long leadId) {
		_leadId = leadId;
	}

	public long getCampaignId() {
		return _campaignId;
	}

	public void setCampaignId(long campaignId) {
		_campaignId = campaignId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Date getDueDate() {
		return _dueDate;
	}

	public void setDueDate(Date dueDate) {
		_dueDate = dueDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getSource() {
		return _source;
	}

	public void setSource(String source) {
		_source = source;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getProduct() {
		return _product;
	}

	public void setProduct(String product) {
		_product = product;
	}

	public boolean getHasEmail() {
		return _hasEmail;
	}

	public boolean isHasEmail() {
		return _hasEmail;
	}

	public void setHasEmail(boolean hasEmail) {
		_hasEmail = hasEmail;
	}

	public boolean getHasPhone() {
		return _hasPhone;
	}

	public boolean isHasPhone() {
		return _hasPhone;
	}

	public void setHasPhone(boolean hasPhone) {
		_hasPhone = hasPhone;
	}

	public boolean getHasName() {
		return _hasName;
	}

	public boolean isHasName() {
		return _hasName;
	}

	public void setHasName(boolean hasName) {
		_hasName = hasName;
	}

	public boolean getExtra1() {
		return _extra1;
	}

	public boolean isExtra1() {
		return _extra1;
	}

	public void setExtra1(boolean extra1) {
		_extra1 = extra1;
	}

	public boolean getExtra2() {
		return _extra2;
	}

	public boolean isExtra2() {
		return _extra2;
	}

	public void setExtra2(boolean extra2) {
		_extra2 = extra2;
	}

	public boolean getExtra3() {
		return _extra3;
	}

	public boolean isExtra3() {
		return _extra3;
	}

	public void setExtra3(boolean extra3) {
		_extra3 = extra3;
	}

	public int getTotalScoring() {
		return _totalScoring;
	}

	public void setTotalScoring(int totalScoring) {
		_totalScoring = totalScoring;
	}

	private String _uuid;
	private long _leadId;
	private long _campaignId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Date _dueDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _title;
	private String _description;
	private String _source;
	private String _type;
	private String _product;
	private boolean _hasEmail;
	private boolean _hasPhone;
	private boolean _hasName;
	private boolean _extra1;
	private boolean _extra2;
	private boolean _extra3;
	private int _totalScoring;

}
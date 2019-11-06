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

import mx.movistar.col.lead.model.Lead;

/**
 * The cache model class for representing Lead in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class LeadCacheModel implements CacheModel<Lead>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeadCacheModel)) {
			return false;
		}

		LeadCacheModel leadCacheModel = (LeadCacheModel)obj;

		if (leadId == leadCacheModel.leadId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, leadId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", leadId=");
		sb.append(leadId);
		sb.append(", campaignId=");
		sb.append(campaignId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", dueDate=");
		sb.append(dueDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", source=");
		sb.append(source);
		sb.append(", type=");
		sb.append(type);
		sb.append(", product=");
		sb.append(product);
		sb.append(", hasEmail=");
		sb.append(hasEmail);
		sb.append(", hasPhone=");
		sb.append(hasPhone);
		sb.append(", hasName=");
		sb.append(hasName);
		sb.append(", extra1=");
		sb.append(extra1);
		sb.append(", extra2=");
		sb.append(extra2);
		sb.append(", extra3=");
		sb.append(extra3);
		sb.append(", totalScoring=");
		sb.append(totalScoring);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Lead toEntityModel() {
		LeadImpl leadImpl = new LeadImpl();

		if (uuid == null) {
			leadImpl.setUuid("");
		}
		else {
			leadImpl.setUuid(uuid);
		}

		leadImpl.setLeadId(leadId);
		leadImpl.setCampaignId(campaignId);
		leadImpl.setGroupId(groupId);
		leadImpl.setCompanyId(companyId);
		leadImpl.setUserId(userId);

		if (userName == null) {
			leadImpl.setUserName("");
		}
		else {
			leadImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			leadImpl.setCreateDate(null);
		}
		else {
			leadImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			leadImpl.setModifiedDate(null);
		}
		else {
			leadImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dueDate == Long.MIN_VALUE) {
			leadImpl.setDueDate(null);
		}
		else {
			leadImpl.setDueDate(new Date(dueDate));
		}

		leadImpl.setStatus(status);
		leadImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			leadImpl.setStatusByUserName("");
		}
		else {
			leadImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			leadImpl.setStatusDate(null);
		}
		else {
			leadImpl.setStatusDate(new Date(statusDate));
		}

		if (title == null) {
			leadImpl.setTitle("");
		}
		else {
			leadImpl.setTitle(title);
		}

		if (description == null) {
			leadImpl.setDescription("");
		}
		else {
			leadImpl.setDescription(description);
		}

		if (source == null) {
			leadImpl.setSource("");
		}
		else {
			leadImpl.setSource(source);
		}

		if (type == null) {
			leadImpl.setType("");
		}
		else {
			leadImpl.setType(type);
		}

		if (product == null) {
			leadImpl.setProduct("");
		}
		else {
			leadImpl.setProduct(product);
		}

		leadImpl.setHasEmail(hasEmail);
		leadImpl.setHasPhone(hasPhone);
		leadImpl.setHasName(hasName);
		leadImpl.setExtra1(extra1);
		leadImpl.setExtra2(extra2);
		leadImpl.setExtra3(extra3);
		leadImpl.setTotalScoring(totalScoring);

		leadImpl.resetOriginalValues();

		return leadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		leadId = objectInput.readLong();

		campaignId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dueDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		source = objectInput.readUTF();
		type = objectInput.readUTF();
		product = objectInput.readUTF();

		hasEmail = objectInput.readBoolean();

		hasPhone = objectInput.readBoolean();

		hasName = objectInput.readBoolean();

		extra1 = objectInput.readBoolean();

		extra2 = objectInput.readBoolean();

		extra3 = objectInput.readBoolean();

		totalScoring = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(leadId);

		objectOutput.writeLong(campaignId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dueDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (source == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(source);
		}

		if (type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (product == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(product);
		}

		objectOutput.writeBoolean(hasEmail);

		objectOutput.writeBoolean(hasPhone);

		objectOutput.writeBoolean(hasName);

		objectOutput.writeBoolean(extra1);

		objectOutput.writeBoolean(extra2);

		objectOutput.writeBoolean(extra3);

		objectOutput.writeInt(totalScoring);
	}

	public String uuid;
	public long leadId;
	public long campaignId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dueDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String title;
	public String description;
	public String source;
	public String type;
	public String product;
	public boolean hasEmail;
	public boolean hasPhone;
	public boolean hasName;
	public boolean extra1;
	public boolean extra2;
	public boolean extra3;
	public int totalScoring;

}
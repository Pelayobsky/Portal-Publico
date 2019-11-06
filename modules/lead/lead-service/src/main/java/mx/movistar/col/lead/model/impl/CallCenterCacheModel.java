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

import mx.movistar.col.lead.model.CallCenter;

/**
 * The cache model class for representing CallCenter in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CallCenterCacheModel
	implements CacheModel<CallCenter>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CallCenterCacheModel)) {
			return false;
		}

		CallCenterCacheModel callCenterCacheModel = (CallCenterCacheModel)obj;

		if (callCenterId == callCenterCacheModel.callCenterId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, callCenterId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", callCenterId=");
		sb.append(callCenterId);
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
	public CallCenter toEntityModel() {
		CallCenterImpl callCenterImpl = new CallCenterImpl();

		if (uuid == null) {
			callCenterImpl.setUuid("");
		}
		else {
			callCenterImpl.setUuid(uuid);
		}

		callCenterImpl.setCallCenterId(callCenterId);
		callCenterImpl.setCampaignId(campaignId);
		callCenterImpl.setGroupId(groupId);
		callCenterImpl.setCompanyId(companyId);
		callCenterImpl.setUserId(userId);

		if (userName == null) {
			callCenterImpl.setUserName("");
		}
		else {
			callCenterImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			callCenterImpl.setCreateDate(null);
		}
		else {
			callCenterImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			callCenterImpl.setModifiedDate(null);
		}
		else {
			callCenterImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dueDate == Long.MIN_VALUE) {
			callCenterImpl.setDueDate(null);
		}
		else {
			callCenterImpl.setDueDate(new Date(dueDate));
		}

		callCenterImpl.setStatus(status);
		callCenterImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			callCenterImpl.setStatusByUserName("");
		}
		else {
			callCenterImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			callCenterImpl.setStatusDate(null);
		}
		else {
			callCenterImpl.setStatusDate(new Date(statusDate));
		}

		if (title == null) {
			callCenterImpl.setTitle("");
		}
		else {
			callCenterImpl.setTitle(title);
		}

		if (description == null) {
			callCenterImpl.setDescription("");
		}
		else {
			callCenterImpl.setDescription(description);
		}

		if (source == null) {
			callCenterImpl.setSource("");
		}
		else {
			callCenterImpl.setSource(source);
		}

		if (type == null) {
			callCenterImpl.setType("");
		}
		else {
			callCenterImpl.setType(type);
		}

		if (product == null) {
			callCenterImpl.setProduct("");
		}
		else {
			callCenterImpl.setProduct(product);
		}

		callCenterImpl.setHasEmail(hasEmail);
		callCenterImpl.setHasPhone(hasPhone);
		callCenterImpl.setHasName(hasName);
		callCenterImpl.setExtra1(extra1);
		callCenterImpl.setExtra2(extra2);
		callCenterImpl.setExtra3(extra3);
		callCenterImpl.setTotalScoring(totalScoring);

		callCenterImpl.resetOriginalValues();

		return callCenterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		callCenterId = objectInput.readLong();

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

		objectOutput.writeLong(callCenterId);

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
	public long callCenterId;
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
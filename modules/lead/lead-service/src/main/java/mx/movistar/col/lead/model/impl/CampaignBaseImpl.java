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

import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.service.CampaignLocalServiceUtil;

/**
 * The extended model base implementation for the Campaign service. Represents a row in the &quot;LEAD_Campaign&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CampaignImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CampaignImpl
 * @see Campaign
 * @generated
 */
@ProviderType
public abstract class CampaignBaseImpl
	extends CampaignModelImpl implements Campaign {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a campaign model instance should use the <code>Campaign</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CampaignLocalServiceUtil.addCampaign(this);
		}
		else {
			CampaignLocalServiceUtil.updateCampaign(this);
		}
	}

}
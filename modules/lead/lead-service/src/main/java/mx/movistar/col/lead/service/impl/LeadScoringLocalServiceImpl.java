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

package mx.movistar.col.lead.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;

import java.util.List;

import mx.movistar.col.lead.model.LeadScoring;
import mx.movistar.col.lead.service.base.LeadScoringLocalServiceBaseImpl;

/**
 * The implementation of the lead scoring local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link mx.movistar.col.lead.service.LeadScoringLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author BriaArrayListn Wing Shun Chan
 * @see LeadScoringLocalServiceBaseImpl
 * @see mx.movistar.col.lead.service.LeadScoringLocalServiceUtil
 */
public class LeadScoringLocalServiceImpl extends LeadScoringLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link mx.movistar.col.lead.service.LeadScoringLocalServiceUtil} to access the lead scoring local service.
	 */
	
	
	public List<LeadScoring> getLeadScoringByPhoneAndIdLead(String phone, long idLead){
	
		DynamicQuery dynamicQuery = leadScoringLocalService.dynamicQuery();
		
		dynamicQuery.add(PropertyFactoryUtil.forName("leadId").eq(idLead));
		dynamicQuery.add(PropertyFactoryUtil.forName("msisdn").eq(phone));
		
		return leadScoringLocalService.dynamicQuery(dynamicQuery);
	}
	
	
}
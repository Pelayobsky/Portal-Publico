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
import java.util.ArrayList;
import java.util.List;

import mx.movistar.col.lead.model.Nir;
import mx.movistar.col.lead.service.base.NirLocalServiceBaseImpl;

/**
 * The implementation of the nir local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link mx.movistar.col.lead.service.NirLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NirLocalServiceBaseImpl
 * @see mx.movistar.col.lead.service.NirLocalServiceUtil
 */
public class NirLocalServiceImpl extends NirLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link mx.movistar.col.lead.service.NirLocalServiceUtil} to access the nir local service.
	 */
		
	public List<Nir> getNirByNumber(String number){
				
		DynamicQuery dynamicQueryNIR = nirLocalService.dynamicQuery();
		
		List<String> ladaDigits  = new ArrayList<>();
		List<String> serieDigits = new ArrayList<>();
				
		ladaDigits.add(number.substring(0, 2));
		ladaDigits.add(number.substring(0, 3));
		
		serieDigits.add(number.substring(2, 6));
		serieDigits.add(number.substring(3, 6));
		
		dynamicQueryNIR.add(PropertyFactoryUtil.forName("primaryKey.lada").in(ladaDigits));
		dynamicQueryNIR.add(PropertyFactoryUtil.forName("primaryKey.serie").in(serieDigits));		
		
		
		
		return nirLocalService.dynamicQuery(dynamicQueryNIR);
	}
	
	
}

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

package mx.movistar.col.lead.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NirService}.
 *
 * @author Brian Wing Shun Chan
 * @see NirService
 * @generated
 */
@ProviderType
public class NirServiceWrapper
	implements NirService, ServiceWrapper<NirService> {

	public NirServiceWrapper(NirService nirService) {
		_nirService = nirService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _nirService.getOSGiServiceIdentifier();
	}

	@Override
	public NirService getWrappedService() {
		return _nirService;
	}

	@Override
	public void setWrappedService(NirService nirService) {
		_nirService = nirService;
	}

	private NirService _nirService;

}
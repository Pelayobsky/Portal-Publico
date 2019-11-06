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
package mx.movistar.col.lead.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@ProviderType
public class CampaignValidationException extends PortalException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9088643235004771589L;

	public CampaignValidationException() {

	}

	public CampaignValidationException(String msg) {

		super(msg);
	}

	public CampaignValidationException(String msg, Throwable cause) {

		super(msg, cause);
	}

	public CampaignValidationException(Throwable cause) {

		super(cause);
	}

	/**
	 * Custom constructor taking a list as a parameter.
	 * 
	 * @param errors
	 */
	public CampaignValidationException(List<String> errors) {

		super(String.join(",", errors));
		_errors = errors;
	}

	public List<String> getErrors() {

		return _errors;
	}

	private List<String> _errors;
}
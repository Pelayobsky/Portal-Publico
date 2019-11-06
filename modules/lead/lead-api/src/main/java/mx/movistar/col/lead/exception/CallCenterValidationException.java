package mx.movistar.col.lead.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */

@ProviderType
public class CallCenterValidationException extends PortalException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9088643235004771589L;

	public CallCenterValidationException() {

	}

	public CallCenterValidationException(String msg) {

		super(msg);
	}

	public CallCenterValidationException(String msg, Throwable cause) {

		super(msg, cause);
	}

	public CallCenterValidationException(Throwable cause) {

		super(cause);
	}

	/**
	 * Custom constructor taking a list as a parameter.
	 * 
	 * @param errors
	 */
	public CallCenterValidationException(List<String> errors) {

		super(String.join(",", errors));
		_errors = errors;
	}

	public List<String> getErrors() {

		return _errors;
	}

	private List<String> _errors;

}

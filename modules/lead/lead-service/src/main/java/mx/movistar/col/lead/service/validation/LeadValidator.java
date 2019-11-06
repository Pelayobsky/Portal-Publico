/**
 * 
 */
package mx.movistar.col.lead.service.validation;

import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import mx.movistar.col.lead.exception.LeadValidationException;

/**
 * @author hectorsv
 *
 */
public class LeadValidator {
	
	/**
	 * Returns <code>true</code> if the given fields are valid for an
	 * Lead.
	 * 
	 * @param titleMap
	 * @param description
	 * @param dueDate
	 * @param errors
	 * @return boolean <code>true</code> if Lead is valid, otherwise
	 *         <code>false</code>
	 */
	public static boolean isLeadValid(
		final Map<Locale, String> titleMap,final String description,
		final Date dueDate,Map<String, String> parameters, final List<String> errors) {

		boolean result = true;

		result &= isTitleValid(titleMap, errors);
		result &= isDueDateValid(dueDate, errors);
		result &= isDescriptionValid(description, errors);
		result &= isParametersValid(parameters,errors);

		return result;
	}
	
	/**
	 * Validates Lead values and throws
	 * {LeadValidationExceptionException} if the Lead values are not
	 * valid.
	 * 
	 * @param titleMap
	 * @param description
	 * @param dueDate
	 * @throws LeadValidationExceptionException
	 */
	public static void validate(
		Map<Locale, String> titleMap, Map<String, String> parameters, String description, Date dueDate)
		throws LeadValidationException {

		List<String> errors = new ArrayList<>();
		if (!isLeadValid(titleMap, description, dueDate,parameters, errors)) {
			throw new LeadValidationException(errors);
		}
	}

	/**
	 * Returns <code>true</code> if description is valid for an Lead. If
	 * not valid, an error message is added to the errors list.
	 * 
	 * @param description
	 * @param errors
	 * @return boolean <code>true</code> if description is valid, otherwise
	 *         <code>false</code>
	 */
	public static boolean isDescriptionValid(
		final String description, final List<String> errors) {

		boolean result = true;

		if (Validator.isBlank(HtmlUtil.stripHtml(description))) {
			errors.add("error.lead-description-empty");
			result = false;
		}

		return result;
	}

	/**
	 * Returns <code>true</code> if due date is valid for an Lead. If not
	 * valid, an error message is added to the errors list.
	 * 
	 * @param dueDate
	 * @param errors
	 * @return boolean <code>true</code> if due date is valid, otherwise
	 *         <code>false</code>
	 */
	public static boolean isDueDateValid(
		final Date dueDate, final List<String> errors) {

		boolean result = true;

		if (Validator.isNull(dueDate)) {
			errors.add("error.Lead-date-empty");
			result = false;
		}

		return result;
	}

	/**
	 * Returns <code>true</code> if title is valid for an Lead. If not
	 * valid, an error message is added to the errors list.
	 * 
	 * @param titleMap
	 * @param errors
	 * @return boolean <code>true</code> if the title is valid, otherwise
	 *         <code>false</code>
	 */
	public static boolean isTitleValid(
		final Map<Locale, String> titleMap, final List<String> errors) {

		boolean result = true;

		// verify the map has something

		if (MapUtil.isEmpty(titleMap)) {
			errors.add("error.Lead-title-empty");
			result = false;
		}
		else {

			// get the default locale

			Locale defaultLocale = LocaleUtil.getSiteDefault();

			result = isTitleValid(titleMap.get(defaultLocale), errors);
		}

		// get the default title string

		return result;
	}

	/**
	 * Returns <code>true</code> if title is valid for an Lead.
	 * 
	 * @param title
	 * @param errors
	 * @return boolean <code>true</code> if title is valid, otherwise
	 *         <code>false</code>
	 */
	public static boolean isTitleValid(
		final String title, final List<String> errors) {

		boolean result = true;

		if ((Validator.isBlank(title))) {
			errors.add("error.Lead-title-empty");
			result = false;
		}

		return result;
	}
	
	/**
	 * Returns <code>true</code> if due date is valid for an Lead. If not
	 * valid, an error message is added to the errors list.
	 * 
	 * @param dueDate
	 * @param errors
	 * @return boolean <code>true</code> if due date is valid, otherwise
	 *         <code>false</code>
	 */
	public static boolean isParametersValid(
		final Map<String, String> parameters, final List<String> errors) {

		boolean result = true;
		
		if (MapUtil.isEmpty(parameters)) {
			errors.add("error.parameters-empty");
			result = false;
		}
		
		//campaignId
		if (Validator.isNull(parameters.get("campaignId"))) {
			errors.add("error.campaign-id-empty");
			result = false;
		}

		return result;
	}

}

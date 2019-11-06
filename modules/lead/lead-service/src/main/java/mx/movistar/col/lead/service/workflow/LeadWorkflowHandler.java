/**
 * 
 */
package mx.movistar.col.lead.service.workflow;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.permission.ResourceActions;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.service.LeadLocalService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true, 
		service = WorkflowHandler.class
	)
public class LeadWorkflowHandler extends BaseWorkflowHandler<Lead> {
	
	@Override
	public String getClassName() {

		return Lead.class.getName();
	}

	@Override
	public String getType(Locale locale) {

		return _resourceActions.getModelResource(locale, getClassName());
	}

	@Override
	public Lead updateStatus(
		int status, Map<String, Serializable> workflowContext)
		throws PortalException {

		long userId = GetterUtil.getLong(
			(String) workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));

		long resourcePrimKey = GetterUtil.getLong(
			(String) workflowContext.get(
				WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));

		if (_log.isDebugEnabled()) {
			_log.debug(
				"Updating workflow status for Lead " + resourcePrimKey);
		}

		ServiceContext serviceContext =
			(ServiceContext) workflowContext.get("serviceContext");

		return _leadLocalService.updateStatus(
			userId, resourcePrimKey, status, serviceContext);
	}

	@Reference
	private LeadLocalService _leadLocalService;

	@Reference
	private ResourceActions _resourceActions;

	private Log _log = LogFactoryUtil.getLog(LeadWorkflowHandler.class);
	
}

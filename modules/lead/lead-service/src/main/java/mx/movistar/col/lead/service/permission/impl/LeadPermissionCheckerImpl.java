/**
 * 
 */
package mx.movistar.col.lead.service.permission.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import org.osgi.service.component.annotations.Component;

import mx.movistar.col.lead.permission.LeadPermissionChecker;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true,
		property = {
			"model.class.name=mx.movistar.col.lead.model.Lead"
		},
		service = LeadPermissionChecker.class 
	)
public class LeadPermissionCheckerImpl implements LeadPermissionChecker {

	@Override
	public void check(
		PermissionChecker permissionChecker, long groupId, long leadId,
		String actionId)
			throws AuthException {
		
		if (!contains(permissionChecker, groupId, leadId, actionId)) {
			throw new AuthException();
		}
	}
	
	@Override
	public boolean contains(
		PermissionChecker permissionChecker, long groupId, long leadId,
		String actionId) {

		return (permissionChecker.hasPermission(
			groupId, RESOURCE_NAME, leadId, actionId));
	}

	@Override
	public void checkTopLevel(
		PermissionChecker permissionChecker, long groupId, String actionId)
			throws AuthException {

		if (!containsTopLevel(permissionChecker, groupId, actionId)) {
			throw new AuthException();
		}
	}

	@Override
	public boolean containsTopLevel(
		PermissionChecker permissionChecker, long groupId, String actionId) {
		return (permissionChecker.hasPermission(
			groupId, TOP_LEVEL_RESOURCE, groupId, actionId));
	}
	
	@Override
	public void checkBaseModel(PermissionChecker permissionChecker, long groupId, long primaryKey, String actionId)
			throws PortalException {
			check(permissionChecker, groupId, primaryKey, actionId);
	}
}

/**
 * 
 */
package mx.movistar.col.lead.permission;

import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import mx.movistar.col.lead.model.Lead;

/**
 * @author hectorsv
 *
 */
public interface LeadPermissionChecker extends BaseModelPermissionChecker {
	
	public static final String ADD_LEAD = "ADD_LEAD";
	
	public static final String RESOURCE_NAME = Lead.class.getName();
	
	public static final String TOP_LEVEL_RESOURCE = "mx.movistar.col.lead.model";

	public void check(
		PermissionChecker permissionChecker, long groupId, long LeadId,
		String actionId)
		throws AuthException;

	public void checkTopLevel(
		PermissionChecker permissionChecker, long groupId, String actionId)
		throws AuthException;

	public boolean contains(
		PermissionChecker permissionChecker, long groupId, long LeadId,
		String actionId);

	public boolean containsTopLevel(
		PermissionChecker permissionChecker, long groupId, String actionId);
	
}

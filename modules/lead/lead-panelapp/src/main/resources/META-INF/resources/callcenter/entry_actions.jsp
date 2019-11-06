<%-- 
	Actions menu for a single assignment.
--%>

<%@ include file="../init.jsp"%>

<c:set var="callCenter" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />

<liferay-ui:icon-menu markupView="lexicon">

	
	<c:if
		test="${callCenterPermissionChecker.contains(permissionChecker, scopeGroupId, callCenter.callCenterId, 'UPDATE' )}">
		<portlet:renderURL var="editCallCenterURL">
			<portlet:param name="mvcRenderCommandName"
				value="<%=MVCCommandNames.EDIT_CALLCENTER %>" />
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="callCenterId" value="${callCenter.callCenterId}" />
		</portlet:renderURL>

		<liferay-ui:icon message="edit" url="${editCallCenterURL}" />
	</c:if>
	
	<%-- Permissions action. --%>
	
	<c:if
		test="${callCenterPermissionChecker.contains(permissionChecker, scopeGroupId, callCenter.callCenterId, 'PERMISSIONS')}">

		<liferay-security:permissionsURL
			modelResource="mx.movistar.col.lead.model.CallCenter"
			modelResourceDescription="${callCenter.getTitle(locale)}"
			resourcePrimKey="${callCenter.callCenterId}" 
			var="permissionsURL" 
		/>

		<liferay-ui:icon message="permissions" url="${permissionsURL}" />
	</c:if>
		
	<%-- Delete action. --%>
	
	<c:if
		test="${callCenterPermissionChecker.contains(permissionChecker, scopeGroupId, callCenter.callCenterId, 'DELETE')}">

		<portlet:actionURL name="<%=MVCCommandNames.DELETE_CALLCENTER %>" var="deleteCallCenterURL">
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="callCenterId" value="${callCenter.callCenterId}" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="${deleteCallCenterURL}" />
	</c:if>
</liferay-ui:icon-menu>

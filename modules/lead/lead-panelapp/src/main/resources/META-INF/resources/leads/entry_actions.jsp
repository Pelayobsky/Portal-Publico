<%-- 
	Actions menu for a single assignment.
--%>

<%@ include file="../init.jsp"%>

<c:set var="lead" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />

<liferay-ui:icon-menu markupView="lexicon">

	
	<c:if
		test="${leadPermissionChecker.contains(permissionChecker, scopeGroupId, lead.leadId, 'UPDATE' )}">
		<portlet:renderURL var="editLeadURL">
			<portlet:param name="mvcRenderCommandName"
				value="<%=MVCCommandNames.EDIT_LEAD %>" />
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="leadId" value="${lead.leadId}" />
		</portlet:renderURL>

		<liferay-ui:icon message="edit" url="${editLeadURL}" />
	</c:if>
	
	<%-- Permissions action. --%>
	
	<c:if
		test="${leadPermissionChecker.contains(permissionChecker, scopeGroupId, lead.leadId, 'PERMISSIONS')}">

		<liferay-security:permissionsURL
			modelResource="mx.movistar.col.lead.model.Lead"
			modelResourceDescription="${lead.getTitle(locale)}"
			resourcePrimKey="${lead.leadId}" 
			var="permissionsURL" 
		/>

		<liferay-ui:icon message="permissions" url="${permissionsURL}" />
	</c:if>
		
	<%-- Delete action. --%>
	
	<c:if
		test="${leadPermissionChecker.contains(permissionChecker, scopeGroupId, lead.leadId, 'DELETE')}">

		<portlet:actionURL name="<%=MVCCommandNames.DELETE_LEAD %>" var="deleteLeadURL">
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="leadId" value="${lead.leadId}" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="${deleteLeadURL}" />
	</c:if>
</liferay-ui:icon-menu>

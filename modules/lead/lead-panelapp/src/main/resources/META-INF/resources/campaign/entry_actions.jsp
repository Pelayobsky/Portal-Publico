<%-- 
	Actions menu for a single assignment.
--%>

<%@ include file="../init.jsp"%>

<c:set var="campaign" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />

<liferay-ui:icon-menu markupView="lexicon">

	
	<c:if
		test="${campaignPermissionChecker.contains(permissionChecker, scopeGroupId, campaign.campaignId, 'UPDATE' )}">
		<portlet:renderURL var="editCampaignURL">
			<portlet:param name="mvcRenderCommandName"
				value="<%=MVCCommandNames.EDIT_CAMPAIGN %>" />
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="campaignId" value="${campaign.campaignId}" />
		</portlet:renderURL>

		<liferay-ui:icon message="edit" url="${editCampaignURL}" />
	</c:if>
	
	<%-- Permissions action. --%>
	
	<c:if
		test="${campaignPermissionChecker.contains(permissionChecker, scopeGroupId, campaign.campaignId, 'PERMISSIONS')}">

		<liferay-security:permissionsURL
			modelResource="mx.movistar.col.lead.model.Campaign"
			modelResourceDescription="${campaign.getTitle(locale)}"
			resourcePrimKey="${campaign.campaignId}" 
			var="permissionsURL" 
		/>

		<liferay-ui:icon message="permissions" url="${permissionsURL}" />
	</c:if>
		
	<%-- Delete action. --%>
	
	<c:if
		test="${campaignPermissionChecker.contains(permissionChecker, scopeGroupId, campaign.campaignId, 'DELETE')}">

		<portlet:actionURL name="<%=MVCCommandNames.DELETE_CAMPAIGN %>" var="deleteCampaignURL">
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="campaignId" value="${campaign.campaignId}" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="${deleteCampaignURL}" />
	</c:if>
</liferay-ui:icon-menu>

 <%--
	The main view.
--%>
 
<%@ include file="../init.jsp"%>


<%-- Success messages. --%>

<liferay-ui:success key="callCenter-added" message="callCenter-added-successfully" />
<liferay-ui:success key="callCenter-updated" message="callCenter-updated-successfully" />
<liferay-ui:success key="callCenter-deleted" message="callCenter-deleted-successfully" />

<portlet:renderURL var="editCallCenterURL">
	<portlet:param name="mvcRenderCommandName" value="<%=MVCCommandNames.EDIT_CALLCENTER %>" />
	<portlet:param name="redirect" value="${currentURL}" />
</portlet:renderURL>

<liferay-ddm:template-renderer 
	className="${callCenterClassName}"
	displayStyle="${ADTdisplayStyle}"
	displayStyleGroupId="${ADTdisplayStyleGroupId}" 
	entries="${callCenter}">

	<div class="container-fluid-1280">
	
		<h1><liferay-ui:message key="callCenter" /></h1>
		
		<%-- Clay management toolbar. --%>
		
		
		
		<%-- Search container. --%>
	
		<liferay-ui:search-container 
			emptyResultsMessage="no-callCenter"
			id="callCenterEntries"
			iteratorURL="${portletURL}" 
			total="${callCenterCount}">

			<liferay-ui:search-container-results results="${callCenter}" />

			<liferay-ui:search-container-row
				className="mx.movistar.col.lead.model.CallCenter"
				modelVar="entry">

				<%@ include file="/callcenter/entry_search_columns.jspf" %>

			</liferay-ui:search-container-row>
			
			<%-- Iterator / Paging --%>

			<liferay-ui:search-iterator 
				markupView="lexicon" 
			/>
		</liferay-ui:search-container>
		
		<liferay-frontend:add-menu>
    		<liferay-frontend:add-menu-item title='Nombre' url="${editCallCenterURL}"  />
		</liferay-frontend:add-menu>
	</div>
</liferay-ddm:template-renderer>

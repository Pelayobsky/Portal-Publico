 <%--
	The main view.
--%>
 
<%@ include file="../init.jsp"%>


<%-- Success messages. --%>

<liferay-ui:success key="lead-added" message="lead-added-successfully" />
<liferay-ui:success key="lead-updated" message="lead-updated-successfully" />
<liferay-ui:success key="lead-deleted" message="lead-deleted-successfully" />

<portlet:renderURL var="editLeadURL">
	<portlet:param name="mvcRenderCommandName" value="<%=MVCCommandNames.EDIT_LEAD %>" />
	<portlet:param name="redirect" value="${currentURL}" />
</portlet:renderURL>

<liferay-ddm:template-renderer 
	className="${leadClassName}"
	displayStyle="${ADTdisplayStyle}"
	displayStyleGroupId="${ADTdisplayStyleGroupId}" 
	entries="${leads}">

	<div class="container-fluid-1280">
	
		<h1><liferay-ui:message key="leads" /></h1>
		
		<%-- Clay management toolbar. --%>
		
		
		
		<%-- Search container. --%>
	
		<liferay-ui:search-container 
			emptyResultsMessage="no-lead"
			id="leadEntries"
			iteratorURL="${portletURL}" 
			total="${leadCount}">

			<liferay-ui:search-container-results results="${leads}" />

			<liferay-ui:search-container-row
				className="mx.movistar.col.lead.model.Lead"
				modelVar="entry">

				<%@ include file="/leads/entry_search_columns.jspf" %>

			</liferay-ui:search-container-row>
			
			<%-- Iterator / Paging --%>

			<liferay-ui:search-iterator 
				markupView="lexicon" 
			/>
		</liferay-ui:search-container>
		
		<liferay-frontend:add-menu>
    		<liferay-frontend:add-menu-item title='Nombre' url="${editLeadURL}"  />
		</liferay-frontend:add-menu>
	</div>
</liferay-ddm:template-renderer>

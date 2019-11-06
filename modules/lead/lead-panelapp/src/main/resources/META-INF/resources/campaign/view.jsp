<%@ include file="../init.jsp"%>

<%-- Success messages. --%>

<liferay-ui:success key="campaign-added" message="campaign-added-successfully" />
<liferay-ui:success key="campaign-updated" message="campaign-updated-successfully" />
<liferay-ui:success key="campaign-deleted" message="campaign-deleted-successfully" />

<portlet:renderURL var="editCampaignURL">
	<portlet:param name="mvcRenderCommandName" value="<%=MVCCommandNames.EDIT_CAMPAIGN %>" />
	<portlet:param name="redirect" value="${currentURL}" />
</portlet:renderURL>

<liferay-ddm:template-renderer 
	className="${campaignClassName}"
	displayStyle="${ADTdisplayStyle}"
	displayStyleGroupId="${ADTdisplayStyleGroupId}" 
	entries="${campaigns}">

	<div class="container-fluid-1280">
	
		<h1><liferay-ui:message key="campaigns" /></h1>
		
		<%-- Search container. --%>
	
		<liferay-ui:search-container 
			emptyResultsMessage="no-campaign"
			id="campaignEntries"
			iteratorURL="${portletURL}" 
			total="${campaignsCount}">

			<liferay-ui:search-container-results results="${campaigns}" />

			<liferay-ui:search-container-row
				className="mx.movistar.col.lead.model.Campaign"
				modelVar="entry">

				<%@ include file="/campaign/entry_search_columns.jspf" %>

			</liferay-ui:search-container-row>
			
			<%-- Iterator / Paging --%>

			<liferay-ui:search-iterator 
				markupView="lexicon" 
			/>
		</liferay-ui:search-container>
		
		<liferay-frontend:add-menu>
    		<liferay-frontend:add-menu-item title='Nombre' url="${editCampaignURL}"  />
		</liferay-frontend:add-menu>
	</div>
</liferay-ddm:template-renderer>

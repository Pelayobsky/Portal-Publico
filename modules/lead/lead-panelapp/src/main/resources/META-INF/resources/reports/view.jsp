<%@page import="mx.movistar.col.lead.panelapp.constants.MVCCommandNames"%>
<%@page import="mx.movistar.col.lead.business.constants.ReportType"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="../init.jsp" %>
<%
	String toDate = ParamUtil.getString(request,"toDate");
	String fromDate = ParamUtil.getString(request, "fromDate");
	
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("jspPage", "reports/view.jsp");
	portletURL.setParameter("toDate", toDate);
	portletURL.setParameter("fromDate", fromDate);
	

%>

<portlet:renderURL var="searchLeadReportURL">
	<portlet:param name="mvcRenderCommandName" value="<%=MVCCommandNames.VIEW_LEAD_REPORT%>" />
</portlet:renderURL>

<portlet:resourceURL id="<%=MVCCommandNames.EXPORT_LEAD_REPORT%>" var="exportOnlineLeadReportURL" >
	<portlet:param name="reportType" value="<%=ReportType.ONLINE.name()%>"/>
</portlet:resourceURL>

<portlet:resourceURL id="<%=MVCCommandNames.EXPORT_LEAD_REPORT%>" var="exportCronLeadReportURL" >
	<portlet:param name="reportType" value="<%=ReportType.CRON.name()%>"/>
</portlet:resourceURL>

	<div class="container-fluid-1280 lead-report">
	
		<h1><liferay-ui:message key="lead-report.title" /></h1>
		<aui:form action="" name="fm" onSubmit="event.preventDefault();" method="post">
			
			<aui:fieldset-group markupView="lexicon">
			
				<aui:fieldset>
					
					<%-- Date Range fields. --%>
					<aui:row>
						<aui:col width="25">
							<aui:input id="fromDate" name="fromDate" type="date" label="label-report.from-date.title" value="${fromDateInputValue}">
								<aui:validator name="required" />
							</aui:input>
						</aui:col>
					</aui:row>
					
					<aui:row>
						<aui:col width="25">
							<aui:input id="toDate" name="toDate" type="date" label="label-report.to-date.title" value="${toDateInputValue}">
								<aui:validator name="required" />
							</aui:input>
						</aui:col>
					</aui:row>
					
				</aui:fieldset>
			</aui:fieldset-group>
			
			<%--Buttons. --%>
			<aui:button-row>
				<aui:button id="searchButton" cssClass="btn btn-primary" type="submit" value="label-report.searchResults" />
				<aui:button id="exportOnlineButton" cssClass="btn btn-info" type="submit" value="label-report.exportOnlineResults" />
				<aui:button id="exportCronButton" cssClass="btn btn-info" type="submit" value="label-report.exportCronResults" />
			</aui:button-row>
			
		</aui:form>
		
		<%-- Search container for Online Lead Report. --%>
		<h1><liferay-ui:message key="online-lead-report.search-container.title" />${iteratorURL}
		</h1>
		<liferay-ui:search-container 
			emptyResultsMessage="online-lead-report.search-container.no-records" 
			id="onlineLeadReportEntries"
			iteratorURL="<%=portletURL%>" 
			total="${leadReportEntriesCount}">
	
			<liferay-ui:search-container-results results="${leadReportEntries}" />
	
			<liferay-ui:search-container-row
				className="mx.movistar.col.lead.model.impl.LeadReportImpl"
				modelVar="entry">
	
				<%@ include file="/reports/entry_search_columns_online_lead_report.jspf" %>
	
			</liferay-ui:search-container-row>
			
			<%-- Iterator / Paging --%>
	
			<liferay-ui:search-iterator 
				markupView="lexicon" paginate="true"
			/>
		</liferay-ui:search-container>
		
	</div>


<aui:script>

	/**
	* Handle form submit. Set editor value to the hidden field 
	* which transports the value to the backend.
	*/
	AUI().ready(function() {
		
		$('#<portlet:namespace />fm').on('submit', function(A) {
			
			submitForm(document.<portlet:namespace />fm);
			
		});
		
		$('#<portlet:namespace />searchButton').on('click', function() {
			
			$('#<portlet:namespace />fm').attr('action', '${searchLeadReportURL}');
			
		});
		
		$('#<portlet:namespace />exportOnlineButton').on('click', function() {
			
			$('#<portlet:namespace />fm').attr('action', '${exportOnlineLeadReportURL}');
			
		});
		
		$('#<portlet:namespace />exportCronButton').on('click', function() {
			
			$('#<portlet:namespace />fm').attr('action', '${exportCronLeadReportURL}');
			
		});
		
		$('#<portlet:namespace />exportButton').on('click', function() {
			
			console.log("Click on Menu Item");
			console.log($("#<portlet:namespace />fromDateInput").val());
			console.log($("#<portlet:namespace />toDateInput").val());
			
			/*$.ajax({
				type: "POST",
				url: "${exportLeadReportURL}",
				data: {
					<portlet:namespace />fromDate: $("#<portlet:namespace />fromDateInput").val(),
					<portlet:namespace />toDate: $("#<portlet:namespace />toDateInput").val()
				},
				dataType: "application/vnd.ms-excel",
				success: function (response, textStatus, request) {
					var a = document.createElement("a");
					a.href = response.file; 
					a.download = response.name;
					document.body.appendChild(a);
					a.click();
					a.remove();
				},
				error: function (ajaxContext) {
					console.log('Export error: ' + ajaxContext.responseText);
				},
				failure: function(msg) {
					console.log(msg);
				}
			});*/
			
		});
		
	});

</aui:script>
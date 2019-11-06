<%-- 
	Lead editing view.
--%>

<%@ include file="../init.jsp"%>

<%-- Generate add / edit action URL and set title. --%>

<c:choose>
	<c:when test="${not empty campaign}">
		<portlet:actionURL var="campaignActionURL" name="<%=MVCCommandNames.EDIT_CAMPAIGN %>">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>

		<c:set var="editTitle" value="edit-campaign"/>
	</c:when>
	<c:otherwise>
		<portlet:actionURL var="campaignActionURL" name="<%=MVCCommandNames.ADD_CAMPAIGN %>">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>

		<c:set var="editTitle" value="add-campaign"/>
	</c:otherwise>
</c:choose>

<%-- Error messages. --%>

<liferay-ui:error key="error.campaign-service-error" message="error.campaign-service-error" />
<liferay-ui:error key="error.campaign-title-empty" message="error.campaign-title-empty" />
<liferay-ui:error key="error.campaign-description-empty" message="error.campaign-description-empty" />
<liferay-ui:error key="error.campaign-date-empty" message="error.campaign-date-empty" />

<div class="container-fluid-1280 edit-campaign">

	<h1><liferay-ui:message key="${editTitle}" /></h1>

	<aui:model-context bean="${campaign}" model="${campaignClass}" />

	<aui:form action="${campaignActionURL}" name="fm" onSubmit="event.preventDefault();">

		<aui:input name="campaignId" field="campaignId" type="hidden" />
		
		<aui:fieldset-group markupView="lexicon">
		
			<aui:fieldset>
				
				<%-- Title field. --%>
				<aui:input name="title">
				
					<aui:validator name="required" />
					
					<%-- Custom AUI validator. --%>
					<aui:validator errorMessage="error.campaign-title-format" name="custom">
						function(val, fieldNode, ruleValue) {
							var wordExpression = 
								new RegExp("^[^\\[\\]\\^$<>]*$");
							
							return wordExpression.test(val);
						}
					</aui:validator>
				</aui:input>

				<%-- Description field. --%>
				<aui:input name="description" type="textarea">
					<aui:validator name="required" />
				</aui:input>

				<%-- Due date field. --%>
				<aui:input name="dueDate">
					<aui:validator name="required" />
				</aui:input>
				
			</aui:fieldset>
		</aui:fieldset-group>
		
		<%--Buttons. --%>
		
		<aui:button-row>
			<aui:button cssClass="btn btn-primary" type="submit" />
			<aui:button cssClass="btn btn-secondary" onClick="${param.redirect}" type="cancel" />
		</aui:button-row>
	</aui:form>

</div>


<aui:script>

	/**
	* Handle form submit. Set editor value to the hidden field 
	* which transports the value to the backend.
	*/
	AUI().ready(function() {
		
		$('#<portlet:namespace />fm').on('submit', function() {


			submitForm(document.<portlet:namespace />fm);
		});
	});

</aui:script>

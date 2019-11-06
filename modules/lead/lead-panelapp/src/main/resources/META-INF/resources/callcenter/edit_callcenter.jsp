<%-- 
	Lead editing view.
--%>

<%@page import="mx.movistar.col.lead.panelapp.constants.TypeLead"%>
<%@page import="mx.movistar.col.lead.panelapp.constants.LeadsPortletKeys"%>
<%@ include file="../init.jsp"%>

<%-- Generate add / edit action URL and set title. --%>

<c:choose>
	<c:when test="${not empty callCenter}">
		<portlet:actionURL var="callCenterccallCenterURL" name="<%=MVCCommandNames.EDIT_CALLCENTER %>">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>

		<c:set var="editTitle" value="edit-callCenter"/>
	</c:when>
	<c:otherwise>
		<portlet:actionURL var="callCenterActionURL" name="<%=MVCCommandNames.ADD_CALLCENTER %>">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>

		<c:set var="editTitle" value="add-callCenter"/>
	</c:otherwise>
</c:choose>

<%-- Error messages. --%>

<liferay-ui:error key="error.callCenter-service-error" message="error.callCenter-service-error" />
<liferay-ui:error key="error.callCenter-title-empty" message="error.callCenter-title-empty" />
<liferay-ui:error key="error.callCenter-description-empty" message="error.callCenter-description-empty" />
<liferay-ui:error key="error.callCenter-date-empty" message="error.callCenter-date-empty" />

<div class="container-fluid-1280 edit-callCenter">

	<h1><liferay-ui:message key="${editTitle}" /></h1>

	<aui:model-context bean="${callCenter}" model="${callCenterClass}" />

	<aui:form action="${callCenterActionURL}" name="fm" onSubmit="event.preventDefault();">

		<aui:input name="callCenterId" field="callCenterId" type="hidden" />
		<aui:input name="campaignId" field="campaignId" type="hidden" />
		
		<aui:fieldset-group markupView="lexicon">
		
			<aui:fieldset>
				
				<%-- Campaign field. --%>
				
				<%--aui:select name="campaign" label="label.campaign-title" >
					<aui:option value=""> Seleccione una campaña </aui:option> 
					  <c:forEach items="${campaigns}" var="camp">
					    <aui:option 
					    	value="${camp.getCampaignId()}" 
					    	label="${camp.getTitle(themeDisplay.getLocale())}" 
					    	selected="${camp.getCampaignId()==callCenter.getCampaignId()?true:false}"/>
					    	
					  </c:forEach>
					  <aui:validator name="required" />
				</aui:select --%>
				
				<%-- Title field. --%>
				<aui:input name="title">
				
					<aui:validator name="required" />
					
					<%-- Custom AUI validator. --%>
					<aui:validator errorMessage="error.assignment-title-format" name="custom">
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
				
				<%-- EndPoint field --%>
				<aui:input name="endPoint" type="textarea">
				</aui:input>
				
				<%-- User field. --%>
				<aui:input name="user" type="textarea">
				</aui:input>
				
				<%-- Password field. --%>
				<aui:input name="password" type="textarea">
				</aui:input>
				
				<%-- Source Lead field. --%>
				<%--aui:select name="source" label="label.source-title">
    				<aui:option value=""><liferay-ui:message key="label.source-select-empty"/></aui:option> 
					  <c:forEach items="${sources}" var="source">
					    <aui:option 
					    	value="${source}" 
					    	label="${source}" 
					    	selected="${source==callCenter.getSource()?true:false}"/>
					  </c:forEach>
					  <aui:validator name="required" />
				</aui:select --%>
				
				<%-- Products field. --%>
				
				<aui:select name="product" label="label.product-title" >
					<aui:option value=""><liferay-ui:message key="label.product-select-empty"/></aui:option> 
					  <c:forEach items="${products}" var="product">
					    <aui:option 
					    	value="${product}" 
					    	label="${product}" 
					    	selected="${product==callCenter.getProduct()?true:false}"/>
					  </c:forEach>
					  <aui:validator name="required" />
				</aui:select>
				
				<%-- Types field. --%>
				
				<aui:select name="type" label="label.types-title" >
					<aui:option value=""><liferay-ui:message key="label.product-select-empty"/></aui:option> 
					  <c:forEach items="${types}" var="type">
					    <aui:option 
					    	value="${type}" 
					    	label="${type}" 
					    	selected="${types==callCenter.getType()?true:false}"/>
					  </c:forEach>
					  <aui:validator name="required" />
				</aui:select>
				
				<%-- Due date field. --%>
				<aui:input name="dueDate">
					<aui:validator name="required" />
				</aui:input>
				
				<%--aui:fieldset label="label.metadata-information">
					<aui:row>
			          <aui:col width="33">
			              <aui:input label="label.name-field" name="hasName" type="checkbox" checked="${callCenter.getHasName()}" />
			          </aui:col>
			          <aui:col width="33">
			             <aui:input label="label.email-field" name="hasEmail" type="checkbox" checked="${callCenter.getHasEmail()}" />
			          </aui:col>
			           <aui:col width="33">
			              <aui:input label="label.phone-field" name="hasPhone" type="checkbox" checked="${callCenter.getHasPhone()}"/>
			          </aui:col>
	         		</aui:row>
	         		<aui:row>
			          <aui:col width="33">
			              <aui:input label="label.extra1-field" name="extra1" type="checkbox" checked="${callCenter.getExtra1()}" />
			          </aui:col>
			          <aui:col width="33">
			             <aui:input label="label.extra2-field" name="extra2" type="checkbox" checked="${callCenter.getExtra2()}" />
			          </aui:col>
			           <aui:col width="33">
			              <aui:input label="label.extra3-field" name="extra3" type="checkbox" checked="${callCenter.getExtra3()}"/>
			          </aui:col>
	         		</aui:row>
	         	</aui:fieldset --%>
        
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
			
			
			//var editorValue = window['<portlet:namespace />descriptionEditor'].getHTML();
			
			//if (editorValue.length == 0) {
			//	return false;
			//}
			
			//window['<portlet:namespace />description'].value = editorValue;

			submitForm(document.<portlet:namespace />fm);
		});
	});

</aui:script>

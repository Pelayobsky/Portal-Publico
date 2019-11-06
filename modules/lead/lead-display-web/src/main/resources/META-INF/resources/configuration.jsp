
<%@ include file="init.jsp" %>

<% 
	LeadDisplayAccessContext leadDisplayContext = new LeadDisplayAccessContext(renderRequest);
	LeadDisplayPortletInstanceConfiguration displayPortletInstanceConfiguration = leadDisplayContext.getLeadDisplayPortletInstanceConfiguration();
%>

<liferay-portlet:actionURL portletConfiguration="<%= true %>"
	var="configurationActionURL"
/>

<liferay-portlet:renderURL portletConfiguration="<%= true %>"
	var="configurationRenderURL"
/>

<div class="container-fluid-1280">

	<aui:form action="<%= configurationActionURL %>" method="post" name="fm">
		
		<aui:input name="<%= Constants.CMD %>" type="hidden"
			value="<%= Constants.UPDATE %>"
		/>
	
		<aui:input name="redirect" type="hidden"
			value="<%= configurationRenderURL %>"
		/>
		<aui:fieldset-group markupView="lexicon">
			
			<%-- Campaign field. --%>
			<aui:fieldset>
				<aui:select name="preferences--leadId--" label="label.lead-title" value="<%= displayPortletInstanceConfiguration.leadId() %>">
					<aui:option value=""> Seleccione un Lead </aui:option> 
					  <c:forEach items="${leads}" var="lead">
					    <aui:option 
					    	value="${lead.getLeadId()}" 
					    	label="${lead.getTitle(themeDisplay.getLocale())}" 
					    	/>
					    	
					  </c:forEach>
					  <aui:validator name="required" />
				</aui:select>
			</aui:fieldset>	
			
			<aui:fieldset label="leaddisplay.label-displayStyle" helpMessage="leaddisplay.label-displayStyle-description">
				<aui:row>
					<div class="display-template">
						<liferay-ddm:template-selector
							className="<%=Lead.class.getName()%>"
							displayStyle="<%=displayPortletInstanceConfiguration.displayStyle()%>"
							displayStyleGroupId="<%=displayPortletInstanceConfiguration.displayStyleGroupId()%>"
							refreshURL="<%=PortalUtil.getCurrentURL(request)%>" 
							showEmptyOption="<%= true %>"
							/>
					</div>
				</aui:row>
			</aui:fieldset>
			
			<aui:row>	
				<aui:fieldset>
					<aui:col md="6" sm="6">
                    	<aui:input autoFocus="true" helpMessage="leaddisplay.label-title-description" label="leaddisplay.label-title" name="preferences--title--" type="text" value="<%= String.valueOf(displayPortletInstanceConfiguration.title()) %>" />
						<aui:input helpMessage="leaddisplay.label-subtitle-description" label="leaddisplay.label-subtitle" name="preferences--subtitle--" type="text" value="<%= String.valueOf(displayPortletInstanceConfiguration.subtitle()) %>" />   
                	</aui:col>
                	<aui:col md="6" sm="6">
                        <aui:input helpMessage="leaddisplay.label-field1-description" label="leaddisplay.label-field1" name="preferences--field1--" type="text" value="<%= String.valueOf(displayPortletInstanceConfiguration.field1()) %>" />
						<aui:input helpMessage="leaddisplay.label-freeText-description" label="leaddisplay.label-freeText" name="preferences--freeText--" type="text" value="<%= String.valueOf(displayPortletInstanceConfiguration.freeText()) %>" />
                	</aui:col>
				</aui:fieldset>
			</aui:row>	
		</aui:fieldset-group>
		<aui:button-row>
			<aui:button type="submit"></aui:button>
		</aui:button-row>
	</aui:form>
</div>

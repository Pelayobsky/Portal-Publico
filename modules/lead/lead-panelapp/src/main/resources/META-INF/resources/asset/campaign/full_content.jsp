<%-- 
	This is for showing assignment full content in Asset Publisher portlet.  
--%>


<%@page import="mx.movistar.col.lead.model.Campaign"%>
<%@page import="com.liferay.asset.kernel.model.AssetRenderer"%>
<%@ include file="../init.jsp"%>

<%
	AssetRenderer<?> assetRenderer = (AssetRenderer<?>)request.getAttribute(WebKeys.ASSET_RENDERER);
					
	String viewEntryURL = assetRenderer.getURLView(liferayPortletResponse, WindowState.MAXIMIZED);
					
	Campaign campaign = (Campaign)request.getAttribute("campaign");					
%>

<aui:a cssClass="title-link" href="<%= viewEntryURL %>">
	<h3 class="title"><%= HtmlUtil.escape(lead.getTitle(locale)) %></h3>
</aui:a>

<div class="autofit-col autofit-col-expand">
	${campaign.getDescription()}
</div>

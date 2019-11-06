<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="mx.movistar.col.lead.display.constants.LeadDisplayWebPortletKeys"%>
<%@page import="mx.movistar.col.lead.configuration.LeadDisplayPortletInstanceConfiguration"%>
<%@page import="mx.movistar.col.lead.display.portlet.config.LeadDisplayAccessContext"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletURL"%>
<%@page import="mx.movistar.col.lead.display.constants.MVCCommandNames"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="mx.movistar.col.lead.model.Lead"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="liferay-ddm" uri="http://liferay.com/tld/ddm" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />


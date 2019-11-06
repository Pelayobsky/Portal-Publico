
<%@ include file="/init.jsp" %>

<c:choose>
 	<c:when test="${not empty leads}">
 		
 		<liferay-ddm:template-renderer
    		className="${className}"
    		contextObjects="${contextObjects}"
    		displayStyle="${displayStyle}"
			displayStyleGroupId="${displayStyleGroupId}"
    		entries="${leads}"
		>

		</liferay-ddm:template-renderer> 
 		
 	</c:when>
 	<c:otherwise>
		<liferay-ui:error key="no-lead-display-config" message="no-lead-display-config"/>
	</c:otherwise>
 </c:choose>
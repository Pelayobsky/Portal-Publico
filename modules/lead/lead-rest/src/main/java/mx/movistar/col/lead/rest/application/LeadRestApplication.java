package mx.movistar.col.lead.rest.application;

import com.google.gson.Gson;
import com.liferay.expando.kernel.model.ExpandoColumn;
import com.liferay.expando.kernel.model.ExpandoTable;
import com.liferay.expando.kernel.model.ExpandoValue;
import com.liferay.expando.kernel.service.ExpandoColumnLocalService;
import com.liferay.expando.kernel.service.ExpandoTableLocalService;
import com.liferay.expando.kernel.service.ExpandoValueLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ClassNameLocalService;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Collections;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.business.api.LeadBusinessService;
import mx.movistar.col.lead.business.exception.BusinessErrorCodeRelationship;
import mx.movistar.col.lead.business.exception.BusinessException;
import mx.movistar.col.lead.business.model.GenericLead;
import mx.movistar.col.lead.model.LeadScoring;
import mx.movistar.col.lead.rest.model.ResponseLead;

@ApplicationPath("/lead")
@Component(immediate = true, service = Application.class)
public class LeadRestApplication extends Application {
	
	private static final Log _logger = LogFactoryUtil.getLog(LeadRestApplication.class);
	
	@Reference
	private LeadBusinessService _leadServiceImpl;	
	
	@Reference
	private UserLocalService _userLocalService;
	
	@Reference
	private ClassNameLocalService _classNameLocalServiceUtil;

	@Reference
	private ExpandoTableLocalService _expandoTableLocalService;
	
	@Reference
	private ExpandoColumnLocalService _expandoColumnLocalService;
	
	@Reference
	private ExpandoValueLocalService _expandoValueLocalService;
	
	@POST
	@Produces("application/json")
	public Response addLead(@Context HttpServletRequest request, GenericLead lead, @HeaderParam("authorization") String authString) {
		
		Gson gson = new Gson();
		ResponseLead response = new ResponseLead();
		
		_logger.debug("AuthType : " + request.getAuthType() );
		_logger.debug("AuthString : " + authString );
		
		//_logger.info("AuthType : " + request.getAuthType() );
		//_logger.info("AuthString : " + authString );
		
		if( Validator.isNull(authString) || !isUserAuthenticated( authString, request ) ) {
			response.setCode(401);
			response.setCorrecto(false);
			response.setError("User not authenticated");
			return Response.status(Status.UNAUTHORIZED).entity(gson.toJson(response)).build();
		}
		
		lead.setIp(request.getRemoteHost());
		
		try {
			String origen = getScreenNameByRequest(authString,request);
			_logger.info(origen);
			lead.setOrigen(origen);
			LeadScoring newLeadScoring =_leadServiceImpl.saveLead(lead);

			if(Validator.isNull(newLeadScoring.getPrimaryKey())) throw new BusinessException("",BusinessErrorCodeRelationship.NINE);
			
			response.setCode(newLeadScoring.getPrimaryKey());
			response.setCorrecto(true);
			response.setError("");
			
			return Response.ok().entity(gson.toJson(response)).build();
		}catch(BusinessException be) {
			
			_logger.info(be);
			response.setCode(0);
			response.setCorrecto(false);
			response.setError(be.getMessage());
			
			return Response.status(Status.BAD_REQUEST).entity(gson.toJson(response)).build();
		}catch(Exception e) {

			_logger.info(e);
			response.setCode(0);
			response.setCorrecto(false);
			response.setError("Error");
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(gson.toJson(response)).build();
		}
	}
	
	@POST
	@Path("/validateNir")
	@Produces("application/json")
	public Response valirNir(@Context HttpServletRequest req, GenericLead lead ) {
		
		try {
			_leadServiceImpl.isMsisdnValid(lead.getPhone());

			return Response.ok().entity("true").build();
		}catch(BusinessException be) {
			
			return Response.status(Status.BAD_REQUEST).entity("false").build();
		}catch(Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("false").build();
		}
	}
	
	@GET
	@Produces("application/json")
	public Response test() {

		Gson gson = new Gson();
		ResponseLead response = new ResponseLead();
		
		response.setCode(1);
		response.setCorrecto(true);
		response.setError("sin 4" );				
		
		return Response.ok().entity(gson.toJson(response)).build();
	}
	
	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}
	
	private String getScreenNameByRequest(String authString, HttpServletRequest request) {
	
		String decodedAuth = "";
		
		// Decode Authentication String to Original value.
		
		String[] authParts = authString.split("\\s+");
		String   authInfo  = authParts[1];
		
		byte[] bytes = null;
		
		try {
			
			bytes = Base64.getDecoder().decode(authInfo );
			decodedAuth = new String(bytes,"utf-8");
			_logger.debug("Decoded Auth string : \"" + decodedAuth + "\"");
			
		} catch (UnsupportedEncodingException ex) {
			_logger.error(ex);
			return "";
		}
		
		String[] decodedAuthParts = decodedAuth.split("\\:");
		
		_logger.debug("Decoded Auth Parts length : " + decodedAuthParts.length);
		
		/*
		 * Check that Basic Authentication has user and token.
		 */
		if(decodedAuthParts.length < 2) {
			return "";
		}
		 		
		try {
			
			// Get Company from Http Servlet Request
			long companyId = PortalUtil.getCompanyId(request);
			
			_logger.debug( "Company ID : " + companyId );
			
			// Get User by Screen Name
			User user = _userLocalService.getUserByScreenName(companyId, decodedAuthParts[0] );
			
			return user.getScreenName();
			
		} catch (Exception e) {
			_logger.error(e);
			return "";
		}
	}
	
	private boolean isUserAuthenticated(String authString, HttpServletRequest request) {
		
		String decodedAuth = "";
		
		// Decode Authentication String to Original value.
		
		String[] authParts = authString.split("\\s+");
		String   authInfo  = authParts[1];
		
		byte[] bytes = null;
		
		try {
			
			bytes = Base64.getDecoder().decode(authInfo );
			decodedAuth = new String(bytes,"utf-8");
			_logger.debug("Decoded Auth string : \"" + decodedAuth + "\"");
			
		} catch (UnsupportedEncodingException ex) {
			_logger.error(ex);
			return false;
		}
		
		String[] decodedAuthParts = decodedAuth.split("\\:");
		
		_logger.debug("Decoded Auth Parts length : " + decodedAuthParts.length);
		
		/*
		 * Check that Basic Authentication has user and token.
		 */
		if(decodedAuthParts.length < 2) {
			return false;
		}
		 
		/**
		 * Check that Basic Auth Token equals to User Custom Field Token.
		 **/
		
		try {
			
			// Get Company from Http Servlet Request
			long companyId = PortalUtil.getCompanyId(request);
			
			_logger.debug( "Company ID : " + companyId );
			
			// Get User by Screen Name
			User user = _userLocalService.getUserByScreenName(companyId, decodedAuthParts[0] );
			
			_logger.debug( "User : " + user.toString() );
			
			// Get Class Name ID for Model User
			long classNameId = _classNameLocalServiceUtil.getClassNameId(User.class.getName());
			
			// Get User Expando Table 
			ExpandoTable table = _expandoTableLocalService.getDefaultTable(companyId, User.class.getName());
			
			_logger.debug( "Table : " + table.toString() );
			
			// Get Lead Token Column
			ExpandoColumn column = _expandoColumnLocalService.getColumn(companyId, classNameId, table.getName(), "leadToken");
			
			_logger.debug( "Column : " + column.toString() );
			
			// Get Token Value
			ExpandoValue value = _expandoValueLocalService.getValue(companyId, classNameId, table.getName(), column.getName(), user.getUserId());
						
			_logger.debug( "Value : " + value);
			
			return Validator.isNotNull(value) && value.getData().equals(decodedAuthParts[1]);
			
		} catch (Exception e) {
			_logger.error(e);
			return false;
		}
		
	}
	
}
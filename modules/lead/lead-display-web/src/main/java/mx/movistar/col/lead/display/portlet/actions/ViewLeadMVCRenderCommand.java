/**
 * 
 */
package mx.movistar.col.lead.display.portlet.actions;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.configuration.LeadDisplayPortletInstanceConfiguration;
import mx.movistar.col.lead.configuration.api.LeadSystemWSConfiguration;
import mx.movistar.col.lead.display.constants.LeadDisplayWebPortletKeys;
import mx.movistar.col.lead.display.constants.MVCCommandNames;
import mx.movistar.col.lead.display.portlet.config.LeadDisplayAccessContext;
import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.service.LeadLocalService;

/**
 * @author hectorsv
 *
 */
@Component(
		configurationPid = {
				"mx.movistar.col.lead.configuration.LeadDisplaySystemServiceConfiguration",
				"mx.movistar.col.lead.configuration.api.LeadSystemWSConfiguration"
				},
		immediate = true,
		property = {
			"javax.portlet.name=" + LeadDisplayWebPortletKeys.LEAD_DISPLAY,
			"mvc.command.name=" + MVCCommandNames.VIEW_DISPLAY_LEAD
		},
		service = MVCRenderCommand.class
	)
public class ViewLeadMVCRenderCommand implements MVCRenderCommand {
	
	private static final Log _logger = LogFactoryUtil.getLog(ViewLeadMVCRenderCommand.class);
	
	@Reference
	private LeadLocalService _leadLocalService;
	
	/* (non-Javadoc)
	 * @see com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand#render(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
				
		//cargamos el configuration del widget
		LeadDisplayAccessContext accessContext = new LeadDisplayAccessContext(renderRequest);
		LeadDisplayPortletInstanceConfiguration displayPortletInstanceConfiguration = 
				accessContext.getLeadDisplayPortletInstanceConfiguration();
		
		//validamos si la configuración del widget ha sido cargada
		if(Validator.isNull(displayPortletInstanceConfiguration) || 
				Validator.isNull(displayPortletInstanceConfiguration.leadId())) {
			renderRequest.setAttribute("leads", new ArrayList<>());
			
		}else {
						
			ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
			Map<String, Object> contextObjects = new HashMap<>();
			try {
				//una vez que el configuration del widget esta cargado, consultamos el lead
				Lead lead = _leadLocalService.getLead(Long.valueOf(displayPortletInstanceConfiguration.leadId()));
				
				//cargamos el lead a la lista que será enviada a la plantilla ADT y lo ponemos como atributo
				renderRequest.setAttribute("leads", Arrays.asList(lead));
				
				//generamos el actionURL del ActionCommand que registrará el scoring del Lead
				LiferayPortletURL addScoringLeadActioURL = PortletURLFactoryUtil.create(renderRequest, 
						themeDisplay.getPortletDisplay().getId(), 
							themeDisplay.getPlid(), PortletRequest.RESOURCE_PHASE);
				addScoringLeadActioURL.setResourceID(MVCCommandNames.ADD_SCORING_LEAD);
				
				//llenamos el mapa de parametro adicionales que se le pasaran a la plantilla ADT
				contextObjects.put("addScoringLeadResourceURL", addScoringLeadActioURL.toString());
				contextObjects.put("ns", renderResponse.getNamespace());
				contextObjects.put("title", displayPortletInstanceConfiguration.title());
				contextObjects.put("subtitle", displayPortletInstanceConfiguration.subtitle());
				contextObjects.put("field1", displayPortletInstanceConfiguration.field1());
				contextObjects.put("freeText", displayPortletInstanceConfiguration.freeText());
				contextObjects.put("isOutOfDate", isOutOfDate(Validator.isNull(_configuration.atentoHorary()) ? "9,21" : _configuration.atentoHorary()));
				
				renderRequest.setAttribute("contextObjects", contextObjects);
				//colocamos atributtos necesarios para el render el ADT
				renderRequest.setAttribute("className", Lead.class.getName());
				renderRequest.setAttribute("displayStyle", displayPortletInstanceConfiguration.displayStyle());
				renderRequest.setAttribute("displayStyleGroupId", displayPortletInstanceConfiguration.displayStyleGroupId());
			} catch (PortalException e) {
				_logger.error("Error al consultar el Lead",e);
			}
		}
		
		return "/view.jsp";
	}
	
	public Boolean isOutOfDate(String config) {
		Boolean valid = Boolean.FALSE;
		String[] hours = config.split(",");
		Integer desde = Integer.valueOf(hours[0]);
		Integer hasta = Integer.valueOf(hours[1]);
		
		LocalTime now = LocalTime.now();
		
		if(now.getHour() < desde || now.getHour() >= hasta) {
			valid = Boolean.TRUE;
		}
		return valid;
	}
	
	@Activate   
	@Modified
    protected void activate(Map<String, Object> properties) {
        _configuration = ConfigurableUtil.createConfigurable(
        		LeadSystemWSConfiguration.class, properties);
    }
	
	private volatile LeadSystemWSConfiguration _configuration;
	
}

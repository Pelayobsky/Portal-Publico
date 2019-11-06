/**
 * 
 */
package mx.movistar.col.lead.configuration.definition;

import com.liferay.portal.kernel.settings.definition.ConfigurationBeanDeclaration;

import org.osgi.service.component.annotations.Component;

import mx.movistar.col.lead.configuration.LeadDisplayPortletInstanceConfiguration;

/**
 * @author hectorsv
 *
 */
@Component
public class LeadDisplayPortletInstanceConfigurationBeanDeclaration implements ConfigurationBeanDeclaration {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.liferay.portal.kernel.settings.definition.ConfigurationBeanDeclaration#
	 * getConfigurationBeanClass()
	 */
	@Override
	public Class<?> getConfigurationBeanClass() {
		return LeadDisplayPortletInstanceConfiguration.class;
	}

}

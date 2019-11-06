package mx.movistar.col.lead.upgrade;

import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;
import org.osgi.service.component.annotations.Component;
import mx.movistar.col.lead.upgrade.v1_1_0.AddCallCenter;
 
@Component(immediate = true, service = UpgradeStepRegistrator.class)
public class LeadUpgradeStepRegistrator implements UpgradeStepRegistrator {
 
    private static final String BUNDLE_SYMBOLIC_NAME = "mx.movistar.col.lead.service";
 
    @Override
    public void register(Registry registry) {
 
        registry.register(BUNDLE_SYMBOLIC_NAME, "1.0.0", "1.1.0",
                new AddCallCenter()
                );
    }
 
}

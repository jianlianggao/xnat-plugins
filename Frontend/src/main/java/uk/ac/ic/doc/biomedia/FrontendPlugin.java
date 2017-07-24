package uk.ac.ic.doc.biomedia;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.nrg.xdat.bean.BiomediaUserattributescollectionBean;

/**
 * Created by gmlenz on 31/08/16.
 */
@XnatPlugin(value = "frontend-plugin", name = "Custom XNAT frontend",
        description = "Frontend modifications for dHCP")
public class FrontendPlugin {
    @Bean
    public String testMessage() {
        return "Hello there from the UserAttributes plugin!";
    }

}

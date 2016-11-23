package org.nrg.xnat.biomedia.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by gmlenz on 31/08/16.
 */
@XnatPlugin(value = "userterms-plugin", name = "Custom user attributes", description = "Store information about user's attributes",
        entityPackages = "org.nrg.xnat.biomedia.userTerms.entities"
/*        ,dataModels = {@XnatDataModel(value = WorkshopBiosamplecollectionBean.SCHEMA_ELEMENT_NAME,
                singular = "User Terms of Use",
                plural = "User Terms of Use")}*/
)
@ComponentScan({"org.nrg.xnat.biomedia.userTerms.services.impl",
        "org.nrg.xnat.biomedia.userTerms.repositories",
        "org.nrg.xnat.biomedia.userTerms.rest"})
public class UserTermsPlugin {
    @Bean
    public String testMessage() {
        return "Hello there from the UserTerms plugin!";
    }

}

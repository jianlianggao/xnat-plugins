package org.nrg.xnat.biomedia.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.nrg.xdat.bean.BiomediaUserattributescollectionBean;

/**
 * Created by gmlenz on 31/08/16.
 */
@XnatPlugin(value = "userattributes-plugin", name = "Custom user attributes",
        description = "Store information about user's attributes",
        entityPackages = "org.nrg.xnat.biomedia.userAttributes.entities",
        dataModels = {@XnatDataModel(value = BiomediaUserattributescollectionBean.SCHEMA_ELEMENT_NAME,
                singular = "User Attribute", plural = "User Attributes")})
@ComponentScan({"org.nrg.xnat.biomedia.userAttributes.services.impl",
        "org.nrg.xnat.biomedia.userAttributes.repositories",
        "org.nrg.xnat.biomedia.userAttributes.rest",
        "org.nrg.xnat.biomedia.userAttributes.preferences"})
public class UserAttributesPlugin {
    @Bean
    public String testMessage() {
        return "Hello there from the UserAttributes plugin!";
    }

}

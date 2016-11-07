package uk.ac.ic.doc.biomedia.plugins.userattributes;

import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by gmlenz on 31/08/16.
 */
@XnatPlugin(value = "userattributes-plugin", name = "Custom user attributes", description = "Store information about user's attributes",
            entityPackages = "uk.ac.ic.doc.biomedia.plugins.userattributes.entities")
@ComponentScan({"uk.ac.ic.doc.biomedia.plugins.userattributes.services.impl",
                "uk.ac.ic.doc.biomedia.plugins.userattributes.repositories",
                "uk.ac.ic.doc.biomedia.plugins.userattributes.rest"})
public class UserAttributesPlugin {
    @Bean
    public String testMessage() {
        return "Hello there from the UserAttributes plugin!";
    }

}

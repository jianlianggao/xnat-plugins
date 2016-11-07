package uk.ac.ic.doc.biomedia.plugins.userterms;

import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by gmlenz on 31/08/16.
 */
@XnatPlugin(value = "userterms-plugin", name = "Custom user attributes", description = "Store information about user's attributes",
            entityPackages = "uk.ac.ic.doc.biomedia.plugins.userterms.entities")
@ComponentScan({"uk.ac.ic.doc.biomedia.plugins.userterms.services.impl",
        "uk.ac.ic.doc.biomedia.plugins.userterms.repositories",
        "uk.ac.ic.doc.biomedia.plugins.userterms.rest"})
public class UserTermsPlugin {
    @Bean
    public String testMessage() {
        return "Hello there from the UserTerms plugin!";
    }

}

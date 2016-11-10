package uk.ac.ic.doc.biomedia;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by gmlenz on 31/08/16.
 */
@XnatPlugin(value = "userterms-plugin", name = "Custom user attributes", description = "Store information about user's attributes",
        entityPackages = "uk.ac.ic.doc.biomedia.entities"
/*        ,dataModels = {@XnatDataModel(value = WorkshopBiosamplecollectionBean.SCHEMA_ELEMENT_NAME,
                singular = "User Terms of Use",
                plural = "User Terms of Use")}*/
)
@ComponentScan({"uk.ac.ic.doc.biomedia.services.impl",
        "uk.ac.ic.doc.biomedia.repositories",
        "uk.ac.ic.doc.biomedia.rest"})
public class UserTermsPlugin {
    @Bean
    public String testMessage() {
        return "Hello there from the UserTerms plugin!";
    }

}

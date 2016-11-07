/*
 * xnat-workshop-plugin: WorkshopXnatPlugin
 * XNAT http://www.xnat.org
 * Copyright (c) 2016, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package uk.ac.ic.doc.biomedia.plugins.downloadwholeproject.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.WorkshopBiosamplecollectionBean;
import org.nrg.xdat.bean.RadRadiologyreaddataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "workshopPlugin", name = "XNAT 1.7 Workshop 2016 Plugin", entityPackages = "uk.ac.ic.doc.biomedia.plugins.downloadwholeproject.entities",
            dataModels = {@XnatDataModel(value = WorkshopBiosamplecollectionBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Biosample Collection",
                                         plural = "Biosample Collections"),
                          @XnatDataModel(value = RadRadiologyreaddataBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Radiology Read",
                                         plural = "Radiology Reads")})
@ComponentScan({"uk.ac.ic.doc.biomedia.plugins.downloadwholeproject.subjectmapping.preferences",
        "uk.ac.ic.doc.biomedia.plugins.downloadwholeproject.subjectmapping.repositories",
        "uk.ac.ic.doc.biomedia.plugins.downloadwholeproject.subjectmapping.rest",
        "uk.ac.ic.doc.biomedia.plugins.downloadwholeproject.subjectmapping.services.impl"})
public class WorkshopXnatPlugin {
    @Bean
    public String workshopPluginMessage() {
        return "Hello there from the workshop plugin!";
    }
}

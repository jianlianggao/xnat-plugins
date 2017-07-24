/*
 * xnat-workshop-plugin: WorkshopXnatPlugin
 * XNAT http://www.xnat.org
 * Copyright (c) 2016, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package uk.ac.ic.doc.biomedia;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
//import org.nrg.xdat.bean.WorkshopBiosamplecollectionBean;
//import org.nrg.xdat.bean.RadRadiologyreaddataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "downloadPlugin", name = "Adds download options to pull tarballs or torrents")
public class DownloadPlugin {
    @Bean
    public String workshopPluginMessage() {
        return "Hello there from the download plugin!";
    }
}

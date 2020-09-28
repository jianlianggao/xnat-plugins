/*
 * xnat-workshop-plugin: org.nrg.xnat.workshop.subjectmapping.preferences.SubjectMappingPreferencesBean
 * XNAT http://www.xnat.org
 * Copyright (c) 2016, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.biomedia.userAttributes.preferences;

import org.nrg.framework.configuration.ConfigPaths;
import org.nrg.prefs.annotations.NrgPreference;
import org.nrg.prefs.annotations.NrgPreferenceBean;
import org.nrg.prefs.beans.AbstractPreferenceBean;
import org.nrg.prefs.exceptions.InvalidPreferenceName;
import org.nrg.prefs.services.NrgPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@NrgPreferenceBean(toolId = "userAttributes", toolName = "XNAT User Attributes Plugin")
public class UserAttributesPreferencesBean extends AbstractPreferenceBean {
    @Autowired
    public UserAttributesPreferencesBean(final NrgPreferenceService preferenceService, final ConfigPaths configFolderPaths) {
        super(preferenceService, configFolderPaths);
    }

    @NrgPreference
    public List<String> getSourceSystemIds() {
        return getListValue("sourceSystemIds");
    }

    public void setSourceSystemIds(final List<String> sourceSystemIds) {
        try {
            setListValue("sourceSystemIds", sourceSystemIds);
        } catch (InvalidPreferenceName invalidPreferenceName) {
            //
        }
    }
}

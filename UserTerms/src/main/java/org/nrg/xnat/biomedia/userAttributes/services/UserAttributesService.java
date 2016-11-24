package org.nrg.xnat.biomedia.userAttributes.services;

import org.nrg.framework.orm.hibernate.BaseHibernateService;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;

import java.util.HashMap;
import java.util.List;

public interface UserAttributesService extends BaseHibernateService<UserAttributes> {
    /**
     * Finds the subject with the indicated {@link UserAttributes#getSubjectId() subject ID}.
     *
     * @param subjectId The subject ID.
     *
     * @return The subject with the indicated ID, null if not found.
     */
    UserAttributes findByUsername(final String username);

    UserAttributes findBySubjectId(final String subjectId);

    String getStringAttributeForUser(final String user, String key);

    Boolean getBooleanAttributeForUser(final String user, Boolean key);

    HashMap getAttributesForUsername (final String user, List keys);

    void setAttributesForUsername(final String user, HashMap attributes);
}

package org.nrg.xnat.biomedia.userAttributes.services;

import org.nrg.framework.orm.hibernate.BaseHibernateService;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;

import java.util.HashMap;

public interface UserAttributesService extends BaseHibernateService<UserAttributes> {
    /**
     * Finds the subject with the indicated {@link UserAttributes#getSubjectId() subject ID}.
     *
     * @param subjectId The subject ID.
     *
     * @return The subject with the indicated ID, null if not found.
     */
    UserAttributes findBySubjectId(final String subjectId);

    UserAttributes getAttributesForUser (final String user);
    void setAttributesForUser(final String User, HashMap attributes);

}

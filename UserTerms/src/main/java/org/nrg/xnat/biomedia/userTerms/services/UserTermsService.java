package org.nrg.xnat.biomedia.userTerms.services;

import org.nrg.framework.orm.hibernate.BaseHibernateService;
import org.nrg.xnat.biomedia.userTerms.entities.UserTerms;

import java.util.HashMap;

public interface UserTermsService extends BaseHibernateService<UserTerms> {
    /**
     * Finds the subject with the indicated {@link UserTerms#getSubjectId() subject ID}.
     *
     * @param subjectId The subject ID.
     *
     * @return The subject with the indicated ID, null if not found.
     */
    UserTerms findBySubjectId(final String subjectId);

    UserTerms getAttributesForUser (final String user);
    void setAttributesForUser(final String User, HashMap attributes);

}

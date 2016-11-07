package uk.ac.ic.doc.biomedia.plugins.userattributes.services;

import org.nrg.framework.orm.hibernate.BaseHibernateService;
import uk.ac.ic.doc.biomedia.plugins.userattributes.entities.UserAttributes;

public interface UserAttributesService extends BaseHibernateService<UserAttributes> {
    /**
     * Finds the subject with the indicated {@link UserAttributes#getSubjectId() subject ID}.
     *
     * @param subjectId The subject ID.
     *
     * @return The subject with the indicated ID, null if not found.
     */
    UserAttributes findBySubjectId(final String subjectId);

}

package uk.ac.ic.doc.biomedia.plugins.userattributes.services.impl;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;
import org.nrg.framework.orm.hibernate.AbstractHibernateEntityService;
import uk.ac.ic.doc.biomedia.plugins.userattributes.entities.UserAttributes;
import uk.ac.ic.doc.biomedia.plugins.userattributes.repositories.UserAttributesRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uk.ac.ic.doc.biomedia.plugins.userattributes.services.UserAttributesService;

import javax.inject.Inject;
import java.util.List;

@Service
public class HibernateSubjectMappingService extends AbstractHibernateEntityService<UserAttributes, UserAttributesRepository> implements UserAttributesService {
    /**
     * {@inheritDoc}
     */
    @Transactional
    @Override
    public UserAttributes findBySubjectId(final String subjectId) {
        return getDao().findByUniqueProperty("subjectId", subjectId);
    }


    public void setHasAcceptedTerms(final Boolean hasAcceptedTerms) {
        //getDao().create()
    }

    public UserAttributes getAttributesForUser(String user) {
        UserAttributes example = new UserAttributes();
        example.setAuthUser(user);
        List<UserAttributes> attributes = _dao.findByExample(example, AbstractHibernateEntity.getExcludedProperties("verified", "failedLoginAttempts"));
        if (attributes == null || attributes.size() == 0) { return null; }
        return attributes.get(0);
    }

    @Inject
    private UserAttributesRepository _dao;
}

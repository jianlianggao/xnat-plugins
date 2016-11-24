package org.nrg.xnat.biomedia.userAttributes.services.impl;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;
import org.nrg.framework.orm.hibernate.AbstractHibernateEntityService;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;
import org.nrg.xnat.biomedia.userAttributes.repositories.UserAttributesRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.nrg.xnat.biomedia.userAttributes.services.UserAttributesService;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;

@Service
public class HibernateUserAttributesService extends AbstractHibernateEntityService<UserAttributes, UserAttributesRepository> implements UserAttributesService {

    @Inject
    private UserAttributesRepository _dao;

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

    public void setAttributesForUser(final String user, HashMap attributes) {

    }

    public UserAttributes getAttributesForUser(String user) {
        UserAttributes example = new UserAttributes();
        example.setAuthUser(user);
        List<UserAttributes> attributes = _dao.findByExample(example, AbstractHibernateEntity.getExcludedProperties("verified", "failedLoginAttempts"));
        if (attributes == null || attributes.size() == 0) { return null; }
        return attributes.get(0);
    }

}

package org.nrg.xnat.biomedia.userTerms.services.impl;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;
import org.nrg.framework.orm.hibernate.AbstractHibernateEntityService;
import org.nrg.xnat.biomedia.userTerms.entities.UserTerms;
import org.nrg.xnat.biomedia.userTerms.repositories.UserTermsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.nrg.xnat.biomedia.userTerms.services.UserTermsService;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;

@Service
public class HibernateUserTermsService extends AbstractHibernateEntityService<UserTerms, UserTermsRepository> implements UserTermsService {

    @Inject
    private UserTermsRepository _dao;

    /**
     * {@inheritDoc}
     */
    @Transactional
    @Override
    public UserTerms findBySubjectId(final String subjectId) {
        return getDao().findByUniqueProperty("subjectId", subjectId);
    }


    public void setHasAcceptedTerms(final Boolean hasAcceptedTerms) {
        //getDao().create()
    }

    public void setAttributesForUser(final String user, HashMap attributes) {

    }

    public UserTerms getAttributesForUser(String user) {
        UserTerms example = new UserTerms();
        example.setAuthUser(user);
        List<UserTerms> attributes = _dao.findByExample(example, AbstractHibernateEntity.getExcludedProperties("verified", "failedLoginAttempts"));
        if (attributes == null || attributes.size() == 0) { return null; }
        return attributes.get(0);
    }

}

package org.nrg.xnat.biomedia.userAttributes.services.impl;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;
import org.nrg.framework.orm.hibernate.AbstractHibernateEntityService;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;
import org.nrg.xnat.biomedia.userAttributes.repositories.UserAttributesRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.nrg.xnat.biomedia.userAttributes.services.UserAttributesService;

import javax.inject.Inject;
import javax.persistence.Entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class HibernateUserAttributesService extends AbstractHibernateEntityService<UserAttributes, UserAttributesRepository> implements UserAttributesService {

    @Inject
    private UserAttributesRepository _dao;

  /*  @Transactional
    @Override
    public UserAttributes attachUserAttributes(String user, Boolean terms) {
        UserAttributes data = new UserAttributes(user);
        data.setUser(user);
        data.setHasAcceptedTerms(terms);
        _dao.create(data);
        return data;
    }*/

    @Override
    @Transactional
    public UserAttributes findByUserName(String username) {
        List<UserAttributes> user = _dao.findByProperty("userName", username);
        if (user == null || user.size() == 0) {
            return null;
        }
        return user.get(0);
    }

    @Override
    @Transactional
    public UserAttributes findByExampleUserName(String username) {
        UserAttributes example = new UserAttributes(username);
        String[] EXCLUSION_PROPERTIES_USERNAME = AbstractHibernateEntity.getExcludedProperties("hasacceptedterms", "hasAcceptedTerms");
        List<UserAttributes> user = _dao.findByExample(example, EXCLUSION_PROPERTIES_USERNAME);
        if (user == null || user.size() == 0) {
            return null;
        }
        return user.get(0);
    }

    @Override
    @Transactional
    public UserAttributes findByProperty(String property, String value) {
        List<UserAttributes> user = _dao.findByProperty(property, value);
        if (user == null || user.size() == 0) {
            return null;
        }
        return user.get(0);
    }

}

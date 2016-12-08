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

    @Transactional
    @Override
    public UserAttributes findByUserName(String username) {
        List<UserAttributes> user = _dao.findByProperty("userName", username);

        //List<UserAttributes> user = _dao.findAllByExample(new UserAttributes(username), AbstractHibernateEntity.getExcludedProperties("what", "okay"));
        if (user == null || user.size() == 0) {
            return null;
        }

        return user.get(0);
    }

    @Transactional
    public UserAttributes findByExampleUserName(String username) {
        UserAttributes example = new UserAttributes(username);

        String[] EXCLUSION_PROPERTIES_XDATUSERLOCK = AbstractHibernateEntity.getExcludedProperties("hasacceptedterms", "hasAcceptedTerms");

        List<UserAttributes> user = _dao.findByExample(example, EXCLUSION_PROPERTIES_XDATUSERLOCK);

        if (user == null || user.size() == 0) {
            return null;
        }

        return user.get(0);
    }

    @Transactional
    @Override
    public String getStringAttributeForUser(String user, String key) {
        UserAttributes example = new UserAttributes(user);

        //final Map<String, Object> attributes = new HashMap<>();
        List<UserAttributes> attributes = _dao.findByExample(example, AbstractHibernateEntity.getExcludedProperties("verified", "failedLoginAttempts"));
        if (attributes == null || attributes.size() == 0) { return null; }

        return attributes.get(0).toString();
    }

    @Transactional
    @Override
    public UserAttributes getAttributesForUsername(String user) {
        return _dao.findAllByExample(new UserAttributes(user), AbstractHibernateEntity.getExcludedProperties("what", "okay")).get(0);
    }

    @Transactional
    @Override
    public Boolean getBooleanAttributeForUser(String user, Boolean key) {
        return null;
    }

    @Transactional
    @Override
    public String getTestString() {
        return "It does work!";
    }

    @Transactional
    @Override
    public void setAttributesForUsername(String User, HashMap attributes) {
        //_dao.
    }

}

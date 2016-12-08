package org.nrg.xnat.biomedia.userAttributes.services;

import org.nrg.framework.orm.hibernate.BaseHibernateService;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;

import java.util.HashMap;
import java.util.List;

public interface UserAttributesService extends BaseHibernateService<UserAttributes> {

    UserAttributes findByUserName(final String username);

    UserAttributes findByExampleUserName(String username);

    String getStringAttributeForUser(final String user, String key);

    Boolean getBooleanAttributeForUser(final String user, Boolean key);

    UserAttributes getAttributesForUsername (final String user);

    void setAttributesForUsername(final String user, HashMap attributes);

    String getTestString();
}

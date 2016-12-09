package org.nrg.xnat.biomedia.userAttributes.services;

import org.nrg.framework.orm.hibernate.BaseHibernateService;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;

import java.util.HashMap;
import java.util.List;

public interface UserAttributesService extends BaseHibernateService<UserAttributes> {

    UserAttributes findByUserName(final String username);

    UserAttributes findByExampleUserName(String username);

    UserAttributes findByProperty(String property, String value);

}

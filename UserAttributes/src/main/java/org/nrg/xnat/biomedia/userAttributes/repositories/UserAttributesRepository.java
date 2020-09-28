package org.nrg.xnat.biomedia.userAttributes.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;
import org.springframework.stereotype.Repository;

@Repository
public class UserAttributesRepository extends AbstractHibernateDAO<UserAttributes> {
}

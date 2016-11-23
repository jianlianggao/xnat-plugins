package org.nrg.xnat.biomedia.userTerms.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import org.nrg.xnat.biomedia.userTerms.entities.UserTerms;
import org.springframework.stereotype.Repository;

@Repository
public class UserTermsRepository extends AbstractHibernateDAO<UserTerms> {
}

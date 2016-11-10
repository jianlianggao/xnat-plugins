package uk.ac.ic.doc.biomedia.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import uk.ac.ic.doc.biomedia.entities.UserTerms;
import org.springframework.stereotype.Repository;

@Repository
public class UserTermsRepository extends AbstractHibernateDAO<UserTerms> {
}

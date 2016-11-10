package uk.ac.ic.doc.biomedia.plugins.userterms.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import uk.ac.ic.doc.biomedia.plugins.userterms.entities.UserTerms;
import org.springframework.stereotype.Repository;

@Repository
public class UserTermsRepository extends AbstractHibernateDAO<UserTerms> {
}

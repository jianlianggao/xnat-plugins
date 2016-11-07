package uk.ac.ic.doc.biomedia.plugins.userattributes.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import uk.ac.ic.doc.biomedia.plugins.userattributes.entities.UserAttributes;
import org.springframework.stereotype.Repository;

@Repository
public class UserAttributesRepository extends AbstractHibernateDAO<UserAttributes> {
}

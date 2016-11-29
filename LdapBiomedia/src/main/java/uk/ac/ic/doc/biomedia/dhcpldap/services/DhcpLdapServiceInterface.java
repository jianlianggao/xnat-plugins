package uk.ac.ic.doc.biomedia.dhcpldap.services;

import org.apache.xpath.operations.Bool;
import org.nrg.framework.orm.hibernate.BaseHibernateService;
import uk.ac.ic.doc.biomedia.dhcpldap.entities.DhcpLdap;

/**
 * Created by gmlenz on 29/11/16.
 */
public interface DhcpLdapServiceInterface extends BaseHibernateService<DhcpLdap> {

    Boolean createNewDhcpLdapUser(final String username);
}

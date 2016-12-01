package uk.ac.ic.doc.biomedia.dhcpldap.services;

import org.apache.xpath.operations.Bool;
import org.nrg.framework.orm.hibernate.BaseHibernateService;
import uk.ac.ic.doc.biomedia.dhcpldap.entities.DhcpLdap;

import javax.naming.NamingException;

/**
 * Created by gmlenz on 29/11/16.
 */
public interface DhcpLdapServiceInterface extends BaseHibernateService<DhcpLdap> {

    Boolean createNewDhcpLdapUser(final String username);
    Boolean updateDhcpLdapUser(final String username);
    void openContext(final String adminUser, final String adminPassword) throws NamingException;


}

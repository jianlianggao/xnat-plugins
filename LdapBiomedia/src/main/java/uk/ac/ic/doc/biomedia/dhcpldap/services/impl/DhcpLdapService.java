package uk.ac.ic.doc.biomedia.dhcpldap.services.impl;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uk.ac.ic.doc.biomedia.dhcpldap.entities.DhcpLdap;
import uk.ac.ic.doc.biomedia.dhcpldap.repositories.DhcpLdapRepository;
import uk.ac.ic.doc.biomedia.dhcpldap.services.DhcpLdapServiceInterface;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;
import java.util.Hashtable;

/**
 * Created by gmlenz on 29/11/16.
 */

@Service
public class DhcpLdapService extends AbstractHibernateEntityService<DhcpLdap, DhcpLdapRepository> implements DhcpLdapServiceInterface {

    @Transactional
    @Override
    public Boolean createNewDhcpLdapUser(String username) {
        return null;
    }

    @Override
    public Boolean updateDhcpLdapUser(String username) {
        return null;
    }

    @Override
    public void openContext(String adminUser, String adminPassword) throws NamingException {
        DhcpLdap ldap = new DhcpLdap();
        Hashtable<String, String> envVars = ldap.getEnvironmentVariables();
        envVars.put(Context.SECURITY_PRINCIPAL, adminUser);
        envVars.put(Context.SECURITY_CREDENTIALS, adminPassword);
        envVars.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        envVars.put(Context.SECURITY_AUTHENTICATION, "simple");
        envVars.put(Context.PROVIDER_URL, ldap.getLDAP_HOST());
        envVars.put(Context.SECURITY_PROTOCOL, "ssl");
        envVars.put(Context.REFERRAL, "follow");

        try {
            ldap.setLdapContext(new InitialLdapContext(envVars, null));

        } catch (NamingException e) { throw e; }

    }
}

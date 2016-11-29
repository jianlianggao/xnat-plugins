package uk.ac.ic.doc.biomedia.dhcpldap.entities;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;

import javax.naming.ldap.LdapContext;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.Hashtable;

/**
 * Created by gmlenz on 29/11/16.
 */

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "DhcpUser")})
public class DhcpLdap extends AbstractHibernateEntity {
    private String DHCP_USER;

    private String LDAP_HOST, LDAP_ADMIN, LDAP_PW, LDAP_SEARCH_BASE;

    private LdapContext context;
    private Hashtable<String, String> environmentVariables;


    public String getLDAP_ADMIN() {
        return LDAP_ADMIN;
    }

    public void setLDAP_ADMIN(String LDAP_ADMIN) {
        this.LDAP_ADMIN = LDAP_ADMIN;
    }

    public String getLDAP_PW() {
        return LDAP_PW;
    }

    public void setLDAP_PW(String LDAP_PW) {
        this.LDAP_PW = LDAP_PW;
    }

    public String getLDAP_SEARCH_BASE() {
        return LDAP_SEARCH_BASE;
    }

    public void setLDAP_SEARCH_BASE(String LDAP_SEARCH_BASE) {
        this.LDAP_SEARCH_BASE = LDAP_SEARCH_BASE;
    }

    public LdapContext getLdapContext() {
        return context;
    }

    public void setLdapContext(LdapContext context) {
        this.context = context;
    }

    public Hashtable<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(Hashtable<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public String getLDAP_HOST() {

        return LDAP_HOST;
    }

    public void setLDAP_HOST(String LDAP_HOST) {
        this.LDAP_HOST = LDAP_HOST;
    }

    public String getDHCP_USER() {

        return DHCP_USER;
    }

    public void setDHCP_USER(String DHCP_USER) {
        this.DHCP_USER = DHCP_USER;
    }
}

package uk.ac.ic.doc.biomedia.dhcpldap.services.impl;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uk.ac.ic.doc.biomedia.dhcpldap.entities.DhcpLdap;
import uk.ac.ic.doc.biomedia.dhcpldap.repositories.DhcpLdapRepository;
import uk.ac.ic.doc.biomedia.dhcpldap.services.DhcpLdapServiceInterface;

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
}

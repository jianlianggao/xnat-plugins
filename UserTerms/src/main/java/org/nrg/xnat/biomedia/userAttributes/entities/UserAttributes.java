package org.nrg.xnat.biomedia.userAttributes.entities;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"username", "hasAcceptedTerms"}))
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "nrg")
public class UserAttributes extends AbstractHibernateEntity {

    @Column(name = "username")
    private String _userName;

    @Column(name = "has_accepted_terms")
    private Boolean _acceptedTerms;
    //private Boolean _usesIpfs;

    public UserAttributes() {
    }

    public UserAttributes(String userName, Boolean acceptedTerms) {
        _userName = userName;
        _acceptedTerms = acceptedTerms;
        setEnabled(true);
    }

    public UserAttributes(String userName) {
        this(userName, false);
    }


    public String getUserName() {
        return _userName;
    }
    public void setUserName(final String userName) {
        _userName = userName;
    }

    public Boolean hasAcceptedTerms() {
        return _acceptedTerms;
    }
    public void setAcceptedTerms(final Boolean status) {
        _acceptedTerms = status;
    }

}

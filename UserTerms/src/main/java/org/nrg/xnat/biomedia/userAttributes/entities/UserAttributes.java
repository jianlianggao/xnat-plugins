package org.nrg.xnat.biomedia.userAttributes.entities;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"userLoginName", "hasAcceptedTerms"}))
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "nrg")
public class UserAttributes extends AbstractHibernateEntity {

    private String _userName;

    private Boolean _hasAcceptedTerms;
    //private Boolean _usesIpfs;

    public UserAttributes(String user, Boolean hasAcceptedTerms) {
        _userName = user;
        _hasAcceptedTerms = hasAcceptedTerms;
        setEnabled(true);
    }

    public UserAttributes(String username) {
        this(username, false);
    }


    public String getUserName() {
        return _userName;
    }
    public void setUserName(final String username) {
        _userName = username;
    }

    public Boolean hasAcceptedTerms() {
        return _hasAcceptedTerms;
    }
    public void setHasAcceptedTerms(final Boolean status) {
        _hasAcceptedTerms = status;
    }

}

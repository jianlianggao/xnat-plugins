package org.nrg.xnat.biomedia.userAttributes.entities;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;

import javax.persistence.Entity;

@Entity
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"username", "hasAcceptedTerms"}))
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "nrg")
public class UserAttributes extends AbstractHibernateEntity {

    private String _userName;
    private boolean _acceptedTerms;

    public UserAttributes() {}

    public UserAttributes(String userName, boolean acceptedTerms) {
        _userName = userName;
        _acceptedTerms = acceptedTerms;
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

    public boolean isAcceptedTerms() {
        return _acceptedTerms;
    }
    public void setAcceptedTerms(boolean _acceptedTerms) {
        this._acceptedTerms = _acceptedTerms;
    }
}

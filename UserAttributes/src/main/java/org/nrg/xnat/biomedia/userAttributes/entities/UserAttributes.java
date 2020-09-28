package org.nrg.xnat.biomedia.userAttributes.entities;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;
import javax.persistence.Entity;

@Entity
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"username", "hasAcceptedTerms"}))
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "nrg")
public class UserAttributes extends AbstractHibernateEntity {

    private String _userName;
    private boolean _agreedTerms;

    public UserAttributes() {}

    public UserAttributes(String userName, boolean acceptedTerms) {
        _userName = userName;
        _agreedTerms = acceptedTerms;
    }
    public UserAttributes(String userName) {
        this(userName, false);
    }

    public String getUserName() {
        return _userName;
    }
    public void setUserName(final String userName) {
        this._userName = userName;
    }

    //for some reason this setter MUST start with 'is', rather than 'has'. Otherwise the property will not be created by Hibernate.
    public boolean isAgreedTerms() {
        return _agreedTerms;
    }
    public void setAgreedTerms(final boolean acceptedTerms) {
        this._agreedTerms = acceptedTerms;
    }
}

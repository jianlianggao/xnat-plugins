package org.nrg.xnat.biomedia.userAttributes.entities;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "authUser"), @UniqueConstraint(columnNames = {"hasAcceptedTerms"})})
public class UserAttributes extends AbstractHibernateEntity {
    private String _user;
    private Boolean _hasAcceptedTerms;
    //private Boolean _usesIpfs;

    public UserAttributes(String user, Boolean hasAcceptedTerms) {
        _user = user;
        _hasAcceptedTerms = hasAcceptedTerms;
    }
    public UserAttributes(String user) {
        this(user, false);
    }

    public String getUser() {
        return _user;
    }
    public void setUser(final String user) {
        _user = user;
    }

    public Boolean hasAcceptedTerms() {
        return _hasAcceptedTerms;
    }
    public void setHasAcceptedTerms(final Boolean status) {
        _hasAcceptedTerms = status;
    }

}

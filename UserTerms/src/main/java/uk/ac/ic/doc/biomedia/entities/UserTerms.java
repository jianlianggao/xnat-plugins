package uk.ac.ic.doc.biomedia.entities;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "authUser"), @UniqueConstraint(columnNames = {"hasAcceptedTerms"})})
public class UserTerms extends AbstractHibernateEntity {
    public String getAuthUser() {
        return _authUser;
    }

    public void setAuthUser(final String authUser) {
        _authUser = authUser;
    }

    public Boolean gethasAcceptedTerms() {
        return _hasAcceptedTerms;
    }

    public void sethasAcceptedTerms(final Boolean hasAcceptedTerms) {
        _hasAcceptedTerms = hasAcceptedTerms;
    }

    private String _authUser;
    private Boolean _hasAcceptedTerms;
}

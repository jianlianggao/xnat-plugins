/*
 * xnat-workshop-plugin: SubjectMappingRepository
 * XNAT http://www.xnat.org
 * Copyright (c) 2016, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package uk.ac.ic.doc.biomedia.plugins.downloadwholeproject.subjectmapping.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import uk.ac.ic.doc.biomedia.plugins.downloadwholeproject.subjectmapping.entities.SubjectMapping;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectMappingRepository extends AbstractHibernateDAO<SubjectMapping> {
}

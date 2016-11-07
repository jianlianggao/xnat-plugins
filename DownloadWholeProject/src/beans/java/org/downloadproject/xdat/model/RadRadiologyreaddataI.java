/*
 * GENERATED FILE
 * Created on Mon Nov 07 14:57:46 GMT 2016
 *
 */
package org.nrg.xdat.model;

import java.util.List;

/**
 * @author XDAT
 *
 */
public interface RadRadiologyreaddataI extends XnatMrassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the modality.
	 */
	public String getModality();

	/**
	 * Sets the value for modality.
	 * @param v Value to Set.
	 */
	public void setModality(String v);

	/**
	 * @return Returns the reader.
	 */
	public String getReader();

	/**
	 * Sets the value for reader.
	 * @param v Value to Set.
	 */
	public void setReader(String v);

	/**
	 * @return Returns the technique.
	 */
	public String getTechnique();

	/**
	 * Sets the value for technique.
	 * @param v Value to Set.
	 */
	public void setTechnique(String v);

	/**
	 * @return Returns the finding.
	 */
	public String getFinding();

	/**
	 * Sets the value for finding.
	 * @param v Value to Set.
	 */
	public void setFinding(String v);

	/**
	 * @return Returns the finding/normal_status.
	 */
	public Boolean getFinding_normalStatus();

	/**
	 * Sets the value for finding/normal_status.
	 * @param v Value to Set.
	 */
	public void setFinding_normalStatus(Object v);

	/**
	 * @return Returns the diagnosis.
	 */
	public String getDiagnosis();

	/**
	 * Sets the value for diagnosis.
	 * @param v Value to Set.
	 */
	public void setDiagnosis(String v);

	/**
	 * @return Returns the comparison.
	 */
	public String getComparison();

	/**
	 * Sets the value for comparison.
	 * @param v Value to Set.
	 */
	public void setComparison(String v);

	/**
	 * @return Returns the history.
	 */
	public String getHistory();

	/**
	 * Sets the value for history.
	 * @param v Value to Set.
	 */
	public void setHistory(String v);

	/**
	 * @return Returns the exam.
	 */
	public String getExam();

	/**
	 * Sets the value for exam.
	 * @param v Value to Set.
	 */
	public void setExam(String v);

	/**
	 * @return Returns the followup_recommended.
	 */
	public Boolean getFollowupRecommended();

	/**
	 * Sets the value for followup_recommended.
	 * @param v Value to Set.
	 */
	public void setFollowupRecommended(Object v);
}

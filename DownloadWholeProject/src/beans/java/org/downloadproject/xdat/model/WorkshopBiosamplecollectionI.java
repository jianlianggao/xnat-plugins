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
public interface WorkshopBiosamplecollectionI extends XnatSubjectassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the dna.
	 */
	public Boolean getDna();

	/**
	 * Sets the value for dna.
	 * @param v Value to Set.
	 */
	public void setDna(Object v);

	/**
	 * @return Returns the rna.
	 */
	public Boolean getRna();

	/**
	 * Sets the value for rna.
	 * @param v Value to Set.
	 */
	public void setRna(Object v);

	/**
	 * @return Returns the plasma.
	 */
	public Boolean getPlasma();

	/**
	 * Sets the value for plasma.
	 * @param v Value to Set.
	 */
	public void setPlasma(Object v);

	/**
	 * @return Returns the serum.
	 */
	public Boolean getSerum();

	/**
	 * Sets the value for serum.
	 * @param v Value to Set.
	 */
	public void setSerum(Object v);

	/**
	 * @return Returns the csf.
	 */
	public Boolean getCsf();

	/**
	 * Sets the value for csf.
	 * @param v Value to Set.
	 */
	public void setCsf(Object v);
}

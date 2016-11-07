/*
 * GENERATED FILE
 * Created on Mon Nov 07 14:57:46 GMT 2016
 *
 */
package org.nrg.xdat.om.base.auto;
import org.apache.log4j.Logger;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;
import org.nrg.xdat.om.*;
import org.nrg.xft.utils.ResourceFile;
import org.nrg.xft.exception.*;

import java.util.*;

/**
 * @author XDAT
 *
 *//*
 ******************************** 
 * DO NOT MODIFY THIS FILE
 *
 ********************************/
@SuppressWarnings({"unchecked","rawtypes"})
public abstract class AutoWorkshopBiosamplecollection extends XnatSubjectassessordata implements org.nrg.xdat.model.WorkshopBiosamplecollectionI {
	public static final Logger logger = Logger.getLogger(AutoWorkshopBiosamplecollection.class);
	public static final String SCHEMA_ELEMENT_NAME="workshop:biosampleCollection";

	public AutoWorkshopBiosamplecollection(ItemI item)
	{
		super(item);
	}

	public AutoWorkshopBiosamplecollection(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoWorkshopBiosamplecollection(UserI user)
	 **/
	public AutoWorkshopBiosamplecollection(){}

	public AutoWorkshopBiosamplecollection(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "workshop:biosampleCollection";
	}
	 private org.nrg.xdat.om.XnatSubjectassessordata _Subjectassessordata =null;

	/**
	 * subjectAssessorData
	 * @return org.nrg.xdat.om.XnatSubjectassessordata
	 */
	public org.nrg.xdat.om.XnatSubjectassessordata getSubjectassessordata() {
		try{
			if (_Subjectassessordata==null){
				_Subjectassessordata=((XnatSubjectassessordata)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("subjectAssessorData")));
				return _Subjectassessordata;
			}else {
				return _Subjectassessordata;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for subjectAssessorData.
	 * @param v Value to Set.
	 */
	public void setSubjectassessordata(ItemI v) throws Exception{
		_Subjectassessordata =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * subjectAssessorData
	 * set org.nrg.xdat.model.XnatSubjectassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectassessordataI> void setSubjectassessordata(A item) throws Exception{
	setSubjectassessordata((ItemI)item);
	}

	/**
	 * Removes the subjectAssessorData.
	 * */
	public void removeSubjectassessordata() {
		_Subjectassessordata =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Dna=null;

	/**
	 * @return Returns the dna.
	 */
	public Boolean getDna() {
		try{
			if (_Dna==null){
				_Dna=getBooleanProperty("dna");
				return _Dna;
			}else {
				return _Dna;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for dna.
	 * @param v Value to Set.
	 */
	public void setDna(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/dna",v);
		_Dna=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Rna=null;

	/**
	 * @return Returns the rna.
	 */
	public Boolean getRna() {
		try{
			if (_Rna==null){
				_Rna=getBooleanProperty("rna");
				return _Rna;
			}else {
				return _Rna;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for rna.
	 * @param v Value to Set.
	 */
	public void setRna(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/rna",v);
		_Rna=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Plasma=null;

	/**
	 * @return Returns the plasma.
	 */
	public Boolean getPlasma() {
		try{
			if (_Plasma==null){
				_Plasma=getBooleanProperty("plasma");
				return _Plasma;
			}else {
				return _Plasma;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for plasma.
	 * @param v Value to Set.
	 */
	public void setPlasma(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/plasma",v);
		_Plasma=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Serum=null;

	/**
	 * @return Returns the serum.
	 */
	public Boolean getSerum() {
		try{
			if (_Serum==null){
				_Serum=getBooleanProperty("serum");
				return _Serum;
			}else {
				return _Serum;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for serum.
	 * @param v Value to Set.
	 */
	public void setSerum(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/serum",v);
		_Serum=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Csf=null;

	/**
	 * @return Returns the csf.
	 */
	public Boolean getCsf() {
		try{
			if (_Csf==null){
				_Csf=getBooleanProperty("csf");
				return _Csf;
			}else {
				return _Csf;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for csf.
	 * @param v Value to Set.
	 */
	public void setCsf(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/csf",v);
		_Csf=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.WorkshopBiosamplecollection> getAllWorkshopBiosamplecollections(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.WorkshopBiosamplecollection> al = new ArrayList<org.nrg.xdat.om.WorkshopBiosamplecollection>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.WorkshopBiosamplecollection> getWorkshopBiosamplecollectionsByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.WorkshopBiosamplecollection> al = new ArrayList<org.nrg.xdat.om.WorkshopBiosamplecollection>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.WorkshopBiosamplecollection> getWorkshopBiosamplecollectionsByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.WorkshopBiosamplecollection> al = new ArrayList<org.nrg.xdat.om.WorkshopBiosamplecollection>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static WorkshopBiosamplecollection getWorkshopBiosamplecollectionsById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("workshop:biosampleCollection/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (WorkshopBiosamplecollection) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
			else
				 return null;
		} catch (Exception e) {
			logger.error("",e);
		}

		return null;
	}

	public static ArrayList wrapItems(ArrayList items)
	{
		ArrayList al = new ArrayList();
		al = org.nrg.xdat.base.BaseElement.WrapItems(items);
		al.trimToSize();
		return al;
	}

	public static ArrayList wrapItems(org.nrg.xft.collections.ItemCollection items)
	{
		return wrapItems(items.getItems());
	}

	public org.w3c.dom.Document toJoinedXML() throws Exception
	{
		ArrayList al = new ArrayList();
		al.add(this.getItem());
		al.add(org.nrg.xft.search.ItemSearch.GetItem("xnat:subjectData.ID",this.getItem().getProperty("xnat:mrSessionData.subject_ID"),getItem().getUser(),false));
		al.trimToSize();
		return org.nrg.xft.schema.Wrappers.XMLWrapper.XMLWriter.ItemListToDOM(al);
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	        //subjectAssessorData
	        XnatSubjectassessordata childSubjectassessordata = (XnatSubjectassessordata)this.getSubjectassessordata();
	            if (childSubjectassessordata!=null){
	              for(ResourceFile rf: ((XnatSubjectassessordata)childSubjectassessordata).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("subjectAssessorData[" + ((XnatSubjectassessordata)childSubjectassessordata).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("subjectAssessorData/" + ((XnatSubjectassessordata)childSubjectassessordata).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	return _return;
}
}

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
public abstract class AutoRadRadiologyreaddata extends XnatMrassessordata implements org.nrg.xdat.model.RadRadiologyreaddataI {
	public static final Logger logger = Logger.getLogger(AutoRadRadiologyreaddata.class);
	public static final String SCHEMA_ELEMENT_NAME="rad:radiologyReadData";

	public AutoRadRadiologyreaddata(ItemI item)
	{
		super(item);
	}

	public AutoRadRadiologyreaddata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoRadRadiologyreaddata(UserI user)
	 **/
	public AutoRadRadiologyreaddata(){}

	public AutoRadRadiologyreaddata(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "rad:radiologyReadData";
	}
	 private org.nrg.xdat.om.XnatMrassessordata _Mrassessordata =null;

	/**
	 * mrAssessorData
	 * @return org.nrg.xdat.om.XnatMrassessordata
	 */
	public org.nrg.xdat.om.XnatMrassessordata getMrassessordata() {
		try{
			if (_Mrassessordata==null){
				_Mrassessordata=((XnatMrassessordata)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("mrAssessorData")));
				return _Mrassessordata;
			}else {
				return _Mrassessordata;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for mrAssessorData.
	 * @param v Value to Set.
	 */
	public void setMrassessordata(ItemI v) throws Exception{
		_Mrassessordata =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/mrAssessorData",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/mrAssessorData",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * mrAssessorData
	 * set org.nrg.xdat.model.XnatMrassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatMrassessordataI> void setMrassessordata(A item) throws Exception{
	setMrassessordata((ItemI)item);
	}

	/**
	 * Removes the mrAssessorData.
	 * */
	public void removeMrassessordata() {
		_Mrassessordata =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/mrAssessorData",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}

	//FIELD

	private String _Modality=null;

	/**
	 * @return Returns the modality.
	 */
	public String getModality(){
		try{
			if (_Modality==null){
				_Modality=getStringProperty("modality");
				return _Modality;
			}else {
				return _Modality;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for modality.
	 * @param v Value to Set.
	 */
	public void setModality(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/modality",v);
		_Modality=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Reader=null;

	/**
	 * @return Returns the reader.
	 */
	public String getReader(){
		try{
			if (_Reader==null){
				_Reader=getStringProperty("reader");
				return _Reader;
			}else {
				return _Reader;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for reader.
	 * @param v Value to Set.
	 */
	public void setReader(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/reader",v);
		_Reader=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Technique=null;

	/**
	 * @return Returns the technique.
	 */
	public String getTechnique(){
		try{
			if (_Technique==null){
				_Technique=getStringProperty("technique");
				return _Technique;
			}else {
				return _Technique;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for technique.
	 * @param v Value to Set.
	 */
	public void setTechnique(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/technique",v);
		_Technique=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Finding=null;

	/**
	 * @return Returns the finding.
	 */
	public String getFinding(){
		try{
			if (_Finding==null){
				_Finding=getStringProperty("finding");
				return _Finding;
			}else {
				return _Finding;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for finding.
	 * @param v Value to Set.
	 */
	public void setFinding(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/finding",v);
		_Finding=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Finding_normalStatus=null;

	/**
	 * @return Returns the finding/normal_status.
	 */
	public Boolean getFinding_normalStatus() {
		try{
			if (_Finding_normalStatus==null){
				_Finding_normalStatus=getBooleanProperty("finding/normal_status");
				return _Finding_normalStatus;
			}else {
				return _Finding_normalStatus;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for finding/normal_status.
	 * @param v Value to Set.
	 */
	public void setFinding_normalStatus(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/finding/normal_status",v);
		_Finding_normalStatus=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Diagnosis=null;

	/**
	 * @return Returns the diagnosis.
	 */
	public String getDiagnosis(){
		try{
			if (_Diagnosis==null){
				_Diagnosis=getStringProperty("diagnosis");
				return _Diagnosis;
			}else {
				return _Diagnosis;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for diagnosis.
	 * @param v Value to Set.
	 */
	public void setDiagnosis(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/diagnosis",v);
		_Diagnosis=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Comparison=null;

	/**
	 * @return Returns the comparison.
	 */
	public String getComparison(){
		try{
			if (_Comparison==null){
				_Comparison=getStringProperty("comparison");
				return _Comparison;
			}else {
				return _Comparison;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for comparison.
	 * @param v Value to Set.
	 */
	public void setComparison(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/comparison",v);
		_Comparison=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _History=null;

	/**
	 * @return Returns the history.
	 */
	public String getHistory(){
		try{
			if (_History==null){
				_History=getStringProperty("history");
				return _History;
			}else {
				return _History;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for history.
	 * @param v Value to Set.
	 */
	public void setHistory(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/history",v);
		_History=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Exam=null;

	/**
	 * @return Returns the exam.
	 */
	public String getExam(){
		try{
			if (_Exam==null){
				_Exam=getStringProperty("exam");
				return _Exam;
			}else {
				return _Exam;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for exam.
	 * @param v Value to Set.
	 */
	public void setExam(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/exam",v);
		_Exam=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _FollowupRecommended=null;

	/**
	 * @return Returns the followup_recommended.
	 */
	public Boolean getFollowupRecommended() {
		try{
			if (_FollowupRecommended==null){
				_FollowupRecommended=getBooleanProperty("followup_recommended");
				return _FollowupRecommended;
			}else {
				return _FollowupRecommended;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for followup_recommended.
	 * @param v Value to Set.
	 */
	public void setFollowupRecommended(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/followup_recommended",v);
		_FollowupRecommended=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.RadRadiologyreaddata> getAllRadRadiologyreaddatas(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.RadRadiologyreaddata> al = new ArrayList<org.nrg.xdat.om.RadRadiologyreaddata>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.RadRadiologyreaddata> getRadRadiologyreaddatasByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.RadRadiologyreaddata> al = new ArrayList<org.nrg.xdat.om.RadRadiologyreaddata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.RadRadiologyreaddata> getRadRadiologyreaddatasByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.RadRadiologyreaddata> al = new ArrayList<org.nrg.xdat.om.RadRadiologyreaddata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static RadRadiologyreaddata getRadRadiologyreaddatasById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("rad:radiologyReadData/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (RadRadiologyreaddata) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
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
		XFTItem mr = org.nrg.xft.search.ItemSearch.GetItem("xnat:mrSessionData.ID",getItem().getProperty("rad:radiologyReadData.imageSession_ID"),getItem().getUser(),false);
		al.add(mr);
		al.add(org.nrg.xft.search.ItemSearch.GetItem("xnat:subjectData.ID",mr.getProperty("xnat:mrSessionData.subject_ID"),getItem().getUser(),false));
		al.trimToSize();
		return org.nrg.xft.schema.Wrappers.XMLWrapper.XMLWriter.ItemListToDOM(al);
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	        //mrAssessorData
	        XnatMrassessordata childMrassessordata = (XnatMrassessordata)this.getMrassessordata();
	            if (childMrassessordata!=null){
	              for(ResourceFile rf: ((XnatMrassessordata)childMrassessordata).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("mrAssessorData[" + ((XnatMrassessordata)childMrassessordata).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("mrAssessorData/" + ((XnatMrassessordata)childMrassessordata).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	return _return;
}
}

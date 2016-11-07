/*
 * GENERATED FILE
 * Created on Mon Nov 07 14:57:46 GMT 2016
 *
 */
package org.nrg.xdat.bean;
import org.apache.log4j.Logger;
import org.nrg.xdat.bean.base.BaseElement;

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
public class RadRadiologyreaddataBean extends XnatMrassessordataBean implements java.io.Serializable, org.nrg.xdat.model.RadRadiologyreaddataI {
	public static final Logger logger = Logger.getLogger(RadRadiologyreaddataBean.class);
	public static final String SCHEMA_ELEMENT_NAME="rad:radiologyReadData";

	public String getSchemaElementName(){
		return "radiologyReadData";
	}

	public String getFullSchemaElementName(){
		return "rad:radiologyReadData";
	}

	//FIELD

	private String _Modality=null;

	/**
	 * @return Returns the modality.
	 */
	public String getModality(){
		return _Modality;
	}

	/**
	 * Sets the value for modality.
	 * @param v Value to Set.
	 */
	public void setModality(String v){
		_Modality=v;
	}

	//FIELD

	private String _Reader=null;

	/**
	 * @return Returns the reader.
	 */
	public String getReader(){
		return _Reader;
	}

	/**
	 * Sets the value for reader.
	 * @param v Value to Set.
	 */
	public void setReader(String v){
		_Reader=v;
	}

	//FIELD

	private String _Technique=null;

	/**
	 * @return Returns the technique.
	 */
	public String getTechnique(){
		return _Technique;
	}

	/**
	 * Sets the value for technique.
	 * @param v Value to Set.
	 */
	public void setTechnique(String v){
		_Technique=v;
	}

	//FIELD

	private String _Finding=null;

	/**
	 * @return Returns the finding.
	 */
	public String getFinding(){
		return _Finding;
	}

	/**
	 * Sets the value for finding.
	 * @param v Value to Set.
	 */
	public void setFinding(String v){
		_Finding=v;
	}

	//FIELD

	private Boolean _Finding_normalStatus=null;

	/**
	 * @return Returns the finding/normal_status.
	 */
	public Boolean getFinding_normalStatus() {
		return _Finding_normalStatus;
	}

	/**
	 * Sets the value for finding/normal_status.
	 * @param v Value to Set.
	 */
	public void setFinding_normalStatus(Object v){
		if(v instanceof Boolean){
			_Finding_normalStatus=(Boolean)v;
		}else if(v instanceof String){
			_Finding_normalStatus=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private String _Diagnosis=null;

	/**
	 * @return Returns the diagnosis.
	 */
	public String getDiagnosis(){
		return _Diagnosis;
	}

	/**
	 * Sets the value for diagnosis.
	 * @param v Value to Set.
	 */
	public void setDiagnosis(String v){
		_Diagnosis=v;
	}

	//FIELD

	private String _Comparison=null;

	/**
	 * @return Returns the comparison.
	 */
	public String getComparison(){
		return _Comparison;
	}

	/**
	 * Sets the value for comparison.
	 * @param v Value to Set.
	 */
	public void setComparison(String v){
		_Comparison=v;
	}

	//FIELD

	private String _History=null;

	/**
	 * @return Returns the history.
	 */
	public String getHistory(){
		return _History;
	}

	/**
	 * Sets the value for history.
	 * @param v Value to Set.
	 */
	public void setHistory(String v){
		_History=v;
	}

	//FIELD

	private String _Exam=null;

	/**
	 * @return Returns the exam.
	 */
	public String getExam(){
		return _Exam;
	}

	/**
	 * Sets the value for exam.
	 * @param v Value to Set.
	 */
	public void setExam(String v){
		_Exam=v;
	}

	//FIELD

	private Boolean _FollowupRecommended=null;

	/**
	 * @return Returns the followup_recommended.
	 */
	public Boolean getFollowupRecommended() {
		return _FollowupRecommended;
	}

	/**
	 * Sets the value for followup_recommended.
	 * @param v Value to Set.
	 */
	public void setFollowupRecommended(Object v){
		if(v instanceof Boolean){
			_FollowupRecommended=(Boolean)v;
		}else if(v instanceof String){
			_FollowupRecommended=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("modality")){
			setModality(v);
		}else if (xmlPath.equals("reader")){
			setReader(v);
		}else if (xmlPath.equals("technique")){
			setTechnique(v);
		}else if (xmlPath.equals("finding")){
			setFinding(v);
		}else if (xmlPath.equals("finding/normal_status")){
			setFinding_normalStatus(v);
		}else if (xmlPath.equals("diagnosis")){
			setDiagnosis(v);
		}else if (xmlPath.equals("comparison")){
			setComparison(v);
		}else if (xmlPath.equals("history")){
			setHistory(v);
		}else if (xmlPath.equals("exam")){
			setExam(v);
		}else if (xmlPath.equals("followup_recommended")){
			setFollowupRecommended(v);
		}
		else{
			super.setDataField(xmlPath,v);
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setReferenceField(String xmlPath,BaseElement v) throws BaseElement.UnknownFieldException{
			super.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("modality")){
			return getModality();
		}else if (xmlPath.equals("reader")){
			return getReader();
		}else if (xmlPath.equals("technique")){
			return getTechnique();
		}else if (xmlPath.equals("finding")){
			return getFinding();
		}else if (xmlPath.equals("finding/normal_status")){
			return getFinding_normalStatus();
		}else if (xmlPath.equals("diagnosis")){
			return getDiagnosis();
		}else if (xmlPath.equals("comparison")){
			return getComparison();
		}else if (xmlPath.equals("history")){
			return getHistory();
		}else if (xmlPath.equals("exam")){
			return getExam();
		}else if (xmlPath.equals("followup_recommended")){
			return getFollowupRecommended();
		}
		else{
			return super.getDataFieldValue(xmlPath);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getReferenceField(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceField(xmlPath);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("modality")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("reader")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("technique")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("finding")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("finding/normal_status")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("diagnosis")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("comparison")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("history")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("exam")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("followup_recommended")){
			return BaseElement.field_data;
		}
		else{
			return super.getFieldType(xmlPath);
		}
	}

	/**
	 * Returns arraylist of all fields
	 */
	public ArrayList getAllFields() {
		ArrayList all_fields=new ArrayList();
		all_fields.add("modality");
		all_fields.add("reader");
		all_fields.add("technique");
		all_fields.add("finding");
		all_fields.add("finding/normal_status");
		all_fields.add("diagnosis");
		all_fields.add("comparison");
		all_fields.add("history");
		all_fields.add("exam");
		all_fields.add("followup_recommended");
		all_fields.addAll(super.getAllFields());
		return all_fields;
	}


	public String toString(){
		java.io.StringWriter sw = new java.io.StringWriter();
		try{this.toXML(sw,true);}catch(java.io.IOException e){}
		return sw.toString();
	}


	public void toXML(java.io.Writer writer,boolean prettyPrint) throws java.io.IOException{
		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.write("\n<rad:RadiologyRead");
		TreeMap map = new TreeMap();
		map.putAll(getXMLAtts());
		map.put("xmlns:arc","http://nrg.wustl.edu/arc");
		map.put("xmlns:cat","http://nrg.wustl.edu/catalog");
		map.put("xmlns:pipe","http://nrg.wustl.edu/pipe");
		map.put("xmlns:prov","http://www.nbirn.net/prov");
		map.put("xmlns:rad","http://nrg.wustl.edu/rad");
		map.put("xmlns:scr","http://nrg.wustl.edu/scr");
		map.put("xmlns:val","http://nrg.wustl.edu/val");
		map.put("xmlns:workshop","http://nrg.wustl.edu/workshop");
		map.put("xmlns:wrk","http://nrg.wustl.edu/workflow");
		map.put("xmlns:xdat","http://nrg.wustl.edu/security");
		map.put("xmlns:xnat","http://nrg.wustl.edu/xnat");
		map.put("xmlns:xnat_a","http://nrg.wustl.edu/xnat_assessments");
		map.put("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
		int header = 0;
		if (prettyPrint)header++;
		writer.write(">");
		addXMLBody(writer,header);
		if (prettyPrint)header--;
		writer.write("\n</rad:RadiologyRead>");
	}


	protected void addXMLAtts(java.io.Writer writer) throws java.io.IOException{
		TreeMap map = this.getXMLAtts();
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
	}


	protected TreeMap getXMLAtts() {
		TreeMap map = super.getXMLAtts();
		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM radiologyReadData -> mrAssessorData
		if (_Modality!=null){
			writer.write("\n" + createHeader(header++) + "<rad:modality");
			writer.write(">");
			writer.write(ValueParser(_Modality,"string"));
			writer.write("</rad:modality>");
			header--;
		}
		if (_Reader!=null){
			writer.write("\n" + createHeader(header++) + "<rad:reader");
			writer.write(">");
			writer.write(ValueParser(_Reader,"string"));
			writer.write("</rad:reader>");
			header--;
		}
		if (_Technique!=null){
			writer.write("\n" + createHeader(header++) + "<rad:technique");
			writer.write(">");
			writer.write(ValueParser(_Technique,"string"));
			writer.write("</rad:technique>");
			header--;
		}
		TreeMap FindingATTMap = new TreeMap();
		String FindingATT = new String();
		if (_Finding_normalStatus!=null)
			FindingATTMap.put("normal_status",ValueParser(_Finding_normalStatus,"boolean"));
		java.util.Iterator iter0 =FindingATTMap.keySet().iterator();
		while(iter0.hasNext()){
			String key = (String)iter0.next();
			FindingATT +=" " + key + "=\"" + FindingATTMap.get(key) + "\"";
		}
		if (_Finding!=null){
			writer.write("\n" + createHeader(header++) + "<rad:finding");
			writer.write(FindingATT);
			writer.write(">");
			writer.write(ValueParser(_Finding,"string"));
			writer.write("</rad:finding>");
			header--;
		}
		else if(!FindingATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<rad:finding");
			writer.write(FindingATT);
			writer.write("/>");
			header--;
		}

		if (_Diagnosis!=null){
			writer.write("\n" + createHeader(header++) + "<rad:diagnosis");
			writer.write(">");
			writer.write(ValueParser(_Diagnosis,"string"));
			writer.write("</rad:diagnosis>");
			header--;
		}
		if (_Comparison!=null){
			writer.write("\n" + createHeader(header++) + "<rad:comparison");
			writer.write(">");
			writer.write(ValueParser(_Comparison,"string"));
			writer.write("</rad:comparison>");
			header--;
		}
		if (_History!=null){
			writer.write("\n" + createHeader(header++) + "<rad:history");
			writer.write(">");
			writer.write(ValueParser(_History,"string"));
			writer.write("</rad:history>");
			header--;
		}
		if (_Exam!=null){
			writer.write("\n" + createHeader(header++) + "<rad:exam");
			writer.write(">");
			writer.write(ValueParser(_Exam,"string"));
			writer.write("</rad:exam>");
			header--;
		}
		if (_FollowupRecommended!=null){
			writer.write("\n" + createHeader(header++) + "<rad:followup_recommended");
			writer.write(">");
			writer.write(ValueParser(_FollowupRecommended,"boolean"));
			writer.write("</rad:followup_recommended>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Modality!=null) return true;
		if (_Reader!=null) return true;
		if (_Technique!=null) return true;
		if (_Finding_normalStatus!=null)
			return true;
		if (_Finding!=null) return true;
		if (_Diagnosis!=null) return true;
		if (_Comparison!=null) return true;
		if (_History!=null) return true;
		if (_Exam!=null) return true;
		if (_FollowupRecommended!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}

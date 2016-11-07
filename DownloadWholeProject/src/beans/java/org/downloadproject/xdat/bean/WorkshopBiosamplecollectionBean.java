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
public class WorkshopBiosamplecollectionBean extends XnatSubjectassessordataBean implements java.io.Serializable, org.nrg.xdat.model.WorkshopBiosamplecollectionI {
	public static final Logger logger = Logger.getLogger(WorkshopBiosamplecollectionBean.class);
	public static final String SCHEMA_ELEMENT_NAME="workshop:biosampleCollection";

	public String getSchemaElementName(){
		return "biosampleCollection";
	}

	public String getFullSchemaElementName(){
		return "workshop:biosampleCollection";
	}

	//FIELD

	private Boolean _Dna=null;

	/**
	 * @return Returns the dna.
	 */
	public Boolean getDna() {
		return _Dna;
	}

	/**
	 * Sets the value for dna.
	 * @param v Value to Set.
	 */
	public void setDna(Object v){
		if(v instanceof Boolean){
			_Dna=(Boolean)v;
		}else if(v instanceof String){
			_Dna=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Rna=null;

	/**
	 * @return Returns the rna.
	 */
	public Boolean getRna() {
		return _Rna;
	}

	/**
	 * Sets the value for rna.
	 * @param v Value to Set.
	 */
	public void setRna(Object v){
		if(v instanceof Boolean){
			_Rna=(Boolean)v;
		}else if(v instanceof String){
			_Rna=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Plasma=null;

	/**
	 * @return Returns the plasma.
	 */
	public Boolean getPlasma() {
		return _Plasma;
	}

	/**
	 * Sets the value for plasma.
	 * @param v Value to Set.
	 */
	public void setPlasma(Object v){
		if(v instanceof Boolean){
			_Plasma=(Boolean)v;
		}else if(v instanceof String){
			_Plasma=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Serum=null;

	/**
	 * @return Returns the serum.
	 */
	public Boolean getSerum() {
		return _Serum;
	}

	/**
	 * Sets the value for serum.
	 * @param v Value to Set.
	 */
	public void setSerum(Object v){
		if(v instanceof Boolean){
			_Serum=(Boolean)v;
		}else if(v instanceof String){
			_Serum=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Csf=null;

	/**
	 * @return Returns the csf.
	 */
	public Boolean getCsf() {
		return _Csf;
	}

	/**
	 * Sets the value for csf.
	 * @param v Value to Set.
	 */
	public void setCsf(Object v){
		if(v instanceof Boolean){
			_Csf=(Boolean)v;
		}else if(v instanceof String){
			_Csf=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("dna")){
			setDna(v);
		}else if (xmlPath.equals("rna")){
			setRna(v);
		}else if (xmlPath.equals("plasma")){
			setPlasma(v);
		}else if (xmlPath.equals("serum")){
			setSerum(v);
		}else if (xmlPath.equals("csf")){
			setCsf(v);
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
		if (xmlPath.equals("dna")){
			return getDna();
		}else if (xmlPath.equals("rna")){
			return getRna();
		}else if (xmlPath.equals("plasma")){
			return getPlasma();
		}else if (xmlPath.equals("serum")){
			return getSerum();
		}else if (xmlPath.equals("csf")){
			return getCsf();
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
		if (xmlPath.equals("dna")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rna")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("plasma")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("serum")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("csf")){
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
		all_fields.add("dna");
		all_fields.add("rna");
		all_fields.add("plasma");
		all_fields.add("serum");
		all_fields.add("csf");
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
		writer.write("\n<workshop:BiosampleCollection");
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
		writer.write("\n</workshop:BiosampleCollection>");
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
		//REFERENCE FROM biosampleCollection -> subjectAssessorData
		if (_Dna!=null){
			writer.write("\n" + createHeader(header++) + "<workshop:dna");
			writer.write(">");
			writer.write(ValueParser(_Dna,"boolean"));
			writer.write("</workshop:dna>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<workshop:dna");
			writer.write("/>");
			header--;
		}

		if (_Rna!=null){
			writer.write("\n" + createHeader(header++) + "<workshop:rna");
			writer.write(">");
			writer.write(ValueParser(_Rna,"boolean"));
			writer.write("</workshop:rna>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<workshop:rna");
			writer.write("/>");
			header--;
		}

		if (_Plasma!=null){
			writer.write("\n" + createHeader(header++) + "<workshop:plasma");
			writer.write(">");
			writer.write(ValueParser(_Plasma,"boolean"));
			writer.write("</workshop:plasma>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<workshop:plasma");
			writer.write("/>");
			header--;
		}

		if (_Serum!=null){
			writer.write("\n" + createHeader(header++) + "<workshop:serum");
			writer.write(">");
			writer.write(ValueParser(_Serum,"boolean"));
			writer.write("</workshop:serum>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<workshop:serum");
			writer.write("/>");
			header--;
		}

		if (_Csf!=null){
			writer.write("\n" + createHeader(header++) + "<workshop:csf");
			writer.write(">");
			writer.write(ValueParser(_Csf,"boolean"));
			writer.write("</workshop:csf>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<workshop:csf");
			writer.write("/>");
			header--;
		}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Dna!=null) return true;
		return true;//REQUIRED dna
	}
}

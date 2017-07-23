package com.tmca.impl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

@JacksonXmlRootElement(localName="SIMID")
public class SIMID {
	@JacksonXmlProperty(localName="type", isAttribute=true)
	private String id = "ICCID";
	@JacksonXmlText()
	@JacksonXmlProperty(localName="test")
	private String value ="21";
	
	public SIMID() {}
	public SIMID(String value) {
		this.setValue(value);
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}

package com.tmca.impl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Datetime {

	private String dateTime;
	private String format;
	
	private static final String FORMAT_UTC = "UTC";
	
	public Datetime() {
		super();
	}
	
	public Datetime(String dateTime) {
		this(dateTime, FORMAT_UTC);
	}
	
	public Datetime(String dateTime, String format) {
		this.setDateTime(dateTime);
		this.setFormat(format);
	}
	
	@JacksonXmlProperty(localName="Datetime")
	@JacksonXmlText()
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	@JacksonXmlProperty(isAttribute=true)
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	@Override
	public String toString() {
		if (dateTime != null) {
			return dateTime;
		} else {
			return "";
		}
	}
	
}

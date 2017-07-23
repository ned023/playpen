package com.tmca.impl;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Coordinate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2838780443805662690L;

	private String lat;
	private String lon;
	private String unit;
	
	public Coordinate(String lat, String lon) {
		this.setLat(lat);
		this.setLon(lon);
		this.setUnit("mas");
	}
	
	public static Coordinate exampleCoordinate() {
		return new Coordinate("-136461600", "522508700");
	}
	
	@JacksonXmlProperty(localName="lat")
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	@JacksonXmlProperty(localName="lon")
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}

	@JacksonXmlProperty(localName="unit", isAttribute=true)
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}

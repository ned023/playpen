package com.tmca.impl;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="e-ML")
public class EML implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7686636029319808761L;
	
	private Header header;
	private VehicleReport vehicleReport;
	
	@JacksonXmlProperty(isAttribute=true)
	private String version= "1.0";
	
	public static EML createExampleEML() {
		EML eml = new EML();
		eml.setHeader(Header.exampleHeader());
		eml.setVehicleReport(VehicleReport.exampleVehicleReport());
		return eml;
	}

	@JacksonXmlProperty(localName="Header")
	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}
	@JacksonXmlProperty(localName="VehicleReport")
	public VehicleReport getVehicleReport() {
		return vehicleReport;
	}

	public void setVehicleReport(VehicleReport vehicleReport) {
		this.vehicleReport = vehicleReport;
	}


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}

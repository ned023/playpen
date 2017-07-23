package com.tmca.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Device implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2226232132655290967L;
	private String DCMSupplier;
	private double FWVersion;
	private int IMEI;
	private String VIN;
	private SIMID simId = new SIMID();
	
	public Device(String dcmSupplier, double fwversion, int imei, String vin, String simid) {
		this.setDCMSupplier(dcmSupplier);
		this.setFWVersion(fwversion);
		this.setIMEI(imei);
		this.setVIN(vin);
		
	}
	
	@JacksonXmlProperty(localName="DCMSupplier")
	public String getDCMSupplier() {
		return DCMSupplier;
	}
	public void setDCMSupplier(String dCMSupplier) {
		DCMSupplier = dCMSupplier;
	}
	
	@JacksonXmlProperty(localName="FWVersion")
	public double getFWVersion() {
		return FWVersion;
	}
	
	
	public void setFWVersion(double fWVersion) {
		FWVersion = fWVersion;
	}
	
	@JacksonXmlProperty(localName="IMEI")
	public int getIMEI() {
		return IMEI;
	}
	public void setIMEI(int iMEI) {
		IMEI = iMEI;
	}
	
	@JacksonXmlProperty(localName="VIN")
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	
	@JacksonXmlProperty(localName="SIMID")
	public SIMID getSIMID() {
		return simId;
	}

	public void setSIMID(SIMID element2) {
		this.simId = element2;
	}

}

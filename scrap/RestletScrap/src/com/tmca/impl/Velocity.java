package com.tmca.impl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Velocity {

	private String velocity;
	private String unit;
	
	private static final String VELOCITY_KPH = "KPH";
	
	public Velocity() {
		super();
	}
	
	public Velocity(String velocity) {
		this(velocity, VELOCITY_KPH);
	}
	
	public Velocity(String velocity, String unit) {
		this.setVeloicty(velocity);
		this.setUnit(unit);
	}
	
	@JacksonXmlProperty(localName="Velocity")
	@JacksonXmlText()
	public String getVelocity() {
		return velocity;
	}
	public void setVeloicty(String velocity) {
		this.velocity = velocity;
	}
	
	@JacksonXmlProperty(isAttribute=true)
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	public String toString() {
		if (velocity != null) {
			return velocity;
		} else {
			return "";
		}
	}
	
}

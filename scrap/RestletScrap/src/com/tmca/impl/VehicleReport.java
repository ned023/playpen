package com.tmca.impl;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class VehicleReport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2373115755128554891L;

	private Coordinate coordinate;
	private String accurate;
	private Velocity velocity;
	private String heading;
	private Datetime dateTime;
	
	public VehicleReport(Coordinate coord, String accuracte, String velocity, String heading, String dateTime) {
		this.setAccurate(accuracte);
		this.setVelocity(new Velocity(velocity));
		this.setHeading(heading);
		this.setDateTime(new Datetime(dateTime));
		this.setCoordinate(coord);
	}
	
	public VehicleReport(String lat, String lon, String accuracte, String velocity, String heading, String dateTime) {
		this (new Coordinate(lat, lon), accuracte, velocity, heading, dateTime);
	}	
	
	public static VehicleReport exampleVehicleReport() {
		return new VehicleReport(Coordinate.exampleCoordinate(), "yes", "21", "60", "20170521T153000Z");
	}
	
	@JacksonXmlProperty(localName="Coordinate")
	public Coordinate getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	@JacksonXmlProperty(localName="Accurate")
	public String getAccurate() {
		return accurate;
	}
	public void setAccurate(String accurate) {
		this.accurate = accurate;
	}
	
	@JacksonXmlProperty(localName="Velocity")
	public Velocity getVelocity() {
		return velocity;
	}
	public void setVelocity(Velocity velocity) {
		this.velocity = velocity;
	}
	
	@JacksonXmlProperty(localName="Heading")
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	
	@JacksonXmlProperty(localName="Datetime")
	public Datetime getDateTime() {
		return dateTime;
	}
	public void setDateTime(Datetime dateTime) {
		this.dateTime = dateTime;
	}
}

package com.tmca.impl;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Message implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5385769939483415933L;
	private String Type;
	private String Service;
	private String Operation;
	
	
	public Message(String messageType, String service, String operation) {
		this.setType(messageType);
		this.setService(service);
		this.setOperation(operation);
	}
	
	@JacksonXmlProperty(localName="Type")
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getService() {
		return Service;
	}
	
	// Service Type
	// ACN - Automatic Collision Notification
	// SOS - Manual Emergency Call
	// SVT - Stolen Vehicle Tracking
	// RVM - Routine Vehicle Maintenance
	// CUST - Customer Account Activation
	// Provisioning - Provisioning
	@JacksonXmlProperty(localName="Service")
	public void setService(String service) {
		Service = service;
	}
	@JacksonXmlProperty(localName="Operation")
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
}

package com.tmca.impl;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


public class Header implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5950840218052295611L;

	
	private Device device;
	private Message message;
	
	
	public Header() {
	}
	
	public Header(Device aDevice, Message aMessage) {
		this.setDevice(aDevice);
		this.setMessage(aMessage);
	}
	
	public static Header exampleHeader() {
		return new Header("Continental", 1.0, 123456789, "abc123toyota", "123123123", "ACK", "SOS", "Notification");
	}
	
	public Header(String dcmSupplier, double fwversion, int imei, String vin, String simid, Message aMessage) {
		this.setDevice(new Device(dcmSupplier, fwversion, imei, vin, simid));
		this.setMessage(aMessage);
	}
	
	public Header(String dcmSupplier, double fwversion, int imei, String vin, String simid, String messageType, String service, String operation) {
		this(dcmSupplier, fwversion, imei, vin, simid, new Message(messageType, service, operation));
	}
	
	@JacksonXmlProperty(localName="Device")
	public Device getDevice() {
		return device;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	
	@JacksonXmlProperty(localName="Message")
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
}

package com.tmca.impl;

import java.io.Serializable;

public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1213733367470087727L;
	private String addressLine ="";
	private String addressLine2 ="";
	private String postCode = "";
	private String city = "";
	private String country = "Australia";
	
	public Address() {
		
	}
	public Address(String address1, String address2, String postcode, String city, String country) {
		this.setAddressLine(address1);
		this.setAddressLine2(address2);
		this.setPostCode(postcode);
		this.setCity(city);
		this.setCountry(country);
		
	}
	
	
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}

package com.tmca.impl;

import java.io.Serializable;

public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8007610867980831150L;
	/**
	 * 
	 */
	private String firstName = "";
	private String lastName = "";
	private int age = 0;
	private Address address;
	
	public Contact() {
		
	}
	
	public Contact(String first, String last, Address address, int age) {
		this.setFirstName(first);
		this.setLastName(last);
		this.setAge(age);
		this.setAddress(address);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

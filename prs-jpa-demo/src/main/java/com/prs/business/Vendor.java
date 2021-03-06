package com.prs.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id = 0;
	String code = null;
	String name = null;
	String address = null;
	String city = null;
	String state = null;
	int zip = 0;
	String phoneNumber = null;
	String email = null;
	boolean isPreApproved = true;

	public Vendor() {
		super();
	}

	public Vendor(int id, String code, String name, String address, String city, String state, int zip,
			String phoneNumber, String email, boolean isPreApproved) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.isPreApproved = isPreApproved;
	}

	public Vendor(String code, String name, String address, String city, String state, int zip, String phoneNumber,
			String email, boolean isPreApproved) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.isPreApproved = isPreApproved;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPreApproved() {
		return isPreApproved;
	}

	public void setPreAppreoved(boolean isPreApproved) {
		this.isPreApproved = isPreApproved;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", code=" + code + ", name=" + name + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", isPreApproved=" + isPreApproved + "]";
	}

	
// Alternate toString() for better readability. Disabled in favor of a generic one for grade-ability	
//	@Override
//	public String toString() {
//		return "Return string for vendor: " + name;
//	}

	
	
}

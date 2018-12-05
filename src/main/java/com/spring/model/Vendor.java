package com.spring.model;

public class Vendor {
	private String name;
	private String email;
	private String address;
	private String ssn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Vendor [name=" + name + ", email=" + email + ", address=" + address + ", ssn=" + ssn + "]";
	}

}

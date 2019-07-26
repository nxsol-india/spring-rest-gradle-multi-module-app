package com.commons.agency;

public class Agency {

	private int id;
	private String name;
	private String address;
	private String agencycode;
	
	public Agency() {
	}
	
	public Agency(int id, String name, String address, String agencycode) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.agencycode = agencycode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAgencycode() {
		return agencycode;
	}
	public void setAgencycode(String agencycode) {
		this.agencycode = agencycode;
	}
	
	
}

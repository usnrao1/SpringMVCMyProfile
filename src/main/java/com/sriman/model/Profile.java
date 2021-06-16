package com.sriman.model;

public class Profile {

	private String name;
	private String qualification;
	private String company;
	private String designation;
	private String address;
	private String createdDate;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}

	public Profile(String name, String qualification, String company, String designation, String address,
			String createdDate) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.company = company;
		this.designation = designation;
		this.address = address;
		this.createdDate = createdDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", qualification=" + qualification + ", company=" + company + ", designation="
				+ designation + ", address=" + address + ", createdDate=" + createdDate + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}

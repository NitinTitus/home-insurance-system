package com.project.to;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table
public class Location {
	@Id
	public int userId;
	@NotEmpty(message="residenceType is a mandatory field.")
	public String residenceType;
	@NotEmpty(message="Address Line 1 is a mandatory field.")
	private String address1;
	
	private String address2;
	@NotEmpty(message="City is a mandatory field.")
	private String city;
	@NotEmpty(message="State is a mandatory field.")
	private String state;
	@NotNull(message="Zip is a mandatory field.")
	private int zip;
	@NotEmpty(message="Residence Use is a mandatory field.")
	private String residenceUse;
	
	public Location() {
		
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getResidenceType() {
		return residenceType;
	}

	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getResidenceUse() {
		return residenceUse;
	}

	public void setResidenceUse(String residenceUse) {
		this.residenceUse = residenceUse;
	}
	
	
}

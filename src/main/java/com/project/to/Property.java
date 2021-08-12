package com.project.to;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Property {
	@Id
	private int userId;
	@NotNull(message="Market value is a mandatory field.")
	private int marketValue;
	@NotNull(message="Year built is a mandatory field.")
	@DateTimeFormat(pattern = "yyyy")
	private Date yearBuilt;
	@NotNull(message="Square Footage is a mandatory field.")
	private int sqFootage;
	@NotEmpty(message="Dwelling style is a mandatory field.")
	private String dwellingStyle;
	@NotEmpty(message="Roof material is a mandatory field.")
	private String roofMaterial;
	@NotEmpty(message="Garage type is a mandatory field.")
	private String garageType;
	@NotNull(message="Number of full baths is a mandatory field.")
	private int numFullBaths;
	@NotNull(message="Number of half baths is a mandatory field.")
	private int numHalfBaths;
	@NotEmpty(message="Has a swimming pool is a mandatory field.")
	private String hasSwimmingPool;
	
	public Property() {
		
	}

	public int getNumFullBaths() {
		return numFullBaths;
	}

	public void setNumFullBaths(int numFullBaths) {
		this.numFullBaths = numFullBaths;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(int marketValue) {
		this.marketValue = marketValue;
	}

	public Date getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(Date yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public int getSqFootage() {
		return sqFootage;
	}

	public void setSqFootage(int sqFootage) {
		this.sqFootage = sqFootage;
	}

	public String getDwellingStyle() {
		return dwellingStyle;
	}

	public void setDwellingStyle(String dwellingStyle) {
		this.dwellingStyle = dwellingStyle;
	}

	public String getRoofMaterial() {
		return roofMaterial;
	}

	public void setRoofMaterial(String roofMaterial) {
		this.roofMaterial = roofMaterial;
	}

	public String getGarageType() {
		return garageType;
	}

	public void setGarageType(String garageType) {
		this.garageType = garageType;
	}

	public int getNumHalfBaths() {
		return numHalfBaths;
	}

	public void setNumHalfBaths(int numHalfBaths) {
		this.numHalfBaths = numHalfBaths;
	}

	public String getHasSwimmingPool() {
		return hasSwimmingPool;
	}

	public void setHasSwimmingPool(String hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}
	
	
}

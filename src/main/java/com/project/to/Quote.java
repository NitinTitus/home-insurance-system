package com.project.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Quote {
	@Id
	private int userId;
	
	private int quoteId;
	
	private double premium;
	
	private double dwellingCoverage;
	
	private double detachedStructures;
	
	private double personalProperty;
	
	private double medicalExpense;
	
	private double additionalExpense;
	
	private double deductible;
	
	public Quote() {
		
	}

	public Quote(double premium, double dwellingCoverage, double detachedStructures, double personalProperty,
			double medicalExpense, double additionalExpense, double deductible) {
		this.premium = premium;
		this.dwellingCoverage = dwellingCoverage;
		this.detachedStructures = detachedStructures;
		this.personalProperty = personalProperty;
		this.medicalExpense = medicalExpense;
		this.additionalExpense = additionalExpense;
		this.deductible = deductible;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public double getDwellingCoverage() {
		return dwellingCoverage;
	}

	public void setDwellingCoverage(double dwellingCoverage) {
		this.dwellingCoverage = dwellingCoverage;
	}

	public double getDetachedStructures() {
		return detachedStructures;
	}

	public void setDetachedStructures(double detachedStructures) {
		this.detachedStructures = detachedStructures;
	}

	public double getPersonalProperty() {
		return personalProperty;
	}

	public void setPersonalProperty(double personalProperty) {
		this.personalProperty = personalProperty;
	}

	public double getMedicalExpense() {
		return medicalExpense;
	}

	public void setMedicalExpense(double medicalExpense) {
		this.medicalExpense = medicalExpense;
	}

	public double getAdditionalExpense() {
		return additionalExpense;
	}

	public void setAdditionalExpense(double additionalExpense) {
		this.additionalExpense = additionalExpense;
	}

	public double getDeductible() {
		return deductible;
	}

	public void setDeductible(double deductible) {
		this.deductible = deductible;
	}
	
}

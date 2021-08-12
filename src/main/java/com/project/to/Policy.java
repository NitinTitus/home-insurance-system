package com.project.to;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Policy {
	@Id
	private int userId;
	
	private int quoteId;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date effectiveDate;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date endDate;
	
	private int policyKey;
	
	private String policyTerm;
	
	private String policyStatus;
	
	public Policy() {
		
	}

	public int getPolicyKey() {
		return policyKey;
	}

	public void setPolicyKey(int policyKey) {
		this.policyKey = policyKey;
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

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPolicyTerm() {
		return policyTerm;
	}

	public void setPolicyTerm(String policyTerm) {
		this.policyTerm = policyTerm;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	
	
	
}

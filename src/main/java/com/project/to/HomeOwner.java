package com.project.to;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class HomeOwner {
	@Id
	private int userId;
	@NotEmpty(message="First Name is a mandatory field.")
	private String firstName;
	@NotEmpty(message="Last Name is a mandatory field.")
	private String lastName;
	@NotNull(message="Date of Birth is a mandatory field.")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	@NotEmpty(message="Are you retired is a mandatory field.")
	private String retired;
	@NotNull(message="Social Security Number is a mandatory field.")
	@Min(value = 100000000, message="Social Security Number should be a valid 9-digit number.")
	@Max(value = 999999999, message="Social Security Number should be a valid 9-digit number.")
	private int ssn;
	@NotEmpty(message="Email is a mandatory field.")
	@Email
	private String email;
	
	public HomeOwner() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getRetired() {
		return retired;
	}

	public void setRetired(String retired) {
		this.retired = retired;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

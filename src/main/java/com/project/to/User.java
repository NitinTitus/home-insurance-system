package com.project.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	@NotEmpty(message="User Name is a mandatory field.")
	private String username;
	@NotEmpty(message="Password is a mandatory field.")
	private String password;
	
	public User() {
		
	}

	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}

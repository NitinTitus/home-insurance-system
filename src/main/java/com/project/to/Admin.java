package com.project.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adminId;
	@NotEmpty(message="Admin Name is a mandatory field.")
	private String adminname;
	@NotEmpty(message="Admin Password is a mandatory field.")
	private String password;
	
	public Admin() {
		
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

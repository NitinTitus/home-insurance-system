package com.project.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AdminUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	public AdminUser() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}

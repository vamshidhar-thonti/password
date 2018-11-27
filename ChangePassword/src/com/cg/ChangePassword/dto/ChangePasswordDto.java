package com.cg.ChangePassword.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LoginCredentials")
public class ChangePasswordDto {
	
	@Id
	@Column(name = "userName")
	private String userName;
	@Column(name = "pass")
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "ChangePassword [userName=" + userName + ", password="
				+ password + "]";
	}
	
	

}

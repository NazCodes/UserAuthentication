package com.user.UserAuthentication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "userdetails")
@Entity
public class AuthenticationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UserID")
	private Integer userID;
	
	@Column(name = "Username")
	private String userName;
	
	@Column(name = "Userpassword")
	private String userPassword;
	
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	

}

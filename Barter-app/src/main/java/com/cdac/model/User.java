package com.cdac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	@Column(name="userid")
	private int userId;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="gender")
	private String gender;
	@Column(name="mobileno")
	private long mobileNo;
	@Column(name="address")
	private String address;
	@Column(name="pincode")
	private long Pincode;
	
	//no para cnstr
	public User() {
		
	}
	//para cnstr

	public User(int userId, String userName, String password, String email, String gender, long mobileNo,
			String address, long pincode) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.address = address;
		Pincode = pincode;
	}
	//getter setter methods

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPincode() {
		return Pincode;
	}

	public void setPincode(long pincode) {
		Pincode = pincode;
	}
	

	
	
}

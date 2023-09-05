package com.bank.app.entity;

public class User {
	private String username;
	private String password;
	private String contactNumber;
	private String  role;
	private double accountBalance;
	public User(String username, String password, String contactNumber, String role, double accountBalance) {
		super();
		this.username = username;
		this.password = password;
		this.contactNumber = contactNumber;
		this.role = role;
		this.accountBalance = accountBalance;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}

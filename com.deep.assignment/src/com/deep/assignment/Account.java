package com.deep.assignment;
import java.util.Date;

public class Account {
	private String accountNo;
	private Date openedData;
	private double balance;
	
	public Account() {}
	
	public Account(String accountNo, Date openedData, double balance) {
		
		this.accountNo = accountNo;
		this.openedData = openedData;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Date getOpenedData() {
		return openedData;
	}
	public void setOpenedData(Date openedData) {
		this.openedData = openedData;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}

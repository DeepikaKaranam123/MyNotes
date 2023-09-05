package com.deep.assignment;

import java.util.Date;

public class SavingsAccount extends Account{
	private double minimumDepositAmount;
	private int noOfTransactionsPerDay;
	public SavingsAccount() {}
	public SavingsAccount(String accountNo, Date openedDate, double balance, double minimumDepositAmount, int noOfTransactionsPerDay) {
		super(accountNo, openedDate, balance);
		this.minimumDepositAmount = minimumDepositAmount;
		this.noOfTransactionsPerDay = noOfTransactionsPerDay;
	}
	public double getMinimumDepositAmount() {
		return minimumDepositAmount;
	}
	public void setMinimumDepositAmount(double minimumDepositAmount) {
		this.minimumDepositAmount = minimumDepositAmount;
	}
	public int getNoOfTransactionsPerDay() {
		return noOfTransactionsPerDay;
	}
	public void setNoOfTransactionsPerDay(int noOfTransactionsPerDay) {
		this.noOfTransactionsPerDay = noOfTransactionsPerDay;
	}
	public void validateMinimumDepositAmount(double minimumDepositAmount)
	{
		if(minimumDepositAmount<100)
		{
			System.out.println("Minimum deposit amount should be more than 100");
		}
		
	}
	public void validateNoOfTransactionsPerDay(int noOfTransactionsPerDay)
	{
		if(noOfTransactionsPerDay>5)
		{
			System.out.println("noOfTransactionsPerDay should be less than 5");
		}
		
	}
	
}

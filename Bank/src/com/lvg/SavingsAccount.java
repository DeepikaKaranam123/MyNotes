package com.lvg;

public class SavingsAccount extends Account{
	private double minimumDepositAmount;
	private int noofTransactionsPerDay;
	
	
	
	public SavingsAccount() {}
	
	
	
	
	public SavingsAccount(int minimumDepositAmount, int noofTransactionsPerDay) {
		
		this.minimumDepositAmount = validateminimumDepositAmount(minimumDepositAmount);
		this.noofTransactionsPerDay = noofTransactionsPerDay;
	}




	private int validateminimumDepositAmount(int minimumDepositAmount2) {
		return 0;
	}




	public double getMinimumDepositAmount() {
		return minimumDepositAmount;
	}
	public void setMinimumDepositAmount(int minimumDepositAmount) {
		this.minimumDepositAmount = minimumDepositAmount;
	}
	public int getNoofTransactionsPerDay() {
		return noofTransactionsPerDay;
	}
	public void setNoofTransactionsPerDay(int noofTransactionsPerDay) {
		this.noofTransactionsPerDay = noofTransactionsPerDay;
	}
	
	

}

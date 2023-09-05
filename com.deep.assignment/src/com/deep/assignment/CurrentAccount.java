package com.deep.assignment;

import java.util.Date;

public class CurrentAccount extends Account {
	private double overDraftLimit;
	public CurrentAccount()
	{
		
	}
	public CurrentAccount(String accountNo, Date openedDate, double balance,double overDraftLimit) {
		super(accountNo, openedDate, balance);
		this.overDraftLimit = overDraftLimit;
	}
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	public void validateOverDraftLimit(double overDraftLimit)
	{
	
		if(overDraftLimit >=0)
			
		{
			System.out.println("Overdraft limit should be less than zero");
		}
	}
}


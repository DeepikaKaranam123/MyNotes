package com.lvg;

public class CurrentAccount extends Account
{
	private int overDraftLimit;

	public CurrentAccount() {
		
	}

	public CurrentAccount(int overDraftLimit) {
		
		this.overDraftLimit = overDraftLimit;
	}

	public int getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(int overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	
	
}

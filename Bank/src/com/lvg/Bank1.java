package com.lvg;
import java.util.Scanner;


public class Bank1 

{
	
	
	Scanner sc=new Scanner(System.in);

	char ttype=sc.next().charAt(0);
	
	private String bankName;
	private String branchName;
	private Account[] accounts;
	private int numAccounts;
	
	
	public Bank1() { }


	public Bank1(String bankName, String branchName, Account[] accounts, int numAccounts) {
		
		this.bankName = bankName;
		this.branchName = branchName;
		this.accounts = accounts;
		this.numAccounts = numAccounts;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public Account[] getAccounts() {
		return accounts;
	}


	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}


	public int getNumAccounts() {
		return numAccounts;
	}


	public void setNumAccounts(int numAccounts) {
		this.numAccounts = numAccounts;
	}
	
	
	public boolean addAcount(Account account)
	{
		if(numAccounts<10) {
			accounts[numAccounts++]=account;
			return true;
		}else
		    	throw new RuntimeException("can not addd more accounts");
			      
		
	}
	public void showAccounts()
	{
		for(int i = 0;i<numAccounts;i++)
		{
			Account account=accounts[i];
			System.out.println("Account no: " + accounts[i].getAccountNo());
			System.out.println("opened Date" + accounts[i].getOpenedDate());
			
		} 
	}
	
	
	public boolean transaction(char ttype,int accountNo,double amount)
	{	
		for(int i = 0;i<numAccounts;i++)
		{
		if(ttype== 'd')
		{
			if(accountNo == accounts[i].getAccountNo())
			{
			System.out.println("deposit section");
			accounts[i].setBalance(accounts[i].getBalance() + amount);
		    return true;
			}
	    }
		
		}
		if(ttype == 'w') 
	    { 
	    	int i;
			if(accountNo == accounts[i].getAccountNo())
			{
	    		SavingsAccount s= new SavingsAccount();
	    		if(amount>=s.getMinimumDepositAmount())
	    		{
	    	       System.out.println("with draw section");
		           accounts[i].getBalance() - amount;
	    		}
		        throw new RuntimeException("insufficient Balance ");
			}
	    }
		
		
	}
	
}
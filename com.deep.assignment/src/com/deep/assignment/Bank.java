package com.deep.assignment;

public class Bank {

	private String bankName;
	private String branchName;
	private Account[] accounts = new Account[10];
	private int noOfAccounts=0;
	
	public Bank() {}

	public Bank(String bankName, String branchName) {
		super();
		this.bankName = bankName;
		this.branchName = branchName;
		
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

	
	
	 public boolean addAccount(Account account) {
	        if (noOfAccounts >= 10) {
	            throw new RuntimeException("It is not permittable to add more than 10 accounts");
	        }

	        if (account instanceof SavingsAccount || account instanceof CurrentAccount) {
	            accounts[noOfAccounts] = account;
	            noOfAccounts=noOfAccounts+1;
	            return true;
	        }

	        return false;
	    }
	 public void showAccounts() {
		 int i=0;
		 while(i<noOfAccounts) {
	        
	            System.out.println("Account No: " + accounts[i].getAccountNo());
	            System.out.println("Opened Date: " + accounts[i].getOpenedData());
	            System.out.println("Balance: " + accounts[i].getBalance());
	            System.out.println();
	            i++;
	    }
	 }
	 
	    public boolean transaction(char ttype, String accountNo, double amount) {
	        Account account = findingAccount(accountNo);

	        if (account != null) {
	            if (ttype == 'd' || ttype == 'D') {
	                account.setBalance(account.getBalance() + amount);
	                return true;
	            } else if (ttype == 'w' || ttype == 'W') {
	                double availableBalance = account.getBalance() - amount;

	                if (account instanceof SavingsAccount) {
	                    SavingsAccount savingsAccount = (SavingsAccount) account;
	                    if (availableBalance >= savingsAccount.getMinimumDepositAmount()) {
	                        account.setBalance(availableBalance);
	                        return true;
	                    } else {
	                        throw new InsufficientBalanceException("Insufficient balance in the account.");
	                    }
	                } else if (account instanceof CurrentAccount) {
	                    CurrentAccount currentAccount = (CurrentAccount) account;
	                    if (availableBalance >= -currentAccount.getOverDraftLimit()) {
	                        account.setBalance(availableBalance);
	                        return true;
	                    } else {
	                        throw new InsufficientBalanceException("Insufficient balance in the account.");
	                    }
	                }
	            }
	        }

	        return false;
	    }
	    
	    class InsufficientBalanceException extends RuntimeException {
	        public InsufficientBalanceException(String message) {
	            super(message);
	        }
	    }
	    
	
	    private Account findingAccount(String accountNo) {
	        for (int i = 0; i < noOfAccounts; i++) {
	            if ((accounts[i].getAccountNo()) == accountNo) {
	                return accounts[i];
	            }
	        }

	        return null;
	    }
	 
	    
	 
	 
	 
	 
	 
	
}

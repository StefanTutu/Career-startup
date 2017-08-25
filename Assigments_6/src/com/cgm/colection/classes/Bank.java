package com.cgm.colection.classes;

public class Bank implements Comparable<Bank>{
	
	private String nameBank;
	private long AccountNumber;
	private double Balance;
	private boolean status; 

	public String getNameBank() {
		return nameBank;
	}

	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

	public long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bank " + nameBank + ", AccountNumber=" + AccountNumber + ", Amount=" + Balance + ", status="
				+ status + ".";
	}

	@Override
	public int compareTo(Bank o) {
		if (o.getAccountNumber() > this.AccountNumber) {
			return -1;
		}
		return 1;
	}
	
	public void withdraw(int amount) {
    	if(amount <= Balance) {
    		Balance=Balance-amount;
    	}
    	else {
    		System.err.println("Insuficient Funds.");
    	}
        this.Balance -= amount;
    }
 
    public void deposit(double amount) {
        this.Balance += amount;
    }
 
    
    public void transfer (double amount, Account otherAccount) {
    	otherAccount.deposit(amount);
    }
    
	public Bank(String nameBank, long accountNumber, double balance, boolean status) {
		super();
		this.nameBank = nameBank;
		AccountNumber = accountNumber;
		Balance = balance;
		this.status = status;
	}


}

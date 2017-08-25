package com.cgm.colection.classes;

public class Account{
	
	private double balance = 0;
	private String accountNumber;
	
	
	public Account(double balance) {
        this.balance = balance;
    }
 
    public void withdraw(int amount) {
    	if(amount <= balance) {
    		balance=balance-amount;
    	}
    	else {
    		System.err.println("Insuficient Funds.");
    	}
        this.balance -= amount;
    }
 
    public void deposit(double amount) {
        this.balance += amount;
    }
 
    public double getBalance() {
        return this.balance;
    }
    
    public void transfer (double amount, Account otherAccount) {
    	otherAccount.deposit(amount);
    }

}

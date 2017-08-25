package com.cgm.colection.interfaces;

import com.cgm.colection.classes.Account;

public class Bank implements Comparable<Bank>{

	private BankAccount[] accounts; 
	private int numOfAccounts; 

	
	
	public BankAccount[] getAccounts() {
		return accounts;
	}

	public void setAccounts(BankAccount[] accounts) {
		this.accounts = accounts;
	}

	public int getNumOfAccounts() {
		return numOfAccounts;
	}

	public void setNumOfAccounts(int numOfAccounts) {
		this.numOfAccounts = numOfAccounts;
	}

	public Bank() {
		accounts = new BankAccount[100];
		numOfAccounts = 0;
	}

	public void openNewAccount(String customerName, double openingBalance) {

		BankAccount b = new BankAccount(customerName, openingBalance);
		accounts[numOfAccounts] = b;
		numOfAccounts++;
		System.out.println(b.getAccountNum()+" "+customerName+" "+openingBalance);

	}

	public void withdrawFrom(int accountNum, double amount) {
		for (int i = 0; i < numOfAccounts; i++) {
			if (accountNum == accounts[i].getAccountNum()) {
				accounts[i].withdraw(amount);
				System.out.println("Amount withdrawn successfully");
				return;
			}
		}
		System.out.println("Account number not found.");
	}

	public void depositTo(int accountNum, double amount) {
		for (int i = 0; i < numOfAccounts; i++) {
			if (accountNum == accounts[i].getAccountNum()) {
				accounts[i].deposit(amount);
				System.out.println("Amount deposited successfully");
				return;
			}
		}
		System.out.println("Account number not found.");
	}

	
	public void printAccountInfo(int accountNum) {
		for (int i = 0; i < numOfAccounts; i++) {
			if (accountNum == accounts[i].getAccountNum()) {
				System.out.println(accounts[i].getAccountInfo());
				return;
			}
		}
		System.out.println("Account number not found.");
	}

	public void printTransactionInfo(int accountNum) {
		for (int i = 0; i < numOfAccounts; i++) {
			if (accountNum == accounts[i].getAccountNum()) {
				System.out.println(accounts[i].getAccountInfo());
				System.out.println("Last transaction: "
						+ accounts[i].getTransactionInfo(accounts[i].getNumberOfTransactions() - 1));
				return;
			}
		}
		System.out.println("Account number not found.");
	}

	public void printAccountInfo(int accountNum, int n) {
		for (int i = 0; i < numOfAccounts; i++) {
			if (accountNum == accounts[i].getAccountNum()) {
				System.out.println(accounts[i].getAccountInfo());
				System.out.println(accounts[i].getTransactionInfo(n));
				return;
			}
		}
		System.out.println("Account number not found.");
	}

	@Override
	public int compareTo(Bank o) {
		if (o.getNumOfAccounts() > this.numOfAccounts) {
			return -1;
		}
		return 1;
	}
	
//	public void transfer (double amount, accountNum otherAccount) {
//	    	otherAccount.deposit(amount);
//	    }

}

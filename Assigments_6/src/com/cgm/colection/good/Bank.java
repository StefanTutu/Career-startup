package com.cgm.colection.good;

public class Bank implements Comparable<Bank> {

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
		System.out.println(b.getAccountNum() + " " + customerName + " " + openingBalance);

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

	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (other == null)
			return false;
		if (other.getClass() != this.getClass())
			return false;
		Bank that = (Bank) other;
		return (this.accounts == that.accounts && (this.numOfAccounts == (that.numOfAccounts)));
	}

	@Override
	public int hashCode() {
		int hash = 1;
		hash = 31 * hash + accounts.hashCode();
		hash = 31 * hash + ((Integer) numOfAccounts).hashCode();
		return hash;
	}
	
	public String MD5(String md5) {
		   try {
		        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
		        byte[] array = md.digest(md5.getBytes());
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < array.length; ++i) {
		          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
		       }
		        return sb.toString();
		    } catch (java.security.NoSuchAlgorithmException e) {
		    }
		    return null;
		}

}

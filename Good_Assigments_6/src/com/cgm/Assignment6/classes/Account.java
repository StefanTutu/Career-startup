package com.cgm.Assignment6.classes;

import java.util.ArrayList;
import java.util.Objects;

public class Account {
	private int accountId;
	private int balance;
	private Bank bank;
	private ArrayList<Transaction> transactions;
	
	public Account(Bank bank, int accountId) {
		this.bank = bank;
		this.accountId = accountId;
	}
	
	public Account(Bank bank, int accountId, int balance) {
		this.bank = bank;
		this.accountId = accountId;
		this.balance = balance;
		this.transactions = new ArrayList<>(); 
	}
	
	public boolean hasAmmount(int ammount) {
		return (balance >= ammount);
	}
	
	public Bank getBank() {
		return this.bank;
	}
	
	public int getAccountId() {
		return this.accountId;
	}
	
	public int getAccountBalance() {
		return this.balance;
	}
	
	public void addAmmount(int ammount) {
		this.balance += ammount;
	}
	
	public void removeAmmount(int ammount) {
		this.balance -= ammount;
	}
	
	public boolean addTransaction(Transaction transaction) {
		if(!hasTransaction(transaction)) {
			transactions.add(transaction);
			return true;
		}
		return false;
	}
	
	public boolean hasTransaction(Transaction transaction) {
		return (transactions.indexOf(transaction) > -1);
	}
	
	public void print() {
		System.out.println(" -- Account " + accountId + "\t balance: " + balance);
		for(Transaction iterator : transactions) {
			iterator.print(this);
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(!this.getClass().equals(o.getClass())){
			return false;
		}
		Account account = (Account) o;
		if(this.getAccountId() == account.getAccountId()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accountId);
	}
}

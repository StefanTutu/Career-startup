package com.cgm.Assignment6.classes;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
	private int bankId;
	private int accountCount;
	private ArrayList<Account> accounts;
	
	public Bank(int bankId) {
		this.bankId = bankId;
		this.accountCount = 0;
		this.accounts = new ArrayList<>();
	}
	
	public Account createAccount(int balance) {
		Account newAccount = new Account(this, accountCount++, balance);
		accounts.add(newAccount);
		return newAccount;
	}
	
	public Account getAccountById(int accountId) {
		Account accountToFind = new Account(this, accountId);
		return accounts.get(accounts.indexOf(accountToFind));
	}
	
	public Transaction createTransaction(int transactionId, Account sender, Account reciever, int ammount) {
		return new Transaction(transactionId, sender, reciever, ammount);
	}
	
	public void addTransaction(Transaction transaction) {
		if(this.equals(transaction.getRecieverAccount().getBank())) {
			transaction.getRecieverAccount().addTransaction(transaction);
		}
		
		if(this.equals(transaction.getSenderAccount().getBank())) {
			transaction.getSenderAccount().addTransaction(transaction);
			
			if(transaction.getSenderAccount().hasAmmount(transaction.getAmmount())) {
				transaction.getSenderAccount().removeAmmount(transaction.getAmmount());
				transaction.accept();
				
				System.out.println("Transaction " + transaction.getTransactionId() + " accepted!");
			} else {
				System.out.println("Unable to execute transaction " + transaction.getTransactionId() + "! Not enough money!");
			}
		}
	}
	
	public void cancelTransaction(Transaction transaction) {
		transaction.cancel();
	}
	
	public int getBankId() {
		return this.bankId;
	}
	
	public void print() {
		System.out.println("Bank " + bankId);
		for(Account iterator : accounts) {
			iterator.print();
		}
	}
	
	public String getListType() {
		return this.accounts.getClass().getName();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(!this.getClass().equals(o.getClass())){
			return false;
		}
		Bank bank = (Bank) o;
		if(this.getBankId() == bank.getBankId()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bankId);
	}
}

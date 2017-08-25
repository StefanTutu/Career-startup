package com.cgm.Assignment6.classes;

public class TransactionManager {
	private Transaction transaction;
	private int currentTransactionId;
	
	public TransactionManager() {
		currentTransactionId = 0;
	}
	
	public void newTransaction(Account sender, Account reciever, int ammount) {
		transaction = sender.getBank().createTransaction(this.currentTransactionId++, sender, reciever, ammount);
		transaction.print();
	}
	
	public void executeTransaction() {
		System.out.println("Executing transaction " + transaction.getTransactionId());
		transaction.getSenderAccount().getBank().addTransaction(transaction);
		print();
	}
	
	public void cancelLastTransaction() {
		System.out.println("Cancelling transaction " + transaction.getTransactionId());
		transaction.getRecieverAccount().getBank().cancelTransaction(transaction);
		print();
	}
	
	public void print() {
		transaction.getSenderAccount().getBank().print();
		transaction.getRecieverAccount().getBank().print();
	}
}

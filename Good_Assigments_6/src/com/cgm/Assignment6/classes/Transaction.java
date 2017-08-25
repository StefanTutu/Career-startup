package com.cgm.Assignment6.classes;

import java.util.Objects;

public class Transaction {
	private int transactionId;
	private Account sender;
	private Account reciever;
	private int ammount;
	private boolean accepted;
	
	public Transaction(int transactionId, Account sender, Account reciever, int ammount) {
		this.transactionId = transactionId;
		this.sender = sender;
		this.reciever = reciever;
		this.ammount = ammount;
		this.accepted = false;
	}
	
	public Account getSenderAccount() {
		return sender;
	}
	
	public Account getRecieverAccount() {
		return reciever;
	}
	
	public int getAmmount() {
		return ammount;
	}
	
	public int getTransactionId() {
		return transactionId;
	}
	
	public void accept() {
		//sender.removeAmmount(ammount);
		reciever.addAmmount(ammount);
		accepted = true;
	}
	
	public void cancel() {
		if(accepted) {
			sender.addAmmount(ammount);
			reciever.removeAmmount(ammount);
			accepted = false;
		}
	}
	
	public boolean isAccepted() {
		return accepted;
	}
	
	public void print() {
		System.out.println("TransactionId " + transactionId + ": sender: " + sender.getAccountId() + "(Bank " + sender.getBank().getBankId() 
				+ ")\treciever: " + reciever.getAccountId() + "(Bank " + reciever.getBank().getBankId() + ")\t Ammount: " + ammount);
	}
	
	public void print(Account currentAccount) {
		if(sender.equals(currentAccount)) {
			System.out.println(" -- -- OutBound: " + ammount + "\t To: " + reciever.getAccountId() + "\tId: " + transactionId);
		}
		if(reciever.equals(currentAccount)) {
			System.out.println(" -- --  InBound: " + ammount + "\tFrom: " + sender.getAccountId() + "\tId: " + transactionId);
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
		Transaction transaction = (Transaction) o;
		if(this.getTransactionId() == transaction.getTransactionId()) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(transactionId);
	}
}

package com.cgm.colection.good;

public class BankAccount implements Comparable<BankAccount> {

	private int accountNum;
	private String customerName;
	private double balance;
	private double[] transactions;
	private String[] transactionsSummary;
	private int numOfTransactions;
	private static int noOfAccounts = 0;

	public String getAccountInfo() {
		return "Account number: " + accountNum + "\nCustomer Name: " + customerName + "\nBalance:" + balance + "\n";
	}

	public String getTransactionInfo(int n) {
		String transaction = transactionsSummary[n];
		if (transaction == null) {
			return "No transaction exists with that number.";
		} else {
			return transaction;
		}
	}

	public BankAccount(String abc, double xyz) {
		customerName = abc;
		balance = xyz;
		noOfAccounts++;
		accountNum = noOfAccounts;
		transactions = new double[100];
		transactionsSummary = new String[100];
		transactions[0] = balance;
		transactionsSummary[0] = "A balance of : $" + Double.toString(balance) + " was deposited.";
		numOfTransactions = 1;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public int getNumberOfTransactions() {
		return numOfTransactions;
	}

	public void deposit(double amount) {

		if (amount <= 0) {
			System.out.println("Amount to be deposited should be positive");
		} else {
			balance = balance + amount;
			transactions[numOfTransactions] = amount;
			transactionsSummary[numOfTransactions] = "$" + Double.toString(amount) + " was deposited.";
			numOfTransactions++;
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Amount to be withdrawn should be positive");
		} else {
			if (balance < amount) {
				System.out.println("Insufficient balance");
			} else {
				balance = balance - amount;
				transactions[numOfTransactions] = amount;
				transactionsSummary[numOfTransactions] = "$" + Double.toString(amount) + " was withdrawn.";
				numOfTransactions++;
			}
		}
	}

	public void transfer(double amount, BankAccount otherAccount) {
		if (amount <= this.balance) {
			withdraw((int) amount);
			otherAccount.deposit(amount);
			System.out.println("\nTransfer succesful. Tansfered: $" + amount);
		} else { // does not need to be else if, because if not <=, it MUST be >.
			System.out.println("\nTransfer failed, not enough balance!");
		}
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double[] getTransactions() {
		return transactions;
	}

	public void setTransactions(double[] transactions) {
		this.transactions = transactions;
	}

	public String[] getTransactionsSummary() {
		return transactionsSummary;
	}

	public void setTransactionsSummary(String[] transactionsSummary) {
		this.transactionsSummary = transactionsSummary;
	}

	public int getNumOfTransactions() {
		return numOfTransactions;
	}

	public void setNumOfTransactions(int numOfTransactions) {
		this.numOfTransactions = numOfTransactions;
	}

	public static int getNoOfAccounts() {
		return noOfAccounts;
	}

	public static void setNoOfAccounts(int noOfAccounts) {
		BankAccount.noOfAccounts = noOfAccounts;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	@Override
	public int compareTo(BankAccount o) {
		if (o.getAccountNum() > this.accountNum) {
			return -1;
		}
		return 1;
	}

	public String toString() {
		return this.customerName + " : " + this.balance;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true; // obiectul curent = obiectul ce-l pui ca parametru, atunci returneaza ca-s la
							// fel
		if (other == null)
			return false; // obiectul celalat este null...nu-s egale
		if (other.getClass() != this.getClass())
			return false; // clasa obiectului curent, difera de clasa pe care ai pus-o ca paramentr,
							// greis,t nu-s egale
		BankAccount that = (BankAccount) other; // instanta a unei clase noi (reference type) ///
		return (this.accountNum == that.accountNum && (this.balance == that.balance)
				&& (this.customerName.equals(that.customerName) && (this.numOfTransactions == that.numOfTransactions)
						&& (this.transactions == that.transactions)
						&& (this.transactionsSummary.equals(that.transactionsSummary))));// compari valorile dintre
																							// obiectul curent si cel
																							// pasat prin parametru...si
																							// speri sa fie egale, in
																							// caz contrar returneaza
																							// false
	}

	@Override
	public int hashCode() {
		int hash = 1;
		hash = 31 * hash + this.hashCode();
		hash = 31 * hash + ((Integer) this.getAccountNum()).hashCode();
		hash = 31 * hash + this.transactions.hashCode();
		hash = 31 * hash + this.transactionsSummary.hashCode();
		hash = 31 * hash + ((Double) this.balance).hashCode();
		hash = 31 * hash + this.customerName.hashCode();
		hash = 31 * hash + ((Integer) this.numOfTransactions).hashCode();
		return hash;

	}

}

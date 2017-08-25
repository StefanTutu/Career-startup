package com.cgm.colection.main;

import com.cgm.colection.good.ListBank;
import com.cgm.colection.good.MapBank;
import com.cgm.colection.good.*;

public class MainGood {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Bank myBank = new Bank();

		myBank.openNewAccount("Stefan", 5000);
		myBank.openNewAccount("Stefan1", 5000);
		myBank.openNewAccount("Stefan2", 10000);

		myBank.depositTo(1, 20.0);
		myBank.withdrawFrom(1, 2000);

		BankAccount ba = new BankAccount("Stefan", 5000);
		BankAccount ba1 = new BankAccount("Stefan1", 1000);
//		ba.setAccountNum(accountNum);
//		ba.setBalance(balance);
//		ba.setCustomerName(customerName);
//		ba.setTransactions(transactions);
//		ba.setTransactionsSummary(transactionsSummary);
//		ba.setNumOfTransactions(numOfTransactions);
		ba.getTransactionInfo(1);
		ba.transfer(100, ba1);
		ba1.transfer(500, ba);
		if (ba.equals(ba1))
			System.out.println("First list ");
		else
			System.out.println("Second list ");
		System.out.println(" " + ba.getAccountInfo());
		System.out.println(" " + ba1.getAccountInfo());
		ba1.getAccountInfo();

		myBank.printAccountInfo(1);
		myBank.printTransactionInfo(1);

		ListBank listBankAccount = new ListBank();
		// listBankAccount.BankAccountArrayList();
		listBankAccount.BankArrayList();
		showLine();

		MapBank mapBank = new MapBank();
		mapBank.illustrateMap();
		showLine();

		if (listBankAccount.equals(mapBank))
			System.out.println("Array");
		else
			System.out.println("Bua");
	}

	// helper method
	private static void showLine() {
		System.out.println("=========================================================");
	}

}

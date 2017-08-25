package com.cgm.colection.good;

import java.util.ArrayList;
import java.util.Collections;

public class ListBank {

	public void BankArrayList() {

		long startTime = System.currentTimeMillis();
		long startTime2 = System.nanoTime();
		ArrayList<BankAccount> BankAccountList = new ArrayList<BankAccount>();
		BankAccountList.add(new BankAccount("Bank1", 1000.00));
		BankAccountList.add(new BankAccount("Bank2", 1000.00));
		BankAccountList.add(new BankAccount("Bank3", 2000.00));

		// display list
		interateThroughArrayList(BankAccountList);

		// //index based changes
		// BankAccountList.set(1, null );
		ChangeIndexOf(BankAccountList, 1);
		// display changed list
		interateThroughArrayList(BankAccountList);

		// sort list
		Collections.sort(BankAccountList);

		interateThroughArrayList(BankAccountList);

		getElementArrayList(BankAccountList);

		interateThroughArrayList(BankAccountList);

		AddElementArrayList(BankAccountList);

		interateThroughArrayList(BankAccountList);

		RemoveElementArrayList(BankAccountList);

		interateThroughArrayList(BankAccountList);

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;

		long endTime = System.nanoTime();

		long duration = (endTime - startTime2) / 1000000; // for milliseconds

		System.out.println("Time for Map is ...... " + duration);

		System.out.println("Time for Array List is  " + elapsedTime);

	}

	public void BankAccountArrayList() {
		ArrayList<Bank> BankList = new ArrayList<>();
		BankList.add(null);
	}

	private void interateThroughArrayList(ArrayList<BankAccount> BankAccountList) {
		for (BankAccount bankAccount : BankAccountList) {
			System.out.println(bankAccount);
		}
	}

	private void ChangeIndexOf(ArrayList<BankAccount> list, int index) {
		list.set(index, new BankAccount("Modified", 1234));
	}

	private void getElementArrayList(ArrayList<BankAccount> list) {
		for (int i = 0; i < list.size(); i++) {
			BankAccount obj = list.get(i);
			System.out.println(" " + obj.getAccountInfo());
			System.out.println(" " + obj.getAccountNum());
			System.out.println(" " + obj.getTransactionInfo(i));
			System.out.println(" " + obj.getNumberOfTransactions());
		}
	}

	private void AddElementArrayList(ArrayList<BankAccount> list) {

		list.add(3, new BankAccount("Number 3", 123456));
		System.out.println("Elemented ADD");

	}

	private void RemoveElementArrayList(ArrayList<BankAccount> list) {
		list.remove(3);
		System.out.println("Deleted intex 3");
	}

}
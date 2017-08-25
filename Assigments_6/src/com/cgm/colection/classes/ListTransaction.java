package com.cgm.colection.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ListTransaction {
	
	public void BankArrayList() {
		
		 Transaction[] a = new Transaction[4];
	        a[0] = new Transaction("Alpha   6/17/2010  800.50");
	        a[1] = new Transaction("Beta   3/26/2002 750.00");
	        a[2] = new Transaction("Gama    6/14/2015  288.00");
	        a[3] = new Transaction("delta 8/22/2017 3870.00");

		Date today = new Date();
		
		List<Transaction> TransactionList = new ArrayList<>();
		TransactionList.add(a[0]);
		TransactionList.add(a[1]);
		TransactionList.add(a[2]);
		TransactionList.add(a[3]);
		
		
		// display sorted list
		interateThroughBankList(TransactionList);
		
		// sort
		Collections.sort(TransactionList);
		// display sorted list
		interateThroughBankList(TransactionList);
		
		
		 System.out.println("Unsorted");
	        for (int i = 0; i < a.length; i++)
	        	 System.out.println(a[i]);
	        System.out.println();
	        
	        System.out.println("Sort by date");
	        Arrays.sort(a, new Transaction.WhenOrder());
	        for (int i = 0; i < a.length; i++)
	        	 System.out.println(a[i]);
	        System.out.println();

	        System.out.println("Sort by customer");
	        Arrays.sort(a, new Transaction.WhoOrder());
	        for (int i = 0; i < a.length; i++)
	        	 System.out.println(a[i]);
	        System.out.println();

	        System.out.println("Sort by amount");
	        Arrays.sort(a, new Transaction.HowMuchOrder());
	        for (int i = 0; i < a.length; i++)
	        	 System.out.println(a[i]);
	        System.out.println();
	}
	
	private void interateThroughBankList(List<Transaction> TransactionList) {
		for (Transaction transaction : TransactionList) {
			System.out.println(transaction);
		}
	}

}

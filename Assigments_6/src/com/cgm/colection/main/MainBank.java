package com.cgm.colection.main;

import com.cgm.colection.classes.Account;
import com.cgm.colection.classes.Transaction;
import com.cgm.colection.classes.*;


public class MainBank {

	public static void main(String[] args) {
		
		Account list = new Account(0);
		
		list.deposit(1000);
		
		Account list2 = new Account(1);
		
		list2.deposit(2000);
		
		list.transfer(400, list2);
		
		System.out.println(list.getBalance());
		System.out.println(list2.getBalance());
		
		ListTransaction listAccount= new ListTransaction();
		listAccount.BankArrayList();
		
		MapTransaction mapAccount = new MapTransaction();
		mapAccount.illustrateMap();
		
		Transaction transaction = new Transaction("Witdrow");
		transaction.compareTo(transaction);

	}
	
	

}

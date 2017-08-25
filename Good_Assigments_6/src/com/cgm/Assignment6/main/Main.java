package com.cgm.Assignment6.main;

import com.cgm.Assignment6.classes.Account;
import com.cgm.Assignment6.classes.Bank;
import com.cgm.Assignment6.classes.PerformanceLog;
import com.cgm.Assignment6.classes.TransactionManager;

public class Main {
	public static void main(String[] args) {
		//StopWatch stopWatch = new StopWatch();
		TransactionManager transactionManager = new TransactionManager();
		
		Bank bank1 = new Bank(1);
		
		PerformanceLog timer = new PerformanceLog("C:\\Users\\andrei.racautanu\\Desktop\\BankingPerformanceLog.txt", bank1.getListType());
		
		timer.start("Create 1 bank");
		Bank bank2 = new Bank(2);
		timer.stop();
		
		timer.start("Create 4 accounts");
		//stopWatch.start("Create 4 accounts");
		Account account1 = bank1.createAccount(100);
		Account account2 = bank1.createAccount(100);
		
		Account account3 = bank2.createAccount(100);
		Account account4 = bank2.createAccount(100);
		//stopWatch.stop();
		timer.stop();
		
		timer.start("Create Transaction 1");
		//stopWatch.start("Create transaction");
		transactionManager.newTransaction(account1, account3, 100);
		//stopWatch.stop();
		timer.stop();
		
		timer.start("Execute transaction 1");
		//stopWatch.start("Execute transaction");
		transactionManager.executeTransaction();
		//stopWatch.stop();
		timer.stop();
		timer.start("Cancel transaction 1");
		//stopWatch.start("Cancel transaction");
		transactionManager.cancelLastTransaction();
		//stopWatch.stop();
		timer.stop();
		
		timer.start("Create Transaction 2");
		//stopWatch.start("Create transaction");
		transactionManager.newTransaction(account2, account4, 100);
		//stopWatch.stop();
		timer.stop();
		
		timer.start("Execute transaction 2");
		//stopWatch.start("Execute transaction");
		transactionManager.executeTransaction();
		//stopWatch.stop();
		timer.stop();
		timer.start("Cancel transaction 2");
		//stopWatch.start("Cancel transaction");
		transactionManager.cancelLastTransaction();
		//stopWatch.stop();
		timer.stop();
	}
}

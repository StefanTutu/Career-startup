package com.cgm.colection.main;

import com.cgm.colection.interfaces.*;

public class Main2 {
	
	public static void main(String[] args) {
	
    Bank myBank = new Bank();

 
    myBank.openNewAccount("Stefan", 5000);
    myBank.openNewAccount("Stefan1", 5000);
    myBank.openNewAccount("Stefan2", 10000);

    myBank.depositTo(1, 20.0);
    myBank.withdrawFrom(1, 2000);
    
    myBank.printAccountInfo(1);
    myBank.printTransactionInfo(1);

	}

}

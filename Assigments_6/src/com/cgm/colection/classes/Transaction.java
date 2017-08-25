package com.cgm.colection.classes;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.Date;

public class Transaction implements Comparable<Transaction>{
	
	  	private final String  bank;     
	    private final Date    date;     
	    private final double  amount;   

	    public Transaction(String bank, Date date, double amount) {
	    
	        this.bank    = bank;
	        this.date   = date;
	        this.amount = amount;
	    }

	    @SuppressWarnings("deprecation")
		public Transaction(String transaction) {
	        String[] a = transaction.split("\\s+");
	        bank    = a[0];
	        date   = new Date(a[1]);
	        amount = Double.parseDouble(a[2]);
	    }

	    
	    public String bank() {
	        return bank;
	    }
	 
	    public Date date() {
	        return date;
	    }
	 
	    public double amount() {
	        return amount;
	    }

	
	    @Override
	    public String toString() {
	        return String.format("%-10s %10s %8.2f", bank, date, amount);
	    }

	    
	    public int compareTo(Transaction that) {
	        return Double.compare(this.amount, that.amount);
	    }    

	  
	    @Override
	    public boolean equals(Object other) {
	        if (other == this) return true;
	        if (other == null) return false;
	        if (other.getClass() != this.getClass()) return false;
	        Transaction that = (Transaction) other;
	        return (this.amount == that.amount) && (this.bank.equals(that.bank))
	                                            && (this.date.equals(that.date));
	    }
	    
	    @Override
	    public int hashCode() {
	        int hash = 1;
	        hash = 31*hash + bank.hashCode();
	        hash = 31*hash + date.hashCode();
	        hash = 31*hash + ((Double) amount).hashCode();
	        return hash;
	        // return Objects.hash(bank, date, amount);
	    }
	    
  
	    public static class WhoOrder implements Comparator<Transaction> {

	        @Override
	        public int compare(Transaction bank1, Transaction bank2) {
	            return bank1.bank.compareTo(bank2.bank);
	        }
	    }

	    public static class WhenOrder implements Comparator<Transaction> {

	        @Override
	        public int compare(Transaction date1, Transaction date2) {
	            return date1.date.compareTo(date2.date);
	        }
	    }

	    public static class HowMuchOrder implements Comparator<Transaction> {

	        @Override
	        public int compare(Transaction amount1, Transaction amount2) {
	            return Double.compare(amount1.amount, amount2.amount);
	        }
	    }

}

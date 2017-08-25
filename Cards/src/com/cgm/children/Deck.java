package com.cgm.children;

import com.cgm.parent.Card;

public class Deck extends Card{

	private String suitss = null;
	private String rankk= null;

	public String getSuitss() {
		return suitss;
	}

	public void setSuitss(String suitss) {
		this.suitss = suitss;
	}

	public String getRankk() {
		return rankk;
	}

	public void setRankk(String rankk) {
		this.rankk = rankk;
	}

	@Override
	public String Tipuri() {
		  
	       	   // Kinds of suits
	        	   if(getSuit()==1) {
	        		   suitss = "DIAMONS";
	        	   }
	        	   else if (getSuit()==2) {
	        		   suitss = "CLUBS";
	        	   }
	        	   else if (getSuit()==3) {
	        		   suitss ="Hearts";
	        	   }
	        	   else if (getSuit()==4) {
	        		   suitss ="Spades";
	        	   }
	        	   
	        	   // Kinds of ranks
	        	   if(getRank()==1) {
	        		   rankk ="ACE";
	        	   }
	        	   else if(getRank()==2) {
	        		   rankk="DEUCE";
	        	   }
	        	   else if(getRank()==3) {
	        		   rankk="Three";
	        	   }
	        	   else if(getRank()==4) {
	        		   rankk="Four";
	        	   }
	        	   else if(getRank()==5) {
	        		   rankk="Five";
	        	   }
	        	   else if(getRank()==6) {
	        		   rankk="Six";
	        	   }
	        	   else if(getRank()==7) {
	        		   rankk="Seven";
	        	   }
	        	   else if(getRank()==8) {
	        		   rankk="Eight";
	        	   }
	        	   else if(getRank()==9) {
	        		   rankk="Nine";
	        	   }
	        	   else if(getRank()==10) {
	        		   rankk="Ten";
	        	   }
	        	   else if(getRank()==11) {
	        		   rankk="Jack";
	        	   }
	        	   else if(getRank()==12) {
	        		   rankk="Queen";
	        	   }
	        	   else if(getRank()==13) {
	        		   rankk="King";
	        	   }
		 return this.rankk+"|"+this.suitss ;
		 }
	
	
}
    
	


package com.cgm.parent;

public abstract class Card {

	private int rank = 13;//rank
	private int suit = 4;//suit
	protected int[][] a = new int[rank][suit];
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	public abstract String Tipuri(); 
}

package com.cgm.parent;

public class Card_alt {
	
	  	public enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES; }

	    public enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE; }

	    final Rank rank;
	    final Suit suit;

	    public Card_alt (final Rank rank, final Suit suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }
	    
	    @Override
	    public String toString(){
	        return suit.name()+"-"+rank.name();
	    }

}

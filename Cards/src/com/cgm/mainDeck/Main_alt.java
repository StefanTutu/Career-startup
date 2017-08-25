package com.cgm.mainDeck;

import java.util.ArrayList;
import java.util.List;
import com.cgm.parent.Card_alt;

public class Main_alt {

	public static void main(String[] args) {

		
		List<Card_alt> newDeck = new ArrayList<Card_alt>( );

        Card_alt.Rank[] ranks = Card_alt.Rank.values();  
        Card_alt.Suit[] suits = Card_alt.Suit.values(); 

        for (Card_alt.Suit suit : suits) {
            for (Card_alt.Rank rank : ranks) {
                newDeck.add(new Card_alt(rank,suit));
            }
        }

        int n = newDeck.size();

        for (int i = 0; i < n ; i++) {
            System.out.println((i + 1)  + ": " + newDeck.get(i));       
        }
        
        System.out.println((n+1) + ": " + "BLACK-JOCKER");
		System.out.println((n+2) + ": " + "WHITE-JOCKER");
        

	}

}

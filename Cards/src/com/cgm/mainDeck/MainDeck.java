package com.cgm.mainDeck;

import java.util.Random;

import com.cgm.children.Deck;

public class MainDeck {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Random R = new Random();
		
		deck.setRank(R.nextInt(13)+1);
		deck.setSuit(R.nextInt(4)+1);
		System.out.println("Wild Card");
		System.out.print(deck.Tipuri()+" ");
		System.out.println("\n");
		
		System.out.println("Deck ");
		for(int i=1;i<14;i++) {
			deck.setRank(i);
			for(int j=1;j<5;j++) {
				deck.setSuit(j);
				System.out.println(deck.Tipuri()+" ");
			}
		}
		System.out.println("Jocker|Black");
		System.out.println("Jocker|White");
		
	}

}

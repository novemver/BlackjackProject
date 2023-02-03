package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
private List deckList = new ArrayList<>(); 
//each deck has 52 cards.lets create them
//for each of the 4 suits create each of the 14 ranks.
public Deck() {
	Rank[] ranks = Rank.values();
	Suit[] suits = Suit.values();
	for (Suit suit : suits) {
		for(Rank rank : ranks) {
			Card card = new Card(suit, rank);
//			System.out.println(card);
			this.deckList.add(card);
		}
	}
}

public int checkSize() {
	return deckList.size();
}

public Card dealCard() {
	shuffleCards();
	return (Card) deckList.remove(0);
}

public void shuffleCards() {
	Collections.shuffle(deckList);
}



public List getDeck() {
	return deckList;
}

public void setDeck(List deckList) {
	this.deckList = deckList;
}

}

package com.skilldistillery.blackjack.testing;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class DealingCards {

	public static void main(String[] args) {
		DealingCards dealer = new DealingCards();
//deal 5 cards from the deck displaying each of the dealt cards

		dealer.deal();

	}

	public void deal() {
		Deck theDeck = new Deck();
//		System.out.println(theDeck.getDeck().size());
		System.out.println(theDeck.getDeck());
		System.out.println("How many cards? "); //switch or if for choice under over
		Scanner scan = new Scanner(System.in);
		int numCards = scan.nextInt();
		scan.nextLine();
//		for(int numCardsDealtSoFar = 0; numCardsDealtSoFar < numCards; numCardsDealtSoFar++) {
//			Card aCard = theDeck.dealCard();
//			System.out.println(aCard);
//			System.out.println(theDeck.checkSize() + " cards left in deck");
		}
// the dealer will take the deck and 
//		scan.close();
	}

}

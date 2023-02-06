package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Dealer {
	private Deck dealerDeck = new Deck();
//	private Hand dHand = new BlackjackHand();
	private Hand dHand = new BlackjackHand();
	private int score = 0;
	private int gamesWon = 0;
	private int cardsRemaining = 0;

	public void shuffleDeck() {
		dealerDeck.shuffleDeck();
	}

	public void dealPlayerCard(Player p) {
		Card playerCard = dealerDeck.dealCard();
		p.receiveCard(playerCard);

	}

	public Hand dealerClear() {
		setScore(0);
		dHand.clear();
		return dHand;
	}

	public void dealDealerCard(Dealer d) {
		Card dealerCard = dealerDeck.dealCard();
		dHand.addCard(dealerCard);
		score += dealerCard.getValue();
	}

	public void dealerCheckCardsRemaining() {
		setCardsRemaining(dealerDeck.checkSize());
		System.out.println("Cards remainging: " + getCardsRemaining());
	}

	public Deck getDealerDeck() {
		return dealerDeck;
	}

	public void setDealerDeck(Deck dealerDeck) {
		this.dealerDeck = dealerDeck;
	}

	public Hand getdHand() {
		return dHand;
	}

	public Hand setdHand(Hand dHand) {
		return this.dHand = dHand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getGamesWon() {
		System.out.println("Games won: " + gamesWon);
		return gamesWon;
	}

	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
		
	}

	public void displayScore() {
		System.out.println("Dealer Hand Total: " + score);
	}

	public void displayDealerGamesWon() {
		System.out.println("Dealer Games Won: " + gamesWon);
	}

	public void dealTheMenu() {
		System.out.println("Please choose: \n1. Hit \n2. Stay ");
	}

	public void dealerHandDisplay() {
		System.out.println("Dealer Hand: " + dHand);
	}

	public void dealerHandSum(Dealer d) {

	}

	public boolean dIsBust(Dealer d) {
		if (d.getScore() > 21) {
			System.out.println("Dealer Bust");
			return true;
		}
		return false;
	}

	public int getCardsRemaining() {
		return cardsRemaining;
	}

	public void setCardsRemaining(int cardsRemaining) {
		this.cardsRemaining = cardsRemaining;
	}

}

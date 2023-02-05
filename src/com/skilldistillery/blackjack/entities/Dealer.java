package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Dealer {
	private Deck dealerDeck = new Deck();
	private Hand dHand = new BlackjackHand();
	private int score = 0;
	private int gamesWon = 0;

	public void shuffleDeck() {
		dealerDeck.shuffleDeck();
	}
	public void dealPlayerCard(Player p) {
		Card playerCard = dealerDeck.dealCard();
		p.receiveCard(playerCard);
		
	}
	public void dealDealerCard(Dealer d) {
		Card dealerCard = dealerDeck.dealCard();
		dHand.addCard(dealerCard);
		score += dealerCard.getValue();
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

	public void setdHand(Hand dHand) {
		this.dHand = dHand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getGamesWon() {
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
		System.out.println(dealerDeck.checkSize() + " cards remaining \n" + "Please choose: \n1. Hit \n2. Stand");
	}

	public void dealerHandDisplay() {
		System.out.println("Dealer Hand: " + dHand);
	}

	public void dealerHandSum(Dealer d) {

	}

	public boolean isBust() {
		
		return false;
	}

	public void addCard() {

	}

	public void clear() {
		// TODO Auto-generated method stub

	}

}

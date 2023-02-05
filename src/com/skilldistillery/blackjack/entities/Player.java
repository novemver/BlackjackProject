package com.skilldistillery.blackjack.entities;

import java.util.Objects;

public class Player {
	private Hand pHand = new BlackjackHand();
	private int score = 0;
	private int gamesWon = 0;

	
//	public void hitOrStay(int score, int gamesWon) {
//		BlackjackHand pB = new BlackjackHand();
//		 pB.playerPlay(score, gamesWon);
//	}
	
	
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
	public void receiveCard(Card p) {
		pHand.addCard(p );
		score += p.getValue();
	}
	public void playerHandDisplay() {
		System.out.println("Player Hand: " + pHand);
	}
	
public void displayScore() {
	System.out.println("Player Hand Total: " + score);
}
public void displayPlayerGamesWon() {
	System.out.println("Player Games won: " + gamesWon);
}
	
	@Override
	public String toString() {
		return "Cards in Player's Hand; " + pHand;
	}
	@Override
	public int hashCode() {
		return Objects.hash(pHand);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(pHand, other.pHand);
	}
	
}

//public void playerHitOrStay(Player p, int c) {
//	Card playerCard = dealerDeck.dealCard();
//	dealer.dealTheMenu();
//	if (p.getScore() >= 21) {
//		p.setGamesWon(p.getGamesWon() + 1);
//		p.displayPlayerGamesWon();
//	}
//	switch (c) {
//	case 1:
//		p.receiveCard(playerCard);
//		break;
//	case 2:
////dealers turn
//		break;
//
//	default:
//		break;
//	}
//}

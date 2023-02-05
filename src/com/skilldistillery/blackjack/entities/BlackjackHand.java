package com.skilldistillery.blackjack.entities;

import java.util.Objects;
import java.util.Scanner;

public class BlackjackHand extends Hand {
//	private BlackjackHand mainBlackjack = new BlackjackHand();

	public void dealGamePlay() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Dealer bjDealer = new Dealer();
		Player player = new Player();
		bjDealer.shuffleDeck();
		bjDealer.dealPlayerCard(player);
		bjDealer.dealDealerCard(bjDealer);
		bjDealer.dealerHandDisplay();
		player.playerHandDisplay();
		bjDealer.dealPlayerCard(player);
		bjDealer.dealDealerCard(bjDealer);
		bjDealer.dealerHandDisplay();
		player.playerHandDisplay();
		bjDealer.displayScore();
		player.displayScore();

	}

	public void isBlackjack(int r) {
		if (r >= 21) {

		}
	}

//	public boolean isBlackjack(Hand b, Hand p) {
//		return false;
//		
//	}
	public void hitMe() {

	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}

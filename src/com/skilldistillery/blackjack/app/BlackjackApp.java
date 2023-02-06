package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.BlackjackHand;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp blackjack = new BlackjackApp();
		blackjack.letsPlay();
	}

	public void letsPlay() {
		deal();
	}

	public void deal() {
		BlackjackHand mainBlackjack = new BlackjackHand();
		Dealer dealer = new Dealer();
		Player player = new Player();
		mainBlackjack.dealGamePlay();
	}

}


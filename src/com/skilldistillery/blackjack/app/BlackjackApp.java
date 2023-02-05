package com.skilldistillery.blackjack.app;

import java.util.Scanner;

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
//		playBlackjack();
	}

	public void deal() {
		BlackjackHand mainBlackjack = new BlackjackHand();
		Dealer dealer = new Dealer();
		Player player = new Player();
		mainBlackjack.dealGamePlay();
	}

//		choice = sc.nextInt();
//		mainBlackjack.playingBlackjack(choice);
//		sc.nextLine();
//		dealer.dealTheMenu();
//		dealer.dealTheMenu();
//		dealer.playerHitOrStay(player, choice);
//		dealer.displayScore();
//		player.displayScore();
//		mainBlackjack.playingBlackjack();
//		dealer.dealTheMenu();
//		player.displayPlayerGamesWon();
//		dealer.dealerHandSum(dealer);

//		System.out.println(mainDeck.getDeck());
//		System.out.println("Let's play Blackjack!");
//		mainDeck.shuffleCards();
//		Scanner kb = new Scanner(System.in);
//		System.out.println(mainDeck.getDeck());
//		 dealtCard = mainDeck.dealCard();
//		 System.out.println(dealtCard);
//		dHand.setDealerHand(dealtCard);

}

//dealer.shuffleDeck();
//dealer.dealPlayerCard(player);
//dealer.dealDealerCard(dealer);
//dealer.dealerHandDisplay();
//player.playerHandDisplay();
//dealer.dealPlayerCard(player);
//dealer.dealDealerCard(dealer);
//dealer.dealerHandDisplay();
//player.playerHandDisplay();
//dealer.displayScore();
//player.displayScore();
//
//dealer.dealPlayerCard(player);
//dealer.dealerHandDisplay();
//player.playerHandDisplay();
//
//dealer.displayScore();
//player.displayScore();
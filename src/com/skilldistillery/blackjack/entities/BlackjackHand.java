package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class BlackjackHand extends Hand {

	public void dealGamePlay() {
		Dealer dealer = new Dealer();
		Player player = new Player();
		Deck gameDeck = new Deck();

		dealer.shuffleDeck();
		playHand(dealer, player);

	}

	public void playHand(Dealer dealer, Player player) {
		dealer.dealerCheckCardsRemaining();
		dealer.dealerClear();
		player.playerClear();
		dealer.dealPlayerCard(player);
		dealer.dealDealerCard(dealer);
		dealer.dealerHandDisplay();
		player.playerHandDisplay();
		dealer.dealPlayerCard(player);
		dealer.dealDealerCard(dealer);
//		dealer.dealerHandDisplay();
//		player.playerHandDisplay();
		if (isTwentyOne(dealer, player) == true) {
			isTwentyOne(dealer, player);
			displayInfo(dealer, player);
			playHand(dealer, player);
		} else if (isBust(dealer, player) == true) {
			isBust(dealer, player);
			displayInfo(dealer, player);
			playHand(dealer, player);
		} else {
		do {
			decisions(dealer, player);
		} while (winStatus(dealer, player) == false );
	}
	}

	public void decisions(Dealer dealer, Player player) {
		displayInfo(dealer, player);

	while (isTwentyOne(dealer, player) == false) {
			Scanner sc = new Scanner(System.in);

		dealer.dealTheMenu();

		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Player chooses to HIT ");
			dealer.dealPlayerCard(player);
			if (dealer.getScore() < 17) {
				dealer.dealDealerCard(dealer);
			}
			displayInfo(dealer, player);
			if (winStatus(dealer, player) == true) {
				playHand(dealer, player);
			}
			break;
		case 2:
			System.out.println("Player chooses to STAY ");
			
			if (dealer.getScore() < 17) {
				dealer.dealDealerCard(dealer);
			}
			displayInfo(dealer, player);
			if (winStatus(dealer, player) == true);
			playHand(dealer, player);
			break;
		default:
			break;
		}
	}
	}

	public void displayInfo(Dealer dealer, Player player) {
		dealer.dealerHandDisplay();
		player.playerHandDisplay();
		dealer.displayScore();
		player.displayScore();
		dealer.getGamesWon();
		player.getGamesWon();
	}

	public boolean winStatus(Dealer dealer, Player player) {
		if (isTwentyOne(dealer, player)) {
			playHand(dealer, player);
			return true;
		} else if (isBust(dealer, player)) {
			playHand(dealer, player);
			return true;
		} else if (gameDraw(dealer, player)) {
			playHand(dealer, player);
			return true;
		} else {
			return false;
		}
	}

	public boolean isTwentyOne(Dealer d, Player p) {
		if (d.getScore() == 21) {
			System.out.println("Dealer wins! ");
			d.setGamesWon(d.getGamesWon() + 1);
			return true;
		} else if (p.getScore() == 21) {
			System.out.println("Player wins!");
			p.setGamesWon(p.getGamesWon() + 1);
			return true;
		} else {
			return false;
		}
	}

	public boolean isBust(Dealer d, Player p) {
		if (d.dIsBust(d)) {
			p.setGamesWon(p.getGamesWon() + 1);

			return true;
		} else if (p.pIsBust(p)) {
			d.setGamesWon(d.getGamesWon() + 1);
		} else {
			return false;
		}
		return false;
	}

	public boolean gameDraw(Dealer d, Player p) {
		if (d.getScore() == p.getScore() && d.getScore() > 17 && p.getScore() > 17) {
			System.out.println("Draw");
		}
		return true;
	}

	public boolean checkWinner(Dealer d, Player p) {
		if (d.getCardsRemaining() < 0) {
			System.out.println("Out of Cards");
			if (d.getGamesWon() > p.getGamesWon()) {
				System.out.println("Dealer wins");
			} else if (p.getGamesWon() > d.getGamesWon())
				System.out.println("Player wins");
		} else {
			return false;
		}
		return true;

	}

}

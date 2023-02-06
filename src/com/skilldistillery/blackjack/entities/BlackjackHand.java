package com.skilldistillery.blackjack.entities;

import java.util.Objects;
import java.util.Scanner;

public class BlackjackHand extends Hand {
//	private BlackjackHand mainBlackjack = new BlackjackHand();

	public void dealGamePlay() {
		Dealer dealer = new Dealer();
		Player player = new Player();
		Deck gameDeck = new Deck();
		int choice = 0;

		dealer.shuffleDeck();
		dealer.dealPlayerCard(player);
		dealer.dealDealerCard(dealer);
		dealer.dealerHandDisplay();
		player.playerHandDisplay();
		dealer.dealPlayerCard(player);
		dealer.dealDealerCard(dealer);
		dealer.dealerHandDisplay();
		player.playerHandDisplay();
		dealer.displayScore();
		player.displayScore();
		dealer.dealerCheckCardsRemaining();
		dealer.displayDealerGamesWon();
		player.displayPlayerGamesWon();
		while (isWinner(dealer, player) == false) {
			Scanner sc = new Scanner(System.in);
			dealer.dealTheMenu();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				dealer.dealPlayerCard(player);
				if (dealer.getScore() < 17) {
					dealer.dealDealerCard(dealer);
				}
				System.out.println("Player chooses to HIT ");

				break;
			case 2:
				if (dealer.getScore() < 17) {
					dealer.dealDealerCard(dealer);
				}
				System.out.println("Player chooses to STAY ");
				break;
			default:
				break;
			}

			dealer.displayScore();
			player.displayScore();
			dealer.dealerHandDisplay();
			player.playerHandDisplay();
			dealer.dealerCheckCardsRemaining();
		}
	}

	public boolean isWinner(Dealer d, Player p) {
		if (d.getScore() == 21) {
			System.out.println("Dealer wins! ");
			d.setGamesWon(d.getGamesWon() + 1);
			return true;
		} else if (p.getScore() == 21) {
			System.out.println("Player wins!");
			p.setGamesWon(p.getGamesWon() + 1);
			return true;
		} else if (d.dIsBust(d)) {
			p.setGamesWon(p.getGamesWon() + 1);
			return true;
		} else if (p.pIsBust(p)) {
			d.setGamesWon(d.getGamesWon() + 1);
			return true;
		} else if (d.getScore() == p.getScore() && d.getScore() > 17 && p.getScore() > 17) {
			System.out.println("Draw");
			return true;
		} else if (d.getScore() > p.getScore() && d.getScore() > 17 && p.getScore() > 17) {
			System.out.println("Dealer wins! ");
			d.setGamesWon(d.getGamesWon() + 1);
			return true;
		} else if (p.getScore() > d.getScore() && d.getScore() > 17 && p.getScore() > 17) {
			System.out.println("Player wins!");
			p.setGamesWon(p.getGamesWon() + 1);
			return true;
		} else {
			return false;
		}
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

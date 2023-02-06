package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Hand {
	protected List<Card> cardHand = new ArrayList<>();

	public Hand() {
	}

	public void addCard(Card pc) {
		cardHand.add(pc);
	}

	public void clear() {
	}

	public String toString() {
		return "" + cardHand;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardHand);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hand other = (Hand) obj;
		return Objects.equals(cardHand, other.cardHand);
	}

}

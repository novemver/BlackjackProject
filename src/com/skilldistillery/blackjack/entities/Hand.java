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
	
//	public void handSum(Hand l) {
//		int score = 0;
//	for(int i = 0; i < ((CharSequence) l).length(); i++) {
//		 score += l.getValue();
//	}


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

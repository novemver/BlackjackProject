package com.skilldistillery.blackjack.entities;

public enum Rank {
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10, "Jack"), QUEEN(10, "Queen"), KING(10, "King"),
	ACE(11, "Ace");

	private int value;
private String politeName;
	Rank(int num) {
		value = num;
	}
	
	Rank(int num, String name) {
		value = num;
		politeName = name;
	}
	
	public int getValue() {
		return value;
	}
	
//	@Override
//public String toString() {
//	return politeName + " " + value;
//}
	

	
}

package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	private String name;
	

	Suit(String n) {
//		this.name = n;
		name = n;
	}

	@Override
	public String toString() {	
		return name;
	}


	
}

//Create a public enum called Suit with the constants 
//(in order) HEARTS, SPADES, CLUBS, DIAMONDS.
//Add a private name field to Suit.
//Add a one-arg constructor to Suit and set the name fields 
//to Hearts, Spades, Clubs, Diamonds.
//Override the toString method to output this name.
//Create a public enum called Rank with the constants 
//(in order) TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE.
//Add a private value field to Rank.
//Add a one-arg constructor to Rank and set the value field to 2-10 for numbers, 10 for JACK, QUEEN, and KING, and 11 for ACE.
//Add a getValue() method to return the value.
//Uncomment the code in CardTest to test your enums.
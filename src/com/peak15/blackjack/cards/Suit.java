package com.peak15.blackjack.cards;

public enum Suit
{
	HEARTS ("Hearts"),
	SPADES ("Spades"),
	DIAMONDS ("Diamonds"),
	CLUBS ("Clubs");
	
	private String name;
	
	private Suit(final String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}
}

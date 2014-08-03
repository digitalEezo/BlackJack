package com.peak15.blackjack.cards;

public enum Rank
{
	ACE("Ace"), TWO("Two"), THREE("Three"), FOUR("Four"), FIVE("Five"), SIX(
			"Six"), SEVEN("Seven"), EIGHT("Eight"), NINE("Nine"), TEN("Ten"), JACK(
			"Jack"), QUEEN("Queen"), KING("King");

	private String name;

	private Rank(final String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return this.name;
	}
}

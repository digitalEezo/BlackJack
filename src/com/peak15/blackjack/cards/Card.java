package com.peak15.blackjack.cards;

public final class Card
{
	private final Rank rank; 
	private final Suit suit;
	
	public Card(final Rank rank, final Suit suit)
	{
		super();
		
		this.rank = rank;
		this.suit = suit;
	}
	
	public Rank getRank()
	{
		return rank;
	}
	
	public Suit getSuit()
	{		
		return suit;
	}
	
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("The ");
		sb.append(rank);
		sb.append(" of ");
		sb.append(suit);
		return sb.toString();
	}
}

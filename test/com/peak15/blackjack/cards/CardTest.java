package com.peak15.blackjack.cards;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest
{

	@Test
	public void testToString()
	{
		final String expected = "The Ace of Spades";
		
		final Card card = new Card(Rank.ACE, Suit.SPADES);
		
		final String actual = card.toString();
		
		assertEquals(expected, actual);
	}

}

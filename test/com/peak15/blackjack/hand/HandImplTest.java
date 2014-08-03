package com.peak15.blackjack.hand;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.peak15.blackjack.cards.Card;
import com.peak15.blackjack.cards.Rank;
import com.peak15.blackjack.cards.Suit;

public class HandImplTest
{
	private Hand hand;

	@Before
	public void setUp()
	{
		hand = new HandImpl();
	}

	@Test
	public void testGetValue_eight_shouldReturn8()
	{
		final Card eightOfClubs = new Card(Rank.EIGHT, Suit.CLUBS);
		hand.addCard(eightOfClubs);

		final int expected = 8;
		final int actual = hand.getValue();

		assertEquals(
				"The value of a hand containing only the eight of clubs should be 8. ",
				expected, actual);
	}

	@Test
	public void testGetValue_eightAndSeven_shouldReturn15()
	{
		final Card eightOfClubs = new Card(Rank.EIGHT, Suit.CLUBS);
		hand.addCard(eightOfClubs);
		final Card sevenOfHearts = new Card(Rank.SEVEN, Suit.HEARTS);
		hand.addCard(sevenOfHearts);

		final int expected = 15;
		final int actual = hand.getValue();

		assertEquals(
				"The value of a hand containing an eight of clubs and a seven of hearts should be 15. ",
				expected, actual);
	}

	@Test
	public void testGetValue_eightAndAce_shouldReturn19()
	{
		final Card eightOfClubs = new Card(Rank.EIGHT, Suit.CLUBS);
		hand.addCard(eightOfClubs);
		final Card aceOfHearts = new Card(Rank.ACE, Suit.HEARTS);
		hand.addCard(aceOfHearts);

		final int expected = 19;
		final int actual = hand.getValue();

		assertEquals(
				"The value of a hand containing an eight of clubs and an ace of hearts should be 19",
				expected, actual);
	}

	@Test
	public void testGetValue_nineAceAndAce_shouldReturn21()
	{
		final Card nineOfClubs = new Card(Rank.NINE, Suit.CLUBS);
		hand.addCard(nineOfClubs);
		final Card aceOfHearts = new Card(Rank.ACE, Suit.HEARTS);
		hand.addCard(aceOfHearts);
		final Card aceOfSpades = new Card(Rank.ACE, Suit.SPADES);
		hand.addCard(aceOfSpades);

		final int expected = 21;
		final int actual = hand.getValue();

		assertEquals(
				"The value of a hand containing a nin of clubs, an ace of hearts, and an ace of spades should be 21",
				expected, actual);
	}
}

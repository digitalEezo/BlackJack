package com.peak15.blackjack.ui;

import static org.junit.Assert.*;

import org.junit.Test;

import com.peak15.blackjack.Update;
import com.peak15.blackjack.cards.Card;
import com.peak15.blackjack.cards.Rank;
import com.peak15.blackjack.cards.Suit;

public class ConsoleUserInterfaceTest
{

	@Test
	public void testProcessUpdate()
	{
		final Update update = createTestUpdate();
		
		new ConsoleUserInterface().processUpdate(update);
	}

	private Update createTestUpdate()
	{
		Update update = new Update();
		
		Card aceOfSpades = new Card(Rank.ACE, Suit.SPADES);
		Card[] dealerHandShowing = {aceOfSpades};
		update.setDealerHandShowing(dealerHandShowing);
		update.setDealerValueShowing(11);
		
		Card tenOfHearts = new Card(Rank.TEN, Suit.HEARTS);
		Card nineOfDiamonds = new Card(Rank.NINE, Suit.DIAMONDS);
		Card[] playerHand = {tenOfHearts, nineOfDiamonds};
		update.setPlayerHand(playerHand);
		update.setPlayerValue(19);
		
		return update;
	}
}

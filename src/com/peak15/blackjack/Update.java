package com.peak15.blackjack;

import com.peak15.blackjack.cards.Card;

public class Update
{
	private Card[] dealerHandShowing;
	private Card[] playerHand;
	private int dealerValueShowing;
	private int playerValue;

	public Card[] getDealerHandShowing()
	{
		return dealerHandShowing;
	}

	public void setDealerHandShowing(final Card[] dealerHandShowing)
	{
		this.dealerHandShowing = dealerHandShowing;
	}

	public Card[] getPlayerHand()
	{
		return playerHand;
	}

	public void setPlayerHand(final Card[] playerHand)
	{
		this.playerHand = playerHand;
	}

	public int getDealerValueShowing()
	{
		return dealerValueShowing;
	}

	public void setDealerValueShowing(final int dealerValueShowing)
	{
		this.dealerValueShowing = dealerValueShowing;
	}

	public int getPlayerValue()
	{
		return playerValue;
	}

	public void setPlayerValue(final int playerValue)
	{
		this.playerValue = playerValue;
	}
}

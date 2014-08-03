package com.peak15.blackjack.player;

import com.peak15.blackjack.hand.Hand;
import com.peak15.blackjack.hand.HandImpl;

public abstract class AbstractPlayer
{
	protected Hand hand;
	
	public AbstractPlayer()
	{
		this.hand = new HandImpl();
	}
	
	public abstract Decision getDecision();
	
	public enum Decision
	{
		HIT,
		STAND
	}
}

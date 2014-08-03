package com.peak15.blackjack.hand;

import com.peak15.blackjack.cards.Card;

public interface Hand
{
	static final int MAX_VALUE = 21;
	
	void addCard(Card card);
	
	boolean isBust();
	
	int getValue();
	
	boolean containsAce();
}
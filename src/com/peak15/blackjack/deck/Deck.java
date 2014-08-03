package com.peak15.blackjack.deck;

import com.peak15.blackjack.cards.Card;

public interface Deck
{
	void shuffle();
	
	Card draw();
	
	int size();
}

package com.peak15.blackjack.deck;

import java.util.ArrayList;
import java.util.List;

import com.peak15.blackjack.cards.Card;
import com.peak15.blackjack.cards.Rank;
import com.peak15.blackjack.cards.Suit;

public class SimpleDeck implements Deck
{
	private static final int DECK_SIZE = 52;
	
	List usedCards;
	
	public SimpleDeck()
	{
		shuffle();
	}

	@Override
	public void shuffle()
	{
		usedCards = new ArrayList();
	}

	@Override
	public Card draw()
	{
		Rank rank = randomRank();
		Suit suit = randomSuit();
		
		Card card = new Card(rank, suit);
		
		if (usedCards.contains(card))
		{
			return draw();
		}
		
		usedCards.add(card);
				
		return card;
	}

	Suit randomSuit()
	{
		Suit[] suits = Suit.values();
		int numSuits = suits.length;
		int rand = (int) (Math.random() % numSuits);
		return suits[rand];
	}
	
	Rank randomRank()
	{
		Rank[] ranks = Rank.values();
		int numRanks = ranks.length;
		int rand = (int) (Math.random() % numRanks);
		return ranks[rand];
	}

	@Override
	public int size()
	{
		return DECK_SIZE - usedCards.size();
	}
}

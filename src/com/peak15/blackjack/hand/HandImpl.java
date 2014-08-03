package com.peak15.blackjack.hand;

import java.util.ArrayList;
import java.util.List;

import com.peak15.blackjack.cards.Card;
import com.peak15.blackjack.cards.Rank;

public class HandImpl implements Hand
{
	List<Card> cards;

	public HandImpl()
	{
		cards = new ArrayList<Card>();
	}

	@Override
	public void addCard(final Card card)
	{
		cards.add(card);
	}

	@Override
	public int getValue()
	{
		int value = 0;

		value += valueNonAce();
		value = valueAce(value);

		return value;
	}

	private int valueNonAce()
	{
		int value = 0;
		Rank currentCardRank = null;

		for (int i = 0; i < cards.size(); ++i) {
			currentCardRank = cards.get(i).getRank();

			switch (currentCardRank)
			{
			case ACE:
				break;
			case KING:
			case QUEEN:
			case JACK:
			case TEN:
				value += 10;
				break;
			case NINE:
				value += 9;
				break;
			case EIGHT:
				value += 8;
				break;
			case SEVEN:
				value += 7;
				break;
			case SIX:
				value += 6;
				break;
			case FIVE:
				value += 5;
				break;
			case FOUR:
				value += 4;
				break;
			case THREE:
				value += 3;
				break;
			case TWO:
				value += 2;
				break;
			}
		}
		
		return value;
	}
	
	private int valueAce(final int valueNonAce)
	{
		int value = valueNonAce;
		int numAces = countAces();
		
		for (int i = numAces; i > 0; --i)
		{
			if (MAX_VALUE - 11 + i <= 11)
			{
				value += 11;
			}
			else
			{
				value += 1;
			}
		}
		
		return value;
	}

	private int countAces()
	{
		int numAces = 0;
		Rank currentCardRank = null;
		
		for (int i = 0; i < cards.size(); ++i) {
			currentCardRank = cards.get(i).getRank();

			switch (currentCardRank)
			{
			case ACE:
				++numAces;
				break;
			default:
				break;
			}
		}
		
		return numAces;
	}

	@Override
	public boolean isBust()
	{
		return getValue() > MAX_VALUE;
	}

	@Override
	public boolean containsAce()
	{
		for (Card card: cards)
		{
			if (card.getRank() == Rank.ACE)
			{
				return true;
			}
		}
		
		return false;
	}
}

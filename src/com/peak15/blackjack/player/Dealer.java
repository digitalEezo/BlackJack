package com.peak15.blackjack.player;

public class Dealer extends AbstractPlayer
{
	private static final boolean HIT_ON_SOFT_17 = true;

	@Override
	public Decision getDecision() 
	{                                                
		int currentValue = this.hand.getValue();
		
		if (currentValue < 17)
		{
			return Decision.HIT;
		}
		else if (currentValue > 17)
		{
			return Decision.STAND;
		}
		else
		{
			if (!hand.containsAce())
			{
				return Decision.STAND;
			}
			else
			{
				return HIT_ON_SOFT_17 ? Decision.HIT : Decision.STAND;
			}
		}
	}

}
package com.peak15.blackjack.ui;

import com.peak15.blackjack.Update;
import com.peak15.blackjack.player.AbstractPlayer.Decision;

public interface UserInterface
{
	void processUpdate(Update update);
	
	Decision getDecision();
}

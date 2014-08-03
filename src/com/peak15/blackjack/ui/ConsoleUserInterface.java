package com.peak15.blackjack.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.peak15.blackjack.Update;
import com.peak15.blackjack.player.AbstractPlayer.Decision;

public class ConsoleUserInterface implements UserInterface
{
	private static final Logger logger = Logger
			.getLogger(ConsoleUserInterface.class.getName());

	private static final String COMMAND_HIT = "h";
	private static final String COMMAND_STAND = "s";

	@Override
	public void processUpdate(final Update update)
	{
		final StringBuffer sb = new StringBuffer();
		
		sb.append("The dealer has showing: ");
		sb.append(Arrays.asList(update.getDealerHandShowing()));
		sb.append(" for a total value of: ");
		sb.append(update.getDealerValueShowing());
		sb.append("\n\n");
		sb.append("You have: ");
		sb.append(Arrays.asList(update.getPlayerHand()));
		sb.append(" for a total value of: ");
		sb.append(update.getPlayerValue());
		sb.append("\n\n");
		
		System.out.println(sb.toString());
	}

	@Override
	public Decision getDecision()
	{
		String input = null;

		while (true) {
			printPrompt();
			input = takeInput();

			switch (input)
			{
			case COMMAND_HIT:
				return Decision.HIT;
			case COMMAND_STAND:
				return Decision.STAND;
			default:
				printInvalidInput(input);
				break;
			}
		}
	}

	private void printPrompt()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Hit or Stand [");
		sb.append(COMMAND_HIT);
		sb.append("= hit, ");
		sb.append(COMMAND_STAND);
		sb.append(" = stand]: ");

		System.out.println(sb.toString());
	}

	private String takeInput()
	{
		String input = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			input = br.readLine();
		} catch (final IOException e) {
			logger.log(Level.WARNING, "Unable to take console input. ", e);
		} finally {
			try {
				br.close();
			} catch (final IOException e2) {
				logger.log(Level.WARNING, "Unable to close the input stream. ",
						e2);
			}
		}

		return input;
	}

	private void printInvalidInput(final String input)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Invalid input '");
		sb.append(input);
		sb.append("' Please try again. ");

		System.out.println(sb.toString());
	}
}

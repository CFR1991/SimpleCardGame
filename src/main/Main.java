package main;

import console.ConsoleHelper;
import model.Hand;

public class Main {
	public static void main(String[] args) {
		boolean playAgain = true;
		ConsoleHelper consoleHelper = new ConsoleHelper();
		StackAndHandsBuilder stackAndHansBuilder = new StackAndHandsBuilder();
		KI ki = new KI();
		while (playAgain) {
			stackAndHansBuilder.createPlayersAndComputersHand();
			Hand playersHand = stackAndHansBuilder.getPlayersHand();
			Hand computersHand = stackAndHansBuilder.getComputersHand();
			ki.checkWinner(playersHand, computersHand);
			playAgain = consoleHelper.checkIfWannaPlayAgain();
		}
	}

}

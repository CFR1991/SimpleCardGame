package main;

import model.Hand;
import model.SameSuitCardList;

public class KI {

	public void checkWinner(Hand player, Hand computer) {
		outputString(checkWinnerSub(player, computer) ? "player" : "computer");
	}

	private void outputString(String playerOrComputerString) {
		System.out.println("The " + playerOrComputerString + " wins!");
	}

	public boolean checkWinnerSub(Hand playersHand, Hand computersHand) {
		int playersSameCardNumber = getHighestSameCardNumber(playersHand);
		int computersSameCardNumber = getHighestSameCardNumber(computersHand);
		if (playersSameCardNumber != computersSameCardNumber) {
			return playersSameCardNumber > computersSameCardNumber;
		}
		return checkWinnerSubSub(playersHand, computersHand);
	}

	private boolean checkWinnerSubSub(Hand playersHand, Hand computersHand) {
		int playersSameCardValue = getHighestSameCardValue(playersHand);
		int computersSameCardValue = getHighestSameCardValue(computersHand);
		if (playersSameCardValue != computersSameCardValue) {
			return playersSameCardValue > computersSameCardValue;
		}
		return false;
	}

	private int getHighestSameCardNumber(Hand playerOrComputer) {
		int highestSameCardNumber = 0;
		SameSuitCardList[] listArray = playerOrComputer.getSameSuitCardListsArray();
		for (int i = 0; i < 4; i++) {
			highestSameCardNumber = maxOf(highestSameCardNumber, listArray[i].size());
		}
		return highestSameCardNumber;
	}

	private int getHighestSameCardValue(Hand playerOrComputer) {
		int highestSameCardValue = 0;
		SameSuitCardList[] listArray = playerOrComputer.getSameSuitCardListsArray();
		for (int i = 0; i < 4; i++) {
			highestSameCardValue = maxOf(highestSameCardValue, getSameCardValue(listArray[i]));
		}
		return highestSameCardValue;
	}

	private int getSameCardValue(SameSuitCardList sameSuitCardList) {
		int value = 0;
		for (int i = 0; i < sameSuitCardList.size(); i++) {
			value += sameSuitCardList.getListElementPictureValue(i);
		}
		return value;
	}

	private int maxOf(int highestSameCardNumber, int sameSuitCardList) {
		return Integer.max(highestSameCardNumber, sameSuitCardList);
	}
}

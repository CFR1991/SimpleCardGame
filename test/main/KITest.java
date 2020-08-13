package main;

import org.junit.Assert;
import org.junit.Test;

import model.Hand;
import model.ModelFactory;

public class KITest {

	private KI ki = new KI();
	private ModelFactory modelFactory = new ModelFactory();

	@Test
	public void test_playerWins_playerHasHigherSameSuitsNumber() {
		// arrange
		Hand playersHand = modelFactory.createAndGetEmptyHand();
		playersHand.addCard(modelFactory.createAndReturnCard(1, 10, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(1, 9, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(1, 5, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(3, 2, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(0, 3, 0));
		//
		Hand computersHand = modelFactory.createAndGetEmptyHand();
		computersHand.addCard(modelFactory.createAndReturnCard(2, 10, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(2, 9, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(1, 5, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(3, 2, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(0, 5, 0));
		// act
		boolean playerWins = ki.checkWinnerSub(playersHand, computersHand);
		// assert
		Assert.assertTrue(playerWins);
	}
	

	@Test
	public void test_computerWins_computerHasHigherSameSuitsNumber() {
		// arrange
		Hand playersHand = modelFactory.createAndGetEmptyHand();
		playersHand.addCard(modelFactory.createAndReturnCard(1, 10, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(1, 9, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(2, 5, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(3, 2, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(0, 3, 0));
		//
		Hand computersHand = modelFactory.createAndGetEmptyHand();
		computersHand.addCard(modelFactory.createAndReturnCard(2, 10, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(2, 9, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(2, 3, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(3, 2, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(0, 4, 0));
		// act
		boolean playerWins = ki.checkWinnerSub(playersHand, computersHand);
		// assert
		Assert.assertFalse(playerWins);
	}
	
	@Test
	public void test_playerWins_playerAndComputerHaveSameHighestSuitsNumber_PlayerHasHigherSameSuitsValue() {
		// arrange
		Hand playersHand = modelFactory.createAndGetEmptyHand();
		playersHand.addCard(modelFactory.createAndReturnCard(1, 10, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(1, 9, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(2, 5, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(3, 2, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(0, 3, 0));
		//
		Hand computersHand = modelFactory.createAndGetEmptyHand();
		computersHand.addCard(modelFactory.createAndReturnCard(2, 10, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(2, 8, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(1, 3, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(3, 2, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(0, 3, 0));
		// act
		boolean playerWins = ki.checkWinnerSub(playersHand, computersHand);
		// assert
		Assert.assertTrue(playerWins);
	}
	
	
	@Test
	public void test_playerWins_playerAndComputerHaveSameHighestSuitsNumber_PlayerHasHigherSameSuitsValue2() {
		// arrange
		Hand playersHand = modelFactory.createAndGetEmptyHand();
		playersHand.addCard(modelFactory.createAndReturnCard(1, 3, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(1, 4, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(1, 2, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(3, 11, 0));//highest ...
		playersHand.addCard(modelFactory.createAndReturnCard(3, 10, 1));//...SameSuitsValue 11+10
		//
		Hand computersHand = modelFactory.createAndGetEmptyHand();
		computersHand.addCard(modelFactory.createAndReturnCard(2, 3, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(2, 4, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(2, 6, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(3, 2, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(0, 3, 0));
		// act
		boolean playerWins = ki.checkWinnerSub(playersHand, computersHand);
		// assert
		Assert.assertTrue(playerWins);
	}
	
	
	@Test
	public void test_computerWins_playerAndComputerHaveSameHighestSuitsNumber_ComputerHasHigherSameSuitsValue() {
		// arrange
		Hand playersHand = modelFactory.createAndGetEmptyHand();
		playersHand.addCard(modelFactory.createAndReturnCard(1, 10, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(1, 9, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(2, 5, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(3, 2, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(0, 3, 0));
		//
		Hand computersHand = modelFactory.createAndGetEmptyHand();
		computersHand.addCard(modelFactory.createAndReturnCard(2, 10, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(2, 11, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(1, 3, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(3, 2, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(0, 3, 0));
		// act
		boolean playerWins = ki.checkWinnerSub(playersHand, computersHand);
		// assert
		Assert.assertFalse(playerWins);
	}
	
	@Test
	public void test_computerWins_playerAndComputerHaveSameHighestSuitsNumber__playerAndComputerHaveSameHighestSuitsValue() {
		// arrange
		Hand playersHand = modelFactory.createAndGetEmptyHand();
		playersHand.addCard(modelFactory.createAndReturnCard(1, 10, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(1, 10, 1));
		playersHand.addCard(modelFactory.createAndReturnCard(2, 5, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(3, 2, 0));
		playersHand.addCard(modelFactory.createAndReturnCard(0, 3, 0));
		//
		Hand computersHand = modelFactory.createAndGetEmptyHand();
		computersHand.addCard(modelFactory.createAndReturnCard(3, 9, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(3, 11, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(1, 3, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(2, 2, 0));
		computersHand.addCard(modelFactory.createAndReturnCard(0, 5, 0));
		// act
		boolean playerWins = ki.checkWinnerSub(playersHand, computersHand);
		// assert
		Assert.assertFalse(playerWins);
	}

}

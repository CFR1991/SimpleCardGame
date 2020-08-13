package main;

import java.util.Collections;
import java.util.Stack;

import model.Card;
import model.Hand;
import model.ModelFactory;

class StackAndHandsBuilder {

	private ModelFactory modelFactory = new ModelFactory();

	private Stack<Card> stack;

	private Hand playersHand;
	private Hand computersHand;

	public void createPlayersAndComputersHand() {
		createStack();
		CreateHandsFromStack();
		printOutPlayersAndComputersHand();
	}

	private void printOutPlayersAndComputersHand() {
		playersHand.print("player: ");
		computersHand.print("computer: ");
	}

	public Hand getPlayersHand() {
		return this.playersHand;
	}

	public Hand getComputersHand() {
		return this.computersHand;
	}

	//
	private void createStack() {
		this.stack = new Stack<Card>();
		for (int value4Suite = 0; value4Suite < 4; value4Suite++) {
			for (int value4Picture = 2; value4Picture < 12; value4Picture++) {
				addCard(value4Suite, value4Picture);
			}
		}
		Collections.shuffle(this.stack);
		Collections.shuffle(this.stack);
		Collections.shuffle(this.stack);
		Collections.shuffle(this.stack);
		Collections.shuffle(this.stack);
	}

	private void addCard(int value4Suite, int value4Picture) {
		if (value4Picture != 10) {
			this.stack.add(this.modelFactory.createAndReturnCard(value4Suite, value4Picture, 0));
		} else {
			for (int valueKingQueenJack = 0; valueKingQueenJack < 3; valueKingQueenJack++) {
				this.stack.add(this.modelFactory.createAndReturnCard(value4Suite, value4Picture, valueKingQueenJack));
			}
		}
	}

	private void CreateHandsFromStack() {
		this.playersHand = modelFactory.createAndGetEmptyHand();
		this.computersHand = modelFactory.createAndGetEmptyHand();
		for (int i = 0; i < 5; i++) {
			playersHand.addCard(this.stack.pop());
			computersHand.addCard(this.stack.pop());
		}
	}

}

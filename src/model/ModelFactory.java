package model;

import org.springframework.stereotype.Service;

@Service
public class ModelFactory {

	public Card createAndReturnCard(int value4Suite, int value4Picture, int valueKingQueenJack) {

		return new Card(getSuitOfValue(value4Suite), getPictureOfValue(value4Picture, valueKingQueenJack));
	}

	private Suit getSuitOfValue(int value4Suite) {
		switch (value4Suite) {
		case 0:
			return Suit.HEART;
		case 1:
			return Suit.DIAMOND;
		case 2:
			return Suit.CLUB;
		case 3:
			return Suit.SPADE;
		default:
			return null;
		}
	}

	private Picture getPictureOfValue(int value4Picture, int valueKingQueenJack) {
		switch (value4Picture) {
		case 11:
			return Picture.ACE;
		case 10:
			return getPictureOfValueKingQueenJack(valueKingQueenJack);
		case 9:
			return Picture.NINE;
		case 8:
			return Picture.EIGHT;
		case 7:
			return Picture.SEVEN;
		case 6:
			return Picture.SIX;
		case 5:
			return Picture.FIVE;
		case 4:
			return Picture.FOUR;
		case 3:
			return Picture.TREE;
		case 2:
			return Picture.TWO;
		default:
			return null;
		}
	}

	private Picture getPictureOfValueKingQueenJack(int valueKingQueenJack) {
		switch (valueKingQueenJack) {
		case 0:
			return Picture.KING;
		case 1:
			return Picture.QUEEN;
		case 2:
			return Picture.JACK;
		default:
			return null;
		}
	}

	public Hand createAndGetEmptyHand() {
		return new Hand();
	}
}

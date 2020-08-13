package model;

public class Card {
	private final Suit suit;
	private final Picture picture;

	Card(Suit suit, Picture picture) {
		this.suit = suit;
		this.picture = picture;
	}

	public Suit getSuit() {
		return suit;
	}

	public Picture getPicture() {
		return picture;
	}
}

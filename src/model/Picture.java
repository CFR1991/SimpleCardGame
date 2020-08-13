package model;

public enum Picture {
	ACE(11), KING(10), QUEEN(10), JACK(10), TEN(10), NINE(9), EIGHT(8), SEVEN(7), SIX(6), FIVE(5), FOUR(4), TREE(
			3), TWO(2);

	private final int value;

	Picture(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		if (value < 10) {
			return Integer.toString(value);
		}
		return this.name().toLowerCase();
	}
}

package model;

public class Hand {

	private SameSuitCardList[] sameSuitCardListsArray = new SameSuitCardList[4];

	Hand() {
		for (int i = 0; i < 4; i++) {
			this.sameSuitCardListsArray[i] = new SameSuitCardList();
		}
	}

	public void addCard(Card card) {
		int cardSuitValue = card.getSuit().getValue();
		SameSuitCardList listOfCardSuit = this.sameSuitCardListsArray[cardSuitValue];
		listOfCardSuit.addCard(card);
	}

	public SameSuitCardList[] getSameSuitCardListsArray() {
		return sameSuitCardListsArray;
	}

	public void print(String outputString) {
		for (int i = 0; i < 4; i++) {
			outputString=String.format("%s%s", outputString, this.sameSuitCardListsArray[i].getPrintString());
		}
		System.out.println(outputString.substring(0,outputString.length()-1));
	}

}

package model;

import java.util.ArrayList;
import java.util.List;

public class SameSuitCardList {
	List<Card> list = new ArrayList<Card>();

	public void addCard(Card card) {
		list.add(card);
	}

	public int size() {
		return this.list.size();
	}

	public int getListElementPictureValue(int i) {
		return this.list.get(i).getPicture().getValue();
	}

	public String getPrintString() {
		if (this.list.isEmpty()) {
			return "";
		}
		String theString = "";
		for (int i = 0; i < this.list.size(); i++) {
			theString=String.format("%s %s %s,", theString, this.list.get(i).getSuit().toString(),
					this.list.get(i).getPicture().toString());
		}
		return theString;
	}

}

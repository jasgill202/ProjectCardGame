package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * 
 * @author dancye
 * @modifier Jasmeet Gill
 * @modifier
 */
public abstract class Card {
	private String suit;
	private int value;
	public DeckOfCards consists_of;
	public DeckOfCards unnamed_DeckOfCards_33;

	/**
	 * Students should implement this method for their specific children classes
	 * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
	 */
	@Override
	public abstract String toString();

	public String getSuit() {
		return this.suit;
	}

	public void setSuit(String aSuit) {
		this.suit = aSuit;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int aValue) {
		this.value = aValue;
	}
}
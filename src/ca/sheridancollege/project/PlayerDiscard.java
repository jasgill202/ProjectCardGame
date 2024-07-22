package ca.sheridancollege.project;

public class PlayerDiscard {
	private Card pDiscardCards;
	private int pDiscardSize;
	private int pNewDeckSize;
	private Card pNewDeckCards;
	public PlayArea unnamed_PlayArea_12;

	public Card getPDeckCards() {
		throw new UnsupportedOperationException();
	}

	public void setPDeckCards(Card aPDeckCards) {
		throw new UnsupportedOperationException();
	}

	public int getPDiscardSize() {
		return this.pDiscardSize;
	}

	public void setPDiscardSize(int aPDiscardSize) {
		this.pDiscardSize = aPDiscardSize;
	}

	public void shuffle() {
		throw new UnsupportedOperationException();
	}

	public int getPNewDeckSize() {
		return this.pNewDeckSize;
	}

	public void setPNewDeckSize(int aPNewDeckSize) {
		this.pNewDeckSize = aPNewDeckSize;
	}

	public Card getPNewDeckCards() {
		return this.pNewDeckCards;
	}

	public void setPNewDeckCards(Card aPNewDeckCards) {
		this.pNewDeckCards = aPNewDeckCards;
	}
}
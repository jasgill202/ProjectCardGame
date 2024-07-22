package ca.sheridancollege.project;

public class CompDiscard {
	private Card cDiscardCards;
	private int cDiscardSize;
	private int cNewDeckSize;
	private Card cNewDeckCards;
	public PlayArea unnamed_PlayArea_17;

	public Card getCDiscardCards() {
		return this.cDiscardCards;
	}

	public void setCDiscardCards(Card aCDiscardCards) {
		this.cDiscardCards = aCDiscardCards;
	}

	public int getCDiscardSize() {
		return this.cDiscardSize;
	}

	public void setCDiscardSize(int aCDiscardSize) {
		this.cDiscardSize = aCDiscardSize;
	}

	public void shuffle() {
		throw new UnsupportedOperationException();
	}

	public int getCNewDeckSize() {
		return this.cNewDeckSize;
	}

	public void setCNewDeckSize(int aCNewDeckSize) {
		this.cNewDeckSize = aCNewDeckSize;
	}

	public Card getCNewDeckCards() {
		return this.cNewDeckCards;
	}

	public void setCNewDeckCards(Card aCNewDeckCards) {
		this.cNewDeckCards = aCNewDeckCards;
	}
}
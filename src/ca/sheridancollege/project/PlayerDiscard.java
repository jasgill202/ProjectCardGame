package ca.sheridancollege.project;

public class PlayerDiscard {
	private Card _pDiscardCards;
	private int _pDiscardSize;
	private int _pNewDeckSize;
	private Card _pNewDeckCards;
	public PlayArea _unnamed_PlayArea_12;

	public Card getPDeckCards() {
		throw new UnsupportedOperationException();
	}

	public void setPDeckCards(Card aPDeckCards) {
		throw new UnsupportedOperationException();
	}

	public int getPDiscardSize() {
		return this._pDiscardSize;
	}

	public void setPDiscardSize(int aPDiscardSize) {
		this._pDiscardSize = aPDiscardSize;
	}

	public void shuffle() {
		throw new UnsupportedOperationException();
	}

	public int getPNewDeckSize() {
		return this._pNewDeckSize;
	}

	public void setPNewDeckSize(int aPNewDeckSize) {
		this._pNewDeckSize = aPNewDeckSize;
	}

	public Card getPNewDeckCards() {
		return this._pNewDeckCards;
	}

	public void setPNewDeckCards(Card aPNewDeckCards) {
		this._pNewDeckCards = aPNewDeckCards;
	}
}
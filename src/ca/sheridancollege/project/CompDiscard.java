package ca.sheridancollege.project;

public class CompDiscard {
	private Card _cDiscardCards;
	private int _cDiscardSize;
	private int _cNewDeckSize;
	private Card _cNewDeckCards;
	public PlayArea _unnamed_PlayArea_17;

	public Card getCDiscardCards() {
		return this._cDiscardCards;
	}

	public void setCDiscardCards(Card aCDiscardCards) {
		this._cDiscardCards = aCDiscardCards;
	}

	public int getCDiscardSize() {
		return this._cDiscardSize;
	}

	public void setCDiscardSize(int aCDiscardSize) {
		this._cDiscardSize = aCDiscardSize;
	}

	public void shuffle() {
		throw new UnsupportedOperationException();
	}

	public int getCNewDeckSize() {
		return this._cNewDeckSize;
	}

	public void setCNewDeckSize(int aCNewDeckSize) {
		this._cNewDeckSize = aCNewDeckSize;
	}

	public Card getCNewDeckCards() {
		return this._cNewDeckCards;
	}

	public void setCNewDeckCards(Card aCNewDeckCards) {
		this._cNewDeckCards = aCNewDeckCards;
	}
}
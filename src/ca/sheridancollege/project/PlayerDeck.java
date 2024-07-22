package ca.sheridancollege.project;

public class PlayerDeck {
	private int _pDeckSize;
	private Card _pDeckCards;
	public PlayArea _unnamed_PlayArea_26;
	public DeckOfCards _consists_of;

	public int getPDeckSize() {
		return this._pDeckSize;
	}

	public void setPDeckSize(int aPDeckSize) {
		this._pDeckSize = aPDeckSize;
	}

	public Card getPDeckCards() {
		return this._pDeckCards;
	}

	public void setPDeckCards(Card aPDeckCards) {
		this._pDeckCards = aPDeckCards;
	}

	public void shuffle() {
		throw new UnsupportedOperationException();
	}
}
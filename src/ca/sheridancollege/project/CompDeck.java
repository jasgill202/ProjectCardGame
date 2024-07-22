package ca.sheridancollege.project;

public class CompDeck {
	private int _cDeckSize;
	private Card _cDeckCards;
	public PlayArea _unnamed_PlayArea_9;
	public DeckOfCards _consists_of;

	public int getCDeckSize() {
		return this._cDeckSize;
	}

	public void setCDeckSize(int aCDeckSize) {
		this._cDeckSize = aCDeckSize;
	}

	public Card getCDeckCards() {
		return this._cDeckCards;
	}

	public void setCDeckCards(Card aCDeckCards) {
		this._cDeckCards = aCDeckCards;
	}

	public void shuffle() {
		throw new UnsupportedOperationException();
	}
}
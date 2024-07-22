package ca.sheridancollege.project;

public class CompDeck {
	private int cDeckSize;
	private Card cDeckCards;
	public PlayArea unnamed_PlayArea_9;
	public DeckOfCards consists_of;

	public int getCDeckSize() {
		return this.cDeckSize;
	}

	public void setCDeckSize(int aCDeckSize) {
		this.cDeckSize = aCDeckSize;
	}

	public Card getCDeckCards() {
		return this.cDeckCards;
	}

	public void setCDeckCards(Card aCDeckCards) {
		this.cDeckCards = aCDeckCards;
	}

	public void shuffle() {
		throw new UnsupportedOperationException();
	}
}
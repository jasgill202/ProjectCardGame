package ca.sheridancollege.project;

public class PlayerDeck {
	private int pDeckSize;
	private Card pDeckCards;
	public PlayArea unnamed_PlayArea_26;
	public DeckOfCards consists_of;

	public int getPDeckSize() {
		return this.pDeckSize;
	}

	public void setPDeckSize(int aPDeckSize) {
		this.pDeckSize = aPDeckSize;
	}

	public Card getPDeckCards() {
		return this.pDeckCards;
	}

	public void setPDeckCards(Card aPDeckCards) {
		this.pDeckCards = aPDeckCards;
	}

	public void shuffle() {
		throw new UnsupportedOperationException();
	}
}
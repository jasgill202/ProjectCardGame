package ca.sheridancollege.project;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class DeckOfCards {
	private int size;
	public Game unnamed_Game_29;
	public Card unnamed_Card_30;
	public Card consists_of;

	/**
	 * the size of the grouping
	 */
	public DeckOfCards(int aSize) {
		throw new UnsupportedOperationException();
	}

	public void shuffle() {
		throw new UnsupportedOperationException();
	}

	public void setSize(int aSize) {
		this.size = aSize;
	}

	public int getSize() {
		return this.size;
	}
}
package ca.sheridancollege.project;
/**
 *
 * @author jasme
 
 */
import java.util.ArrayList;

public class CompDiscard {
    private final ArrayList<Card> discardPile;

    public CompDiscard() {
        this.discardPile = new ArrayList<>();
    }

    public void addCard(Card card) {
        discardPile.add(card);
    }

    public void addCards(ArrayList<Card> cards) {
        discardPile.addAll(cards);
    }

    public int getDiscardPileSize() {
        return discardPile.size();
    }

    public void clear() {
        discardPile.clear();
    }

    public void shuffleIntoDeck(CompDeck compDeck) {
        compDeck.addCards(discardPile);
        discardPile.clear();
    }
}

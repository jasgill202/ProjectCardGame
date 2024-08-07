package ca.sheridancollege.project;
/**
 *
 * @author jasme
 * modified by Stefan
 */
import java.util.ArrayList;
import java.util.Collections;

public class PlayerDiscard {
    private final ArrayList<Card> discardPile;

    public PlayerDiscard() {
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

    public void shuffleIntoDeck(PlayerDeck playerDeck) {
        playerDeck.addCards(discardPile);
        Collections.shuffle(discardPile);
        discardPile.clear();
    }
}
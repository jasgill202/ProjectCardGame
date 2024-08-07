package ca.sheridancollege.project;
/**
 *
 * @author jasme

 */
import java.util.ArrayList;

public class CompDeck {
    private final ArrayList<Card> compDeck;

    public CompDeck() {
        this.compDeck = new ArrayList<>();
    }

    public void addCard(Card card) {
        compDeck.add(card);
    }

    public void addCards(ArrayList<Card> cards) {
        compDeck.addAll(cards);
    }

    public Card drawCard() {
        if (compDeck.isEmpty()) {
            return null;
        }
        return compDeck.remove(0);
    }

    public ArrayList<Card> drawWarCards() {
        ArrayList<Card> warCards = new ArrayList<>();
        for (int i = 0; i < 4 && !compDeck.isEmpty(); i++) {
            warCards.add(drawCard());
        }
        return warCards;
    }

    public int getCDeckSize() {
        return compDeck.size();
    }

    public void clear() {
        compDeck.clear();
    }

    public ArrayList<Card> getAllCards() {
        ArrayList<Card> allCards = new ArrayList<>(compDeck);
        clear();
        return allCards;
    }

    public void refill(CompDiscard compDiscard) {
        compDiscard.shuffleIntoDeck(this);
    }
}

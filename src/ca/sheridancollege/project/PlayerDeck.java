package ca.sheridancollege.project;
/**
 *
 * @author jasme
 * modified by Stefan
 */
import java.util.ArrayList;
import java.util.Collections;

public class PlayerDeck {
    private final ArrayList<Card> playerDeck;

    public PlayerDeck() {
        this.playerDeck = new ArrayList<>();
    }

    public void addCard(Card card) {
        playerDeck.add(card);
    }

    public void addCards(ArrayList<Card> cards) {
        playerDeck.addAll(cards);
    }

    public Card drawCard() {
        if (playerDeck.isEmpty()) {
            return null;
        }
        return playerDeck.remove(0);
    }

    public ArrayList<Card> drawWarCards() {
        ArrayList<Card> warCards = new ArrayList<>();
        for (int i = 0; i < 4 && !playerDeck.isEmpty(); i++) {
            warCards.add(drawCard());
        }
        return warCards;
    }

    public int getPDeckSize() {
        return playerDeck.size();
    }

    public void clear() {
        playerDeck.clear();
    }

    public ArrayList<Card> getAllCards() {
        ArrayList<Card> allCards = new ArrayList<>(playerDeck);
        clear();
        return allCards;
    }

    public void refill(PlayerDiscard playerDiscard) {
        playerDiscard.shuffleIntoDeck(this);
    }
}

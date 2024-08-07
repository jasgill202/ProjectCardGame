/*Editted by Stefan Forrest*/
package ca.sheridancollege.project;
/**
 *
 * @author @author jasme
 * modified by Stefan
 */
import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    private ArrayList<Card> cards;

    public DeckOfCards() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }

    public int getSize() {
    return cards.size();
    }

    // Method to initialize the deck using the CardFactory
    public void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (int value = 1; value <= 13; value++) {
                addCard(CardFactory.createCard(suit, value));
            }
        }
        shuffle();
    }
    //Added this method for testing:
    public ArrayList<Card> getCards(){
    return cards;
    }
}

package ca.sheridancollege.project;
/**
 *
 * @author jasme
 */
import java.util.ArrayList;

public class PlayArea {
    private final PlayerDeck playerDeck;
    private final CompDeck compDeck;
    private final PlayerDiscard playerDiscard;
    private final CompDiscard compDiscard;

    public PlayArea(PlayerDeck playerDeck, CompDeck compDeck, PlayerDiscard playerDiscard, CompDiscard compDiscard) {
        this.playerDeck = playerDeck;
        this.compDeck = compDeck;
        this.playerDiscard = playerDiscard;
        this.compDiscard = compDiscard;
    }

    public void compare() {
        refillDecks(); // Refill decks from discard piles if empty

        if (playerDeck.getPDeckSize() == 0 || compDeck.getCDeckSize() == 0) {
            return;
        }

        Card playerCard = playerDeck.drawCard();
        Card compCard = compDeck.drawCard();

        System.out.println("Player draws: " + playerCard);
        System.out.println("Computer draws: " + compCard);

        if (playerCard.getValue() > compCard.getValue()) {
            System.out.println("Player wins the round!");
            playerDiscard.addCard(playerCard);
            playerDiscard.addCard(compCard);
        } else if (playerCard.getValue() < compCard.getValue()) {
            System.out.println("Computer wins the round!");
            compDiscard.addCard(playerCard);
            compDiscard.addCard(compCard);
        } else {
            System.out.println("It's a tie! Going into war mode.");
            if (!playWar(playerCard, compCard)) {
                return; // If a player loses during war due to an empty deck
            }
        }

        printCardCounts(); // Display the current card counts
        checkTotalCards(); // Verify total cards after each round
    }

    private boolean playWar(Card playerInitialCard, Card compInitialCard) {
        refillDecks();

        if (playerDeck.getPDeckSize() < 4) {
            System.out.println("Player doesn't have enough cards for war. Computer wins the war!");
            compDiscard.addCard(playerInitialCard);
            compDiscard.addCard(compInitialCard);
            compDiscard.addCards(playerDeck.getAllCards());
            return false;
        }
        if (compDeck.getCDeckSize() < 4) {
            System.out.println("Computer doesn't have enough cards for war. Player wins the war!");
            playerDiscard.addCard(playerInitialCard);
            playerDiscard.addCard(compInitialCard);
            playerDiscard.addCards(compDeck.getAllCards());
            return false;
        }

        ArrayList<Card> playerWarCards = playerDeck.drawWarCards();
        ArrayList<Card> compWarCards = compDeck.drawWarCards();

        Card playerWarCard = playerWarCards.get(3); // 4th card
        Card compWarCard = compWarCards.get(3); // 4th card

        ArrayList<Card> warPile = new ArrayList<>();
        warPile.add(playerInitialCard);
        warPile.add(compInitialCard);
        warPile.addAll(playerWarCards);
        warPile.addAll(compWarCards);

        if (playerWarCard.getValue() > compWarCard.getValue()) {
            System.out.println("Player wins the war!");
            playerDiscard.addCards(warPile);
        } else {
            System.out.println("Computer wins the war!");
            compDiscard.addCards(warPile);
        }

        return true;
    }

    private void refillDecks() {
        if (playerDeck.getPDeckSize() == 0) {
            playerDiscard.shuffleIntoDeck(playerDeck);
        }
        if (compDeck.getCDeckSize() == 0) {
            compDiscard.shuffleIntoDeck(compDeck);
        }
    }

    private void printCardCounts() {
        System.out.println("Player Deck: " + playerDeck.getPDeckSize() + " cards");
        System.out.println("Player Discard Pile: " + playerDiscard.getDiscardPileSize() + " cards");
        System.out.println("Computer Deck: " + compDeck.getCDeckSize() + " cards");
        System.out.println("Computer Discard Pile: " + compDiscard.getDiscardPileSize() + " cards");
    }

    private void checkTotalCards() {
        int totalCards = playerDeck.getPDeckSize() + playerDiscard.getDiscardPileSize() +
                         compDeck.getCDeckSize() + compDiscard.getDiscardPileSize();
        System.out.println("Total cards in play: " + totalCards);
    }

    public boolean isGameOver() {
        // Check if the player or computer has all 52 cards
        if (playerDeck.getPDeckSize() + playerDiscard.getDiscardPileSize() == 52) {
            System.out.println("Player wins the game!");
            return true;
        } else if (compDeck.getCDeckSize() + compDiscard.getDiscardPileSize() == 52) {
            System.out.println("Computer wins the game!");
            return true;
        }
        return false;
    }
}

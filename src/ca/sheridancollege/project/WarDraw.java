package ca.sheridancollege.project;
/**
 *
 * @author jasme
 */
import java.util.ArrayList;

public class WarDraw {
    
    public static ArrayList<Card> drawWarCards(PlayerDeck playerDeck, CompDeck compDeck) {
        ArrayList<Card> warPile = new ArrayList<>();
        
        // Draw 3 cards from each player and add to warPile
        for (int i = 0; i < 3; i++) {
            if (playerDeck.getPDeckSize() > 0) {
                warPile.add(playerDeck.drawCard());
            }
            if (compDeck.getCDeckSize() > 0) {
                warPile.add(compDeck.drawCard());
            }
        }
        
        // Draw the fourth card to compare
        if (playerDeck.getPDeckSize() > 0 && compDeck.getCDeckSize() > 0) {
            Card playerWarCard = playerDeck.drawCard();
            Card compWarCard = compDeck.drawCard();
            
            System.out.println("Player draws: " + playerWarCard + " (war)");
            System.out.println("Computer draws: " + compWarCard + " (war)");
            
            warPile.add(playerWarCard);
            warPile.add(compWarCard);
        }
        
        return warPile;
    }
}


package ca.sheridancollege.project;
/**
 *
 * @author jasme
 * modified by Stefan
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {
    private PlayerDeck playerDeck;
    private CompDeck compDeck;
    private PlayerDiscard playerDiscard;
    private CompDiscard compDiscard;
    private PlayArea playArea;
    private Scanner scanner;

    // Singleton instance
    private static Game instance;

    // Private constructor to prevent instantiation
    private Game(Scanner scanner) {
        this.scanner = scanner; // Use the shared scanner instance
        initializeGame();
    }

    // Public method to get the singleton instance
    public static Game getInstance(Scanner scanner) {
        if (instance == null) {
            instance = new Game(scanner);
        }
        return instance;
    }

    private void initializeGame() {
        playerDeck = new PlayerDeck();
        compDeck = new CompDeck();
        playerDiscard = new PlayerDiscard();
        compDiscard = new CompDiscard();
        playArea = new PlayArea(playerDeck, compDeck, playerDiscard, compDiscard);
        initializeDecks();
    }

    private void initializeDecks() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        ArrayList<Card> fullDeck = new ArrayList<>();

        for (String suit : suits) {
            for (int value = 1; value <= 13; value++) {
                fullDeck.add(new Card(suit, value));
            }
        }

        Collections.shuffle(fullDeck);

        for (int i = 0; i < fullDeck.size(); i++) {
            if (i < 26) {
                playerDeck.addCard(fullDeck.get(i));
            } else {
                compDeck.addCard(fullDeck.get(i));
            }
        }
    }

    public void startGame() {
        boolean exit = false;

        while (!exit) {
            while (!playArea.isGameOver()) {
                System.out.println("Press Enter to draw a card, or type 'exit' to quit.");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    exit = true;
                    break;
                }
                playArea.compare();  // Handle card comparisons and rounds
            }

            if (!exit) {
                System.out.println("Do you want to play again?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume the newline

                if (choice == 1) {
                    initializeGame();  // Restart the game
                } else {
                    exit = true; // Set exit to true to return to the main menu
                }
            }
        }
    }
}

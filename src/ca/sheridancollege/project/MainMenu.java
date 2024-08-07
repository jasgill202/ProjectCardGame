/*Editted by Stefan Forrest*/
package ca.sheridancollege.project;
/**
 *
 * @author jasme
 * @author Mohamed
 */
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Main Menu");
            System.out.println("1. Start Game");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine(); 
            int choice = 0;

            
            if (input.equalsIgnoreCase("exit")) {
                choice = 2; 
            } else {
                try {
                    choice = Integer.parseInt(input); 
                } catch (NumberFormatException e) {
                    choice = -1; // Invalid input
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("Game has started!");
                    Game game = Game.getInstance(scanner);
                    game.startGame(); 
                    break;
                case 2:
                    System.out.println("Exiting the game.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                    break;
            }
        }

        scanner.close();
    }
}
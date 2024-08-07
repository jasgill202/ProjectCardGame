/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author idris
 */


public class PlayingCard extends Card {

    public PlayingCard(String suit, int value) {
        super(suit, value); // Call the superclass constructor
    }

    // Optionally override toString() or other methods if needed
    @Override
    public String toString() {
        return getValue() + " of " + getSuit();
    }
}



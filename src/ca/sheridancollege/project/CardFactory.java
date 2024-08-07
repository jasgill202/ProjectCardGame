/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author overd
 */
public class CardFactory {
    public static Card createCard(String suit, int value) {

        return new Card(suit, value);
    }
}

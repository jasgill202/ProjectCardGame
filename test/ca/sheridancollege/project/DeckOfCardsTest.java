/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;



/**
 *
 * @author overd
 */
public class DeckOfCardsTest {
     private DeckOfCards deck;
    
    public DeckOfCardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        deck = new DeckOfCards();
        deck.initializeDeck(); // Initialize with a full deck
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addCard method, of class DeckOfCards.
     */
//    @Test
//    public void testAddCard() {
//        System.out.println("addCard");
//        Card card = null;
//        DeckOfCards instance = new DeckOfCards();
//        instance.addCard(card);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of shuffle method, of class DeckOfCards.
     */
//    @Test
//    public void testShuffle() {
//        System.out.println("shuffle");
//        DeckOfCards instance = new DeckOfCards();
//        instance.shuffle();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    @Test
    public void testShuffleGood(){
    System.out.println( "shuffle - Good");
    ArrayList<Card> originalOrder = new ArrayList<>(deck.getCards());
    deck.shuffle();
    ArrayList<Card> shuffleOrder = new ArrayList<>(deck.getCards());
    
    assertNotEquals("Shuffling an empty deck doesnt affect order", originalOrder, shuffleOrder);
    
    }
    @Test
    public void testShuffleBad(){
    System.out.println( "shuffle - Bad");
    deck = new DeckOfCards();
    ArrayList<Card> originalOrder = new ArrayList<>(deck.getCards());
    deck.shuffle();
    ArrayList<Card> shuffleOrder = new ArrayList<>(deck.getCards());
    
    assertEquals("Shuffling an empty deck doesnt affect order", originalOrder, shuffleOrder);
    
    }
    @Test
    public void testShuffleBoundary(){
    System.out.println( "shuffle - Boundary");
    deck = new DeckOfCards();
    deck.addCard(new Card("Hearts",1));
    ArrayList<Card> originalOrder = new ArrayList<>(deck.getCards());
    deck.shuffle();
    ArrayList<Card> shuffleOrder = new ArrayList<>(deck.getCards());
    
    assertEquals("Shuffling an empty deck doesnt affect order", originalOrder, shuffleOrder);
    
    }
       
    


    /**
     * Test of drawCard method, of class DeckOfCards.
     */
//    @Test
//    public void testDrawCard() {
//        System.out.println("drawCard");
//        DeckOfCards instance = new DeckOfCards();
//        Card expResult = null;
//        Card result = instance.drawCard();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getSize method, of class DeckOfCards.
     */
//    @Test
//    public void testGetSize() {
//        System.out.println("getSize");
//        DeckOfCards instance = new DeckOfCards();
//        int expResult = 0;
//        int result = instance.getSize();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of initializeDeck method, of class DeckOfCards.
//     */
//    @Test
//    public void testInitializeDeck() {
//        System.out.println("initializeDeck");
//        DeckOfCards instance = new DeckOfCards();
//        instance.initializeDeck();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

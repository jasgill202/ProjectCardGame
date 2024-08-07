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

/**
 *
 * @author overd
 */
public class PlayerTest {
    
    private Player player;

    public PlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        player = new PlayerImpl("Jasmeet");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of play method, of class Player.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        player.play();

    }

    //Test of getName method, of class Player.

    @Test
    public void testGetName_Good() {
        System.out.println("getName  Good case");
        String expResult = "Jasmeet";
        String result = player.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetName_Bad() {
        System.out.println("getName  Bad case");
        player.setName(null);
        String result = player.getName();
        assertNull(result);
    }

    @Test
    public void testGetName_Boundary() {
        System.out.println("getName  Boundary case");
        player.setName("");
        String result = player.getName();
        assertEquals("", result);
    }

    // Test of setName method, of class Player.

    @Test
    public void testSetName_Good() {
        System.out.println("setName  Good case");
        String name = "Stefan";
        player.setName(name);
        assertEquals(name, player.getName());
    }

    @Test
    public void testSetName_Bad() {
        System.out.println("setName  Bad case");
        player.setName(null);
        assertNull(player.getName());
    }

    @Test
    public void testSetName_Boundary() {
        System.out.println("setName  Boundary case");
        String name = "";
        player.setName(name);
        assertEquals(name, player.getName());
    }



    public class PlayerImpl extends Player {
        public PlayerImpl(String name) {
            super(name);
        }

        @Override
        public void play() {

        }
    }
    
    
}

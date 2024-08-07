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

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 *
 * @author overd
 */
public class MainMenuTest {
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;
    
    public MainMenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        System.setIn(systemIn);
    }
    private void provideInput(String data){
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    /**
     * Test of main method, of class MainMenu.
     */
    @Test
    public void testMainGood(){
    System.out.println("main - Good");
    String p = " 1\n2\n";
    provideInput(p);
    
    String [] args = null;
    MainMenu.main(args);
    assertTrue(true);
    
    }
    @Test
    public void testMainBad(){
    System.out.println("main - Bad");
    String p = "abc\n2\n";
    provideInput(p);
    
    String [] args =null;
    MainMenu.main(args);
    assertTrue(true);
    }
    @Test
    public void testMainBoundary(){
    System.out.println("main - Boundary");
    String p = "\n2\n";
    provideInput(p);
    
    String [] args =null;
    MainMenu.main(args);
    assertTrue(true);
    
}
}

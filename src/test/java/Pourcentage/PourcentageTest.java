/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pourcentage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author insset
 */
public class PourcentageTest {
    
    public PourcentageTest() {
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
    }

    /**
     * Test of GainPrixSolder method, of class Pourcentage.
     */
    @Test
    public void testGainPrixSolder() {
        System.out.println("GainPrixSolder");
        int prix_depart = 20;
        int remise = 20;
        Pourcentage instance = new Pourcentage();
        String expResult = "3,99";
        String result = instance.GainPrixSolder(prix_depart, remise);
        assertEquals(expResult, result);
    }

    /**
     * Test of PrixInitialise method, of class Pourcentage.
     */
    @Test
    public void testPrixInitialise() {
        System.out.println("PrixInitialise");
        int prix_reduit = 5;
        int remise = 50;
        Pourcentage instance = new Pourcentage();
        String expResult = "7,5";
        String result = instance.PrixInitialise(prix_reduit, remise);
        assertEquals(expResult, result);
      }
    
    @Test
    public void testDiviseur() {
        System.out.println("Diviseurs");
        int val1 = 5;
        int val2 = 5;
        Pourcentage instance = new Pourcentage();
        String expResult = "1.0";
        String result = instance.Diviseur(val1, val2);
        assertEquals(expResult, result);
      }
    
        @Test
    public void testNADiviseur() {
        System.out.println("Diviseurs");
        int val1 = 5;
        int val2 = 0;
        Pourcentage instance = new Pourcentage();
        String expResult = "Division par 0, impossible";
        String result = instance.Diviseur(val1, val2);
        assertEquals(expResult, result);
      }
    
}

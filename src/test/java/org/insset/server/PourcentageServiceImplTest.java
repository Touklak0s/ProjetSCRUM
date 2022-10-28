/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

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
public class PourcentageServiceImplTest {
    
    public PourcentageServiceImplTest() {
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
     * Test of calculPourcentageGAIN method, of class PourcentageServiceImpl.
     */
    @Test
    public void testCalculPourcentageGAIN() {
        String[] tabVal = new String[]{"255", "25"};
        PourcentageServiceImpl instance = new PourcentageServiceImpl();
        String expResult = "Votre article est au prix originel de 255 avec une réduction de 25% ce qui vous fait économiser : 63,75€";
        
        String result = instance.calculPourcentageGAIN(tabVal);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculPourcentageINITIAL method, of class PourcentageServiceImpl.
     */
    @Test
    public void testCalculPourcentageINITIAL() {
        String[] tabVal = new String[]{"255", "25"};
        PourcentageServiceImpl instance = new PourcentageServiceImpl();
        String expResult = "Votre article est au prix solder de 255 avec une réduction de 25% ce qui vous un prix initial de : 318,75€";
        String result = instance.calculPourcentageINITIAL(tabVal);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of calculDiviseur method, of class PourcentageServiceImpl.
//     */
//    @Test
//    public void testCalculDiviseurOUI() {
//        String[] tabVal = new String[]{"57", "20"};
//        PourcentageServiceImpl instance = new PourcentageServiceImpl();
//        String expResult = "Resultat de votre division : 2,85";
//        String result = instance.calculDiviseur(tabVal);
//        assertEquals(expResult, result);
//    }
//    
    /**
     * Test of calculDiviseur method, of class PourcentageServiceImpl.
     */
    @Test
    public void testCalculDiviseurNON() {
        String[] tabVal = new String[]{"0", "25"};
        PourcentageServiceImpl instance = new PourcentageServiceImpl();
        String expResult = "Division par 0 impossible !";
        String result = instance.calculDiviseur(tabVal);
        assertEquals(expResult, result);
    }
    
}

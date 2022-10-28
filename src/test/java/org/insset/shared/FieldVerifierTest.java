/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

import static java.lang.String.valueOf;
import java.util.Date;
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
public class FieldVerifierTest {
    
    public FieldVerifierTest() {
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
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidNameOK() {
        String name = "Bonjour";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
    }
        @Test
    public void testIsValidNameNOK() {
        String name = null;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalOK() {
        Integer NotreChiffre = 12;
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDecimal(NotreChiffre);
        assertEquals(expResult, result);
    }


    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanOK() {
        String NotreChiffre = "XXX";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidRoman(NotreChiffre);
        assertEquals(expResult, result);
    }
        @Test
    public void testIsValidRomanNOK() {
        String NotreChiffre = "102";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidRoman(NotreChiffre);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDateNULL() {
        String NotreDate = null;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(NotreDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidDateOK() {
        String NotreDate = "20/12/2024";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDate(NotreDate);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testIsValidDateNOK() {
        String NotreDate = "20/12/20245";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(NotreDate);
        assertEquals(expResult, result);
    }
    
}

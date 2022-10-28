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
public class RomanConverterServiceImplTest {
    
    public RomanConverterServiceImplTest() {
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
     * Test of convertDateYears method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertDateYearsOK() {
        String NotreChiffre = "10/12/2024";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "X/XII/MMXXIV";
        String result = instance.convertDateYears(NotreChiffre);
        assertEquals(expResult, result);
    }
   

    /**
     * Test of convertRomanToArabe method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertRomanToArabe() {
        System.out.println("convertRomanToArabe");
        String NotreChiffre = "XIV";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 14;
        Integer result = instance.convertRomanToArabe(NotreChiffre);
        assertEquals(expResult, result);

    }

    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman() {
        System.out.println("convertArabeToRoman");
        Integer NotreChiffre = 235;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "CCXXXV";
        String result = instance.convertArabeToRoman(NotreChiffre);
        assertEquals(expResult, result);
    }

    /**
     * Test of findRomanIdByValue method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testFindRomanIdByValue() {
        String value = "X";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 8;
        Integer result = instance.findRomanIdByValue(value);
        assertEquals(expResult, result);
    }
    
}

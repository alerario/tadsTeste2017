/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author utfpr
 */
public class AbcTest {
    
    public AbcTest() {
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
     * Test of dobro method, of class Abc.
     */
    @org.junit.Test
    public void testDobro() {
        System.out.println("dobro");
        int x = 0;
        Abc instance = new Abc();
        int expResult = 0;
        int result = instance.dobro(x);
        assertEquals(expResult, result);
        result = instance.dobro(2);
        assertEquals(4, 4);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

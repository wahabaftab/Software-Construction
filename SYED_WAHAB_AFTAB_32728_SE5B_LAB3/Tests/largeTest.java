/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author swaha_000
 */
public class largeTest {
    
    public largeTest() {
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

   
    @Test
    public void testcapacity() {
        System.out.println("capacity");
        Tables t= new large();
        int expResult = 6;
        int result = t.capacity;
        assertEquals(expResult, result);
    }
    @Test
    public void testtype() {
        System.out.println("type");
        Tables t= new large();
        String expResult = "Large";
        String result = t.type;
        assertEquals(expResult, result);
    }
    
}

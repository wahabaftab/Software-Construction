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
public class RestaurantTest {
    
    public RestaurantTest() {
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
     * Test of booking method, of class Restaurant.
     */
    @Test
    public void testtype() {
        System.out.println("type");
         Table_Creator TC= new Table_Creator();
        Priority_Queue PQ = new Priority_Queue();
        Order O= new Order("dinner",5,7,"M",PQ,TC); // CHANGE E/L/M/S here to change booking

        Restaurant R= new Restaurant(O,PQ,TC);
        
        R.booking();
        String expResult = "dinner";
        String result = O.type;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
      public void testitems() {
        System.out.println("items");
         Table_Creator TC= new Table_Creator();
        Priority_Queue PQ = new Priority_Queue();
        Order O= new Order("dinner",5,7,"M",PQ,TC); // CHANGE E/L/M/S here to change booking

        Restaurant R= new Restaurant(O,PQ,TC);
        
        R.booking();
        int expResult = 5;
        int result = O.items;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
      @Test
      public void testmembers() {
        System.out.println("members");
         Table_Creator TC= new Table_Creator();
        Priority_Queue PQ = new Priority_Queue();
        Order O= new Order("dinner",5,7,"M",PQ,TC); // CHANGE E/L/M/S here to change booking

        Restaurant R= new Restaurant(O,PQ,TC);
        
        R.booking();
        int expResult = 7;
        int result = O.total_members;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}

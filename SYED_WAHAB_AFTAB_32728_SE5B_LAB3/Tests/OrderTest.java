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
public class OrderTest {
    
    public OrderTest() {
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
     * Test of set_priority method, of class Order.
     */
    @Test
    public void testSet_priority() {
        System.out.println("set_priority");
        Priority_Queue PQ= new Priority_Queue();
        Table_Creator TC= new Table_Creator();
        Order instance = new Order("lunch",1,4,"E",PQ,TC);
        instance.set_priority();
        int expResult = 2;
        int result = instance.get_priority();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of get_priority method, of class Order.
     */
    @Test
    public void test_waiting_time() {
        System.out.println("waiting_time");
        Priority_Queue PQ= new Priority_Queue();
        Table_Creator TC= new Table_Creator();
        Order instance = new Order("lunch",1,4,"E",PQ,TC);
       
        int expResult = 7;
        int result = instance.waiting_time;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
     @Test
    public void test_allocated() {
        System.out.println("allocated_time");
        Priority_Queue PQ= new Priority_Queue();
        Table_Creator TC= new Table_Creator();
        Order instance = new Order("lunch",1,4,"E",PQ,TC);
       
        int expResult = 20*4;
        int result = instance.time_allocated;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

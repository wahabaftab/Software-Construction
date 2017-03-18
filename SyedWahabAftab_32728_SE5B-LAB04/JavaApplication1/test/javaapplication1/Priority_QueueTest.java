/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
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
public class Priority_QueueTest {
    
    public Priority_QueueTest() {
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
     * Test of queue method, of class Priority_Queue.
     */
    @Test
    public void testQueue() {
        System.out.println("queue");
    List<Integer> a = new ArrayList();
        a.add(1);
        a.add(5);
        a.add(15);
        a.add(4);
        
        Priority_Queue instance = new Priority_Queue();
        instance.queue(a);
        int expResult = 15;
        int result = instance.highest;
        assertEquals(expResult, result);
    }

    
   
    
}

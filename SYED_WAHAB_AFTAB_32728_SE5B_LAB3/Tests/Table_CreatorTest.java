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
public class Table_CreatorTest {
    
    public Table_CreatorTest() {
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
     * Test of create_table method, of class Table_Creator.
     */
    @Test
    public void testCreate_table() {
        System.out.println("create_table");
        String c = "L";
        Table_Creator instance = new Table_Creator();
        instance.create_table(c);
        String type= "Large";
        String result =instance.T.type;
        assertEquals(type, result);
        
    }
    
}

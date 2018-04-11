/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracletest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benjamin Greenway
 */
public class ReverseTest {
    
    public ReverseTest() {
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
     * Test of main method, of class Reverse.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = {"http://localhost:8080/FEHTracker/ReverseServlet", "Reverse Me"};
        Reverse.main(args);
        
    }
    
}

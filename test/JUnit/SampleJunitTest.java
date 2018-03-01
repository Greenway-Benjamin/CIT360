/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Benjamin Greenway
 */
public class SampleJunitTest {
    
    public SampleJunitTest() {
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
     * Test of add method, of class SampleJunit.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String one = "8";
        String two = "9";
        SampleJunit instance = new SampleJunit();
        int expResult = 17;
        int result = instance.add(one, two);
        assertEquals(expResult, result);
        
    }
    
    @Test(expected=NumberFormatException.class)
    public void testAdd2() {
        System.out.println("add");
        String one = "eight";
        String two = "nine";
        SampleJunit instance = new SampleJunit();
        int expResult = 17;
        int result = instance.add(one, two);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of makeSandwich method, of class SampleJunit.
     */
    @Test
    public void testMakeSandwich() {
        System.out.println("makeSandwich");
        String cond1 = "paper";
        String cond2 = "oil";
        String cond3 = "carrot";
        SampleJunit instance = new SampleJunit();
        String expResult = "You get a paper and oil and carrot Sandwich!";
        String result = instance.makeSandwich(cond1, cond2, cond3);
        assertEquals(expResult, result);
        
    }
    
}

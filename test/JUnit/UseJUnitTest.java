/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import java.util.Arrays;
import static org.hamcrest.CoreMatchers.hasItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Benjamin Greenway
 */
public class UseJUnitTest {
    
    public UseJUnitTest() {
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

    //Compares if two numbers are equal with assertEquals
    @Test
    public void testAdd() {
        System.out.println("add");
        String one = "0";
        String two = "0";
        UseJUnit instance = new UseJUnit();
        int expResult = 0;
        int result = instance.add(one, two);
        assertEquals(expResult, result);        
    }
    
    //Compares if two numbers are equal, will generate a numberformatexceptions
    //but still pass because it is expected
    @Test(expected=NumberFormatException.class)
    public void testAdd2() {
        System.out.println("add2");
        String one = "zero";
        String two = "one";
        UseJUnit instance = new UseJUnit();
        int expResult = 1;
        int result = instance.add(one, two);
        assertEquals(expResult, result);        
    }

    //Compares two strings with assertEquals
    @Test
    public void testMakeSandwich() {
        System.out.println("makeSandwich");
        String cond1 = "mud";
        String cond2 = "ham";
        String cond3 = "london";
        UseJUnit instance = new UseJUnit();
        String expResult = "You get a mud and ham and london Sandwich!";
        String result = instance.makeSandwich(cond1, cond2, cond3);
        assertEquals(expResult, result);        
    }

    //Compares two arrays to see if they are equal using assertArrayEquals
    @Test
    public void testMakeArray() {
        System.out.println("makeArray");
        String str1 = "zubat";
        String str2 = "bad zubat";
        String str3 = "big zubat";
        UseJUnit instance = new UseJUnit();
        String[] expResult = {"zubat", "bad zubat", "big zubat"};        
        String[] result = instance.makeArray(str1, str2, str3);
        Assert.assertArrayEquals(expResult, result);        
    }
    
    
    //Second test with assertArrayEquals, will fail because it is out of order
    //Set to ignore because failing tests are sad
    @Ignore
    public void testMakeArray2() {
        System.out.println("makeArray2");
        String str1 = "zubat";
        String str2 = "bad zubat";
        String str3 = "big zubat";
        UseJUnit instance = new UseJUnit();
        String[] expResult = {"zubat", "bad zubat", "big zubat"};        
        String[] result = instance.makeArray(str1, str2, str3);
        Arrays.sort(result);
        Assert.assertArrayEquals(expResult, result);        
    }

    //Tests if 5 is a prime number using assertTrue
    @Test
    public void testPrimeNumberCheck() {
        System.out.println("primeNumberCheck");
        int primeNumber = 5;
        UseJUnit instance = new UseJUnit();
        Boolean expResult = null;
        Boolean result = instance.primeNumberCheck(primeNumber);
        assertTrue(result);      
    }
    
    //Tests that 4 is not a prime number using assertFalse
    @Test
    public void testPrimeNumberCheck2() {
        System.out.println("primeNumberCheck2");
        int primeNumber = 4;
        UseJUnit instance = new UseJUnit();
        Boolean expResult = null;
        Boolean result = instance.primeNumberCheck(primeNumber);
        assertFalse(result);      
    }

    //Tests that array one and array two are not the same object with assertNotSame
    @Test
    public void testIsItSame() {
        System.out.println("isItSame");
        UseJUnit instance = new UseJUnit();
        String str1 = "zubat";
        String str2 = "bad zubat";
        String str3 = "big zubat";  
        String[] one = instance.makeArray(str1, str2, str3);
        String[] two = instance.makeArray(str1, str2, str3);
        assertNotSame(one, two);        
    }
    
    //Tests that array one and two are the same with assertSame
    @Test
    public void testIsItSame2() {
        UseJUnit instance = new UseJUnit();
        String str1 = "zubat";
        String str2 = "bad zubat";
        String str3 = "big zubat";  
        String[] one = instance.makeArray(str1, str2, str3);
        String[] two = one;               
        assertSame(one, two);
    }
    
    //Asserts that a number received is not null with assertNotNull
    @Test
    public void testTotallyNotNull() {
        System.out.println("totallyNotNull");
        UseJUnit instance = new UseJUnit();
        int number = instance.totallyNotNull();       
        assertNotNull(number);      
    }
    
    //Tests that a number comes back as null with assertNull
    @Test
    public void testTotallyNull() {
        System.out.println("totallyNull");
        UseJUnit instance = new UseJUnit();
        String number = instance.totallyNull();       
        assertNull(number);      
    }
    
    //Tests that the array contains a specific element
    @Test
    public void assertThatArray() {
        System.out.println("assertThat");
        UseJUnit instance = new UseJUnit();
        String str1 = "zubat";
        String str2 = "bad zubat";
        String str3 = "big zubat";            
        String[] greatArray = instance.makeArray(str1, str2, str3);
        assertThat(Arrays.asList(greatArray), hasItem("zubat"));
    }
    
}

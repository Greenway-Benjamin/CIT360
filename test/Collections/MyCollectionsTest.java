/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

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
public class MyCollectionsTest {
    
    public MyCollectionsTest() {
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

    @Ignore
    public void myArrayTest1() {
        SetExample collectionTest = new SetExample();
        collectionTest.mySet();        
        // TODO review the generated test code and remove the default call to fail.
        
        
    }
    @Ignore
    public void myArrayTest2() {
        ArrayExample collectionTest = new ArrayExample();
        collectionTest.myArray();
}
    
    @Ignore
    public void myArrayTest3() {
        MapExample collectionTest = new MapExample();
        collectionTest.myMap();
}
    
    @Test
    public void myArrayTest4() {
        QueueExample collectionTest = new QueueExample();
        collectionTest.myQueue();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.*;


/**
 *
 * @author Benjamin Greenway
 */
public class SetExample {
    public void mySet() {
        
    //Create Set and add items. When printed out, all items are sorted automatically.
        Set greatSet = new TreeSet();
        greatSet.add("Zacharias");
        greatSet.add("Jerry");
        greatSet.add("Ben");
        greatSet.add("Sandy");
        System.out.print("\n The initial array is: " + greatSet);
        
    //    System.out.print(greatSet.get(2));
        
    //A set will not include two identical items
        greatSet.add("Ben");
        System.out.print("\n \n Attempted to add 'Ben' to the set. Set is now: " + greatSet);
    
    //Discover if an item is contained in the set    
        System.out.println("\n \n Does the set contain 'Ben'? " + greatSet.contains("Ben"));
        
    //Create a new hashset which does not sort automatically. List it and compare
    //to the treeset. Still returns true even though items are listed out of order
        Set compareSet = new HashSet();
        compareSet.add("Jerry");
        compareSet.add("Zacharias");
        compareSet.add("Sandy");
        compareSet.add("Ben");
        System.out.print("\n \n HashSet created. Set is: " + compareSet);
        System.out.print("\n \n Are the two sets equal? " + compareSet.equals(greatSet));  
        
        
    }
}

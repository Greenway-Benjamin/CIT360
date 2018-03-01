/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Benjamin Greenway
 */
public class ArrayExample {
    
    //Create an arraylist
    public void myArray() {
        List greatArray = new ArrayList() {};
        greatArray.add("Cookies");
        greatArray.add("Milk");
        greatArray.add("Disgusting slime");
        greatArray.add("Ice cream");
        System.out.print(" ArrayList Elements");
        System.out.print("\n" + greatArray);
        
    //Each item in a list can be called by their index number
        System.out.print("\n \n Third item in the list is: " + greatArray.get(2));
        
    //Get the size of the list
        System.out.print("\n \n The list has this many items: " + greatArray.size());
    
    //Add an item at the index number on a list, first slot is index 0
        greatArray.add(2, "Pie");
        System.out.print("\n \n 'Pie' added to index 2 (Third spot). After it is added, array is: \n" + greatArray);
    
    //Add a list to a list, all items are simply added to the end of the list,
    //can set a an index argument to insert it at after a certain index number
        greatArray.addAll(greatArray);
        System.out.print("\n \n Added array to itself. Array is now: \n" + greatArray);
        
    //Remove an item based on index, only removes item #3
        greatArray.remove(3);
        System.out.print("\n \n Removed index number three. Array is now: \n" + greatArray);
        
    //Remove an item based on name, only removes first instance
        greatArray.remove("Ice cream");
        System.out.print("\n \n Removed name 'Ice cream' from array. Array is now: \n" + greatArray);
        
    //Find index of a certain item, will only find the first instance    
        System.out.println("\n \n The index of 'Pie' is: " + greatArray.indexOf("Pie"));
    //Find index number of last instance of a certain item    
        System.out.print("\n The last index of 'Pie' is: " + greatArray.lastIndexOf("Pie"));
        
    //Sort the list alphabetically    
        Collections.sort(greatArray);
        System.out.print("\n \n After array is sorted: \n" + greatArray);
        
    //Swap the order of two items in the list    
        Collections.swap(greatArray, 0, 5);
        System.out.print("\n \n Swapping index 0 and 5 of array: \n" + greatArray);
    
    //Discover if an item is contained in the set    
        System.out.print("\n \n Does the array contain 'Milk': " + greatArray.contains("Milk"));
        
    //Create a new list and set current list equal to it. Returns true.
        List comparedList = new ArrayList();
        comparedList.addAll(greatArray);
        System.out.print("\n \n before swap are the arrays identical? " + comparedList.equals(greatArray));
    
    //Swap list items, compare again. Now returns false even though all items
    //are the same.    
        Collections.swap(comparedList,0,5);
        System.out.print("\n \n after swapping are the arrays identical? " + comparedList.equals(greatArray));
    }
}

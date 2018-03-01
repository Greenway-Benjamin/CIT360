/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Benjamin Greenway
 */
public class MapExample {
    public void myMap() {
    //Create a new treemap and insert items. Items will be sorted by the key argument automatically    
        Map greatMap = new TreeMap();
        greatMap.put("Mount Rushmore", "Texas");
        greatMap.put("President", "White House");
        greatMap.put("Astronaut", "Moon");
        greatMap.put("Recyclables", "Trash");
        greatMap.put("Baby", "Bed");
        System.out.print("\n The initial map: " + greatMap);
        
    //Tests if map contains a specific key:
        System.out.print("\n \n Does the map contain the key 'President'? " + greatMap.containsKey("President"));
        System.out.print("\n \n Does the map contain the key 'White House'? " + greatMap.containsKey("White House"));
    
    //Tests if map contains a specific value:
        System.out.print("\n \n Does the map contain the value 'President'? " + greatMap.containsValue("President"));
        System.out.print("\n \n Does the map contain the value 'White House'? " + greatMap.containsValue("White House"));
        
    //Gets an object at the key value:
        System.out.print("\n \n The value at the key 'Baby' is: " + greatMap.get("Baby"));
    
    //Creates a set and adds all map.entry items into the set. Items are placed
    //in a random order. Will not work with Treeset.
        Set superSet = new HashSet();
        superSet.addAll(greatMap.entrySet());
        System.out.print("\n \n The hashset is: " + superSet);
        
    //Creates a collection of just the keys in random order. If using treeset will sort automatically.
        Set keySet = new HashSet();
        keySet.addAll(greatMap.keySet());
        System.out.print("\n \n The keys are: " + keySet);
        
    //Creates a collection of just the values to an arraylist in a random order.
        ArrayList valueList = new ArrayList();
        valueList.addAll(greatMap.values());
        System.out.print("\n \n The values are: " + valueList);    
        
    //Creates Hashmap and compares it to Treemap. Will return true even though
    //orders are very different between the two.
        Map compareMap = new HashMap();        
        compareMap.put("Astronaut", "Moon");
        compareMap.put("Mount Rushmore", "Texas");
        compareMap.put("Recyclables", "Trash");
        compareMap.put("Baby", "Bed");
        compareMap.put("President", "White House");
        System.out.print("\n \n The new hasmap is: " + compareMap);
        System.out.print("\n \n Are the two maps equal? " + greatMap.equals(compareMap));
        System.out.print("\n \n The hashcode for first map is: " + greatMap.hashCode());
        System.out.print("\n \n The hashcode for second map is: " + compareMap.hashCode());
        
        //Clears the compareMap
        compareMap.clear();
        System.out.print("\n \n Cleared second map. Map now is: " + compareMap);
        System.out.print("\n \n Is second map now empty? " + compareMap.isEmpty());
        
        //Inserts new values into the map, and will overwrite any map at an existing key
        greatMap.put("Phone", "Pocket");
        greatMap.put("Baby", "Carseat");
        System.out.print("\n \n Added Phone and changed Baby. greatMap now reads: " + greatMap);
        
        //Create a new map, and put it into the greatMap
        Map anotherMap = new HashMap();
        anotherMap.put("Legs", "Pants");
        anotherMap.put("Food", "Belly");
        System.out.print("\n \n This new map reads: " + anotherMap);
        greatMap.putAll(anotherMap);
        System.out.print("\n \n Added map to greatMap. greatMap now reads: " + greatMap);
        
        //Removes an entry at key value
        greatMap.remove("Phone");
        System.out.print("\n \n Removed Phone. Now greatMap reads: " + greatMap);
        
        //Number of key/value pairs
        System.out.print("\n \n There are still this many pairs: " + greatMap.size());
       
    }
    
   
}

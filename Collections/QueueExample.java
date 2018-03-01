/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Benjamin Greenway
 */
public class QueueExample {
    //Create queue as a LinkedList
    public void myQueue() {
        Queue greatQueue = new LinkedList();
        greatQueue.add("Number One Item Ever");
        greatQueue.add("Pizza");
        greatQueue.add("I want to be first");
        greatQueue.add("You'll never get to me");
        System.out.print("\n \n The queue is currently: " + greatQueue);
        
    //Returns the first item currently in queue without removing it
        System.out.print("\n \n The first item in the queue is: " + greatQueue.element());
        
    //Removes the top item in the queue    
        greatQueue.remove();
        System.out.print("\n \n After removing the first item in the queue it is: " + greatQueue);
        
    //Removes a particular item from the queue, even if it's not first    
        greatQueue.remove("I want to be first");
        System.out.print("\n \n Removed 'I want to be first' from the queue. It now reads: " + greatQueue);
        
    //Cannot add an item into a specific place... new items added go to the 
    //bottom of the queue
    //greatQueue.add(2,"Bagels");
        greatQueue.add("Bagels");
    
    //Add the queue to itself
        greatQueue.addAll(greatQueue);
        System.out.print("\n \n Added queue to itself. Queue is now: " + greatQueue);
    
    //Returns the first item currently in queue without removing it
        System.out.print("\n \n The first item in the queue now is: " + greatQueue.element());
        
        
    }
    
}

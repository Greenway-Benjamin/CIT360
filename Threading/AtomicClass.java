/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author Benjamin Greenway
 */
public class AtomicClass {
    
    //Create static int for threads to write to. Labeled volatile for proper reference visibility among threads
    static volatile int number;
    
    
        
    //Synchronized function so that threads can only access it one at a time
    static synchronized void goUp() {
        number++;
    }
    
}

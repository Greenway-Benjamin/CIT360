/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import static Threading.AtomicClass.number;

/**
 *
 * @author Benjamin Greenway
 */
public class WorkerThread implements Runnable {

    private String command;

    public WorkerThread(String s){
        this.command=s;
    }
    
    //Command to execute runnable
    @Override
    public void run() { 
        
        //Count up static variable number 1000 times and print out number
        for (int i = 1; i < 1001; i++) {
        AtomicClass.goUp();
        System.out.println(number);
        }
            
    }

    //
   

    @Override
    public String toString(){
        return this.command;
    }
}

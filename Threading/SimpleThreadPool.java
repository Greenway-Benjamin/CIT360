/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import static Threading.AtomicClass.number;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

    public static void main(String[] args) {
        
        //Create executor with a max of thre threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        //Create 10 runnable tasks executing the run() command in WorkerThread
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            
            executor.execute(worker);
            
          }
        
        //Shut down executor once all threads have finished
        executor.shutdown();
        
        //When executor terminates print out resulting number and say done
        while (!executor.isTerminated()) {
        }        
        System.out.println(number);
        System.out.println("Finished all threads");
    }

}

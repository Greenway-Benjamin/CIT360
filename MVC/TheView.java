/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.Scanner;

/**
 *
 * @author Benjamin Greenway
 */
public class TheView {
    
    public void initiateView(){
    
        System.out.println("------------------------------------------------------------");
        System.out.println("Hello! Welcome to your quick you. What would you like to do?");
        System.out.println("1. View you");
        System.out.println("2. Edit you");
        System.out.println("3. Exit"); 
    
    }

    public String askForResponse() {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("");
        System.out.println("Please Make a response");
        String reply = reader.nextLine();       
        
        return reply;
        
    }

    void say(String post) {
        System.out.println(post);
    }
    
}

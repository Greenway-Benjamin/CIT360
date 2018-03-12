/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP.Handlers;

/**
 *
 * @author Benjamin Greenway
 */
public class Tryagain implements Handler{

    @Override
    public void handleIt() {
        System.out.println("");
        System.out.println("You didn't enter a command here, try again");
        System.out.println("");
    }
    
}

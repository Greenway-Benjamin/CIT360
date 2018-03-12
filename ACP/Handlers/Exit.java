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
public class Exit implements Handler{

    @Override
    public void handleIt() {
        System.out.println("");
        System.out.println("OK BYE");
        System.exit(0);
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP.Handlers;

import java.util.Scanner;

/**
 *
 * @author Benjamin Greenway
 */
public class Pants implements Handler{

    @Override
    public void handleIt() {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("What kinda pants ya want?");
        String pantstype = in.nextLine();
        System.out.println("");
        System.out.println("Looks like I'm gettin' ya some " + pantstype + " pants.");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP.Handlers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Benjamin Greenway
 */
public class Add implements Handler{

    @Override
    public void handleIt() {
        int one;
        int two;
        int three;
        try {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Gimme a whole number");
        one = in.nextInt();
        System.out.println("");
        System.out.println("Gimme another one");
        two = in.nextInt();
        three = one + two;
        System.out.println(one + " + " + two + " = " + three);
        } catch (InputMismatchException e) {
            System.out.println("You need to enter a whole number!");
            handleIt();
        }
    }
    
}

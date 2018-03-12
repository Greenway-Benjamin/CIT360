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
public class Viewer implements Handler{

    @Override
    public void handleIt() {
       System.out.println("Here's what ya can do");
       System.out.println("Pick from the choices below:");
       System.out.println("----------------------------");
       System.out.println("Pants");
       System.out.println("Add");
       System.out.println("Party");
       System.out.println("Exit");
    }
    
}

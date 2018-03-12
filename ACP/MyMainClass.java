/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import ACP.Handlers.*;
import java.util.Scanner;

/**
 *
 * @author Benjamin Greenway
 */
public class MyMainClass {
    
    public static void main(String[] args) {
        
        ApplicationController app = new ApplicationController();        
        
        app.mapCommand("View", new Viewer());
        app.mapCommand("Pants", new Pants());
        app.mapCommand("Add", new Add());
        app.mapCommand("Party", new Party());       
        app.mapCommand("Exit", new Exit());
        app.mapCommand("Tryagain", new Tryagain());
        
        startApp(app);
    }

    private static void startApp(ApplicationController app) {
        app.handleRequest("View");
        
        Scanner in = new Scanner(System.in);
        String request = in.nextLine();
        if (app.handlerMap.containsKey(request)==true) {
            app.handleRequest(request);
        } else {
            app.handleRequest("Tryagain");
        }
        
        startApp(app);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Benjamin Greenway
 */
public class TheMainClass {
    
    public static void main (String[]args) {               
        
        TheModel model = new TheModel();
        
        TheView view = new TheView();
        
        TheController controller = new TheController(model, view);      
                
        controller.getStarted();
        
    }
    
}

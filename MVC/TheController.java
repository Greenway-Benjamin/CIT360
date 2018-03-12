/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

/**
 *
 * @author Benjamin Greenway
 */
public class TheController {
    
    private TheView view;
    private TheModel model;
    
    

    public TheController(TheModel model, TheView view) {     

            this.view = view;
            this.model = model;
            
       }
    
    public void getStarted() {
       view.initiateView();
       int request = Integer.parseInt(view.askForResponse());       
       switch (request){
       case 1: getModelItems();
       break;
       case 2: setModelItems();
       break;
       case 3: leave();      
    }
    }

    private void getModelItems() {
        String first = model.getFirstName();
        String last = model.getLastName();
        int age = model.getAge();
        boolean head = model.isHeadOfHousehold();
        
        view.say("First name: " + first);
        view.say("Last name: " + last);
        view.say("Age: " + age);
        view.say("Head of Household: " + head);
        getStarted();
    }

    private void setModelItems() {
        
        view.say("What is your first name?");
        model.setFirstName(view.askForResponse());
        view.say("What is your last name?");
        model.setLastName(view.askForResponse());
        view.say("What is your age?");
        model.setAge(Integer.parseInt(view.askForResponse()));
        view.say("Are you head of Household? 1 for yes or 2 for no");
        boolean head;
        if ("1".equals(view.askForResponse())) {
            head = true;
        } else {
            head = false;
        }
        model.setHeadOfHousehold(head);
        view.say("You have been updated!");
        getStarted();
    }

    private void leave() {
        view.say("Thank you. Goodbye");
        System.exit(0);
    }
    
    
    
    
}

package JUnit;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daddy
 */
public class SampleJunit {
    
    public int add(String one, String two) {
        int intOne = Integer.parseInt(one);
        int intTwo = Integer.parseInt(two);
        return intOne + intTwo;
    }
    
    public String makeSandwich(String cond1, String cond2, String cond3) {
        return "You get a " + cond1 + " and " + cond2 + " and " + cond3 + " Sandwich!";
    }
    
    
}

    
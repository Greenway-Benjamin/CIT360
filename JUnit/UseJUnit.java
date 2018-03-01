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
public class UseJUnit {
    
    public int add(String one, String two) {
        int intOne = Integer.parseInt(one);
        int intTwo = Integer.parseInt(two);
        return intOne + intTwo;
    }
    
    public String makeSandwich(String cond1, String cond2, String cond3) {
        return "You get a " + cond1 + " and " + cond2 + " and " + cond3 + " Sandwich!";
    }
    
    public String[] makeArray(String str1, String str2, String str3){
        String[] sweetArray = {str1, str2, str3};
        
        return sweetArray;
    }
         
    
    public Boolean primeNumberCheck(int primeNumber){
        if (primeNumber == 1){
            return false;
        }
        else if (primeNumber == 2) {
            return true;
        }
        else if (primeNumber == 3) {
            return true;
        }
        else if (primeNumber == 4) {
            return false;
        }
        else
        for(int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void isItSame (String one, String two, String three) {
        List arrayOne = new ArrayList();
        List arrayTwo = new ArrayList();
        List arrayThree = new ArrayList();
        
        arrayOne.add(one);
        arrayOne.add(two);
        arrayOne.add(three);
        
        arrayTwo.add(one);
        arrayTwo.add(two);
        arrayTwo.add(three);
        
        arrayThree = arrayOne;
}
    
    public int totallyNotNull(){
        int number = 0;
        return number;
    }
    
    public String totallyNull(){
        String nothing = null;
        return nothing;
    }
}

    
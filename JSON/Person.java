/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.util.List;

/**
 *
 * @author Benjamin Greenway
 */
public class Person {
    
    String name;
    long num;
    Double balance;
    Boolean vip;
    List<String> welcomeChildren;
    
    void createPerson(String name, long num, Double balance, Boolean vip, List<String> welcomeChildren) {
        this.name = name;
        this.num = num;
        this.balance = balance;
        this.vip = vip;
        this.welcomeChildren = welcomeChildren;
    }
    
}

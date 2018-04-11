/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Benjamin Greenway
 */
public class CreateUser {
    
    
    
    public boolean CreateUser(String username, String password) {       
        
        
        //Create Configuration and set it to map to the database
        Configuration cfg = new Configuration() {};
        cfg.configure("hibernate.cfg.xml");
        
        
        //Create new sessionfactory and open the session
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession(); 
        //Begin SQL transaction
        Transaction tx = session.beginTransaction();
        
        Set compare = new TreeSet();
        
        List users = session.createQuery("FROM User").list();
        
        for (Iterator iterator = users.iterator(); iterator.hasNext();) {
            User currentUser = (User) iterator.next();
            compare.add(currentUser.getUsername());            
        }      
        
        if (compare.contains(username)) {
            
            System.out.println("Username already used. Choose another.");
            tx.commit();
            session.close();
            factory.close();
            return false;
            
        }
        
        else {
        
        //Create a new employee and set variables
        User user = new User(); 
        user.setUsername(username);
        user.setPassword(password);        
        
        
        
        //Save employee object to table
        session.save(user);        
        
        //Commit transaction, close session, close sessionfactory
        tx.commit();
        session.close();
        factory.close();
    }
        return true;
    }
}

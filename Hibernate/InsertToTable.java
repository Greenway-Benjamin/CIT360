/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Benjamin Greenway
 */
public class InsertToTable {
    
    public static void main(String[] args) {
        
        //Create Configuration and set it to map to the database
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        
        //Create new sessionfactory and open the session
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession(); 
        
        //Create a new employee and set variables
        Employee employee = new Employee(); 
        employee.setFirstName("Frank");
        employee.setLastName("Placeholder");
        employee.setCarColor("Blue");
        employee.setDOB(1964);
        
        //Begin SQL transaction
        Transaction tx = session.beginTransaction();
        
        //Save employee object to table
        session.save(employee);        
        
        //Commit transaction, close session, close sessionfactory
        tx.commit();
        session.close();
        factory.close();
    }
    
}

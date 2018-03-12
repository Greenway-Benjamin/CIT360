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
public class DeleteFromTable {
    
    public static void main (String[] args) {
        
        //Create Configuration and set it to map to the database
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        //Create new sessionfactory and open the session
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        //Begin SQL transaction
        Transaction tx = session.beginTransaction();
        
        //Set employee object to ID slot number 2 and delete the employee
        Employee employee = (Employee)session.get(Employee.class, 2);
        session.delete(employee);
        
        //Commit deletion of employee, close session, close session factory
        tx.commit();
        session.close();
        factory.close();
    }
    
}

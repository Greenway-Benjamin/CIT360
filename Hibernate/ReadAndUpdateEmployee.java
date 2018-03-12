/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Benjamin Greenway
 */
public class ReadAndUpdateEmployee {
    
    public static void main (String[] args) {
        
        //Create Configuration and set it to map to the database
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        //Create new sessionfactory and open the session
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        //Start a transaction
        Transaction tx = session.beginTransaction();
        
        //List all items from the employee table
        List employees = session.createQuery("FROM Employee").list();
        for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
            Employee employee = (Employee) iterator.next();
            System.out.println("");
            System.out.println("________________________");
            System.out.println("First Name: " + employee.getFirstName());
            System.out.println("Last Name: " + employee.getLastName());
            System.out.println("Car Color:" + employee.getCarColor());
            System.out.println("Date of Birth: " + employee.getDOB());
            System.out.println("________________________");
        }
        
        //Create employee object and set it to employee in table at ID 2
        Employee employee = (Employee)session.get(Employee.class, 2);
        
        //Set car color of employee to Pink and update table
        employee.setCarColor("Pink");         
        session.update(employee);
        
        //List car color
        System.out.println(employee.getFirstName() + "'s car color is " + employee.getCarColor());
        
        //Commit transaction, close session and close sessionfactory
        tx.commit();
        session.close();
        factory.close();
        
    }
    
}

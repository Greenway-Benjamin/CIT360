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
public class UpdateCarColor {
    
    public static void main(String[] args) {
    
    Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee employee = (Employee)session.get(Employee.class, 2);
        employee.setCarColor("Red");
        session.update(employee);
        
        tx.commit();
        session.close();
        factory.close();
 
        
    }
}

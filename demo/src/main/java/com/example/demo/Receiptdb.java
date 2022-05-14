package com.example.demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Orderdb {
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     Session session;
    
     public void createOrder(String datetime, Customer customer, ArrayList<OrderQuant> items) {
        start();
        Order newOrder = new Order(datetime, customer, items);
        session.save(newOrder);
        session.getTransaction().commit();
        close();
     }
    
     public void retrieveOrder(int broncoID) {
        start();
        session.get(Order.class, broncoID);
        close();
     }

     // something else filters information; same info if not changed, new infor for things that DO change
     public void updateOrder(int broncoID, String first, String last, Address address, String dob, int phoneNum, 
      String enterDate, String gradDate, String major, String minor) {
        start();
        Order order = session.get(Order.class, broncoID);
        Order.setFirstName(first);
        Order.setLastName(last);
        Order.setAddress(address);
        Order.setDob(dob);
        Order.setPhoneNumber(phoneNum);
        Order.setEnterDate(enterDate);
        Order.setGradDate(gradDate);
        Order.setMajor(major);
        Order.setMinor(minor);
        session.update(order);
        session.getTransaction().commit();
        close();
     }
    
     public void deleteOrder(int broncoID) {
        start();
        Order order = session.get(Order.class, broncoID);
        session.delete(order);
        session.getTransaction().commit();
        close();
     }

     public void start() {
        session = sessionFactory.openSession();
        session.beginTransaction();
     }

     public void close() {
         session.close();
         sessionFactory.close();
     }
}

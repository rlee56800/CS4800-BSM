package com.example.demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Orderdb {
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     Session session;
    
     public void createOrder(String datetime, Customer customer, ArrayList<OrderQuant> items, double totalPrice) {
        start();
        Order newOrder = new Order(datetime, customer, items, totalPrice);
        session.save(newOrder);
        session.getTransaction().commit();
        close();
     }
    
     public void retrieveOrder(int orderID) {
        start();
        session.get(Order.class, orderID);
        close();
     }

     // orders cannot be updated (it's a receipt)
    
     public void deleteOrder(int orderID) {
        start();
        Order order = session.get(Order.class, orderID);
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

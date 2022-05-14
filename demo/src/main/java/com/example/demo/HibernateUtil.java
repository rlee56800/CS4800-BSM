package com.example.demo;

import org.hibernate.SessionFactory;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = null;
    static {
    try {
        //sessionFactory = new AnnotationConfiguration().configure().buildSessionFatory();
    } catch(Exception e) {
        System.err.println("Exception while initializing hibernate util.");
        //throw new ExceptionInInitializerError(th);
        e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}

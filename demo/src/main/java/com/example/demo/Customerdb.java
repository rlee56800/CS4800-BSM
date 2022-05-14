package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Customerdb {
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     Session session;
    
     public void createStudent(int broncoID, String first, String last, Address address, String dob, int phoneNum, 
      String enterDate, String gradDate, String major, String minor) {
        start();
        Student newStudent = new Student(broncoID, first, last, address, dob, phoneNum, enterDate, gradDate, major, minor);
        session.save(newStudent);
        session.getTransaction().commit();
        close();
     }
    
     public void retrieveStudent(int broncoID) {
        start();
        session.get(Student.class, broncoID);
        close();
     }

     // something else filters information; same info if not changed, new infor for things that DO change
     public void updateStudent(int broncoID, String first, String last, Address address, String dob, int phoneNum, 
      String enterDate, String gradDate, String major, String minor) {
        start();
        Student student = session.get(Student.class, broncoID);
        Student.setFirstName(first);
        Student.setLastName(last);
        Student.setAddress(address);
        Student.setDob(dob);
        Student.setPhoneNumber(phoneNum);
        Student.setEnterDate(enterDate);
        Student.setGradDate(gradDate);
        Student.setMajor(major);
        Student.setMinor(minor);
        session.update(student);
        session.getTransaction().commit();
        close();
     }
    
     public void deleteStudent(int broncoID) {
        start();
        Student student = session.get(Student.class, broncoID);
        session.delete(student);
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

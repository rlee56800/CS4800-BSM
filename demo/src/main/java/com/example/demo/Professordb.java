package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Professordb {
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     Session session;
    
     public void createProfessor(int broncoID, String first, String last, Address address, String dob, int phoneNum, String dept, String office, String research) {
        start();
        Professor newProf = new Professor(broncoID, first, last, address, dob, phoneNum, dept, office, research);
        session.save(newProf);
        session.getTransaction().commit();
        close();
     }
    
     public void retrieveProfessor(int broncoID) {
        start();
        session.get(Professor.class, broncoID);
        close();
     }

     // something else filters information; same info if not changed, new infor for things that DO change
     public void updateProfessor(int broncoID, String first, String last, Address address, String dob, int phoneNum, String dept, String office, String research) {
        start();
        Professor prof = session.get(Professor.class, broncoID);
        Professor.setFirstName(first);
        Professor.setLastName(last);
        Professor.setAddress(address);
        Professor.setDob(dob);
        Professor.setPhoneNumber(phoneNum);
        Professor.setDepartment(dept);
        Professor.setOffice(office);
        Professor.setResearch(research);
        session.update(prof);
        session.getTransaction().commit();
        close();
     }
    
     public void deleteProfessor(int broncoID) {
        start();
        Professor prof = session.get(Professor.class, broncoID);
        session.delete(prof);
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

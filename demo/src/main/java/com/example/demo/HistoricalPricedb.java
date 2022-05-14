package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HistoricalPricedb {
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     Session session;
    
     public void createHistoricalPrice(String date, double price, Product product) {
        start();
        HistoricalPrice newHistoricalPrice = new HistoricalPrice(date, price, product);
        session.save(newHistoricalPrice);
        session.getTransaction().commit();
        close();
     }
    
     public void retrieveHistoricalPrice(int hprice_id) {
        start();
        session.get(HistoricalPrice.class, hprice_id);
        close();
     }

     // something else filters information; same info if not changed, new infor for things that DO change
     public void updateHistoricalPrice(int hp_id, String date, double price, Product product) {
        start();
        HistoricalPrice historicalPrice = session.get(HistoricalPrice.class, hp_id);
        historicalPrice.setDate(date);
        historicalPrice.setPrice(price);
        historicalPrice.setProduct(product);
        session.update(historicalPrice);
        session.getTransaction().commit();
        close();
     }
    
     public void deleteHistoricalPrice(int broncoID) {
        start();
        HistoricalPrice historicalPrice = session.get(HistoricalPrice.class, broncoID);
        session.delete(historicalPrice);
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

package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Productdb {
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     Session session;
    
     public void createProduct(double price, String name) {
        start();
        Product newProduct = new Product(price, name);
        session.save(newProduct);
        session.getTransaction().commit();
        close();
     }
    
     public void retrieveProduct(int product_id) {
        start();
        session.get(Product.class, product_id);
        close();
     }

     // something else filters information; same info if not changed, new infor for things that DO change
     public void updateProduct(int product_id, double price, String name) {
        boolean changeHist =  false;
        Product product;
        start();
        product = session.get(Product.class, product_id);
        changeHist = !(product.getPrice() == price);
        product.setPrice(price);
        product.setName(name);
        session.update(product);
        session.getTransaction().commit();
        close();

        if(changeHist) {
            HistoricalPricedb.createHistoricalPrice(price, product);
        }
     }
    
     public void deleteProduct(int broncoID) {
        start();
        Product product = session.get(Product.class, broncoID);
        session.delete(product);
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

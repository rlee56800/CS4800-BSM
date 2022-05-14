package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productID;
    @Column(name = "price")
    private double price;
    @Column(name = "name")
    private String name;
    
    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    // getters
    public int getProductID() {
        return productID;
    }
    
    public String getProductName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // setters
    public void setPrice(double newPrice) {
        price = newPrice;
    }
    public void setName(String name) {
        this.name = name;
    }
}

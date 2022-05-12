package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    @Column(name = "product_id")
    private int productID;
    @Column(name = "price")
    private double price;
    @Column(name = "name")
    private String name;
    
    public Product(int productID, double price, String name) {
        this.productID = productID;
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

    public void setPrice(String date, double newPrice) {
        //historicalPrice.add(new HistoricalPrice(date, price));
        price = newPrice;
    }
}

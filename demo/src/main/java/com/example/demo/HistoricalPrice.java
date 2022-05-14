package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historical_price")
public class HistoricalPrice {
    @Id
    @Column(name = "hprice_id") // does it need this
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hprice_id;
    @Column(name = "date")
    private String date;
    @Column(name = "price")
    private double price;
    private Product product;

    public HistoricalPrice(String date, double price, Product product) {
        this.date = date;
        this.price = price;
        this.product = product;
    }

    public HistoricalPrice getHistoricalPrice() {
        //return this; // what does this do
        return new HistoricalPrice(date, price, product);
    }

    // getters
    public int getHPriceID() {
        return hprice_id;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }
    
    // setters
    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="historical_price")
public class HistoricalPrice {
    @Column(name = "hprice_id") // does it need this
    private int hprice_id;
    @Column(name = "date")
    private String date;
    @Column(name = "price")
    private double price;

    public HistoricalPrice(String date, double price) {
        this.date = date;
        this.price = price;
    }

    public HistoricalPrice getHistoricalPrice() {
        //return this; // what does this do
        return new HistoricalPrice(date, price);
    }
}

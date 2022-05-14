package com.example.demo;

import java.util.ArrayList;
// Order prints the recript and is used in the Report

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;
    @Column(name = "datetime")
    private String datetime;
    @Column(name = "customer")
    private Customer customer;
    @Column(name = "total_price")
    private double totalPrice;
    private ArrayList<OrderQuant> items;

    public Order(String datetime, Customer customer) {
        this.datetime = datetime;
        this.customer = customer;
    }

    public Order(String datetime, Customer customer, ArrayList<OrderQuant> items, double tp) {
        this.datetime = datetime;
        this.customer = customer;
        this.items = items;
        this.totalPrice = tp;
    }

    public void addItem(Product item, int quant) {
        OrderQuant adding = new OrderQuant(item, quant);
        items.add(adding);
        totalPrice += (1 - customer.getDiscountScheme()) * adding.getSum();
    }

    // getters
    public Customer getOrderID() {
        return customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getDatetime() {
        return datetime;
    }

    public ArrayList<OrderQuant> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

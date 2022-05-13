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

    public void addItem(Product item, int quant) {
        OrderQuant adding = new OrderQuant(item, quant);
        items.add(adding);
        totalPrice += (1 - customer.getDiscountScheme()) * adding.getSum();
    }

    // public double calculateTotal() {
    //     double total = 0;

    //     for(OrderQuant item : items) {
    //         // sum of all items in cart
    //         total += item.getSum();
    //     }

    //     //apply discount
    //     total *= (1 - customer.getDiscountScheme());

    //     return total;
    // }

    // getters
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

package demo.src.main.java.com.example.demo;

import java.util.ArrayList;
// Order prints the recript and is used in the Report

public class Order {
    private String date;
    private String time;
    private ArrayList<Product> products;
    private Customer customer;

    public Order(String date, String time, Customer customer) {
        this.date = date;
        this.time = time;
        this.customer = customer;
    }

    public void addItem(Product item, int quantity) {

    }

    public double calculateTotal() {
        double total = 0;

        for(Product prod : products) {
            // sum of all items in cart
            total += prod.getQuantity() * prod.getPrice();
        }

        // apply discount
        total *= (1 - customer.getDiscountScheme());

        return total;
    }

    // getters
    public Customer getCustomer() {
        return customer;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}

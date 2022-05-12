package com.example.demo;

// Product object + quantity
public class OrderQuant {
    Product item;
    int quantity;

    public OrderQuant(Product item, int quant) {
        this.item = item;
        quantity = quant;
    }

    public Product getItem(){
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSum() {
        return item.getPrice() * quantity;
    }

    public void setQuantity(int quant) {
        quantity = quant;
    }
}

package com.example.demo;

import java.util.ArrayList;

public class Report {
    private ArrayList<Order> orders;

    public Report(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public double getTotalEarnings() {
        double total = 0;
        for(Order o : orders) {
            total += o.calculateTotal();
        }

        return total;
    }

    // // something has to sort period
    // public double getTotalEarnings(String period) {
    //     double total = 0;

    //     for(Order o : orders) {
    //         if(o.getDate().equals(period)) { // heck your efficiency
    //             total += o.calculateTotal();
    //         }
    //     }

    //     return total;
    // }
}

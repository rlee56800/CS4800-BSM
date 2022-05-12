package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

    @Column(name = "street")
    private String street;
    @Column(name = "number")
    private int number;
    @Column(name = "zipcode")
    private int zipcode;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;

    public Address(String street, int number, int zipcode, String city, String state) {
        this.street = street;
        this.number = number;
        this.zipcode = zipcode;
        this.city = city;
        this.state = state;
    }

    // singleton :(
    public Address getAddress() {
        return new Address(street, number, zipcode, city, state);
    }
}
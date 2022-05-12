package com.example.demo;
import javax.persistence.*;


@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "broncoID")
    private int broncoID; // THIS IS IN THE UOD
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "dob")
    private String dob;
    @Column(name = "phone_number")
    private int phoneNumber;
    private DiscountScheme discountScheme;

    public Customer(int broncoID, String firstName, String lastName, String dob, int phoneNumber, String type) {
        this.broncoID = broncoID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        discountScheme = new DiscountScheme(type);
    }

    public Customer(int broncoID, String firstName, String lastName, String dob, int phoneNumber) {
        this(broncoID, firstName, lastName, dob, phoneNumber, "none");
    }

    // getters
    public int getBroncoID() {
        return broncoID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public double getDiscountScheme() {
        return discountScheme.getPriceDiscount();
    }

    // setters
    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
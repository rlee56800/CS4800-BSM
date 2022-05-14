package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student extends Customer {
    @Column(name = "enter_date")
    private String enterDate;
    @Column(name = "grad_date")
    private String gradDate;
    @Column(name = "major")
    private String major;
    @Column(name = "minor")
    private String minor;

    public Student(int broncoID, String firstName, String lastName, Address address, String dob, int phoneNumber, String enterDate, String gradDate, String major, String minor) {
        super(broncoID, firstName, lastName, address, dob, phoneNumber);
        this.enterDate = enterDate;
        this.gradDate = gradDate;
        this.major = major;
        this.minor = minor;
    }    

    // getters
    public String getEnterDate() {
        return enterDate;
    }

    public String getGradDate() {
        return gradDate;
    }

    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }

    // setters
    public void setEnterDate(String enterDate) {
        this.enterDate = enterDate;
    }

    public void setGradDate(String gradDate) {
        this.gradDate = gradDate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }
}

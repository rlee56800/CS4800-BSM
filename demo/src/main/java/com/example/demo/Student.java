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

    public Student(int broncoID, String firstName, String lastName, String dob, int phoneNumber, String enterDate, String gradDate, String major, String minor) {
        super(broncoID, firstName, lastName, dob, phoneNumber);
        this.enterDate = enterDate;
        this.gradDate = gradDate;
        this.major = major;
        this.minor = minor;
    }
}

package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor extends Customer {
    @Column(name = "department")
    private String department;
    @Column(name = "office")
    private String office;
    @Column(name = "research")
    private String research;

    public Professor(int broncoID, String firstName, String lastName, String dob, int phoneNumber, String department, String office, String research) {
        super(broncoID, firstName, lastName, dob, phoneNumber);
        this.department = department;
        this.office = office;
        this.research = research;
    }
}

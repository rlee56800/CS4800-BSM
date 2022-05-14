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

    public Professor(int broncoID, String firstName, String lastName, Address address, String dob, int phoneNumber, String department, String office, String research) {
        super(broncoID, firstName, lastName, address, dob, phoneNumber);
        this.department = department;
        this.office = office;
        this.research = research;
    }

    // getters
    public String getDepartment() {
        return department;
    }

    public String getOffice() {
        return office;
    }

    public String getResearch() {
        return research;
    }

    // setters
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setResearch(String research) {
        this.research = research;
    }
}

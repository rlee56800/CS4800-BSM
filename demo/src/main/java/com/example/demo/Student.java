package com.example.demo;

public class Student extends Customer {
    private String enterDate;
    private String gradDate;
    private String major;
    private String minor;

    public Student(int broncoID, String firstName, String lastName, String dob, int phoneNumber, String enterDate, String gradDate, String major, String minor) {
        super(broncoID, firstName, lastName, dob, phoneNumber);
        this.enterDate = enterDate;
        this.gradDate = gradDate;
        this.major = major;
        this.minor = minor;
    }
}

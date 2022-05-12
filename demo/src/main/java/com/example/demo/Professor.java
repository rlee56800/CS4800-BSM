package demo.src.main.java.com.example.demo;

public class Professor extends Customer {
    private String department;
    private String office;
    private String research;

    public Professor(int broncoID, String firstName, String lastName, String dob, int phoneNumber, String department, String office, String research) {
        super(broncoID, firstName, lastName, dob, phoneNumber);
        this.department = department;
        this.office = office;
        this.research = research;
    }
}

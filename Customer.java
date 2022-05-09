public class Customer {
    private int broncoID;
    private String firstName;
    private String lastName;
    private String dob;
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

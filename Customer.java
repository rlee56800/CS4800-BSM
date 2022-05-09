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
    public double getDiscountScheme() {
        return discountScheme.getPriceDiscount();
    }
}

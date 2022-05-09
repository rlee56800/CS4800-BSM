public class Address {

    private String street;
    private int number;
    private int zipcode;
    private String city;
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
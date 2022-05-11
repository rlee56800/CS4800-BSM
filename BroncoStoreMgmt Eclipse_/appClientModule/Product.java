import java.util.ArrayList;

public class Product {
    private int productID;
    private int quantity;
    private double price;
    private String name;
    private ArrayList<HistoricalPrice> historicalPrice; // added when price is changed

    public Product(int productID, double price, String name) {
        this.productID = productID;
        this.price = price;
        this.name = name;
        historicalPrice = new ArrayList<HistoricalPrice>();
    }

    public Product(int productID, double price, String name, int quantity) {
        this(productID, price, name); // is that how this works
        this.quantity = quantity;
    }

    // getters
    public int getProductID() {
        return productID;
    }
    
    public String getProductName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(String date, double newPrice) {
        historicalPrice.add(new HistoricalPrice(date, price));
        price = newPrice;
    }
}

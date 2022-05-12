package demo.src.main.java.com.example.demo;

public class DiscountScheme {
    public double priceDiscount;

    public DiscountScheme(String type) {
        switch(type) {
            case "student":
                // students gte 10% discount
                priceDiscount = 0.10;
                break;
            case "professor":
                // professors get 15% discount
                priceDiscount = 0.15;
                break;
            default:
                // else 0% discount
                priceDiscount = 0.0;
        }
    }

    public double getPriceDiscount() {
        return priceDiscount;
    }
}

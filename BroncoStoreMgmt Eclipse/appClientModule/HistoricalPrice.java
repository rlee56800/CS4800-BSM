public class HistoricalPrice {
    private String date;
    private double price;

    public HistoricalPrice(String date, double price) {
        this.date = date;
        this.price = price;
    }

    public HistoricalPrice getHistoricalPrice() {
        //return this; // what does this do
        return new HistoricalPrice(date, price);
    }
}

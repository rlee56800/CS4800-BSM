public class Receipt {
    private Order order;
    private Customer customer;
    private String period;

    public Receipt(Order order, String period) {
        this.order = order;
        this.customer = order.getCustomer();
        this.period = period;
    }

    public double getTotal() {
        return order.calculateTotal();
    }

    public String getPeriod() {
        return period;
    }
}

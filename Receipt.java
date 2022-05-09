public class Receipt {
    private Order order;
    private Customer customer;
    private String period;

    public Receipt(Order order, String period) {
        this.order = order;
        this.customer = order.getCustomer();
        this.period = period;
    }

    public String printReceipt() {
        return "a";
        // do we want this
        // print:
        // product.getID()/whatever
        // product.getName()
        // product.getQuantity()

        // product.getPrice() * product.getQuantity
        // or print each individually?
        // for(int i = quantity, etc)
        // that stuff

        // for(int i = quantity)
        // all of that
    }

    public double getTotal() {
        return order.calculateTotal();
    }

    public String getPeriod() {
        return period;
    }

    public Customer getCustomer() {
        return customer;
    }
}

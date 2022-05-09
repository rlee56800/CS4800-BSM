import java.util.ArrayList;

public class Report {
    private ArrayList<Receipt> receipts;

    public Report(ArrayList<Receipt> receipts) {
        this.receipts = receipts;
    }

    public double getTotalEarnings() {
        double total = 0;
        for(Receipt r : receipts) {
            total += r.getTotal();
        }

        return total;
    }

    public double getTotalEarnings(String period) {
        double total = 0;

        for(Receipt r : receipts) {
            if(r.getPeriod().equals(period)) { // heck your efficiency
                total += r.getTotal();
            }
        }

        return total;
    }
}

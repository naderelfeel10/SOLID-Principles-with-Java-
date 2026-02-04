package SRP.EX3.solution;

import java.util.List;

public class InvoiceCalculator {

    public Double calcTotalPrice(List<Double> items){
        double total = 0;
        for (double price : items) {
            total += price;
        }
        total = total + (total * 0.14); // Adding 14% VAT
        return total;
    }
}

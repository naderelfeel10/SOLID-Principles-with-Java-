package SRP.EX4.solution;

import java.util.List;

public class PriceCalculator {

    public double calculateTotalPrice(List<String> items){
        double total = 0;
        for (String item : items) {
            total += getItemPrice(item);
        }
        return total;
    }

    private double getItemPrice(String item) {
        return item.length() * 2.5;
    }
}

package SRP.EX4.solution;

import java.util.List;

public class OrderValidator {

    public void validateOrder(String customerId, List<String> items){
        if (customerId == null || customerId.isEmpty()) {
            throw new IllegalArgumentException("Invalid customer");
        }

        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("No items in order");
        }
    }
}

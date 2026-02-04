package SRP.EX4.problem;
import java.util.*;

public class OrderProcessor {

    public void processOrder(String customerId, List<String> items, String paymentType) {
        if (customerId == null || customerId.isEmpty()) {
            throw new IllegalArgumentException("Invalid customer");
        }

        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("No items in order");
        }


        double total = 0;
        for (String item : items) {
            total += getItemPrice(item);
        }


        if (paymentType.equals("CARD")) {
            if (!chargeCard(customerId, total)) {
                throw new RuntimeException("Card payment failed");
            }
        } else if (paymentType.equals("PAYPAL")) {
            if (!chargePaypal(customerId, total)) {
                throw new RuntimeException("Paypal payment failed");
            }
        } else {
            throw new IllegalArgumentException("Unsupported payment");
        }


        saveOrder(customerId, items, total);

        updateInventory(items);

        sendConfirmationEmail(customerId);

        logOrder(customerId, total);
    }



    private double getItemPrice(String item) {
        return item.length() * 2.5;
    }


    private boolean chargeCard(String customerId, double amount) {
        return true;
    }

    private boolean chargePaypal(String customerId, double amount) {
        return true;
    }

    private void saveOrder(String customerId, List<String> items, double total) {
        System.out.println("Order saved");
    }

    private void updateInventory(List<String> items) {
        System.out.println("Inventory updated");
    }

    private void sendConfirmationEmail(String customerId) {
        System.out.println("Email sent");
    }

    private void logOrder(String customerId, double total) {
        System.out.println("Order logged");
    }
}


package SRP.EX3.problem;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class InvoiceManager {

    public void processInvoice(String customerEmail, List<Double> items) {
        // 1. Math / Business Logic
        double total = 0;
        for (double price : items) {
            total += price;
        }
        total = total + (total * 0.14); // Adding 14% VAT

        try (FileWriter writer = new FileWriter("invoice_" + customerEmail + ".txt")) {
            writer.write("Invoice for: " + customerEmail + "\nTotal: $" + total);
        } catch (IOException e) {
            System.err.println("Failed to save file");
        }

        System.out.println("Connecting to SMTP Server...");
        System.out.println("Email: 'Your total is $" + total + "' sent to " + customerEmail);

        System.out.println("[LOG]: Invoice processed for " + customerEmail + " at " + java.time.LocalDateTime.now());
    }
}
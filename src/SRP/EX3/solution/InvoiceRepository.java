package SRP.EX3.solution;

import java.io.FileWriter;
import java.io.IOException;

public class InvoiceRepository {

    public void writeToFile(String customerEmail, Double total){
        try (FileWriter writer = new FileWriter("invoice_" + customerEmail + ".txt")) {
            writer.write("Invoice for: " + customerEmail + "\nTotal: $" + total);
        } catch (IOException e) {
            System.err.println("Failed to save file");
        }
    }

}

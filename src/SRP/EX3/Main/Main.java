package SRP.EX3.Main;


import SRP.EX3.solution.InvoiceService;

import java.util.Arrays;
import java.util.List;

public class Main {
    static InvoiceService invoiceService = new InvoiceService();
    public static void main(String[] args) {
        List<Double> items = Arrays.asList(30.0, 50.0, 100.0);
        invoiceService.processInvoice("naderelfeel@gmail.com",items);

    }
}
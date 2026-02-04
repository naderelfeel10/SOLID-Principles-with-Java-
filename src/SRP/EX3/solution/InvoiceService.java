package SRP.EX3.solution;

import java.util.List;
public class InvoiceService {

   InvoiceRepository invoiceRepository = new InvoiceRepository();
   InvoiceLogging invoiceLogging = new InvoiceLogging();
   InvoiceCalculator invoiceCalculator = new InvoiceCalculator();
   EmailService emailService = new EmailService();

    public void processInvoice(String customerEmail, List<Double> items) {
        double totalPrice = invoiceCalculator.calcTotalPrice(items);

        Invoice invoice = new Invoice(customerEmail, items, totalPrice);
        invoiceRepository.writeToFile(invoice.getCustomerEmail(), totalPrice);
        emailService.emailInvoice(invoice.getCustomerEmail(), invoice.getTotal());
        invoiceLogging.logInvoice(invoice.getCustomerEmail());

    }
}

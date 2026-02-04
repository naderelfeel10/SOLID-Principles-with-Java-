package SRP.EX3.solution;

public class InvoiceLogging {

    public void logInvoice(String customerEmail){
        System.out.println("[LOG]: Invoice processed for " + customerEmail + " at " + java.time.LocalDateTime.now());
    }

}

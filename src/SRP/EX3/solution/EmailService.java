package SRP.EX3.solution;

public class EmailService {

    public void emailInvoice(String customerEmail, Double total ){
        System.out.println("Connecting to SMTP Server...");
        System.out.println("Email: 'Your total is $" + total + "' sent to " + customerEmail);
    }
}

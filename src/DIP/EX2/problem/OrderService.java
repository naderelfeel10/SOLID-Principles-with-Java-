package DIP.EX2.problem;

public class OrderService {

    private EmailSender emailSender = new EmailSender();

    public void completeOrder() {
        emailSender.sendEmail("Your order has been shipped  ");
    }
}
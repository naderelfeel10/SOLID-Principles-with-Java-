package SRP.EX4.solution;

public class PayPalPaymentService implements PaymentService {

    @Override
    public void pay(String customerId, double amount){
        System.out.println("paypal charged: " + amount);
    }
}

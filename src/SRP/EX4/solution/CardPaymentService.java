package SRP.EX4.solution;

public class CardPaymentService implements PaymentService{

    @Override
    public void pay(String customerId, double amount){
        System.out.println("Card charged: " + amount);
    }
}

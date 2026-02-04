package SRP.EX4.main;

import SRP.EX4.solution.CardPaymentService;
import SRP.EX4.solution.OrderService;
import SRP.EX4.solution.PaymentService;

import java.util.Arrays;
import java.util.List;

public class Main {
    static OrderService orderService = new OrderService();
    public static void main(String[] args) {

        PaymentService paymentService = new CardPaymentService();
        List<String> items = Arrays.asList("PC","laptop");
        orderService.processOrder("33",items,paymentService);

    }
}
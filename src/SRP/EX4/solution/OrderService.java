package SRP.EX4.solution;


import java.util.List;

public class OrderService {

    OrderValidator orderValidator = new OrderValidator();
    PriceCalculator priceCalculator = new PriceCalculator();
    OrderSave orderSave = new OrderSave();
    Inventory inventory = new Inventory();
    OrderConfirmation orderConfirmation = new OrderConfirmation();
    Logging logging = new Logging();

    public void processOrder(String customerId, List<String> items, PaymentService paymentService){
            orderValidator.validateOrder(customerId, items);
            double totalPrice = priceCalculator.calculateTotalPrice(items);
            Order order = new Order(customerId, items, totalPrice);
            paymentService.pay(customerId, totalPrice);
            orderSave.saveOrder(order);
            inventory.updateInventory(items);
            orderConfirmation.sendConfirmationEmail(customerId);
            logging.logOrder(customerId, totalPrice);
    }

}

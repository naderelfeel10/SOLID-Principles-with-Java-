package OCP.EX2.solution;

public class OrderCalculatorService {

    final private OrderHandlerFactory orderHandlerFactory = new OrderHandlerFactory();

    public double calculateTotalOrderPrice(Order order){
        OrderCalculator orderCalculator = orderHandlerFactory.getCalculator(order.getType());

        double total = orderCalculator.calculateTotal(order);
        return total;
    }
}

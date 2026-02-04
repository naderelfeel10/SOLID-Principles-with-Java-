package OCP.EX2.solution;

public class OrderProcessor {

    OrderValidatorService orderValidatorService = new OrderValidatorService();
    OrderCalculatorService orderCalculatorService = new OrderCalculatorService();

    public void procecssOrder(Order order){
        orderValidatorService.validateOrder(order);
        double total = orderCalculatorService.calculateTotalOrderPrice(order);
        System.out.println("total price : "+total);

    }
}

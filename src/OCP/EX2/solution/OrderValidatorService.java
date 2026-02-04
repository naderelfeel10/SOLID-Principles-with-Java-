package OCP.EX2.solution;

public class OrderValidatorService {


    public void validateOrder(Order order){
        OrderValidator orderValidator = new OrderHandlerFactory().getValidator(order.getType());
        orderValidator.validate(order);
    }

}

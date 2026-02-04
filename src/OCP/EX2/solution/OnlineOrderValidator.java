package OCP.EX2.solution;

import OCP.EX2.solution.Order;

public class OnlineOrderValidator implements OrderValidator {

    @Override
     public void validate(Order order) {
            if (order.getAddress() == null) {
                throw new RuntimeException("Address required for online orders");
            }
    }
}

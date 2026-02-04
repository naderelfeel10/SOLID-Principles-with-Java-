package OCP.EX2.solution;

import OCP.EX2.solution.Order;

public class StoreOrderValidator implements OrderValidator {

    @Override
    public void validate(Order order) {
            if (order.getAddress() == null) {
                throw new RuntimeException("Store ID required");
            }
    }
}

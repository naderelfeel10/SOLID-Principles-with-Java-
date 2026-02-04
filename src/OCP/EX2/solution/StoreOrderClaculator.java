package OCP.EX2.solution;

import OCP.EX2.solution.Order;
import OCP.EX2.solution.OrderItem;

public class StoreOrderClaculator implements OrderCalculator{

    @Override
    public double calculateTotal(Order order) {
        double total = 0;

        for (OrderItem item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }

        return total;
    }

}

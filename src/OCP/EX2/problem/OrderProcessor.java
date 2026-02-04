package OCP.EX2.problem;

public class OrderProcessor {

    public void processOrder(Order order) {

        validate(order);
        double total = calculateTotal(order);
    }

    private void validate(Order order) {
        if (order.getType().equals("ONLINE")) {
            if (order.getAddress() == null) {
                throw new RuntimeException("Address required for online orders");
            }
        } else if (order.getType().equals("STORE")) {
            if (order.getStoreId() == null) {
                throw new RuntimeException("Store ID required");
            }
        }
    }

    private double calculateTotal(Order order) {
        double total = 0;

        for (OrderItem item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }

        if (order.getType().equals("ONLINE")) {
            total += 50; // shipping
        }

        return total;
    }




}

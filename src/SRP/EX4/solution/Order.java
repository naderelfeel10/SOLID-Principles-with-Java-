package SRP.EX4.solution;

import java.util.List;

public class Order {
    private String customerId;
    private List<String> items;
    private double totalPrice;

    public Order(String customerId, List<String> items, double totalPrice){
        this.customerId = customerId;
        this.items = items;
        this.totalPrice = totalPrice;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


}

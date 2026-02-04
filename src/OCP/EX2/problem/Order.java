package OCP.EX2.problem;

import java.util.List;

public class Order {

    private String type;          // ONLINE, STORE, etc.
    private List<OrderItem> items;

    // Online order fields
    private String address;

    // Store order fields
    private String storeId;

    public Order(String type, List<OrderItem> items,String address) {
        this.type = type;
        this.items = items;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getAddress() {
        return address;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
}

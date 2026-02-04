package OCP.EX2.solution;

import java.util.List;

public class Order {

    private String type;
    private List<OrderItem> items;
    private String address;
    private String storeId;

    public Order(String type, List<OrderItem> items, String address) {
        this.type = type;
        this.items = items;
        this.address = address;
    }

    public String getType() {return type;}

    public List<OrderItem> getItems() {return items;}

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

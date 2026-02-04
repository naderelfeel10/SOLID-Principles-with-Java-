package DIP.EX1.solution;


public class DeliveryCompany {

    private DeliveryService deliveryService;

    public DeliveryCompany(DeliveryService deliveryService){
        this.deliveryService = deliveryService;
    }
    public void sendProduct(Product product){
        this.deliveryService.deliverProduct(product);
    }


}

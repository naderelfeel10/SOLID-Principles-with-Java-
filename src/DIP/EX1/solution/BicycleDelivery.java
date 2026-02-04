package DIP.EX1.solution;

public class BicycleDelivery implements DeliveryService{

    @Override
    public void deliverProduct(Product product){
        System.out.println("BicycleDelivery is delvering the product");
    }
}

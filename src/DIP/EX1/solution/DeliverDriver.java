package DIP.EX1.solution;

public class DeliverDriver implements DeliveryService {

    @Override
    public void deliverProduct(Product product){
        System.out.println("DeliverDriver is delivering the product");
    }
}

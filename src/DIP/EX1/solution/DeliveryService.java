package DIP.EX1.solution;

public interface DeliveryService {
    void deliverProduct(Product product);
}

// we are now able to extend to BicycleDelivery or ThirdPartyLogistics for example with now change in the code

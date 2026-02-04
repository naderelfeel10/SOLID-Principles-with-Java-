package DIP.EX1.problem;

public class DelveryCompany {

    // this method violates (dependeny inversion principle) as
    /*
    1. there is a tight coupling between DilveryCompany and DeliveryDriver
    2. every time you call the function it declares DeliveryDriver
    3. what if we want to change the Delivery or add add another option ?
    4. also hard to test
    */
    // so high level classes should not depend on low level ones

    public void sendProduct(Product product){
        DeliveryDriver deliveryDriver = new DeliveryDriver();
        deliveryDriver.deliverProduct(product);
    }

}

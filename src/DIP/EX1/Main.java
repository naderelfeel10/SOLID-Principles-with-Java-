package DIP.EX1;

import DIP.EX1.problem.DelveryCompany;
import DIP.EX1.problem.Product;
import DIP.EX1.solution.BicycleDelivery;
import DIP.EX1.solution.DeliverDriver;
import DIP.EX1.solution.DeliveryService;

public class Main {
    // trust the process
    public static void main(String[] args) {

        // the problem :
        Product product1 = new Product();
        DelveryCompany delveryCompany = new DelveryCompany();
        delveryCompany.sendProduct(product1);

        // solution
        DeliveryService deliveryService = new DeliverDriver();
        DIP.EX1.solution.Product product2 = new DIP.EX1.solution.Product();
        DIP.EX1.solution.DeliveryCompany deliveryCompany = new DIP.EX1.solution.DeliveryCompany(deliveryService);
        deliveryCompany.sendProduct(product2);


    }
}

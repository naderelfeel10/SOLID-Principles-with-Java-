package OCP.EX2.Main;


import OCP.EX2.solution.Order;
import OCP.EX2.solution.OrderItem;
import OCP.EX2.solution.OrderProcessor;

import java.util.Arrays;
import java.util.List;

public class Main {
    static OrderProcessor orderProcessor = new OrderProcessor();
    public static void main(String[] args) {

        List<OrderItem> items = Arrays.asList(
                new OrderItem("PC",100.0,10),
                new OrderItem("HeadPhone",2000.0,3)
        );
        Order onlineOrder = new Order("ONLINE",items,"Cairo");
        Order storeOrder = new Order("STORE",items,"Cairo");

        orderProcessor.procecssOrder(onlineOrder);
        System.out.println("******");
        orderProcessor.procecssOrder(storeOrder);

    }
}
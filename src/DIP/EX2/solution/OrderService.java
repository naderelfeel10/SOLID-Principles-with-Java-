package DIP.EX2.solution;

public class OrderService {

    private NotificationService notificationService;

    public OrderService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void completeOrder(){
        //
        //
        this.notificationService.sendMSG("Your order has been shipped!");
    }

}

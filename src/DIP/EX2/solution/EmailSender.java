package DIP.EX2.solution;

public class EmailSender implements  NotificationService{

    @Override
    public void sendMSG(String msg){
        System.out.println("sending email : "+msg);
    }
}

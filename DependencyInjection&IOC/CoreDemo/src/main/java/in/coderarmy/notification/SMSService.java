package in.coderarmy.notification;

public class SMSService implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("SMS is sent");
    }
}

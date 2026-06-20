package in.coderarmy;

import in.coderarmy.notification.PopUpNotificationService;
import in.coderarmy.notification.EmailService;
import in.coderarmy.notification.SMSService;

public class Main {
    public static void main(String args[]) {
//        OrderService order = new OrderService();
//        order.placeOrder();
        // dependency hona normal hai
        // order service -> business logic hai which cannot contains object creation
//        SMSService notification = new SMSService();
//        OrderService order = new OrderService(notification);
//        order.placeOrder();

//        EmailService notification = new EmailService();
//        OrderService order = new OrderService(notification);
//        order.placeOrder();

        PopUpNotificationService notification = new PopUpNotificationService();
        OrderService order = new OrderService(notification);
        order.placeOrder();

        // agar bahut saari service ho jayegi toh main hamara bohot complicated ho jayega
        // dont create your own dependency , but get your own dependency
        // spring core -> saari dependency yeh manage karega , dependecy khud laake dega
        // a class should ask what it needs , but not build it itself (spring core )
        // dependency injection ko spring core automate karta hai (part nahi hai)

        // if dependency is injected by using setter injection
        OrderService order1 = new OrderService();
        order1.placeOrder();
    }
}

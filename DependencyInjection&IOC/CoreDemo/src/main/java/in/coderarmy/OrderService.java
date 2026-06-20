package in.coderarmy;

import in.coderarmy.notification.NotificationService;
import in.coderarmy.notification.SMSService;

public class OrderService {
    NotificationService notification;

    // using constructor
    public OrderService(NotificationService notification){
        this.notification = notification;
    }

    // using setter
    public void setNotification(NotificationService notification){
        this.notification = notification;
    }
    public OrderService(){
    }
    public void placeOrder(){
        System.out.println("Order is placed");
        // notification.sendNotification();
        // abhi bhi tight coupling hai kyuki order ke andar wahi sab chiz hone chahiye jo orders ko manage karne ke liye chahiye
        // manageOrder()
        notification.sendNotification();
    }
}

// dependency injection is further classified into two types
// using constructor
// using setter method
// using field injection (we will be talking about letter)

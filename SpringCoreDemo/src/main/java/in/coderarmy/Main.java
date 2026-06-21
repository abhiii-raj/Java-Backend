package in.coderarmy;

import in.coderarmy.random.abhi.raj.NotificationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
         // OrderService order = new OrderService(new PaymentService());
         // order.placeOrder();
        /*
            but I wanted this dependency should be injected
            using springframework / spring core
         */
        /*
            SpringBoot -> automatically configures the things
            SpringMVC -> used for creating web applications
            Normally programs -> objects
            SpringFramework(IOC) Container -> Beans
         */
        Class<AppConfig> clazz = AppConfig.class;
        ApplicationContext context = new AnnotationConfigApplicationContext(clazz);
        /*
            An Ioc container has been made using annotation based configuration
            and all the rules are in app config class which i have provided the metadata
        */

        /*
            OrderService order = context.getBean(OrderService.class);
            order.placeOrder();

            PaymentService payment = context.getBean(PaymentService.class);
            payment.pay();

            NotificationService notify = context.getBean(NotificationService.class);
            notify.notification();
         */

        /*
            Constructor dependency injection
            OrderService order = context.getBean(OrderService.class);
            order.placeOrder();
         */

        /*
            Setter dependency injection
            OrderService order = context.getBean(OrderService.class);
            order.placeOrder();
         */

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();
    }
}

package in.coderarmy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private PaymentService payment;
//
//    @Autowired
//    public OrderService(PaymentService payment) {
//        this.payment = payment;
//    }
//    @Autowired
//    public void setPaymentService(PaymentService payment){
//        this.payment = payment;
//    }

    public void placeOrder(){
        payment.pay();
        System.out.println("Order is placed");
    }
}

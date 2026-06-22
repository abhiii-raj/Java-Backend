package in.coderarmy;

import in.strikes.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.coderarmy")
public class AppConfig {
    // iss method ko springframework call karega user ke object ko receive karne ke liye
    @Bean
    // ye bean annotation hamare spring ko batati hai jab tum app configuration ke rule ko read kar rhe hoge , jo bean laga hoga unn methods ko call karna, tumhe ek object return mein milega aur uss object ko apne ioc container mein store kar lena
    public User createUser(){
        return new User("Abhi", 21);
    }

    @Bean
    public CartService createCartService(){
        return new CartService();
    }

}

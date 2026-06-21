package in.coderarmy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // to mark it as configuration file
@ComponentScan("in.coderarmy") // scan all the classes which is marked as component in the entire project/packagename
public class AppConfig {
    //empty
}

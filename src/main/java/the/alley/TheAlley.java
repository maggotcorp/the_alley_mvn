package the.alley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
//@EnableOpenApi //Enable open api 3.0.3 spec
public class TheAlley {
    public static void main(String[] args) {
            SpringApplication.run(TheAlley.class, args);
    }
    //Docket test = SpringFoxConfig.api();
}
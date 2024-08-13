package the.alley.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import the.alley.service.EngineService;

@Configuration
public class SpringFoxConfig {
    @Bean
    public EngineService engineService() {
        return new EngineService(); // rtest
    }
}

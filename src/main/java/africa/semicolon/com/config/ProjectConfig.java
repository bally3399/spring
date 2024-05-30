package africa.semicolon.com.config;

import africa.semicolon.com.services.HelloServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Configuration
@ComponentScan(basePackages = "africa.semicolon.com")
public class ProjectConfig {
    @Bean
    public HelloServices helloServices() {
        return new HelloServices();
    }
    @Bean
    public BigDecimal bigDecimal(){
        return new BigDecimal(200);
    }

}

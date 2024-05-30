package africa.semicolon.com;

import africa.semicolon.com.config.ProjectConfig;
import africa.semicolon.com.services.HelloServices;
import africa.semicolon.com.services.MailServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("bean in context:"+ Arrays.toString(context.getBeanDefinitionNames()));

        HelloServices helloServices = context.getBean(HelloServices.class);
        helloServices.sayHello("Bim bim");

        BigDecimal amount = context.getBean(BigDecimal.class);
        System.out.println(amount);

        MailServices mailServices = context.getBean(MailServices.class);
        mailServices.sendMailTo("sulaimabaliqis@gmail.com");
    }
}
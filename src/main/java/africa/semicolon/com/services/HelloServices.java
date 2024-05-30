package africa.semicolon.com.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServices {
    public void sayHello(String name) {
        System.out.println("Hello " + name+ "!");
    }

}

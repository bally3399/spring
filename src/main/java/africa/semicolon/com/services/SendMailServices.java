package africa.semicolon.com.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SendMailServices implements MailServices{

    private final HelloServices helloServices;


    public SendMailServices(HelloServices helloServices){
        System.out.println("creating hello service");
        this.helloServices = helloServices;
    }
    @Override
    public void sendMailTo(String mail) {
        helloServices.sayHello(mail);
        System.out.println("mail sent to "+ mail+"using sendgrid");
    }
}

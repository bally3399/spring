package africa.semicolon.com.services;

import org.springframework.stereotype.Repository;

@Repository

public class MailGunMailServices implements MailServices {
    @Override
    public void sendMailTo(String mail) {
        System.out.println("mail sent to "+ mail+" using sendgrid");
    }


}

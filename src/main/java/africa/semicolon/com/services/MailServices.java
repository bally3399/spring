package africa.semicolon.com.services;


import org.springframework.stereotype.Repository;

@Repository
public interface MailServices {
void sendMailTo(String mail);
}

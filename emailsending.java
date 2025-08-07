
package project;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
public class emailsending {
    public static void sendEmail(String to, String subject, String messageText) {
        final String from = "alixie95@gmail.com"; // your Gmail
        final String password = "lgyu kjcw xamw zfcy"; // app password

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); 
        props.put("mail.smtp.port", "587");              
        props.put("mail.smtp.auth", "true");             
        props.put("mail.smtp.starttls.enable", "true");  

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(messageText);

            Transport.send(message);
            System.out.println("Email Sent Successfully");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
   

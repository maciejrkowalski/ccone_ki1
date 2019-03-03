package pl.zlapkontakt.ccone_1.ccone_ki1;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

public class TransactionalEmailSender {

    public static void sendEmailWithAttachment(String to, String subject, String htmlBody, String filePath, String fileNameCsv) throws Exception {

        // Sender's email ID needs to be mentioned
        String from = "kontakt@zlapkontakt.pl";

        final String username = "kontakt@zlapkontakt.pl";//change accordingly
        final String password = "Bialykon16!";//change accordingly

        // Assuming you are sending email through relay.jangosmtp.net
        String host = "az-serwer1713145.online.pro";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "25");

        // Get the Session object.
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.

            message.setFrom(new InternetAddress(from, "Zespół zlapkontakt.pl"));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            // Set Subject: header field
            message.setSubject(subject);

            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Now set the actual message
            messageBodyPart.setContent(htmlBody, "text/html; charset=utf-8");

            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment
            String filename = filePath;
            File file = new File(filePath);

            messageBodyPart = new MimeBodyPart();

//            ((MimeBodyPart) messageBodyPart).attachFile(file,"text/csv","UTF-8");
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(fileNameCsv);

            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);

            // Send message
            Transport.send(message);

            System.out.println("Wysłano e-mail na adres " + to);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }


    }

    public static void sendEmail(String to, String subject, String htmlBody) throws Exception {

        // Sender's email ID needs to be mentioned
        String from = "kontakt@zlapkontakt.pl";

        final String username = "kontakt@zlapkontakt.pl";//change accordingly
        final String password = "Bialykon16!";//change accordingly

        // Assuming you are sending email through relay.jangosmtp.net
        String host = "az-serwer1713145.online.pro";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "25");

        // Get the Session object.
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.

            message.setFrom(new InternetAddress(from, "Zespół zlapkontakt.pl"));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            // Set Subject: header field
            message.setSubject(subject);
//            message.setContent(htmlBody, "text/html; charset=utf-8");
            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Now set the actual message
//            messageBodyPart.setText(htmlBody);
            messageBodyPart.setContent(htmlBody, "text/html; charset=utf-8");
            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);

            // Send message
            Transport.send(message);

            System.out.println("Wysłano e-mail na adres " + to);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }


    }
}

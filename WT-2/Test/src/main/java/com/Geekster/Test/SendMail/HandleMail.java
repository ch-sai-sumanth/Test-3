package com.Geekster.Test.SendMail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class HandleMail {

    public void sendMail(String messege){

        //host : gmail is smtp :
        String host  = "smtp.gmail.com";

        Properties props = System.getProperties();

        System.out.println(props);

        //set properties :

        props.put("mail.smtp.host",host);
        props.put("mail.smtp.port","465");
        props.put("mail.smtp.ssl.enable","true");
        props.put("mail.smtp.auth","true");


        //session
        Session mailSession = Session.getInstance(props,new MailAuthenticator());

        //create the message object

        MimeMessage mimeMessage = new MimeMessage(mailSession);


        try {

            //sender
            mimeMessage.setFrom(org.geekster.MailConstants.SENDER);

            //receiver
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(org.geekster.MailConstants.RECEIVERMAILADDRESS));

            //subject
            mimeMessage.setSubject(org.geekster.MailConstants.SUBJECT);

            mimeMessage.setText(messege);

            Transport.send(mimeMessage);

        } catch (MessagingException e) {
            e.printStackTrace();
        }





    }
}

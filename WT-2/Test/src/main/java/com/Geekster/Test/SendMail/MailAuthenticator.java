package com.Geekster.Test.SendMail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication()
    {

        return new PasswordAuthentication(org.geekster.MailConstants.SENDER, "wugilhuhtzxcbvif");
    }




}

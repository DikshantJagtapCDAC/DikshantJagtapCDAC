package org.fi.restjpa.RestJPA.services;

import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;

public class MailServiceImpl implements MailService {
	
	@Autowired
	JavaMailSender javaMailSender;

	@Override
	public void sendMail(String to, String subject, String Contents) {
		
		try {
			
			MimeMessage email = javaMailSender.createMimeMessage();
			email.setSubject(subject);
			email.addFrom(new InternetAddress[] {new InternetAddress("patna.boot@frankelsinfotech.com")});
			email.addRecipient(RecipientType.TO, new InternetAddress(to));
			email.setContent(Contents, "text/html");
			javaMailSender.send(email);

			}catch(AddressException e) {
				e.printStackTrace();
			}catch(MailException e) {
				e.printStackTrace();
			}catch(MessagingException e) {
				e.printStackTrace();
			}
	}

}

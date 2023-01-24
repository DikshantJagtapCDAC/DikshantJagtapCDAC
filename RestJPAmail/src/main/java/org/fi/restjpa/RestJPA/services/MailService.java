package org.fi.restjpa.RestJPA.services;

public interface MailService {
	public void sendMail(String to, String subject,String Contents);
}

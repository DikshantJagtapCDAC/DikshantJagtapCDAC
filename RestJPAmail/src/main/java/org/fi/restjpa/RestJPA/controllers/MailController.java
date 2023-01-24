package org.fi.restjpa.RestJPA.controllers;

import org.fi.restjpa.RestJPA.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController 
{
	@Autowired
	MailService mailService;
	
	@PostMapping("/sendMail")
	public void sendMail(@RequestParam("to") String to, @RequestParam("subject") String subject,@RequestParam("contents")String contents)
	{
		mailService.sendMail(to, subject, contents);
	}

}

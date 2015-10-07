package com.endava.intern.marketplace.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endava.intern.marketplace.mail.MailSender;
import com.endava.intern.marketplace.mail.MockMailSender;

@RestController
public class MailController {
	
	private MailSender mailsender = new MockMailSender();
	
	@RequestMapping("/mail")
	public String hello(){
		
		mailsender.send("vioo@mail.com", "Mail's subject", "the content");
		
		return "Mail Sent";
		
	}
	
	
	
}

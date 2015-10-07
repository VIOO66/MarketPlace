package com.endava.intern.marketplace.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfig {

	@Bean
	public MailSender mockMailSender(){
		return new MockMailSender();
	}
	
	@Bean
	public MailSender simpleMailSender(){
		return new SimpleMailSender();
	}
	
}

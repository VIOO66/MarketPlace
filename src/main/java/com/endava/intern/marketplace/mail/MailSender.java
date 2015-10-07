package com.endava.intern.marketplace.mail;

public interface MailSender {

	void send(String to, String subject, String body);

}
package com.endava.intern.marketplace.mail;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.apache.commons.logging.Log;

//@Primary
//@Component
//@Qualifier("simpleMailSender")
public class SimpleMailSender implements MailSender {

	private static final Log logger = LogFactory.getLog(SimpleMailSender.class);
	/* (non-Javadoc)
	 * @see com.endava.intern.marketplace.mail.MailSender#send(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void send(String to, String subject, String body){
		logger.info("Sending smtp mail to: " + to);
		logger.info("Subject: "+subject);
		logger.info("Body :"+body);
	}
}

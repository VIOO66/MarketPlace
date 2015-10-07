package com.endava.intern.marketplace.core;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endava.intern.marketplace.mail.MailSender;

@Controller
public class HelloController {
	

	private MailSender mailSender;

	@Autowired
	public HelloController(@Qualifier("simpleMailSender") MailSender mailSender){
		this.mailSender = mailSender;
	}
	

	@RequestMapping("/home")
	public String home(Model model){
		String car = "shevalet";
		mailSender.send("vioo@mail.com", "Mail's subject", "the content");
		
		model.addAttribute("car", car);
		return "index";
		
	}

}

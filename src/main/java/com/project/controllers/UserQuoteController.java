package com.project.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class UserQuoteController {
	@RequestMapping("/createQuote")
	public String createQuote() {
		return "createQuotePage";
	}
	
	@RequestMapping("/retrieveQuote")
	public String retrieveQuote() {
		return "retrieveQuotePage";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession httpSession) {
		httpSession.invalidate();
		return "homePage";
	}
}

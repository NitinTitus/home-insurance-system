package com.project.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.project.dao.QuoteDao;
import com.project.to.Quote;

@Controller
@EnableWebMvc
public class QuoteController {
	@Autowired
	private QuoteDao quoteDao;
	
	@RequestMapping("/getQuote")
	public String getQuote(Model model, HttpSession httpSession) {
		Quote quote = quoteDao.getQuote(httpSession);
		if(quote==null) {
			model.addAttribute("quoteMessage","Fill the location, owner and property details first!");
		}
		model.addAttribute("quote",quote);
		return "quotePage";
	}
	
	@RequestMapping("/getRetrieveQuote")
	public String retrieveQuote(Model model, HttpSession httpSession) {
		quoteDao.retrieveQuote(model, httpSession);
		return "getRetrieveQuotePage";
	}
	
	@RequestMapping("/getQuoteSummary")
	public String quoteSummary(Model model, HttpSession httpSession) {
		quoteDao.retrieveQuote(model, httpSession);
		return "getQuoteSummaryPage";
	}
	
	
}

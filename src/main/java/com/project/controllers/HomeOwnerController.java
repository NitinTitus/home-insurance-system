package com.project.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.project.dao.HomeOwnerDao;
import com.project.to.HomeOwner;

@Controller
@EnableWebMvc
public class HomeOwnerController {
	@Autowired
	private HomeOwnerDao homeOwnerDao;
	
	@RequestMapping("/userOwner")
	public String locationPage(Model model) {
		model.addAttribute("homeOwnerObject", new HomeOwner());
		return "homeOwnerPage";
	}
	
	@RequestMapping("/addHomeOwner")
	public String addLocation(@Valid @ModelAttribute("homeOwnerObject") HomeOwner owner, BindingResult bindingResult, HttpSession httpSession, Model model) {
		if(bindingResult.hasErrors()) {
			return "homeOwnerPage";
		}
		homeOwnerDao.addHomeOwner(owner, httpSession);
		model.addAttribute("savedHomeStatus","Home Owner details saved succesfully!");
		return "homeOwnerPage";
	}
}

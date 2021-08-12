package com.project.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.validation.BindingResult;

import com.project.dao.PropertyDao;
import com.project.to.Property;

@Controller
@EnableWebMvc
public class PropertyController {
	@Autowired
	private PropertyDao propertyDao;
	
	@RequestMapping("/userProperty")
	public String propertyPage(Model model) {
		model.addAttribute("userPropertyObject", new Property());
		return "userPropertyPage";
	}
	
	@RequestMapping("/addProperty")
	public String addLocation(@Valid @ModelAttribute("userPropertyObject") Property property, BindingResult bindingResult, HttpSession httpSession, Model model) {
		if(bindingResult.hasErrors()) {
			return "userPropertyPage";
		}
		propertyDao.addProperty(property, httpSession);
		model.addAttribute("savedPropertyStatus","Property details saved succesfully!");
		return "userPropertyPage";
	}
}

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

import com.project.dao.LocationDao;
import com.project.to.Location;

@Controller
@EnableWebMvc
public class LocationController {
	@Autowired
	private LocationDao locationDao;
	
	@RequestMapping("/userLocation")
	public String locationPage(Model model) {
		model.addAttribute("userLocationObject", new Location());
		return "userLocationPage";
	}
	
	@RequestMapping("/addLocation")
	public String addLocation(@Valid @ModelAttribute("userLocationObject") Location location, BindingResult bindingResult, HttpSession httpSession, Model model) {
		if(bindingResult.hasErrors()) {
			return "userLocationPage";
		}
		locationDao.addLocation(location, httpSession);
		model.addAttribute("savedStatus","Location details saved succesfully!");
		return "userLocationPage";
	}
}

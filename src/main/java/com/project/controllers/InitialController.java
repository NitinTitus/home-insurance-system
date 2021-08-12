package com.project.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.project.dao.AdminDao;
import com.project.dao.UserDao;
import com.project.to.Admin;
import com.project.to.AdminUser;
import com.project.to.Policy;
import com.project.to.User;

@Controller
@EnableWebMvc
public class InitialController {

	@Autowired
	UserDao userDao;
	
	@Autowired
	AdminDao adminDao;
	
	@RequestMapping("/")
	public String getHomePage() {
		return "homePage";
	}
	
	@RequestMapping("/home")
	public String returnHomePage() {
		return "homePage";
	}
	
	@RequestMapping("/userLogin")
	public String userLogin(Model model) {
		model.addAttribute("user",new User());
		return "userLoginPage";
	}
	
	@RequestMapping("/newUserLogin")
	public String newUserLogin(@Valid @ModelAttribute("user")User user, BindingResult bindingResult, Model model, HttpSession httpSession) {
		if(bindingResult.hasErrors()) {
			return "userLoginPage";
		}
		int status = userDao.validateUser(user);
		if(status==-1) {
			model.addAttribute("message","Wrong credentials entered!");
			return "userLoginPage";
		}
		else {
			httpSession.setAttribute("userId",status);
			return "initialPage";
		}
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(Model model) {
		model.addAttribute("userRegister",new User());
		return "registerUserPage";
	}
	
	@RequestMapping("/addUser")
	public String addUser(@Valid @ModelAttribute("userRegister")User user, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "registerUserPage";
		}
		String message = userDao.addUser(user);
		model.addAttribute("registerMessage", message);
		return "registerUserPage";
	}
	
	@RequestMapping("/initialPage")
	public String getInitialPage() {
		return "initialPage";
	}
	
	@RequestMapping("/adminLogin")
	public String adminLogin(Model model) {
		model.addAttribute("admin",new Admin());
		return "adminLoginPage";
	}
	
	@RequestMapping("/newAdminLogin")
	public String newAdminLogin(@Valid @ModelAttribute("admin")Admin admin, BindingResult bindingResult, Model model, HttpSession httpSession) {
		if(bindingResult.hasErrors()) {
			return "adminLoginPage";
		}
		int status = adminDao.validateAdmin(admin);
		if(status==-1) {
			model.addAttribute("adminMessage","Wrong credentials entered!");
			return "adminLoginPage";
		}
		else {
			httpSession.setAttribute("adminId",status);
			adminDao.getUsers(httpSession);
			model.addAttribute("adminUser",new AdminUser());
			return "adminLoginSelectPage";
		}
	}
	
	@RequestMapping(value="adminLoginSelect",method = RequestMethod.POST)
	public String adminLoginSelectPost(@ModelAttribute("adminUser") AdminUser adminUser, HttpSession httpSession) {
		httpSession.setAttribute("userId", adminUser.getUserId());
		return "initialPage";
	}
	
}

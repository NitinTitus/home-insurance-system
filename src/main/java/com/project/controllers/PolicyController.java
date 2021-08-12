package com.project.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.project.dao.PolicyDao;
import com.project.to.Policy;

@Controller
@EnableWebMvc
public class PolicyController {

	@Autowired
	PolicyDao policyDao;
	
	@RequestMapping("/buyPolicy")
	public String buyPolicy(Model model) {
		model.addAttribute("userPolicyObject", new Policy());
		return "buyPolicyPage";
	}
	
	@RequestMapping("/addPolicy")
	public String addPolicy(@ModelAttribute("userPolicyObject")Policy policy, Model model, HttpSession httpSession) {
		policyDao.buyPolicy(policy, httpSession);
		model.addAttribute("policyMessage","Policy bought succesfully!");
		return "buyPolicyPage";
	}
	
	@RequestMapping("/viewPolicy")
	public String viewPolicy(HttpSession httpSession,Model model) {
		Policy policy = policyDao.getPolicy(httpSession);
		if(policy==null) {
			model.addAttribute("policyBuy","Buy policy before viweing the details!");
		}
		model.addAttribute("policy",policy);
		return "viewPolicyPage";
	}
	
	@RequestMapping("/renewPolicy")
	public String renewPolicy(HttpSession httpSession,Model model) {
		Policy policy = policyDao.renewPolicy(httpSession);
		model.addAttribute("policy",policy);
		return "viewPolicyPage";
	}
	
	@RequestMapping("/cancelPolicy")
	public String cancelPolicy(HttpSession httpSession,Model model) {
		Policy policy = policyDao.cancelPolicy(httpSession);
		model.addAttribute("policy",policy);
		return "viewPolicyPage";
	}
	
	@RequestMapping(value = "editPolicyTerms", method = RequestMethod.GET)
	public String editPolicyTerms(Model model,HttpSession hsession) {	
		return "editPolicyTermPage";
	}
	
	@RequestMapping(value = "editPolicyTerms", method = RequestMethod.POST)
	public String editPolicyTerms(@RequestParam String newPolicyTerms, Model model,HttpSession hsession) {	
		Policy policy = policyDao.updateTerms(newPolicyTerms, hsession);
		model.addAttribute("policy",policy);
		return "viewPolicyPage";
	}
}

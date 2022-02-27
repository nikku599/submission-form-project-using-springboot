package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@Autowired
	CustomerRepo repo;
	
	@RequestMapping("/")
	public String redirect() {
		return "edureka";
	}
	@RequestMapping("/details")
	public String details(Customers customers) {
		repo.save(customers);
		return "edureka";
	}
	
	@RequestMapping("/getdetails")
	public String getDetails() {
		return "viewCustomer";
	}
	
	@PostMapping("/back")
	public String backButton() {
		return "redirect:edureka";
	}
	
	@GetMapping("/edureka")
	public String edureka() {
		return "edureka";
	}
	@PostMapping("/getdetails")
	public ModelAndView getdetails(@RequestParam int cid) {
		
		ModelAndView mv = new ModelAndView("Retrive");
		Customers customer = repo.findById(cid).orElse(null);
		mv.addObject(customer);
		return mv;
		
		
	}
	
}

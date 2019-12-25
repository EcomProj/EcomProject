package com.SpringBootwebApplication.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	
	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		System.out.println("Wel come Controller Executed!!");
		return new ModelAndView("welcome");
	}
	
	
	@RequestMapping("/showcustomer")
	public ModelAndView secondPage() {
		
		System.out.println("second page Executed!!");
		
		return new ModelAndView("showcustomer");
	}

}

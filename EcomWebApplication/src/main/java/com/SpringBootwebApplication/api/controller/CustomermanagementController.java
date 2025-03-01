package com.SpringBootwebApplication.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootwebApplication.api.model.Customer;
import com.SpringBootwebApplication.api.service.CustomerService;
import com.google.gson.Gson;

@RestController
public class CustomermanagementController {
	
@Autowired
private CustomerService service;

//addcustomer
	@RequestMapping("/getcustomer")
	public String getcustomer() {
		System.out.println("Get Customer");
		Gson gson = new Gson();
		List<Customer> list= service.getcustomer();
		return gson.toJson(list);
	}
	
	@RequestMapping("/addcustomer")
	public ModelAndView addcustomer() {
		System.out.println("Add customer Page!!!");
		return new ModelAndView("addcustomer");
	}
}

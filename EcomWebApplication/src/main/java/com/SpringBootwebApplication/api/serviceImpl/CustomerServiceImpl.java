package com.SpringBootwebApplication.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootwebApplication.api.dao.CustomerDao;
import com.SpringBootwebApplication.api.model.Customer;
@Service
public class CustomerServiceImpl implements com.SpringBootwebApplication.api.service.CustomerService {
	
@Autowired
private CustomerDao dao;

	@Override
	public List<Customer> getcustomer() {
		return dao.getcustomer();
	}

}

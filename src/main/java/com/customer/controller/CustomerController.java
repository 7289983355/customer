package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.customerService.CustomerService;
import com.customer.reqModel.CustomReq;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("api/v1/customer")
public class CustomerController {
	
	
	private final CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService ){
		this.customerService =customerService;	
	}
	
	
	@PostMapping("/register")
	public void registerCustomer(@RequestBody CustomReq  customReq) {
		
		log.info("new customer registration {} " ,customReq);
		
		customerService.buidCustomer(customReq);
		
	}

}

package com.netbanking.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.pojo.Customer;
import com.netbanking.main.service.CustomerServiceInterface;

@RestController
@CrossOrigin(origins="")
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerServiceInterface customerServiceInterface;

	@RequestMapping(value = "customer", method = RequestMethod.POST)
	public boolean addNewEmployee( Customer customer) {
		return customerServiceInterface.addNewCustomer(customer);
	}
	
	@RequestMapping(value="",method = RequestMethod.PUT)
	public boolean updateCustomer(Customer customer) {
		return customerServiceInterface.updateCustomer(customer);
	} 
	
	@RequestMapping(value="",method = RequestMethod.DELETE)
	public boolean deleteCustomerByCustomerId(int customerId) {
		return customerServiceInterface.deleteCustomerByCustomerId(customerId);
	}
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public Customer getCustomerByCustomerId(int customerId){
		return customerServiceInterface.getCustomerByCustomerId(customerId)	;
	}
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public List<Customer> getAllCustomer(){
		return customerServiceInterface.getAllCustomer();
		
	}

	
	
	
}

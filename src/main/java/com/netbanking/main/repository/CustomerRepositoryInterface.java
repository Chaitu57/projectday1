package com.netbanking.main.repository;

import java.util.List;

import com.netbanking.main.pojo.Customer;

public interface CustomerRepositoryInterface {

	public boolean addNewCustomer(Customer customer);

	public boolean updateCustomer(Customer customer);

	public boolean deleteCustomerByCustomerId(int customerId);

	public Customer getCustomerByCustomerId(int customerId);

	public List<Customer> getAllCustomer();

}

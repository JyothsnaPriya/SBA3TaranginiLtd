package com.verizon.adb.service;

import java.util.List;

import com.verizon.adb.model.Customer;
import com.verizon.adb.model.Packages;
import com.verizon.adb.model.Packages;

public interface CustomerService {

	Customer addCustomer(Customer customer);

	List<Customer> getAllCustomers();
	

	
}

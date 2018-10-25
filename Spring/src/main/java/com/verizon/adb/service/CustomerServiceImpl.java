package com.verizon.adb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.adb.dao.PackageRepository;
import com.verizon.adb.dao.CustomerRepository;
import com.verizon.adb.dao.CustomerRepository;
import com.verizon.adb.model.Customer;
import com.verizon.adb.model.Packages;

@Service 
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository csm;

	@Override
	public Customer addCustomer(Customer customer) {
		
		return csm.save(customer);
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		
		return csm.findAll();
	}

}

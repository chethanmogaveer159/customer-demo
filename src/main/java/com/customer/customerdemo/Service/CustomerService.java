package com.customer.customerdemo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.customerdemo.Entity.Customer;
import com.customer.customerdemo.Repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public  List<Customer> getAllCustomer(){
		List<Customer> customers=new ArrayList<>();
		customers=customerRepository.findAll();
		return customers;
	}
	
	public Customer addCustomer(Customer customer) {
		customer=customerRepository.save(customer);
		return customer;
	}
	
	public Optional<Customer> getCustomer(int id){
		return customerRepository.findById(id);
	}
	
	public Customer updateCustomer(Customer customer, int id){
		if(id == customer.getId()) {
			return customerRepository.save(customer);
		}
		return customer;
	}
	
	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}
}

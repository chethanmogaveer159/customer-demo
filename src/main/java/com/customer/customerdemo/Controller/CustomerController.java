package com.customer.customerdemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.customerdemo.Entity.Customer;
import com.customer.customerdemo.Service.CustomerService;
@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping(value = "/customers")
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	
	 @GetMapping(value="/customers/{id}") 
	 public Optional<Customer> getCustomer(@PathVariable int id){ 
		 return customerService.getCustomer(id); 
	 }
	 
	@PostMapping("/addCustomer")
	public void addEmployees(@RequestBody Customer customer){
		customerService.addCustomer(customer);
	}
	
	@PutMapping("/customers/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable int id){
		return customerService.updateCustomer(customer, id);
	}
	
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}
}

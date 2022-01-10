package com.customer.customerdemo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.customer.customerdemo.Entity.Customer;

@SpringBootTest
class CustomerDemoApplicationTests {
	Customer customer=new Customer();
	@Test
	@DisplayName("Created customer Test")
	void createCustomer() {
		System.out.println("New Customer Added");
	}
	
	@Test
	@DisplayName("Extracting Customers Test")
	void extractCustomer() {
		System.out.println("Customers can be Extracted");
	}

}

package com.customer.customerdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.customerdemo.Entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
}

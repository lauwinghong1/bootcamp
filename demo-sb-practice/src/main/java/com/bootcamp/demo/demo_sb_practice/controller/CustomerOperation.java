package com.bootcamp.demo.demo_sb_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.demo_sb_practice.dto.HSBCCustomerDTO;
import com.bootcamp.demo.demo_sb_practice.entity.CustomerEntity;
import com.bootcamp.demo.demo_sb_practice.model.Customer;

public interface CustomerOperation {
  @PostMapping(value = "/customer")
  CustomerEntity createCustomer(@RequestBody Customer customer);

  //localhost:8099/customer?id=1
  @GetMapping(value = "/hsbc/customer")
  HSBCCustomerDTO getCustomer(@RequestParam Long id); 
}

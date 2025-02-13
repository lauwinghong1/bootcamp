package com.bootcamp.demo.demo_sb_practice.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_practice.controller.CustomerOperation;
import com.bootcamp.demo.demo_sb_practice.dto.HSBCCustomerDTO;
import com.bootcamp.demo.demo_sb_practice.entity.CustomerEntity;
import com.bootcamp.demo.demo_sb_practice.model.Customer;
import com.bootcamp.demo.demo_sb_practice.service.CustomerService;

@RestController // remember it! Without this, it cannot create Bean!
public class CustomerController implements CustomerOperation {
  @Autowired
  private CustomerService customerService;

  @Override
  public CustomerEntity createCustomer(Customer customer){
    return customerService.createCustomer(customer);
  }

  @Override
  public HSBCCustomerDTO getCustomer(Long id){
    // Call Service
    CustomerEntity customerEntity = customerService.getCustomer(id);
    // Convert Entity to DTo
    return HSBCCustomerDTO.builder()
      .email(customerEntity.getEmail())
      .build();
  }

}

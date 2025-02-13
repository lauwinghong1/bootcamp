package com.bootcamp.demo.demo_sb_practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.demo_sb_practice.entity.CustomerEntity;
import com.bootcamp.demo.demo_sb_practice.model.Customer;
import com.bootcamp.demo.demo_sb_practice.reposity.CustomerRepository;
import com.bootcamp.demo.demo_sb_practice.service.CustomerService;

@Service

public class CustomerServiceImpl implements CustomerService{
  @Autowired
  private CustomerRepository customerRepository;

  @Override
  public CustomerEntity createCustomer(Customer customer){
    CustomerEntity customerEntity = CustomerEntity.builder()
      .name(customer.getName())
      .email(customer.getEmail())
      .build();
    // save customer to db
    return customerRepository.save(customerEntity);
  }

  @Override
  public CustomerEntity getCustomer(Long id){
    return customerRepository.findById(id).orElse(null);
  }
}

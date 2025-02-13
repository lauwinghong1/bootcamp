package com.bootcamp.demo.demo_sb_practice.service;

import com.bootcamp.demo.demo_sb_practice.entity.CustomerEntity;
import com.bootcamp.demo.demo_sb_practice.model.Customer;

public interface CustomerService {
  CustomerEntity createCustomer(Customer customer);
  CustomerEntity getCustomer(Long id);
}

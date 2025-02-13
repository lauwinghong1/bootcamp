package com.bootcamp.demo.demo_sb_practice.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_practice.controller.OrderOperation;
import com.bootcamp.demo.demo_sb_practice.service.OrderService;

@RestController // remember it! Without this, it cannot create Bean!

public class OrderController implements OrderOperation{
  @Autowired
  private OrderService orderService;
}

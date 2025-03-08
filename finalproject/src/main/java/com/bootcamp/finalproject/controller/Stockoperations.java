package com.bootcamp.finalproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.finalproject.model.Stock;

public interface Stockoperations {
 @PostMapping(value = "/finalproj/{stock}")
  public String getstock(@RequestParam Long id);
  
} 
package com.bootcamp.finalproject.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.finalproject.controller.Stockoperations;
import com.bootcamp.finalproject.model.Stock;

@Controller
@ResponseBody
@RequestMapping(value = "/v1")

public class StockController implements Stockoperations{

  @Override
  public String getstock(@RequestParam Long id) {
    String key = 
    return;
  }

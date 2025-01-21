package com.bootcamp.web.demo_springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.web.demo_springweb.model.Dog;

@Controller // remember it!  It does new class, call mathod by web link submitted, automatically
@ResponseBody // remember it!
@RequestMapping(value = "/v1") // On post
public class AnimalController {
  
  @GetMapping(value = "/dog/{age}/{name}")
  public Dog getDog(@PathVariable String age, @PathVariable String name) {
    int dogAge = -1;
    try {
      dogAge = Integer.parseInt(age);
    } catch (NumberFormatException e){
      return new Dog(null, -1);
    }
    return new Dog(name, dogAge);
  }
}

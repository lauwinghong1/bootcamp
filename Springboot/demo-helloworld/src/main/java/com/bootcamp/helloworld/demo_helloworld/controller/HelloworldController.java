package com.bootcamp.helloworld.demo_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   // remember it!
@ResponseBody  // remember it!
public class HelloworldController {
  @GetMapping(value = "/helloworld")
  public String helloworld(){
    return "Hello World!";
  }
  
}

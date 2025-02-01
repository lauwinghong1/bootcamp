package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   // remember it!
@ResponseBody  // remember it!
public class GoodbyeController {
  @GetMapping(value = "/goodbyeworld")
  
  public String goodbye() {
    return ("<h1> Goodbye! </h1>");
  }
  
}

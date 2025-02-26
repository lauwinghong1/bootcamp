package com.bootcamp.goodbye.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Goodbye {
  @GetMapping(value = "/tg2/goodbye")
  public String helloworld() {
    return "Goodbye !";
  }
}

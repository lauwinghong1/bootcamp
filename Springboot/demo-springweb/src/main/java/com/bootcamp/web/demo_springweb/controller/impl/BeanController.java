package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.web.demo_springweb.DemoSpringwebApplication;


@Controller // remember it! It does new class, call mathod by web link submitted, automatically
@ResponseBody // remember it!
@RequestMapping(value = "/v1") // On post
public class BeanController {
  @GetMapping(value = "/bean")
  public String[] getBean() {
    return DemoSpringwebApplication.context.getBeanDefinitionNames();
  }


}

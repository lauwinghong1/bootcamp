package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // remember it!  It does new class, call mathod by web link submitted, automatically
@ResponseBody // remember it!
@RequestMapping(value = "/v1") // On postman/web, it is presented in http://localhost:8090/v1/........
public class MathOperationController {

  @GetMapping(value = "/math/add/{x}/{y}")
  public int add(@PathVariable() int x, @PathVariable int y) {
    return (x + y);
  }

  @GetMapping(value = "/math/sub/{x}/{y}")
  public int sub(@PathVariable() int x, @PathVariable int y) {
    return (x - y);
  }

  // http://localhost:8090/v1/math/9/7
  @GetMapping(value = "/math/mult/{a}/{b}")
  public int mult(@PathVariable(value = "a") int x, @PathVariable(value = "b") int y) {
    return (x * y);
  }

  // http://localhost:8090/v1/math/mult1?x=9&y=7
  @GetMapping(value = "/math/mult1")
  public int mult1(@RequestParam int x, @RequestParam int y) {
    return (x * y);
  }

  // http://localhost:8090/v1/math/div?a=9&b=7
  @GetMapping(value = "/math/div")
  public int div(@RequestParam(value ="a") int x, @RequestParam(value="b") int y) {
    return (x / y);
  }
}

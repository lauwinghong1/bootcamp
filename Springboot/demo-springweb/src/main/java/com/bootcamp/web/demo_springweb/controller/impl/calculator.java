package com.bootcamp.web.demo_springweb.controller.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.web.demo_springweb.model.Operand;
import com.bootcamp.web.demo_springweb.model.calculatorLog;

@Controller // remember it! It does new class, call mathod by web link submitted, automatically
@ResponseBody // remember it!
@RequestMapping(value = "/v1") // On postman/web, it is presented in http://localhost:8090/v1/........

public class calculator {
  private List<calculatorLog> callog = new ArrayList<calculatorLog>();

  @GetMapping(value = "/compute/{fac1}/{opr}/{fac2}")
  public calculatorLog compute(@PathVariable() double fac1, @PathVariable String opr, @PathVariable double fac2) {
    String upperopr = opr.toUpperCase();
    Double result = 0.0;
    Operand operand = null;
    switch (upperopr) {
      case "ADD":
        result = fac1 + fac2;
        operand = Operand.ADD;
        break;
      case "SUB":
        result = fac1 - fac2;
        operand = Operand.SUB;
        break;
      case "MUL":
        result = fac1 * fac2;
        operand = Operand.MUL;
        break;
      case "DIV":
        result = fac1 / fac2;
        operand = Operand.DIV;
    }
    calculatorLog clog = new calculatorLog(fac1, operand, fac2, //
                        Math.round(result * 1000.00) / 1000.00);
    callog.add(clog);
    return (clog);
  }

  @GetMapping(value = "/showlog")
  public List<calculatorLog> showlog() {
    return (callog);
  }
}

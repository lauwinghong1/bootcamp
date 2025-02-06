package com.bootcamp.calculator1.controller.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.calculator1.controller.DatabaseOperation;
import com.bootcamp.calculator1.model.CalculatorLog;
import com.bootcamp.calculator1.model.Operand;

@Controller // remember it! It does new class, call mathod by web link submitted, automatically
@ResponseBody // remember it!
@RequestMapping(value = "/v1") // On postman/web, it is presented in http://localhost:8090/v1/........

public class Calculator implements DatabaseOperation {
  private List<CalculatorLog> callog = new ArrayList<CalculatorLog>();

  @Override
  public CalculatorLog compute(double fac1, String opr, double fac2) {
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
        if (fac2 == 0.00) {
          throw new IllegalArgumentException("Divid by 0 error");
        } else {
          result = fac1 / fac2;
          operand = Operand.DIV;
        } ;
        break;
      default:
        throw new IllegalArgumentException("Invalid operand used.");
    }
    CalculatorLog clog = new CalculatorLog(fac1, operand, fac2, //
        Math.round(result * 1000.00) / 1000.00);
    callog.add(clog);
    return (clog);
  }

  @Override
  public List<CalculatorLog> showlog() {
    return (callog);
  }

  @Override
  public CalculatorLog showrec(@PathVariable int id){
    return callog.get(id);
  }

  @Override
  public List<CalculatorLog> dellog() {
    callog.removeAll(callog);
    return (callog);

  }
}

package com.bootcamp.calculator.calculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.calculator.calculator.model.calculatorLog;

public interface databaseOperation {

  @GetMapping(value = "/compute/{fac1}/{opr}/{fac2}")
  public calculatorLog compute(@PathVariable() double fac1, //
  @PathVariable String opr, @PathVariable double fac2);
  
  @GetMapping(value = "/showlog")
  public List<calculatorLog> showlog();

}

package com.bootcamp.calculator1.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.calculator1.model.CalculatorLog;

public interface DatabaseOperation {

  @GetMapping(value = "/compute/{fac1}/{opr}/{fac2}")
  public CalculatorLog compute(@PathVariable double fac1, //
      @PathVariable String opr, @PathVariable double fac2);

  @GetMapping(value = "/showlog")
  public List<CalculatorLog> showlog();

  @GetMapping(value = "/showrec/{id}")
  public CalculatorLog showrec(@PathVariable int id);

  @DeleteMapping(value = "/dellog")
  public List<CalculatorLog> dellog();
}


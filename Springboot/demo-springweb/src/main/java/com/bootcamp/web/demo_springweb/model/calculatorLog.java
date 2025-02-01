package com.bootcamp.web.demo_springweb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class calculatorLog {
  private Double factor1;
  private Operand operand;
  private Double factor2;
  private Double result;
}

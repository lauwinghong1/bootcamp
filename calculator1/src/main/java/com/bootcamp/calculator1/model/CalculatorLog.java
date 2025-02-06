package com.bootcamp.calculator1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CalculatorLog {
  private Double factor1;
  private Operand operand;
  private Double factor2;
  private Double result;
}

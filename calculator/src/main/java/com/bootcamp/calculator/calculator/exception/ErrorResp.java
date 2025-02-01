package com.bootcamp.calculator.calculator.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ErrorResp {
  private int code;
  private String message;
}

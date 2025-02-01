package com.bootcamp.calculator.calculator.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionalHandler {
  @ExceptionHandler(value = IllegalArgumentException.class)
  public ErrorResp handleIAE(IllegalArgumentException e){
    return new ErrorResp(99, "IllegalArgumentException: "+e.getMessage());
  }
}

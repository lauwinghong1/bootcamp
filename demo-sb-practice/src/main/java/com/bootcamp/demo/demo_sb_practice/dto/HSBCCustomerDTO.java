package com.bootcamp.demo.demo_sb_practice.dto;

import lombok.Builder;
import lombok.Getter;

// ! DTO for API Consumer
@Getter
@Builder
public class HSBCCustomerDTO {
  private String email;
}

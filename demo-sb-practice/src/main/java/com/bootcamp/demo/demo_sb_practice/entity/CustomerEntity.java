package com.bootcamp.demo.demo_sb_practice.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Entity
@Table(name = "Customers")
@Builder
@Getter
public class CustomerEntity implements Serializable {
  // id, name, email
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "customer_name")
  private String name;
  @Column(name = "customer_email")
  private String email;
}

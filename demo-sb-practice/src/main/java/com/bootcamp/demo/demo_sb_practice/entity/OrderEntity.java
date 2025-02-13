package com.bootcamp.demo.demo_sb_practice.entity;


import java.io.Serializable;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// ! Avoid primitive
@Entity
@Table(name = "Orders")
public class OrderEntity implements Serializable {
  // id, name, email
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Double amount;
  @Column(name = "order_date")
  private LocalDate orderDate;

  // Foreign key
  @ManyToOne
  @JoinColumn(name = "customer_id")
  private CustomerEntity customer;
}


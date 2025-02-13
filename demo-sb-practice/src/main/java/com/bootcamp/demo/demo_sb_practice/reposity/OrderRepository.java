package com.bootcamp.demo.demo_sb_practice.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.demo.demo_sb_practice.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
  
}

package com.bootcamp.web.demo_springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.web.demo_springweb.entity.UserEntity;

// HIBERATE, jpa
// ! Spring generate class for implementing the UserRepository
public interface UserReposity extends JpaRepository<UserEntity, Long>{
  // Generation Process: based on Database products (MySQL, PostgreSQL)  
  // ! so, Hibernate 
}

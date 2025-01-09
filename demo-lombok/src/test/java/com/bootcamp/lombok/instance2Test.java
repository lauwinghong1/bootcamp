package com.bootcamp.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)

public class instance2Test {
    private boolean success;

    @Test
    @Order(1)
    void testAction1(){
      Assertions.assertEquals(3, Calender.sumup(1, 2));
      this.success=true;
    }

    @Test
    @Order(2)
    void testAction2(){
      if (this.success){
        System.out.println("Test action2");
      }
    }
  }
  
}

package com.bootcamp.lombok;

import org.junit.jupiter.api.Assertions;

// file name suffix must be "Test" or "Tests"

// Instance PER METHOD
public class instanceTest {
  private int x;

  //@Test
  void testMethod1(){
    this.x++;
    System.out.println(this.x);
    Assertions.assertEquals(3, Calender.sumup(1,2));
  }

  void testMethod2(){
    this.x++;
    System.out.println(this.x);
    Assertions.assertEquals(3, Calender.sumup(1,2));
  }

  public static void main(String[] args) {
    instanceTest aaa = new instanceTest();
    aaa.testMethod1();
    aaa.testMethod1();

  }
  }

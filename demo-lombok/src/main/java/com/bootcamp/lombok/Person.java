package com.bootcamp.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// anotation
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

// mvn clean m-> remove target folder
// mvn compile - only compile the main code only (download lib by pom.xml)
// mvn testCompile -> compile main + compile test
// mvn test -> compile main + compile test + run test
// mvn install - "mvn test" + package jar + move jar to m2
// mvn dependency:tree

public class Person {
  private String name;
  //private int age;


  public static void main(String[] args) {
    Person p1 = new Person("aa");
    Person p2 = new Person("aa");
    System.out.println(p1.equals(p2));
    System.out.println(p1.toString());


  }
  
}

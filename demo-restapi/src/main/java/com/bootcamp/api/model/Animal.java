package com.bootcamp.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Animal {
  public static Animal animals[]  =new Animal[100];

  public static boolean addAnimal(Animal animal){
    for (int i=0;i < animals.length;i++){
      if (animals[i]==null) {
        animals[i] = animal;
        return true; 
      }
    }
    return false;
  }
  private long id;
  private String name;
}

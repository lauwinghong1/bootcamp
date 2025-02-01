package com.bootcamp.web.demo_springweb.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.web.demo_springweb.controller.DatabaseOperation;
import com.bootcamp.web.demo_springweb.model.Dog;



@Controller
@ResponseBody
@RequestMapping(value = "/v1")
public class DatabaseController implements DatabaseOperation {
  private static List<Dog> dogs = new ArrayList<>();

  @Override
  public Dog createDog(String name,  int age) {
    Dog newDog = new Dog(name, age);
    DatabaseController.dogs.add(newDog);
    return newDog;
  }

  @Override
  public List<Dog> getDog() {
    return DatabaseController.dogs;
  }

  @Override
  public List<Dog> getDog( String name) {
    return DatabaseController.dogs.stream() //
        .filter(e -> e.getName().equals(name)) //
        .collect(Collectors.toList());
  }

  @Override
  public List<Dog> getDog( int age) {
    return DatabaseController.dogs.stream() //
        .filter(e -> e.getAge() == age) //
        .collect(Collectors.toList());
  }

  @Override
  public Dog updateDog(int index, Dog dog) {
    if (dogs.size() <= index || index<0){
      throw new IllegalArgumentException("Dog ID is invalid");
    }
    DatabaseController.dogs.set(index, dog);
    return dog;
  }

  @Override
  public Dog cloneDog( Dog dog) {
    DatabaseController.dogs.add(dog);
    return dog;
  }

  @Override
  public boolean deleteDog(int dogid) {
    if (dogid >= DatabaseController.dogs.size())
      return false;
    else {
      DatabaseController.dogs.remove(dogid);
      return true;
    }
  }

  // Post - create new resource
  // Put vs Patch
  // 1. Put -> find the resource by id, replace the whole resouce by id
  // 2. Patch -> find the resource by id, update one/few resource attribute
  @Override
  public boolean updateDogName(int id,  String name) {
    if (id >= DatabaseController.dogs.size() || id < 0)
      return false;
    else {
      DatabaseController.dogs.get(id).setName(name);
      return true;
    }
  }
}

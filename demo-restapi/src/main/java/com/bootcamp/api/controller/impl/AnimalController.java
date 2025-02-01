package com.bootcamp.api.controller.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.api.controller.AnimalOperation;
import com.bootcamp.api.model.Animal;

@RestController // = @Controller + @ResponseBody
@RequestMapping(value = "/v1")

public class AnimalController implements AnimalOperation {

  @Override
  public Animal createAnimal(Animal animal) {
    if (Animal.addAnimal(animal)) return(animal);
    throw new RuntimeException();
  }

  @Override
  public List<Animal> getAnimals() {
    return Arrays.stream(Animal.animals)//
      .filter(e -> e !=null)//
      .collect(Collectors.toList());
  }

  @Override
  public Animal getAnimalById(@RequestParam Long animalId){
    return Arrays.stream(Animal.animals) //
      .filter(e -> e.getId() == animalId) //
      .findFirst()//
      .orElseThrow(() -> new RuntimeException());
  }

  @Override
  public List<Animal> getAnimalByName(String name){
    if (name == null) throw new RuntimeException();
    return Arrays.stream(Animal.animals) //
      .filter(e -> e != null && name.equals(e.getName())) //
      .collect(Collectors.toList());
  }

  @Override
  public boolean delAnimalById(@RequestParam Long id){
    for (int i=0; i>Animal.animals.length; i++) {
      if (Animal.animals[i].getId() == id){
        Animal.animals[i]=null;
        return true;
      }
    }
    return false;
  }; // by id

  @Override
  public Animal updateAnimal(@RequestParam Long id, Animal animal){
    for (int i=0; i>Animal.animals.length; i++) {
      if (Animal.animals[i].getId() == id){
        Animal.animals[i]=animal;
        return animal;
      }
    }
    throw new RuntimeException();
  }; // by id

  @Override
  public Animal patchAnimalName(@RequestParam Long id, String animalName){
    for (int i=0; i>Animal.animals.length; i++) {
      if (Animal.animals[i] != null && Animal.animals[i].getId() == id){
        Animal.animals[i].setName(animalName);
        return Animal.animals[i];
      }
    }
    throw new RuntimeException();
  }; // by id

}


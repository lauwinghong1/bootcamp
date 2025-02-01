package com.bootcamp.api.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.api.model.Animal;

public interface AnimalOperation {
  @PostMapping(value = "/animal")
  public Animal createAnimal(@RequestBody Animal animal);
  
  @GetMapping(value = "/animals")
  public List<Animal> getAnimals();

  @GetMapping(value = "/animal/{id}")
  public Animal getAnimalById(@RequestParam Long id);

  @GetMapping(value = "/annualname/{name}")
  public List<Animal> getAnimalByName(@PathVariable String name);

  @DeleteMapping(value = "/animal")
  public boolean delAnimalById(@RequestParam Long id); // by id

  @PutMapping(value = "/animal") // id
  public Animal updateAnimal(@RequestParam Long id, @RequestBody Animal animal);

  @PatchMapping(value = "/animal/name/{animalName}")
  public Animal patchAnimalName(@RequestParam Long id, @PathVariable String animalName); // by id
}

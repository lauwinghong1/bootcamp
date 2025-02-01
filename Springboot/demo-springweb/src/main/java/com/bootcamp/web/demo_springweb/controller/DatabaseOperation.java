package com.bootcamp.web.demo_springweb.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bootcamp.web.demo_springweb.model.Dog;

public interface DatabaseOperation {
  @PostMapping(value = "/dog/{name}/{age}")
  public Dog createDog(@PathVariable String name, @PathVariable int age);

  @GetMapping(value = "/getalldog")
  public List<Dog> getDog();

  @GetMapping(value = "/getdogname/{name}")
  public List<Dog> getDog(@PathVariable String name);

  @GetMapping(value = "/getdogage/{age}")
  public List<Dog> getDog(@PathVariable int age);

  @PutMapping(value = "/dog/put/{index}")
  public Dog updateDog(@PathVariable int index, @RequestBody Dog dog);

  @PostMapping(value = "/dog")
  public Dog cloneDog(@RequestBody Dog dog);

  @DeleteMapping(value = "/dog/{index}")
  public boolean deleteDog(@PathVariable(value = "index") int dogid);

  @PatchMapping(value = "/dog/{id}/{name}")
  public boolean updateDogName(@PathVariable int id, @PathVariable String name);
}

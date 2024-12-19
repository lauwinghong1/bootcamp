package zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// ! T in class signature is to describe "attribute", "instance method"
public class Zoo<T extends Animal> {
  private List<T> animals; // !

  public Zoo() {
    this.animals = new ArrayList<>();
  }

  public void add(T animal) { // !
    this.animals.add(animal);
  }

  public List<T> getAnimals() { // !
    return this.animals;
  }

  // ! "<K extends Animal>" is to describe the range of "Zoo<K>"
  public static <K extends Animal> int animalCount(Zoo<K> zoo) {
    zoo.getAnimals().get(0).eat();
    // zoo.getAnimals().get(0).sleep();
    // zoo.getAnimals().get(0).run();
    return 1;
  }

  public static int animalCount2(Zoo<? extends Animal> zoo) {
    zoo.getAnimals().get(0).eat();
    // zoo.getAnimals().get(0).sleep();
    //zoo.getAnimals().get(0).run();
    return zoo.getAnimals().size();
  }

  public static void main(String[] args) {
    List<List<String>> stringLists = new LinkedList<>();

    //animalCount2() - Scenario 1 (Tiger or Panda)
    Zoo<Animal> animalZoo = new Zoo<>();
    animalCount2(animalZoo);
    // animalCount2() - Scenario 2 (All Tigers)
    Zoo<Tiger> tigerZoo = new Zoo<>();
    animalCount2(tigerZoo);
    // animalCount2() - Scenario 3 (All Pandas)
    Zoo<Panda> pandaZoo = new Zoo<>();
    animalCount2(pandaZoo);

    // Queue strings = new LinkedList();
    // strings.add("abc");
    // strings.add(new Tiger());
    // strings.poll().charAt(0);
  }
}
package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo2{
    private List<Animal>animals;

  public Zoo2(){
    this.animals = new ArrayList<>();
  }
  
  public void add (Animal animal){
    this.animals.add(animal);
  }
public static void main(String[]args){
  Zoo2 zoo = new Zoo2();
  zoo.add (new Tiger());

  Zoo2 zoo1=new Zoo2();
  zoo1.add (new Tiger());
  // zoo1.add(new Panda());
}

}

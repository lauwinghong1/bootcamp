import java.util.Objects;

public class Father extends Grandfather implements Swimable, Walkable {
  private String name;
  
  public Father(String name){
    this.name=name;
  }

  public Father(String name, double weight, double height){
    super(height, weight);
    this.name=name;
  }

  public String getName(){
    return this.name;
  }

  // If you write dwon the @override here....
  // 1. Compiler will help check the parent class, ensure there is same method for overriden
  // 2. Readability 
  @Override
  public void swim(){
    System.out.println("Father is swimming ...");
  }

  @Override
  public void walk(){
    System.out.println("Father is walking ....");
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Father)) return false;
    Father father = (Father) obj;
    return Objects.equals(father.getName(), this.name) //
          && Objects.equals(father.getHeight(), super.getHeight()) //
          && Objects.equals(father.getWeight(), super.getWeight());
  }

  @Override
  public int hashCode(){
    return Objects.
  }

  public void drive(){
    System.out.println("Father can drive....");
  }

  public static void main(String[] args) {
    System.err.println(Swimable.x); //10 (public static)
    
    //Poly
    Swimable father = new Father("Oscar");
    // Durng compile time, only swim() method is visable for father object
    father.swim();
    //father.walk();
    Walkable father2 = new Father("Steve");
    father2.walk();
    //father2.swim();
    
    // Father and Walkable has relationship
    // Father and Swimable has relationship
    // But Walkable and Swimable has NO relationship
    // Walkable father3 = father;

    //Father father4 = father;
    // If you insist and confirm the "father" is a Father object, and you want to convert its type
    Father father4 = (Father) father;
    father4.swim();
    father4.walk();

    Walkable father5 = father4;
    father5.walk();
    // father5.swim();

    Swimable father6 = (Father) father5;// 2 risk: from walkable object -> Father; // Object->

    System.out.println(Swimable.sum(10,2));
    
    Father father7 = new Father("Peter");
    father7.eat();

    new Father("Kenny").eat(); // eat() method inside tehh interface
    //Swimable.eat() // eat Method is an instance method

    // ! Swimable vs Grandfather (No relationship)
    Grandfather father8 = (Father) father6; // 1 risk
    // father8.drive();  // Drive hidden

    // Parent object cannot be assigned to child object reference
    // Father father9 = new Grandfather()
  }
}

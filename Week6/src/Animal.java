public abstract class Animal {
  private int age;
  private String color;

  // implicity empty constructor
  public Animal(){
    System.out.println("****This is Aminal empty constructor");
  }
  
  public Animal(int age, String color){
    this.age=age;
    this.color=color;
    System.out.println(this.age + " & "+this.color + " recorded.");
  }
  
  public void setAge(int inage){
    this.age=inage;
  }

  public int getAge(){
    return this.age;
  }

  public String getColor(){
    return this.color;
  }

  //  public static void main(String[] args) {
  //    Cat c1 = new Cat(12, "Neo");
  //    System.out.println(c1.getColor());
  //  }
  
  // If abstract specified on Animal class declaration,
  // it is new allowed to new class of Animal
  public static void main(String[] args) {
    Animal a1 = new Animal(6,"aa");
  }
  // Abstract Class
  // 1. Cannot be self created -> "new"
  // 2. Share the common attribute (private attribute, public method)
  // 3. parent constructure can only be used by child class
  // 4. parent object instance method can be accessed by the child object
  // 5. Define abstract methods (without implmementation)
}

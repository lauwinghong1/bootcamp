public class Cat extends Animal{
  // private int age;
  private String color;
  
  public Cat(int age, String incolor){
    super(age); // call the parent constrcutor
    this.color=incolor;
  }

  public static void main(String[] args) {
    // empty constructor by default call the parent empty constructor
    Cat c1 = new Cat(12, "Red");
    System.out.println(c1.getAge());
  } 
}

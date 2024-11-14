public class Dog extends Animal{
  public String name;
  // public Dog(){
  //    super(); //call the parent constructor
  // }
  public Dog(int age, String name){
    super(age); // call the parent constrcutor
    this.name=name;
  }

  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    //Dog d1 = new Dog();  //call parent constructor to create Animal object,
                         // and then associate the Dog object with the Animal 
                         // Object
    //d1.setAge(10);
    Dog d1 = new Dog(10, "Sally");
    System.out.println(d1.getAge()+" "+d1.getName());
  }
}

public class Animal {
  private int age;

  // implicity empty constructor
  //public Animal(){
  //}
  public Animal(int age){
    this.age=age;
  }
  
  public void setAge(int inage){
    this.age=inage;
  }

  public int getAge(){
    return this.age;
  }
}

//class, object
public interface Swimable {   // contract
  // ! Interface
  // 1. All methods are without implementation (Abstract method)
  // 2. No instance variable
  // 3. No constructor
  // 4. Can hold static variable/methods
  
  // Implicitly public static
  int x = 10;
  void swim();  

  // after Java 8 (2014)
  // 1. static method
  static int sum(int x, int y){
    return x+y;
  }
  // 2. default method (with implementation)
  default void eat(){
    System.out.println("eat() method inside the interface");
  }


    // ! Assignment
    // 2 classes and at least 2 interfaces
    // attributes, getter, setter, constructor
}


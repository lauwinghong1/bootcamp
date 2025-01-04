package Week8.src;

public class DemoTypeInference {
  // var cannot be used in attribute type
  //private var x;
  
  public static void main(String[] args) {
    // Strong type (compile time)
    int x = 3;
    x=10;

    // Java 10
    var y = 3; // var is determined during compile time, by the first initialization
    // confirmed y is "int" type.
    // y=10.3;
    var Person = new Person();

  }

  public static class Person {}

  public static int sum(Number x, Number y){
    return x.intValue()+y.intValue();
  }

  // var cannot be used as parameter
  //public static int sum(var x, var y){
  //  return x.intValue()+y.intValue();
  // }
  
  // var cannot be used as return type
  //public static var sum(int x, int y){
  //  return x+y;
  //}
}

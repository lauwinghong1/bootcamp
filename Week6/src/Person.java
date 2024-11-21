// All class in Java extends Object.class implicity

public class Person {

  @Override
  public String toString(){
      return "New object added";
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    // ! Person@6b95977 -> Object reference
    System.out.println(p1.toString()); // Person@6b95977

    Object o1=new Object();
    o1.toString();
    
  }
  
}

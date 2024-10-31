public class Cat {
  private String name;  // Attribute
  private int age;      // Attribute

  // !!! Java:  Instance = Object
  // Instance Method
  public String getName() {
    return this.name;
  }
  // Instance Method
  public void setName(String x) {
    this.name=x;
  }
  // Instance Method
  public int getAge(){
    return this.age;
  }
  // Instance Method
  public void setAge(int x){
    x++;
    this.age = x;
  }
  // Instance Method


  public static void main(String[] args) {
     int x=3;
     x++;
     System.out.println(x);
     
     //String s = "hello";
     //String s1 = new String("hello");
     //String s2 = String.valueOf("Hello");

     Cat c = new Cat();  // create a cat object
     c.setName("Hong");
     System.out.println(c.getName());

     Cat c1 = new Cat(); // create a cat object
     c1.setName("Wing");
     System.out.println(c1.getName());
     c1.setAge(60);
     System.out.println(c1.getAge());
  }

  }


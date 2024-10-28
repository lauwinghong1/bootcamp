public class Demointeger {
  public static void main(String[] args) {
    int x =3;
    int x1 =1;
    //if (x <> x1) {  // primitive, we use compare operand to compare....
    // }

    Integer y=4;           
    Integer y2=8; 
    String s = "Hello";
    // y and s are both object in Java
    y = new Integer(4);  // same as line 4
    //if (y.compareTo(new Integer[4]) == 0) System.out.println("y equal to 4");
    if (y.compareTo(y2) < 0) System.out.println("y small than y2");
    else if (y.compareTo(y2) >0) System.out.println("y is greater than y2");
    else System.out.println("y = y2");

    int xx4 = y;    // un-boxing
    double d1 = y.doubleValue(); // Unboxing Integer X to double (d1)
    // Long l1 = new Integer(10);  // Integer->int->long->long cannot do this!
    Long l1 = new Integer(10).longValue();  // Integer->Long->long Accepted!
    Integer int1 = new Double(8.4).intValue();

    //Other types
    boolean b1= new Boolean(false);
    // Character c1 = new Character('a');  // it is trandition way
    Character c1 = 'a';  // it is auto-box 

    Integer i5 = Integer.valueOf(8);  // similar to new Integer (8)
    String s2 = String.valueOf("Hello");
    String s3 = String.valueOf(9);
    System.out.println(s3);
  }
  
}

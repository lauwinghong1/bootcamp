package DemoStaticMethod;

public class Human {
  public static void main(String[] args) {
    System.out.println(Democalculator.add(2,4));

    Democalculator cal = new Democalculator();
    System.out.println(cal.add2(8, 8));
    Democalculator cal2 = new Democalculator();
    System.out.println(cal2.add2(100, 200));
  
}
}
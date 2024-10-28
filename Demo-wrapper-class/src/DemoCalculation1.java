public class DemoCalculation1 {
  public static void main(String[] args) {
    Integer num1 = Integer.valueOf(127);
    Integer num2 = Integer.valueOf(127);
    System.out.println(num1 == num2);

    Integer num3 = Integer.valueOf(128);
    Integer num4 = Integer.valueOf(128);
    System.out.println(num3 == num4);
    System.out.println(num3.compareTo(num4));
  }
  
}

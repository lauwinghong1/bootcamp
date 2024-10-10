import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please input a number : ");
    int number = input.nextInt();
    // System.out.println("Number is "+number);

    if (number >=50) {
      System.out.println("Passed!");
    }
    else {
      System.out.println("Failed");
    }
  }
  
}

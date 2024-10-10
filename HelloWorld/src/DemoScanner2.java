import java.util.Scanner;

public class DemoScanner2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please input a character : ");
    int number = input.nextInt();
    boolean isAudlt = number >= 18;

    if (isAudlt) {
      System.out.println("You are Audlt");
    }
    else {
      System.out.println("You are NOT Audlt");
    }
  }
  
}

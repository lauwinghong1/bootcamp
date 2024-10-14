import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    // Expected result
    // ***** -> i = 0
    // **** -> i = 1
    // *** -> i = 2
    // ** -> i = 3
    // * -> i = 4

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int m = input.nextInt();
    System.out.println();
    for (int i = 0; i<m; i++) {
      int j = m-i;
      for (int k=j; k>=1; k--) {
        System.out.print("*");
      }
      System.out.print(" -> i = ");
      System.out.println(i);
    }
  }
}

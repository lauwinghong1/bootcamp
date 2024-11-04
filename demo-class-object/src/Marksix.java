import java.util.Random;

public class Marksix {
  public static void main(String[] args) {
    int[] marsix = new int[50];
    Random ran = new Random();
    int random = 0;

    // For loop to generate 6 numbers
    for (int i=0; i<=5; i++) {
      boolean unique = false;
      // While loop to check duplication and put into array if no duplicated
      while (unique==false) {
        random=ran.nextInt(49)+1;
        if (marsix[random] != random) {
          marsix[random]=random;
          unique=true;
        }
       }; 
      }
      // Display marksix number in ascending order
      for (int i=1; i<=49; i++) {
        if (marsix[i] !=0) System.out.print(marsix[i] + " ");
      }
      System.out.println();
  }
}
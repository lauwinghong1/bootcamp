public class Exercise4 {
  public static void main(String[] args) {
    // Expected result
    // ***** -> i = 0
    // **** -> i = 1
    // *** -> i = 2
    // ** -> i = 3
    // * -> i = 4

    for (int i = 0; i<5; i++) {
      int j = 5-i;
      for (int k=j; k>=1; k--) {
        System.out.print("*");
      }
      System.out.print(" -> i = ");
      System.out.println(i);
    }
      }
}

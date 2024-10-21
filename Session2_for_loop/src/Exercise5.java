import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {   
    int a = 0;
    int b = 1;
    // int i = 0;       <= use for while loop
    for (int i=0; i<=14; i++) {
    // while (i<=15) {    <= use for while loop
    if (i == 0) System.out.print(i);
      else {
        int c=a+b;
        System.out.print(":"+c);
        b=a;
        a=c;
      }
      // i++;  <= use for while loop
    } 
    System.out.println();

    // Reverse string
    String original = "Programming";
    String reverse = "" ;
    for (int j=original.length()-1; j>=0; j--) {
      reverse += original.charAt(j);
    }
    System.out.println("Original string: "+original);
    System.out.println("Reversed string: "+reverse);
  }
}
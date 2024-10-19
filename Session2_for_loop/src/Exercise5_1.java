import java.util.Scanner;

public class Exercise5_1 {
  public static void main(String[] args) {
    //  Palindrome
    Scanner a = new Scanner(System.in);
    String input = a.next().trim();
    int halflen = input.length()/2;
    int fulllen = input.length();
    String leftstring = input.substring(0, halflen).toUpperCase();
    String Rightstring = input.substring(halflen, fulllen).toUpperCase();
    //System.out.println(leftstring);
    String reverse = "";
    System.out.println("Length:" + fulllen + halflen);
    int remain = fulllen = halflen;
    for (int i=remain-1; i>=0; i--) {
      reverse += Rightstring.charAt(i);
    }
    System.out.println(leftstring);
    System.out.println(reverse);

    if (leftstring.equals(reverse)) {
      System.out.println("It is palindrome");
    }
      else {
        System.out.println("It is NOT palindrome");
    }
  }
  
}

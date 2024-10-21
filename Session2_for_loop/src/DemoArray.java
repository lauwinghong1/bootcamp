import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    
    int[] intArray = new int[3];
    intArray[0] = 9;
    intArray[1] = 21;
    intArray[2] = 100;
    System.out.println(intArray[2]);

     int[] intArr1 = new int[] {1 ,2, 3};
     System.out.println(intArr1[1]);

     String charstring = "example";
     char[] chararray = charstring.toCharArray(); // Move String to char array
     String resstr = String.valueOf(chararray);  // Move char array to String

     System.out.println(charstring);
     System.out.println(Arrays.toString(chararray));
     System.out.println(resstr);
  }
}

import java.util.Arrays;

public class Exercise5_5 {
  public static void main(String[] args) {
    // String inputString2 = "Java Programming";
    String inputString2 = "Java Programming";
    String OutputString = "";
    char[] aeiou = new char[] {'A', 'E', 'I', 'O', 'U','a','e','i','o','u'};
    char poschar = ' ';
    boolean valid = false;
    for (int i=0; i<=inputString2.length()-1; i++) {
      valid = false;
      poschar = inputString2.charAt(i);
      for (int j=0; j<=9; j++) {
        if (poschar == aeiou[j]) {
             valid=true;
             break;
        }
      }
      if (valid) System.out.print(poschar);
      else System.out.print(' ');
    }
    System.out.println();


    // charAt() vs indexOf()
    String inputString4 = "Java, Python, JavaScript, ,typeScript";
    char target = 'P';

    for (int i=0; i<=inputString4.length()-1; i++) {
      if (inputString4.charAt(i) == target) {
        System.out.println(i);
      }
    }
    System.out.println(inputString4.indexOf(target));



    //  Nested loop
    // times table
    for (int i=1; i<=9; i++) {
      for (int j=1; j<=9; j++) {
        System.out.print(i*j + " ");
      }
      System.out.println();
    }

    // 
    int[] intArr = new int[4];
    int a=1;
    int b=3;
    int c=5;
    int d=7;
    intArr[0]=a;
    intArr[1]=b;
    intArr[2]=c;
    intArr[3]=d;
    for (int i=0; i<=intArr.length-1; i++) {
      System.out.println(intArr[i]);
    }
    System.out.println(Arrays.toString(intArr));
    System.out.println();

    // String array
    String[] strArr = new String[] {"Element 1", "Element 2", "Lau", "Hong"};
    String[] strArr1 = new String[] {"a", "b", "c", "d"};
    System.out.println(Arrays.toString(strArr1));
    for (int i=strArr.length-1; i>=0; i--) {
      strArr[i] = strArr1[strArr.length -1 -i];
    }
    System.out.println(Arrays.toString(strArr));


    // String Array
    String[] strarr3 = new String[] {"abc", "def", "ghi" , "xyzabc"};
    for (int i=0; i<=strarr3.length-1; i++) {
      System.out.println(strarr3[i]);
      for (int j=0; j<=strarr3[i].length()-1; j++) {
         System.out.println(strarr3[i].charAt(j));
      }
    }

    //
    String[] strarr4 = new String[] {"abc", "def", "ghi" , "xyzabc","Java","Pyphon"};
    String swap = "";
    System.out.println();
    for (int i=strarr4.length-1; i>=strarr4.length/2+1; i--) {
       swap=strarr4[i];
       strarr4[i]=strarr4[strarr4.length-1-i];
       strarr4[strarr4.length-1-i]=swap;
     }
     System.out.println(Arrays.toString(strarr4));
  }
}
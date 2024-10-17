public class DemoForLoop {
  public static void main(String[] args) {
    // The i is only used inside the for-loop
    String text = "Lau Wing Hong";
    for (int i = 0; i < text.length(); i++) {
      // System.out.println(text.charAt(i));
      System.out.println(text.charAt(i));
    }
    System.out.println();
    // sum up all even number between 1 - 20
    int sum = 0;
    for (int i = 0; i <= 20; i += 2) {
      sum += i;
    }
    // System.out.println("sum= " + sum);
    System.out.println("sum= " + sum);

    // sum up all odd number between 1 - 20
    sum = 0;
    for (int i = 1; i <= 20; i += 2) {
      sum += i;
    }
    System.out.println("sum= " + sum);
    // System.out.println(i);

    System.out.println();
    // print out 10 8 6 4 2 0
    for (int i = 10; i >= 2; i -= 2) {
      System.out.println(i);;
    }
    System.out.println();

    // Output: aceg
    text = "abcdefg";
    String output = "";
    for (int i = 0; i < text.length(); i += 2) {
      // System.out.println(text.charAt(i));
      output = output + text.charAt(i);
    }
    System.out.println(output);

    // counting
     String s2 = "bbbbaaaayfhd";
     int count =0;
     for (int i=0; i < s2.length(); i++) {
       if (s2.charAt(i) == 'a') {
         count++ ;
       }
     }
     System.out.println(count);

    // How many numbers can be divided by 3 or 4 between 1 - 100?
    for (int i = 1; i <= 100; i++) {
       if ((i%3 == 0) || (i%4 == 0)) {
         System.out.println(i);
       }
     }
     System.out.println();

     // Find the last index of c, if not found, print out -1
     // Do not use lastIndexof()
     String s3 = "abcdabcdabcd";
     int pos = -1;
     for (int i=0; i<s3.length(); i++) {
        if (s3.charAt(i)=='c') {
          pos = i;
        }
     }
     System.out.println(pos);
     // Alternative: lastIndexOf
     System.out.println(s3.lastIndexOf('c'));
     System.out.println(s3.indexOf('c'));  // Find the first index of string
     System.out.println(s3.contains("dab"));  // Contains

     //Substring (fromIndex, toindex - 1)
     System.out.println(s3.substring(1, 3));
     System.out.println(s3.substring(s3.length()-2, s3.length())) ;

     // continue and break
     // break: exit the current loop block
     for (int i=0; i<5; i++) {
        System.out.println(i);  
        if (i>2) {
          break;
        } 
     }
     // continue
     // print odd numbers
     for (int i=0; i<=5; i++) {
        if (i%2 == 0) {
          continue;   // equal to ITER (RPG code), skill the rest code and back to i++
        } 
        System.out.println(i);
      }

      System.out.println();   //ln -> line break
      
      for (int i = 0; i < 5; i++) {
         System.out.print("@");
      }
      System.out.println();

      for (int i=1; i<=9; i++) {
        for (int j=1; j<=9; j++) {
          int k=i*j;
          System.out.print(k + " ");
        }
        System.out.println();
      }

      // *****
      // ****
      // ***
      // **
      // *
      for (int i=5; i>=1; i--) {
         for (int j=1; j<=i; j++) {
            System.out.print("*");
         }
         System.out.println();
        }

      //  *
      // ***
      //*****
      // *** 
      //  *
      int max = 5;
      int space = max-3;
      for (int i=1; i<=max; i+=2) {
        for (int j=1; j<=space; j++) {
          System.out.print(" ");
        }
        space = space - 1;
        for (int k=1; k<=i; k++) {
          System.out.print("*");  
        }
        System.out.println();
      }
      
  }
}
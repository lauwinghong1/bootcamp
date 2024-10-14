public class Demostring1 {
  public static void main(String[] args) {
    // Expect Result
    // VENTURENIXLAB, JAVA
    // venturenixlab, java
    // V*NTUR*NIXLAB, JAVA

    String s1 = "VENTURENIXLAB";
    String s2 = ", JAVA";
    System.out.println(s1.concat(s2));
    System.out.println(s1.concat(s2).toLowerCase());
    System.out.println(s1.concat(s2).replace('E','*'));
    System.out.println(s1.concat(s2).replace("JAVA","Cobol").toUpperCase());

    String str3 = "StrA";
    String str4 = "Str3";
    System.out.println(str4.compareTo(str3));
    System.out.println(str3.equals(str4));
    System.out.println((char)48); //<= print the character of ASCII

    //Substring
    String Str10 = "Lau Wing Hong";
    System.out.println(Str10.substring(4));
    System.out.println(Str10.substring(4,8));   //the 1st position is rational value, but the 2nd para is having -1

    // isempty
    String Str11 = " ";
    System.out.println("Is Empty? " + Str11.isEmpty());
    System.out.println("Is Blank? " + Str11.isBlank());
    String Str12 = "";
    System.out.println("Is Empty? " +Str12.isEmpty());
    System.out.println("Is Blank? " +Str11.isBlank());

    // startWith
    String str13 = "Diamond Hill";
    System.out.println("startsWith: "+str13.startsWith("a",2));  // Operand, position

    // endsWith
    System.out.println(str13.endsWith("l"));

    // Condition
    char grade = 'B';
    switch (grade) {
        case 'A':
          System.out.println("Excellence");
          break;
        case 'B':
          System.out.println("Good");
          break;
        case 'C':
          System.out.println("Fair");
          break;
        case 'D':
          System.out.println("Fail");
          break;
        default:
          System.out.println("Undefined");
    }

   
  }
  
}

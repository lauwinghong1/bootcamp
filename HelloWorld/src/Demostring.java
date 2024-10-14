public class Demostring {
  public static void main(String[] args) {
    String x1 = "hello";
    String x2 = "abc";
    
    // ! equals()
    boolean result = "hello".equals(x1);   //<= good practice
    boolean result1 = x2.equals("world");  //<= bad practice
    // Return type<-method signature(input parameter)
    System.out.println(result);
    System.out.println(result1);

    // ! length()
    int len = x1.length();
    System.out.println(len);

    // ! charAt()
    // index starts from 0 to lenth-1
    System.out.println("Length: " + x1.length());
    System.out.println(x1.charAt(x1.length()-1));
    char bbb = x1.charAt(x1.length()-x1.length());
    System.out.println("Character: " +bbb);
    System.out.println(bbb+0);

    int age=60;
    String sentence = "I am at age of " + age;
    System.out.println(sentence);

        // trim()
        String str6 = "........Bootcamp......  " ;
        System.out.println(str6.trim());
        // replace()
        String str61 = str6.replace('.','X');
        System.out.println(str61);
        // toLowerCase
        String str71 = "ABCDEFGHIJKLMNOPQRST";
        String Low71 = str71.toLowerCase();
        System.out.println(Low71);
        // toUpperCase
        String Upp71 = Low71.toUpperCase();
        System.out.println(Upp71);
        // Concat
        String con1 = "Lau ";
        String con2  = "Wing ";
        String con3 = "Hong";
        System.out.println(con1.concat(con2).concat(con3).replace('H','h'));
        // Contain
        String fullname = con1.concat(con2).concat(con3);
        System.out.println(fullname.contains("Hong"));
      }
}

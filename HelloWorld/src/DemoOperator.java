public class DemoOperator {
  public static void main(String[] args) {
    // "!=" check if not equal to
    boolean result = 3 != 2;
    System.out.println(result);
    
    // "==" check if equal to
    // "=" assignment
    result = 3 == 2;
    System.out.println(result);

    // || OR,  && AND
    boolean eventA = 3 < 2;
    boolean eventB = 10%2 == 0;
    boolean combine = eventA || eventB;
    System.out.println(combine);

    // ==, !=, >=, <=, >, <  comparison -> event result
    char gender ='M';
    int age = 35;
    boolean isAudlt = age >=18;
    boolean isMale = gender == 'M';
    if (isAudlt && isMale) {
      System.out.println("He is a male audlt");
    } else {
      System.out.println("He is not a mail audlt");
    }
  }
}

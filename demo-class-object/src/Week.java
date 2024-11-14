// Introduce static final, static block
public class Week {
  
  private static int counter = 0;
  private int number;

  private static final int WEEK_OF_DAYS = test();
  private static final int DAY_OF_HOURS = test2();
  //private static final int WEEK_OF_DAYS;
  //private static final int DAY_OF_HOURS;
  public static final int WEEK_OF_HOURS;

  public Week(){
    System.out.println("Creating Week Object ...");
    this.number = ++counter; 
  }
// Initializer block (do once first when creating objects)
  {
    System.out.println("Initializer Block ...");
  }

  public int getnumber(){
    return this.number;
  }

  static {
    //WEEK_OF_DAYS=test();
    //DAY_OF_HOURS=test2();
    System.out.println(Week.WEEK_OF_DAYS);
    System.out.println(DAY_OF_HOURS);
    WEEK_OF_HOURS = WEEK_OF_DAYS * DAY_OF_HOURS;
    System.out.println("Static block");
  }

  public static int test(){
    return 7;
  }
  public static int test2(){
    return 24;
  }

  public static void main(String[] args) {
    // Static Method test()
    // Static Method test2()
    // Static block
    System.out.println(Week.WEEK_OF_HOURS);
    Week wk1 = new Week();
    Week wk2 = new Week();

    System.out.println(wk1.getnumber());
    System.out.println(wk2.getnumber());
  }
  
}

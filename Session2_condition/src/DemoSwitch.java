public class DemoSwitch {
  public static void main(String[] args) {
    int weekNumber = 1;
    String weekday = "";

    // switch case - WITH BREAK
    switch (weekNumber) {
      case 1:
        weekday = "Monday";
        break;
      case 2:
        weekday = "Tuesday";
        break;
      case 3:
        weekday = "Wednesday";
        break;
      case 4:
        weekday = "Thursday";
        break;
      case 5:
        weekday = "Friday";
        break;
      case 6:
        weekday = "Saturday";
        break;
      case 7:
        weekday = "Sunday";
        break;
    }
    System.out.println("Weekday = " + weekday);
      

    // switch case - WITHOUT BREAK
    char gradeForMoney = 'D';
    int money = 0;
    switch (gradeForMoney){
      case 'A':
        money += 10;
      case 'B':
        money += 10;
      case 'C':
        money += 10;
      case 'D':
        money += 10;
      case 'E':
        money += 10;
    }
    System.out.println("Money $" + money);

    String ddd="Hong";
    boolean bbb = ddd.equals("Hong");
    boolean bbbnot = !ddd.equals("Wing");
    System.out.println(bbb);
    System.out.println(bbbnot);
  }
}

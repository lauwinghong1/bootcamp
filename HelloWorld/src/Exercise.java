public class Exercise {
  public static void main(String[] args) {
    // int /double / string / system.out.println
    int first = 31;
    int second = 42;
    int sum = first + second;
    int subvar = second - first;
    int anothersum = sum + first + second - 16;
    boolean varB = false;
    boolean varC = true;
    double fnumber = anothersum * -1 - 0.2;
    double dnumber = -20.5;
    int remainder = 10%3;
    int result = remainder + 2;

    System.out.println("The first one:" + first);
    System.out.println("The second one:" + second);
    System.out.println("The sum is:" + sum);
    System.out.println("The subtraction result is:" + subvar);
    System.out.println("The another sum result is:" + anothersum);
    System.out.println("The variable varB:" + varB);
    System.out.println("The variable varC:" + varC);
    System.out.println("The variable reminder is:" + remainder);
    System.out.println("The variable result is:" + result);

    System.out.println("********************");
    int aaa = 1;
    int bbb = 2;
    System.out.println("result is:" + aaa+bbb);
    System.out.println(aaa+bbb);
    // && - AND
    // || - OR
    // == - Equal
    // != - Not equal
    System.out.println("********************");
    int year = 2023;
    if (year%4 == 0 || (year%100 == 0 && year%400 == 0)){
      System.out.println(year + " is leap year.");
    }
    else {
      System.out.println(year + " is NOT leap year.");
    }
  }
}
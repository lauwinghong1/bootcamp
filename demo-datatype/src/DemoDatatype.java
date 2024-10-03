public class DemoDatatype {
  public static void main(String[] args) {
    // Remark line, welcome to bootcamp.
    // You can drop note here ...

    // data type
    // "int" -> integer
    // x -> variable
    int x = 1;
    int y = 10;
    int a = x + y;    // 11

    //Tool: System.out.println()
    System.out.println(a);

    //Math Operation
    int z = y - x;
    a = a * z;
    int zz = z / 10;
    System.out.println(zz);

    // Math Operation: %
    // Reminder
    int reminder = y % 3;
    System.out.println(reminder);

    // Double (a number with decimal places)
    double dd = 10.5;
    // Assign an int value to double variable
    double dd2 = 10;
    System.out.println(dd);
    System.out.println(dd2);

    // ! What is 10?
    // 10 is an int value
    // ! What is dd2, dd2 is an double variable
    // int value -> double value
    // double value assign to double variable

    // Naming convetion; camel cases
    int englishScore = 70;
    int historyScore = 85;
    int mathScore = 90;
    double qal = 3;
    // average
    // int + int -> int
    // int + double -> double
    // int / int = int
    // assign int value to double variable
    double average = (englishScore + historyScore + mathScore) / qal;
    System.out.println(average);

    // Variable re-assignment
    x = 20;
    a = -40;
    
    // code blocks: main(String[] arg) {}
    // ! we cannot declare the variable twice !

    // how to backup an old value of variable
    int backup = x;
    x = 100;
    int e=9;
    e = e + 1;
    System.out.println(e);  //10
    e += 1;
    System.out.println(e);  //11
    e -= 1;
    System.out.println(e);  //10
    e *= 3;
    System.out.println(e);  //30
    e /= 30;
    System.out.println(e);  //1
    
    //++
    e++;   // self increment by 1
    System.out.println(e); // 2
    //--
    e--;   // self decrement by 1
    System.out.println(e);  // 1 
    //++e
    ++e;
    System.out.println(e); //2
    //--e
    --e;
    System.out.println(e);  //1
  } 
}
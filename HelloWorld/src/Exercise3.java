import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String monthchar = "";
    int days = 0;

    System.out.print("Please input a year ? ");
    int year = input.nextInt();
    System.out.println();
    System.out.print("Please input month ? ");
    int month = input.nextInt();
    System.out.println();
    System.out.println();

    boolean isLeapyear = (year%100!=0 && year%4==0) || (year%100==0 && year%400==0);
    //System.out.println(isLeapyear);
    
    switch (month) {
       case 1: 
         monthchar = "January";
         days = 31;
         break;
       case 2:
         monthchar = "Febuary";
         if (isLeapyear)  days = 29;
         else days = 28;
         break;
       case 3: 
         monthchar = "March";
         days = 31;
         break;
       case 4: 
         monthchar = "April";
         days = 30;
         break;
       case 5: 
         monthchar = "May";
         days = 31;
         break;
       case 6: 
         monthchar = "June";
         days = 30;
         break;
      case 7: 
         monthchar = "July";
         days = 31;
         break;
      case 8: 
         monthchar = "August";
         days = 31;
         break;
      case 9: 
         monthchar = "September";
         days = 30;
         break;
      case 10: 
         monthchar = "October";
         days = 31;
         break;
      case 11: 
         monthchar = "November";
         days = 30;
         break;
      case 12: 
         monthchar = "December";
         days = 31;
     }
     System.out.println("The number of days of "+monthchar+"/"+year+" is:"+days);

  }
  
}

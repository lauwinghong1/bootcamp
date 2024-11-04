package DemoStaticMethod;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DemoDate {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2024,02,29);
    System.out.println(date);

    System.out.println(date.plusDays(1));
    System.out.println(date.getDayOfWeek());
    //date = date.plusMonths(2).plusDays(5);
    System.out.println(date);
    
    LocalDate date3 = LocalDate.of(1970,01,1);
    //if (date.compareTo(date3) >= 1) System.out.println("Greater");
    LocalDate date4 = LocalDate.of(2014,1,1);
    System.out.println(date3.toEpochDay());
    System.out.println(date4.toEpochDay());

    LocalTime time1 = LocalTime.of(23,0,0);

    //LocalDateTime dt = LocalDateTime.of(2024,1,1,0,0,0);
    LocalDateTime aaa = LocalDateTime.of(2024,1,1,0,0,0);
    
    LocalDate date11 = LocalDate.of (2024,1,1);
    date11 = aaa.toLocalDate();
    System.out.println(date11);
    

  }
}

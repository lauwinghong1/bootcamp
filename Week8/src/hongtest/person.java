package Week8.src.hongtest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class person {
  private int person;
  
  //abstract int method();

  public person(int a){
     this.person=a;
   }

   public void setperson (int a){
    this.person=a;
   }

  public String getperson(){
    return "person class:" + this.person;
  }

  public static void main(String[] args) {
    // List<person> a = new ArrayList<>();
    // a.add(new person(1));
    // a.add(new person(3));
    // a.add(new person1(5));
    // a.add(new person2(9));
    
    person man1 = new woman(0);
    man1.setperson(2);
    person woman2 = new woman(2);
    // //System.out.println(man2.getperson());
    man1.
  
  }
}

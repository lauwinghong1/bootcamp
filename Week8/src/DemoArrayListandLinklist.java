package Week8.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayListandLinklist {

  public static void main(String[] args) {

    ArrayList<String> aa = new ArrayList<>();
    aa.add("Lau");
    aa.add("Wing");
    aa.add("abc1");
    aa.add("abc3");
    aa.add("abc4");
    aa.add("abc3");
    System.out.println(aa.toString());
        aa.set(3,"hong");
    System.out.println(aa.toString());
    System.out.println(aa.get(2));
    // System.out.println(aa.toString());
    
    List<String> string2 = new LinkedList<>();
    string2.add("abc");
    System.out.println(string2.toString());
  }


}

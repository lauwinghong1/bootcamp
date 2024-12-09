package Week8.src;

import java.util.LinkedList;
import java.util.List;

public class Demolinkedlist {
  public static void main(String[] args) {
    List<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    // Same as ArrayList, ordering is in place for LinkedList
    for (String s : strings){
      System.out.println(s);
    }
    System.out.println(strings.size());
    System.out.println(strings);;
    strings.remove("abc");
    System.out.println(strings);

    System.out.println("-----------------");
    LinkedList<String> string2 = new LinkedList<>();
    string2.add("abc");
    string2.add("def");
    string2.add("ijk");
    System.out.println(string2);
    string2.removeFirst();
    string2.removeLast();
    System.out.println(string2);
  }
  
}

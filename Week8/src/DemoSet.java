package Week8.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DemoSet {
  public static void main(String[] args) {
    Collection<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    strings.remove("abc");
    System.out.println(strings.size());

    Set<String> s1 = new HashSet<>();  // The feature of "Set" is to REMOVE DUPLICATE
    s1.add("abc");
    s1.add("abc");
    System.out.println(s1.size());
    if (s1.add("abc")) System.out.println("success"); // The add() of set is to check duplicate
    else System.out.println("Failed");                // Meaning avoid duplication
    if (s1.add("ijk")) System.out.println("success");
    else System.out.println("Failed");
  }
  
}

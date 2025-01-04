package Week8.src;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // underlying structure of hashmap:  array+linked list

    HashMap<String, String> hm1 = new HashMap<>();
    hm1.put("1", "vincent"); // put one entry into hashmap
    hm1.put("2", "Lucas");   // put one entry into hashmap
    hm1.put("3", "steven");  // put one entry into hashmap
    System.out.println(hm1.size());

    // <String String> 
    // <Key, value>, key cannot be repeated
    hm1.put("2", "lydia");  // override the entry (beause thay are in the same key)
    System.out.println(hm1.get("2"));
    System.out.println(hm1.size());
    System.out.println(hm1.get("10"));

    for (Map.Entry<String, String> entry: hm1.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    for (String key:hm1.keySet()){
      System.out.println(key);
    }

    for (String values:hm1.values()){
      System.out.println(values);
    }
  }
  
}

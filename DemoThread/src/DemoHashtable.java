import java.util.HashMap;
import java.util.Map;

public class DemoHashtable {
  private Map<Integer, Integer> stringMap;

  public DemoHashtable(){
    //Solution, use HashTable instead of HashMap
    stringMap = new Hashtable<>();
    //stringMap = new HashMap<>();
  }

  public void put(Integer key){
    this.stringMap.put(key, 999);
  }
  
  public Map<Integer, Integer> getStringMap(){
    return this.stringMap;
  }
  public static void main(String[] args) {
    DemoHashtable hashtable = new DemoHashtable();
    Runnable task1 =() -> {
      for (int i=0; i<100_000; i++){
        hashtable.put(i);
      }
    };
    Runnable task2 =() -> {
      for (int i=100_000; i<200_000; i++){
        hashtable.put(i);
      }
    };
    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task2);
    thread1.start();
    thread2.start();
    try{
      thread1.join();
      thread2.join();
    } catch (InterruptedException e){}
    System.out.println(hashtable.getStringMap().size());
  }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DemoVector {
  private List<Integer> integers;

  public DemoVector(){
    // Solution
    // this.integers = new Vector<>();
    this.integers = new ArrayList<>();
  }

  public void addInteger(Integer x){
    this.integers.add(x);
  }

  public List<Integer> getinteger(){
    return this.integers;
  }
  
  public static void main(String[] args) {
    DemoVector demolist = new DemoVector();
    Runnable task = () -> {
      for (int i=0; i<100_000; i++){
        demolist.addInteger(1);
      }
    };

    Thread thread1 = new Thread(task);
    thread1.start();
    Thread thread2 = new Thread(task);
    thread2.start();
    try{
      thread1.join();
      thread2.join();
    } catch (InterruptedException e){}
    System.out.println(demolist.getinteger().size());


  }
  
}

public class Demostring {
  private String str;

  public synchronized void addchar(char c){
    this.str += c;
  }

  public String getStr(){
    return this.str;
  }

  // Solution 1 : StringBuffer
  // Solution 2: synchronized
  public static void main(String[] args) {
    Demostring ds = new Demostring();

    Runnable task = () -> {
      for (int i=0; i<100000; i++){
        ds.addchar('a');
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

    System.out.println(ds.getStr().length());
  }
  
  
}

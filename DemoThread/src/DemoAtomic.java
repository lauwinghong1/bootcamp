import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomic {
  private AtomicInteger x;

  public DemoAtomic() {
    this.x=new AtomicInteger();
  }

  public AtomicInteger getX(){
    return this.x;
  }

  
  public static void main(String[] args) {
    DemoAtomic demoAtomic = new DemoAtomic();
    Runnable task = () -> {
      for (int i=0; i<100_000; i++){
        demoAtomic.getX().getAndIncrement();
      }
    };
    Thread thread1 = new Thread(task);
    Thread thread2 = new Thread(task);
    thread1.start();
    thread2.start();
    try{
      thread1.join();
      thread2.join();
    } catch (InterruptedException e){}
    System.out.println(demoAtomic.getX());
  }
  
}

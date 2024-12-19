package Week8.src;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    Queue<Integer> pq = new PriorityQueue<>();
    pq.add(100);
    pq.add(89);
    pq.add(10);
    pq.add(1);
    for (Integer q: pq){System.out.println(q);}
    System.out.println(pq.poll()); //1     Priority Q will have sort in advance.
    System.out.println(pq.poll()); //10
    pq.add(8);
    System.out.println(pq.poll()); //8
    for (Integer q: pq){System.out.println(q);}

    // RED -> WHITE -> BLUE (With use comparator)
    Queue<Ball>  bq = new PriorityQueue<>(new OrderbyColor());

    bq.add(new Ball(Color.BLUE, 3.2));
    bq.add(new Ball(Color.RED, 3.2));
    bq.add(new Ball(Color.WHITE, 5.0));
    bq.add(new Ball(Color.BLUE, 3.2));
    bq.add(new Ball(Color.RED, 10.2));
    System.out.println(bq.poll());
    System.out.println(bq.poll());
    System.out.println(bq.poll());
    System.out.println(bq.poll());
    System.out.println(bq.poll());

  }
  
}

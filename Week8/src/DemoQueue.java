package Week8.src;

import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DemoQueue {
  public static void main(String[] args) {
    Queue<String> q1 = new LinkedList<>();
    q1.add("vincent");
    q1.add("oscar");
    q1.add("lucas");
    String head=q1.poll();
    System.out.println(head);  // similar to removeFirst
    
    while(!q1.isEmpty()){
      head = q1.poll();
      System.out.println(head);
    }
    q1.add("abc");
    q1.add("def");
    q1.add("ijk");
    System.out.println(q1.peek());
    while(!q1.isEmpty()){
       head = q1.poll();
       System.out.println(head);
     }
    // for-each loops: we cannot modify the elements inside the queue
    //for (String str:q1){
    //  System.out.println(str);
   // }

   // Queue - LinkedList
   // Deque - LinkedList
   Deque<String> dq1 = new LinkedList<>();
   dq1.add("abc");
   dq1.add("def");
   dq1.add("ijk");
   System.out.println(dq1.pollFirst()); //abc
   System.out.println(dq1.pollLast());  //ijk
   dq1.addLast("xxx");
   dq1.addFirst("yyy");
   System.out.println(dq1);
   System.out.println(dq1.peekFirst());
   System.out.println(dq1.peekLast());   
   
   // pop, push (stack strcuture - FILO)
   // add, poll (FIFO)
   Stack<String> stack = new Stack<>();
   stack.push("aaa");
   stack.push("bbb");
   System.out.println(stack.pop());

   // Arraydeque
   Deque<Double> doubles = new ArrayDeque<>();
   doubles.add(10.3);
   doubles.add(10.7);
   System.out.println(doubles.pollLast());
   
   Queue<Integer> integers = new ArrayDeque<>();
   integers.add(10);
   integers.add(11);
   System.out.println(integers.poll());
   
   //Blue, Red, White
   Queue<Ball> balls = new PriorityQueue<>();
   
  }
  
}

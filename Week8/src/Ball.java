package Week8.src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ball implements Comparable<Ball>{
  private Color color;
  private double size;
  
  public Ball (Color color){
    this.color=color;
  }

  public Color getColor (){
    return this.color;
  } 

  public Ball(Color color, double size){
    this.color=color;
    this.size =size;
  }
  public double getsize(){
    return this.size;
  }

  @Override
  public int compareTo(Ball ball){
    //-1 (push this first) or 1 (push ball first)
    // this vs ball
    if (this.color == ball.getColor()){
        if (this.size >= ball.getsize()) return 1;
        else return -1;
    }
    if (this.color == Color.BLUE) 
      return -1;
    if (ball.getColor() == Color.BLUE) 
      return 1;
    if (this.color == Color.RED && ball.getColor() == Color.WHITE)
      return -1;
    if (ball.getColor() == Color.RED && this.color==Color.WHITE)
      return 1;
    return -1;
    }

    @Override
    public String toString(){
      return "Ball[: " //
        + "color=" + this.color//
        + "; Sized=" + this.size + "]";
    }

    public static void main(String[] args) {
      List<Ball>  ballsarray = new ArrayList<>();
      
      // Use Array list and being sory with Comparable (CompareTo)
      ballsarray.add(new Ball(Color.WHITE, 5));
      ballsarray.add(new Ball(Color.RED, 15));
      ballsarray.add(new Ball(Color.BLUE, 20));
      ballsarray.add(new Ball(Color.RED, 4));
      ballsarray.add(new Ball(Color.BLUE,8));
      // Comparable
      Collections.sort(ballsarray);  //It will run the compareTo code under Comparable<Ball>
      System.out.println(ballsarray.toString());

      System.out.println();
      System.out.println();

      //Comparator
      Collections.sort(ballsarray, new OrderbyColor());
      System.out.println(ballsarray);

      Collections.sort(ballsarray, new OrderbySize());
      System.out.println(ballsarray);
      // Try to use priority queue
      // Queue<Ball> ballsqueue = new PriorityQueue<>();
      // ballsqueue.add(new Ball(Color.WHITE, 5));
      // ballsqueue.add(new Ball(Color.RED, 15));
      // ballsqueue.add(new Ball(Color.BLUE, 20));
      // ballsqueue.add(new Ball(Color.RED, 4));
      // ballsqueue.add(new Ball(Color.BLUE,8));
      // System.out.println(ballsqueue.toString());

    }
  }


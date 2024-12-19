package Week8.src;

import java.util.Comparator;

public class OrderbySize implements Comparator<Ball>{
  @Override
  public int compare(Ball b1, Ball b2){
    // b1 vs b2
    if (b1.getsize() > b2.getsize()) 
      return -1;
    else return 1;
  }
}

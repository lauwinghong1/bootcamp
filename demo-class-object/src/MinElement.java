import java.util.Arrays;

public class MinElement {

  public static void main(String[] args) {
    int[] numberarr = new int[]{10,12,13,14};
    System.out.println(minnumber(numberarr));
  }


  public static int minnumber(int[] arr) {
    int[] total = new int[arr.length];
    int left = 0;
    int right = 0;
    for (int i=0; i<arr.length;i++) {
       left = arr[i] / 10;
       right = arr[i] - (left*10);
       total[i] = left + right;
    }
    Arrays.sort(total);
    return total[0];
  }
  
}
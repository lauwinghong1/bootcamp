import java.util.Arrays;

public class Exercise_1 {
  public static void main(String[] args) {
    
    int arr1[] = new int[] {1, 8, 99, 0, 4};
    int swap = 0;
    for (int i=0; i<=arr1.length-1; i++){
      if (arr1[i]>=arr1[i+1]) {
        swap = arr1[i+1];
        arr1[i+1]=arr1[i];
        arr1[i]=swap;
      }
      System.out.println(Arrays.toString(arr1));
    }
    
  }
}
